package model;

import java.util.*;

import view.Panel;

public class Input implements IInput {

    MasterControl master;
    private ArrayList<String> inputStmt;
    private ArrayList<String> noiseStmt;
    private int priority = 1;
    private int laps = 0;
    private Panel panel;   

    public Input(MasterControl master) {
        this.master = master;
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
        setPriority(priority);
        master.getMaster().getData().setInputStmt();
        
    }

    @Override
    public void splitInput(String stringStmt) {
        inputStmt = new ArrayList<>(Arrays.asList(stringStmt.split("\\r?\\n|\\r")));

        
    } 
    
    @Override
    public void splitNoise(String stringStmt) {
        noiseStmt = new ArrayList<>(Arrays.asList(stringStmt.split("\\r?\\n|\\r")));
    }

    @Override
    public void runFilter() {
        if(priority == 1) {
            master.getMaster().getData().setMiddleStmt(master.getCircularShift().shift(master.getMaster().getData().getInputStmt()));
            master.getMaster().getData().setOutputStmt(master.getNoiseRemover().removeNoise(master.getMaster().getData().getMiddleStmt()));
            master.getMaster().getData().setOutputStmt(master.getAlphabetizer().sort(master.getMaster().getData().getOutputStmt()));
        } else {
            master.getMaster().getData().setMiddleStmt(master.getAlphabetizer().sort(master.getMaster().getData().getInputStmt()));
            master.getMaster().getData().setOutputStmt(master.getCircularShift().shift(master.getMaster().getData().getMiddleStmt()));
            master.getMaster().getData().setOutputStmt(master.getNoiseRemover().removeNoise(master.getMaster().getData().getMiddleStmt()));
        }
        //laps = 1;
        
    }

    @Override
    public int getLaps() {
        // TODO Auto-generated method stub
        return 0;
    }

    // public int getLaps() {
    //     return laps;
    // }

}

