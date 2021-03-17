package view;

import java.util.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import controller.GUIActionListener;
import model.MasterControl;

public class Panel {

    private JFrame window;

    private JTextArea inputArea = new JTextArea(5, 10);
    private JTextArea intermediateArea = new JTextArea(5, 10);
    private JTextArea outputArea = new JTextArea(5, 10);
    private JTextArea noiseArea = new JTextArea();
    private JTextField speedBox = new JTextField();

    private JRadioButton alphaButton = new JRadioButton("Alphabetical Sort");
    private JRadioButton shiftButton = new JRadioButton("Circular Shift");
    private JButton inputButton = new JButton("Enter");
    private JButton clearButton = new JButton("Clear");

    public Panel(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();
        JPanel intermediatePanel = new JPanel();
        JPanel outputPanel = new JPanel();
        JPanel titlePanel = new JPanel();
        JPanel textPanel = new JPanel(); // for all the jtextareas
        JPanel inputPanel = new JPanel();
        JPanel priorityPanel = new JPanel();

        JLabel titleLabel = new JLabel("<html>Team 6: KWIC <br/>Shared Data & OO</html>");
        cp.add(BorderLayout.NORTH, titlePanel);
        Border bevelBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        titlePanel.setPreferredSize(new Dimension(1000, 120));
        titlePanel.setBackground(Color.lightGray);
        titlePanel.setForeground(Color.black);
        titlePanel.add(titleLabel);

        JLabel noiseLabel = new JLabel("                 Noise Words: ");
        noiseArea.setText("a\nan\nthe\nand\nor\nof\nto\nbe\nis\nin\nout\nby\nas\nat\noff");
        titlePanel.add(noiseLabel);
        titlePanel.add(noiseArea);
        JScrollPane noiseScrollPane = new JScrollPane(noiseArea);
        // noiseScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        titlePanel.add(noiseScrollPane);
        noiseArea.setEditable(true);
        noiseArea.setLineWrap(false);
        noiseScrollPane.setBorder(bevelBorder);
        noiseScrollPane.setPreferredSize(new Dimension(200, 100));

        JLabel speedLabel = new JLabel("                  Performance Speed:");
        titlePanel.add(speedLabel);
        titlePanel.add(speedBox);
        speedBox.setPreferredSize(new Dimension(150, 27));
        speedBox.setBorder(bevelBorder);

        cp.add(BorderLayout.CENTER, textPanel); // text panel consists of each indiv. text panel
        textPanel.setPreferredSize(new Dimension(1027, 590));

        Border loweredbeveled = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        GUIActionListener listener = new GUIActionListener(this);

        // area for entering input phrases
        textPanel.add(inputPanel, BorderLayout.NORTH);
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        inputPanel.setPreferredSize(new Dimension(336, 597));
        JLabel inputLabel = new JLabel("   Input ");
        inputPanel.add(inputLabel);
        JLabel blankLabel = new JLabel("                               ");

        inputPanel.add(inputArea);
        inputPanel.setBackground(Color.lightGray);
        inputPanel.setForeground(Color.black);
        JScrollPane inputScrollPane = new JScrollPane(inputArea);
        inputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        inputPanel.add(inputScrollPane);
        inputArea.setEditable(true);
        inputArea.setLineWrap(false);
        inputScrollPane.setBorder(bevelBorder);
        inputScrollPane.setPreferredSize(new Dimension(334, 527));
        inputPanel.add(blankLabel);
        // inputPanel.add(inputButton);
        // inputButton.addActionListener(listener);
        inputPanel.add(clearButton);
        clearButton.addActionListener(listener);

        // displaying the middle step
        intermediatePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel intermediateLabel = new JLabel(" Second Step    ");
        textPanel.add(intermediatePanel, BorderLayout.CENTER);
        intermediatePanel.setPreferredSize(new Dimension(336, 595));
        intermediatePanel.add(intermediateLabel);
        intermediatePanel.add(intermediateArea);
        intermediatePanel.setBackground(Color.lightGray);
        intermediatePanel.setForeground(Color.black);
        JScrollPane intermediateScrollPane = new JScrollPane(intermediateArea);
        intermediateScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        intermediatePanel.add(intermediateScrollPane);
        intermediateArea.setEditable(false);
        intermediateArea.setLineWrap(false);
        Border intermediateBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        intermediateScrollPane.setBorder(intermediateBorder);
        intermediateScrollPane.setPreferredSize(new Dimension(334, 527));

        // displaying the output
        Border outputBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        outputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel outputLabel = new JLabel("  Final Output      ");
        textPanel.add(outputPanel, BorderLayout.SOUTH);
        outputPanel.setPreferredSize(new Dimension(336, 597));
        outputPanel.add(outputLabel, BorderLayout.NORTH);
        outputPanel.add(outputArea, BorderLayout.CENTER);
        outputPanel.setBackground(Color.lightGray);
        outputPanel.setForeground(Color.black);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);
        outputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        outputPanel.add(outputScrollPane);
        outputArea.setEditable(false);
        outputArea.setLineWrap(false);
        outputScrollPane.setBorder(outputBorder);
        outputScrollPane.setPreferredSize(new Dimension(334, 527));

        // for setting priority
        cp.add(BorderLayout.SOUTH, priorityPanel);
        ButtonGroup priorityGroup = new ButtonGroup();
        priorityGroup.add(shiftButton);
        priorityGroup.add(alphaButton);

        TitledBorder titledPriorityBorder;
        titledPriorityBorder = BorderFactory.createTitledBorder(loweredbeveled, "Priority");
        titledPriorityBorder.setTitleJustification(TitledBorder.CENTER);
        titledPriorityBorder.setTitleColor(Color.black);

        priorityPanel.setBorder(titledPriorityBorder);
        priorityPanel.setBackground(Color.gray);
        priorityPanel.setForeground(Color.white);
        priorityPanel.add(inputButton);
        inputButton.addActionListener(listener);
        priorityPanel.add(shiftButton);
        priorityPanel.add(alphaButton);
        shiftButton.setSelected(true);
        shiftButton.setBackground(Color.gray);
        shiftButton.setForeground(Color.black);
        shiftButton.addActionListener(listener);
        alphaButton.setBackground(Color.gray);
        alphaButton.setForeground(Color.black);
        alphaButton.addActionListener(listener);

    }

    public JTextArea getInputArea() {
        return inputArea;
    }

    public JTextArea getIntermediateArea() {
        return intermediateArea;
    }

    public JTextArea getOutputArea() {
        return outputArea;
    }

    public JTextArea getNoiseArea() {
        return noiseArea;
    }

    public JTextField getSpeedBox() {
        return speedBox;
    }

    public JRadioButton getShiftButton() {
        return shiftButton;
    }

    public JRadioButton getAlphaButton() {
        return alphaButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getInputButton() {
        return inputButton;
    }

}