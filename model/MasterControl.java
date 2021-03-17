package model;

import java.util.*;
import model.Input;
import model.Data;
import view.Panel;
import view.Starter;

public class MasterControl {

    long startTime = 0;
    long endTime = 0;
    long speedTime = 0;

    private IData data;
    private IInput input;
    private ICircularShift circularShift;
    private INoiseRemover noiseRemover;
    private IAlphabetizer alphabetizer;
    private Timer timer;
    private IOutput output;
    private Panel panel;

    public MasterControl(Panel panel) {
        // masterRun();
        this.panel = panel;
        printTime();
    }

    public void masterRun(IInput input) {
        this.input = input;
        data = new Data();
        circularShift = new CircularShift();
        alphabetizer = new Alphabetizer();

        data.setNoiseStmt(input.getNoise());
        data.setInputStmt(input.getStmt());
        ArrayList<String> sortedArray = new ArrayList<String>();
        ArrayList<String> shiftedArray = new ArrayList<String>();
        // shifting 1 , sorting 2
        System.out.println(input.getPriority());
        if (input.getPriority() == 1) { // Shifter first
            // mid output
            System.out.println(data.getInputStmt());
            shiftedArray = circularShift.shift(data.getInputStmt());
            System.out.println(shiftedArray);
            data.setCaStmt(shiftedArray);
            output.print(data.getCaStmt());
            // final output
            sortedArray = alphabetizer.sort(shiftedArray);
            data.setAlphaStmt(sortedArray);
            output.print(data.getAlphaStmt());

        } else if (input.getPriority() == 2) { // Sorter first
            // mid output
            sortedArray = alphabetizer.sort(shiftedArray);
            data.setAlphaStmt(sortedArray);
            output.print(data.getAlphaStmt());

            // final output
            shiftedArray = circularShift.shift(data.getInputStmt());
            data.setCaStmt(shiftedArray);
            output.print(data.getCaStmt());
        }
        // send to output actions go here
    }

    public void printTime() {
        startTime = System.currentTimeMillis();
        System.out.println(startTime + " start\n");
        // masterRun();
        // where all the modules instances will be sandwiched in

        endTime = System.currentTimeMillis();
        System.out.println(endTime + " end\n");
        speedTime = endTime - startTime;
        System.out.println(speedTime + " milliseconds");
        output = new Output(speedTime, panel);
    }

    public IData getData() {
        return data;
    }
}