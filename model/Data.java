
import java.io.File;
import java.util.*;

public class Data implements IData {

    public Data() {
    }

    private ArrayList<String> inputStmt;
    private ArrayList<String> csStmt;
    private ArrayList<String> alphaStmt;
    private ArrayList<String> outputStmt;
    private File noiseBank;

    @Override
    public ArrayList<String> getInputStmt() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<String> getCaStmt() {
        return csStmt;
    }

    @Override
    public ArrayList<String> getAlphaStmt() {
        return alphaStmt;
        
    }

    @Override
    public ArrayList<String> getOutputStmt() {
        return outputStmt;
    }

    @Override
    public void setInputStmt() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setCaStmt() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setAlphaStmt() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setOutputStmt() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public File getNoiseBank() {
        return noiseBank;
    }

}