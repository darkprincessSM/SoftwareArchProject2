package model;

import java.util.ArrayList;

public interface IOutput {

    public void print(ArrayList<String> stmt);

    public void printPerformance(long time);

}