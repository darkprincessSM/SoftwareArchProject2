package model;

import java.io.File;
import java.util.*;

public interface IData {

    public ArrayList<String> getInputStmt();

    public void setInputStmt();

    public ArrayList<String> getCaStmt();

    public void setCaStmt();

    public ArrayList<String> getAlphaStmt();

    public void setAlphaStmt();

    public ArrayList<String> getOutputStmt();

    public void setOutputStmt();

    public File getNoiseBank();

}