package controller;

import view.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IInput;
import model.Input;
import model.MasterControl;

public class GUIActionListener implements ActionListener {
    
    private Panel panel;
    private Boolean isSort = Boolean.valueOf(false);
    private Boolean isShift = Boolean.valueOf(false);
    private MasterControl master;
    private IInput input = new Input();

    public GUIActionListener(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == panel.getShiftButton()) {
            System.out.println(panel.getShiftButton().isSelected());
            isSort = false;
            isShift = true;

        } else if (source == panel.getAlphaButton()) {
            System.out.println(panel.getAlphaButton().isSelected());
            isShift = false;
            isSort = true;

        } else if (source == panel.getInputButton()) {
            master = new MasterControl(panel);
            //master.setPanel(panel);
            if (isShift) {
                input.setPriority(1);
            } else if (isSort) {
                input.setPriority(2);                
            }
            input.transmitIn(panel.getInputArea().getText());
            
        } else if (source == panel.getClearButton()) {
            panel.getInputArea().setText("");
            panel.getIntermediateArea().setText("");
            panel.getOutputArea().setText("");
        }
        
    }
}
