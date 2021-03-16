
import java.io.File;
import java.util.*;

public interface IData {

    public ArrayList<String> getInputStmt();
    public void setInputStmt();
    public ArrayList<String> getCsStmt();
    public void setCsStmt(ArrayList<String> csStmt);
    public ArrayList<String> getAlphaStmt();
    public void setAlphaStmt(ArrayList<String> alphaStmt);
    public ArrayList<String> getOutputStmt();
    public void setOutputStmt(ArrayList<String> outputStmt);
    public File getNoiseBank();
    public ArrayList<String> getMiddleStmt();
    public void setMiddleStmt(ArrayList<String> middleStmt);

}