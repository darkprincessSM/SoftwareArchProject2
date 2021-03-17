package model;

import java.util.*;

import view.Panel;

public class Input implements IInput {

    private ArrayList<String> inputStmt;
    private ArrayList<String> noiseStmt;
    private int priority = 1;
    private Panel panel;

    public Input() {
    }

    // for testing
    @Override
    public void printNoiseInput() {
        System.out.println(noiseStmt);

    }

    @Override
    public void printStmt() {
        System.out.println(inputStmt);
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;

    }

    @Override
    public void transmitIn(String stringStmt, String noiseStmt) {
        // Transmit in from GUI
        splitInput(stringStmt);
        splitInput(noiseStmt);
        System.out.println(priority);
    }

    @Override
    public void splitInput(String stringStmt) {
        inputStmt = new ArrayList<>(Arrays.asList(stringStmt.split("\\r?\\n|\\r")));

    }

    @Override
    public void splitNoise(String stringStmt) {
        noiseStmt = new ArrayList<>(Arrays.asList(stringStmt.split("\\r?\\n|\\r")));
    }

}