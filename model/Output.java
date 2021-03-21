package model;

import view.Panel;
import java.util.*;

public class Output implements IOutput {

    private Panel panel;
    private int count = 1;

    public Output(long time, Panel panel) {
        this.panel = panel;
        printPerformance(time);
    }

    public Output(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void print(ArrayList<String> stmt) {
        String stringStmt = String.join("\n", stmt);
        if (count == 1) {
            panel.getIntermediateArea().setText(stringStmt);
            count++;
        } else if (count == 2) {
            panel.getOutputArea().setText(stringStmt);
            count = 1;
        }

    }

    @Override
    public void printPerformance(long time) {
        String timeString = String.valueOf(time);
        panel.getSpeedBox().setText(timeString + " milliseconds");
        System.out.println(time);
    }

}