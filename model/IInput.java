import java.util.*;

public interface IInput {

    public void transmitIn(String stringStmt);

    public void splitInput(String stringStmt);

    public void splitNoise(String noiseStmt);

    public void printNoiseInput();

    public void setPriority(int num);

}