package model;

import model.MasterControl;
import view.Panel;
import view.Starter;

import java.util.*;
import javax.swing.JTextField;

public class Output implements IOutput {

    private Panel panel;
    private MasterControl master;
    
    public Output(long time, Panel panel) {
        this.panel = panel;
        printPerformance(time);
    }

    @Override
    public void print() {
        String exitStmt = makeString(master.getData().getMiddleStmt());
        panel.getIntermediateArea().setText(exitStmt);
        exitStmt = makeString(master.getData().getOutputStmt());
        panel.getOutputArea().setText(exitStmt);

    }

    @Override
    public void printPerformance(long time) {
        String timeString = String.valueOf(time);

        panel.getSpeedBox().setText(timeString + " milliseconds");
        System.out.println(time);
    }
    @Override
    public String makeString(ArrayList<String> stmt) {
        String stringStmt = String.join("\n", stmt);
        return stringStmt;
    }

    // @Override
    // public String makeString() {
    //     // TODO Auto-generated method stub
    //     return null;
    // }
}