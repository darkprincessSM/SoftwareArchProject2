package model;
import java.util.*;

import view.Panel;
import view.Starter;
public class MasterControl {

    long startTime = 0;
    long endTime = 0;
    long speedTime = 0;
    
    private Starter starter;
    private Panel panel;
    private MasterControl master;
    private IData data = new Data(master);
    private IInput input = new Input(master);
    private ICircularShift circularShift = new CircularShift();
    private INoiseRemover noiseRemover = new NoiseRemover();
    private IAlphabetizer alphabetizer = new Alphabetizer();;
    //private Timer timer;
    private IOutput output = new Output(speedTime, panel);
    

    public MasterControl(Panel panel) {
        //masterRun();
        this.panel = panel;
        //printTime();
    }

 

    public void masterRun() {
        //data = new Data(master);
        //input = new Input();
        //circularShift = new CircularShift();
        //alphabetizer = new Alphabetizer();
        //noiseRemover = new NoiseRemover();
        new MasterControl(starter.getPanel());
        if (input.getLaps() == 1) {

        }

    }

    // public void setPanel(Panel panel) {
    //     this.panel = panel;
        
    // }

    public void printTime() {
        startTime = System.currentTimeMillis();
        System.out.println(startTime + " start\n");
        masterRun();

        //where all the modules instances will be sandwiched in

        endTime = System.currentTimeMillis();
        System.out.println(endTime + " end\n");
        speedTime = endTime - startTime;   
        System.out.println(speedTime + " milliseconds") ;
        output = new Output(speedTime, panel);
    }

   public IData getData() {
       return data;
   }

   public MasterControl getMaster() {
       return master;
   }

   public IInput getInput() {
       return input;
   }

   public ICircularShift getCircularShift() {
       return circularShift;
   }

   public IAlphabetizer getAlphabetizer() {
       return alphabetizer;
   }

   public INoiseRemover getNoiseRemover() {
       return noiseRemover;
   }
}