import java.util.*;


public interface INoiseRemover {

    public void readNoise(ArrayList<String> csStmt);
    public ArrayList<String> removeNoise(ArrayList<String> csStmt);

}