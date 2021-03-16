package model;
import java.io.File;
import java.util.*;

public class Data implements IData {

    public Data(MasterControl master) {
        this.master = master;
    }

    private MasterControl master;
    private ArrayList<String> inputStmt = new ArrayList<String>();
    private ArrayList<String> outputStmt = new ArrayList<String>();
    //private ArrayList<String> csStmt;
    //private ArrayList<String> alphaStmt;
    private ArrayList<String> middleStmt;

    @Override
    public ArrayList<String> getInputStmt() {
        return inputStmt;
    }

    // @Override
    // public ArrayList<String> getCsStmt() {
    //     return csStmt;
    // }

    // @Override
    // public ArrayList<String> getAlphaStmt() {
    //     return alphaStmt;

    // }

    @Override
    public ArrayList<String> getOutputStmt() {
        return outputStmt;
    }



    @Override
    public void setInputStmt() {
        // TODO Auto-generated method stub

    }

    // @Override
    // public void setCsStmt(ArrayList<String> csStmt) {
    //     this.csStmt = csStmt;

    // }

    // @Override
    // public void setAlphaStmt(ArrayList<String> alphaStmt) {
    //     this.alphaStmt = alphaStmt;
    // }

   

    @Override
    public File getNoiseBank() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setOutputStmt(ArrayList<String> outputStmt) {
        this.outputStmt = outputStmt;
        
    }

    @Override
    public ArrayList<String> getCsStmt() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<String> getAlphaStmt() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<String> getMiddleStmt() {
        return middleStmt;
    }

    @Override
    public void setMiddleStmt(ArrayList<String> middleStmt) {
        this.middleStmt = middleStmt;
        
    }

}