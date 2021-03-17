package model;

import java.util.*;

public class NoiseRemover implements INoiseRemover {

    private ArrayList<String> noise;

    public NoiseRemover() {
    }

    @Override
    public void readNoise(ArrayList<String> noise) {
        this.noise = noise;

    }

    @Override
    public ArrayList<String> removeNoise(ArrayList<String> csStmt) {
        ArrayList<String> removeLines = new ArrayList<String>();

        String firstWord;
        for (var s : csStmt) {
            s.trim();
            firstWord = s.substring(0, s.indexOf(" "));
            for (var w : noise) {
                if (firstWord.equalsIgnoreCase(w)) {
                    removeLines.add(s);
                }
            }
        }
        csStmt.removeAll(removeLines);
        return csStmt;
    }
}