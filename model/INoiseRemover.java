import java.util.*;

public interface INoiseRemover {

    public void readNoise(ArrayList<String> Noise);

    public ArrayList<String> removeNoise(ArrayList<String> csStmt);

}