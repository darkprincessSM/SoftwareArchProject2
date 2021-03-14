package model;
import java.util.*;

import view.Panel;
public class MasterControl {

    long startTime = 0;
    long endTime = 0;
    long speedTime = 0;

    private IData data;
    private IInput input;
    private ICircularShift circularShit;
    private INoiseRemover noiseRemover;
    private IAlphabetizer alphabetizer;
    private Timer timer;
    private IOutput output;
    public Panel panel;

    public MasterControl(Panel panel) {
        //masterRun();
        printTime();
    }

 

    public void masterRun() {
        
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
        
    }

    public void printTime() {
        startTime = System.currentTimeMillis();
        System.out.println(startTime + " start\n");
        input = new Input();

        //where all the modules instances will be sandwiched in

        endTime = System.currentTimeMillis();
        System.out.println(endTime + " end\n");
        speedTime = endTime - startTime;   
        System.out.println(speedTime + " milliseconds") ;
        output = new Output(speedTime, panel);
    }
}