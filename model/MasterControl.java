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
        noiseRemover = new NoiseRemover();
        output = new Output();

        ArrayList<String> sortedArray = new ArrayList<String>();
        ArrayList<String> shiftedArray = new ArrayList<String>();
        ArrayList<String> removed = new ArrayList<String>();
        // shifting 1 , sorting 2
        noiseRemover.readNoise(input.getNoise());
        removed = noiseRemover.removeNoise(input.getStmt());
        data.setInputStmt(removed);

        if (input.getPriority() == 1) { // Shifter first
            // mid output
            shiftedArray = circularShift.shift(data.getInputStmt());
            data.setCsStmt(shiftedArray);
            output.print(data.getCsStmt());
            // final output
            sortedArray = alphabetizer.sort(shiftedArray);
            data.setAlphaStmt(sortedArray);
            output.print(data.getAlphaStmt());

        } else if (input.getPriority() == 2) { // Sorter first
            // mid output
            sortedArray = alphabetizer.sort(data.getInputStmt());
            data.setAlphaStmt(sortedArray);
            output.print(data.getAlphaStmt());

            // final output
            shiftedArray = circularShift.shift(sortedArray);
            data.setCsStmt(shiftedArray);
            output.print(data.getCsStmt());
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