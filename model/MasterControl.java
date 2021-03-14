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
        masterRun();
    }

 

    public void masterRun() {
        startTime = System.currentTimeMillis();
        //input = new Input();

        System.out.println("how fast is this?");
        endTime = System.currentTimeMillis();
        speedTime = endTime - startTime;   
        output = new Output(speedTime, panel);
    }

}