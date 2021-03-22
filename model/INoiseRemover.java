package model;

import java.util.*;

public interface INoiseRemover {

    public void readNoise(ArrayList<String> noise);

    public ArrayList<String> removeNoise(ArrayList<String> csStmt);

}