package model;

import model.MasterControl;
import view.Panel;
import java.util.*;
import javax.swing.JTextField;

public class Output implements IOutput {

    Panel panel;
    JTextField speedBox = panel.getSpeedBox();

    public Output(long time, Panel panel) {
        printPerformance(time);
    }

    @Override
    public void print() {

    }

    @Override
    public void printPerformance(long time) {
        String timeString = String.valueOf(time);
        speedBox.setText(timeString);
    }

}