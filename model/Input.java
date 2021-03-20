package model;

// import java.util.*;
import model.IInput;
import view.Panel;
import java.util.ArrayList;
import java.util.Arrays;

public class Input implements IInput {

    private ArrayList<String> inputStmt;
    private ArrayList<String> noiseStmt;
    private int priority = 1;
    private Panel panel;

    // for testing
    @Override
    public void printNoiseInput() {
        ///
    }

    @Override
    public void printStmt() {
        ///
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;

    }

    @Override
    public void transmitIn(String stringStmt, String noise) {
        // Transmit in from GUI
        splitInput(stringStmt);
        splitNoise(noise);
    }

    @Override
    public void splitInput(String stringStmt) {
        inputStmt = new ArrayList<>(Arrays.asList(stringStmt.split("\\r?\\n|\\r")));
        
    }

    @Override
    public void splitNoise(String noise) {
        noiseStmt = new ArrayList<>(Arrays.asList(noise.split("\\r?\\n|\\r")));
    }

    @Override
    public ArrayList<String> getNoise() {
        return noiseStmt;
    }

    @Override
    public ArrayList<String> getStmt() {
        return inputStmt;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setStmt(ArrayList<String> inputStmt) {
        this.inputStmt = inputStmt;
    }

}