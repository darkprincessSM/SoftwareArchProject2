
import java.util.*;

public class Timer implements ITimer {

    public Timer() {
        long startTime = System.currentTimeMillis();
        //masterRun();
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }

    @Override
    public void runtime() {
        // TODO Auto-generated method stub
        
    }

}