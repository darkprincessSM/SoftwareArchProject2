package view;

import model.MasterControl;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Starter {

    private Panel panel;

    public Starter() {
        startGui();
    }

    public void startGui() {
        JFrame window = new JFrame();
        // ImageIcon pipePic = new ImageIcon("pipe.png");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(400, 100);
        // window.setIconImage(pipePic.getImage());
        window.setTitle("KWIC: Shared Data & OO");

        Panel panel = new Panel(window);
        panel.init();

        window.pack();
        window.setVisible(true);

        window.setResizable(true);

    }

    public Panel getPanel() {
        return panel;
    }
    // public void start(ArrayList<String> inputStmt) {
    // // TODO implement here
    // return null;
    // }

}
