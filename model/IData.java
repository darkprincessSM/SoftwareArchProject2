package model;

import java.util.*;

public interface IData {

    public void setCaStmt(ArrayList<String> circ);

    public void setAlphaStmt(ArrayList<String> alpha);

    public void setOutputStmt(ArrayList<String> output);

    public ArrayList<String> getCaStmt();

    public ArrayList<String> getInputStmt();

    public ArrayList<String> getAlphaStmt();

    public ArrayList<String> getNoiseStmt();

    public ArrayList<String> getOutputStmt();

    public void setInputStmt(ArrayList<String> input);

    public void setNoiseStmt(ArrayList<String> noise);

}