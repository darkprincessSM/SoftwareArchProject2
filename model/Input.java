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

    @Override
    public void printNoiseInput() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;

    }

    @Override
    public void transmitIn(String stringStmt) {
        // Transmit in from GUI
        splitInput(stringStmt);
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