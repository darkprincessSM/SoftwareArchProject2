package model;

import java.util.*;

public class CircularShift implements ICircularShift {

    @Override
    public ArrayList<String> shift(ArrayList<String> inputStmt) {
        ArrayList<String> shiftedStmt = new ArrayList<String>();
        String newLine = "";
        String oldLine = "";
        String[] parts;
        for (int i = 0; i < inputStmt.size(); i++) {
            shiftedStmt.add(inputStmt.get(i));
            oldLine = inputStmt.get(i);
            for (int j = 0; j < inputStmt.get(i).split(" ").length - 1; j++) {
                parts = oldLine.split(" ");
                for (int k = 1; k < parts.length; k++) {
                    newLine += parts[k] + " ";
                }
                newLine += parts[0];
                shiftedStmt.add(newLine);
                oldLine = newLine;
                newLine = "";
            }
        }
        return shiftedStmt;
    }

}