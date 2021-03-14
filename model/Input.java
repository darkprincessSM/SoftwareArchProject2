package model;
import java.util.*;

public class Input implements IInput {

    private ArrayList<String> inputStmt;
    private int priority = 1;

    public Input() {
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
        }

    @Override
    public void splitInput(String stringStmt) {
        inputStmt = new ArrayList<>(Arrays.asList(stringStmt.split("\\r?\\n|\\r")));
        
    }
    
        
    }

}