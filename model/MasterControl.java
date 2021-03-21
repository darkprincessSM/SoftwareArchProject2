package model;

import java.util.*;
import view.Panel;

public class MasterControl {

    long startTime = 0;
    long endTime = 0;
    long speedTime = 0;

    private IData data;
    private IInput input;
    private ICircularShift circularShift;
    private INoiseRemover noiseRemover;
    private IAlphabetizer alphabetizer;
    private IOutput output;
    private Panel panel;

    public MasterControl(Panel panel) {
        this.panel = panel;
    }

    public void masterRun(IInput input) {
        startTime = System.currentTimeMillis();
        System.out.println(startTime + " start\n");

        this.input = input;
        data = new Data();
        circularShift = new CircularShift();
        alphabetizer = new Alphabetizer();
        noiseRemover = new NoiseRemover();
        output = new Output(panel);

        ArrayList<String> sortedArray = new ArrayList<String>();
        ArrayList<String> shiftedArray = new ArrayList<String>();
        ArrayList<String> removed = new ArrayList<String>();

        data.setInputStmt(input.getStmt());

        if (input.getPriority() == 1) { // Shifter first
            // mid output
            shiftedArray = circularShift.shift(data.getInputStmt());
            System.out.println(shiftedArray);
            noiseRemover.readNoise(input.getNoise());
            removed = noiseRemover.removeNoise(shiftedArray);
            data.setCsStmt(removed);
            output.print(removed);
            // final output
            sortedArray = alphabetizer.sort(data.getCsStmt());
            data.setAlphaStmt(sortedArray);
            output.print(data.getAlphaStmt());

        } else if (input.getPriority() == 2) { // Sorter first
            // mid output
            sortedArray = alphabetizer.sort(data.getInputStmt());
            data.setAlphaStmt(sortedArray);
            output.print(data.getAlphaStmt());

            // final output
            shiftedArray = circularShift.shift(sortedArray);
            noiseRemover.readNoise(input.getNoise());
            removed = noiseRemover.removeNoise(shiftedArray);
            data.setCsStmt(removed);
            output.print(removed);
        }
        // send to output actions go here
        endTime = System.currentTimeMillis();
        System.out.println(endTime + " end\n");
        speedTime = endTime - startTime;
        System.out.println(speedTime + " milliseconds");
        output = new Output(speedTime, panel);
    }
}