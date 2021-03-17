package model;

import java.util.*;

import view.Panel;

public interface IInput {

    public void transmitIn(String stringStmt, String noiseStmt);

    public void splitInput(String stringStmt);

    public void splitNoise(String noiseStmt);

    public void printNoiseInput();

    public void printStmt();

    public void setPriority(int num);

}