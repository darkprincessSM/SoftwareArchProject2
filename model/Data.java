package model;

import java.util.*;

public class Data implements IData {

    public Data() {
        //
    }

    private ArrayList<String> inputStmt;
    private ArrayList<String> csStmt;
    private ArrayList<String> alphaStmt;
    private ArrayList<String> outputStmt;

    @Override
    public ArrayList<String> getInputStmt() {
        return inputStmt;
    }

    @Override
    public ArrayList<String> getCsStmt() {
        return csStmt;
    }

    @Override
    public ArrayList<String> getAlphaStmt() {
        return alphaStmt;

    }

    @Override
    public ArrayList<String> getOutputStmt() {
        return outputStmt;
    }

    @Override
    public void setInputStmt(ArrayList<String> inputStmt) {
        this.inputStmt = inputStmt;

    }

    @Override
    public void setCsStmt(ArrayList<String> csStmt) {
        this.csStmt = csStmt;

    }

    @Override
    public void setAlphaStmt(ArrayList<String> alphaStmt) {
        this.alphaStmt = alphaStmt;
    }

    @Override
    public void setOutputStmt(ArrayList<String> outputStmt) {
        this.outputStmt = outputStmt;
    }

}