package model;

import java.util.*;

import view.Panel;

public interface IInput {

    public void transmitIn(String stringStmt, String noiseStmt);

    public void splitInput(String stringStmt);

    public void splitNoise(String noiseStmt);

    public ArrayList<String> getNoise();

    public ArrayList<String> getStmt();
    
    public void setStmt(ArrayList<String> inputStmt);

    public int getPriority();

    public void setPriority(int num);

}