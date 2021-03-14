package model;

import model.MasterControl;
import view.Panel;
import java.util.*;
import javax.swing.JTextField;

public class Output implements IOutput {

    private Panel panel;
    //private JTextField speedBox;

    public Output(long time, Panel panel) {
        this.panel = panel;
        printPerformance(time);
    }

    @Override
    public void print() {

    }

    @Override
    public void printPerformance(long time) {
        String timeString = String.valueOf(time);
        panel.getSpeedBox().setText(timeString);
        System.out.println(time);
    }

}