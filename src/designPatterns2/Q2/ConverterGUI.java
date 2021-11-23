package Q2;
/**
 * The ConverterGUI class creates an GUI application and responsible for reading and displaying output
 *
 * @version 1.0.0
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 * @since 11/10/2021
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterGUI {

    private String[] units = {"Mile", "Yard", "Foot"};
    private JFrame frame;

    public ConverterGUI() {
        initializeFrame();
    }

    private void initializeFrame() {
        frame = new JFrame("OOP: Assignment 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
        frame.setLayout(null);
        frame.setPreferredSize(new Dimension(450, 250));
        frame.pack();
        frame.setVisible(true);
    }

    private void initUI() {
        JLabel appTitle = new JLabel("Length Converter Program");
        appTitle.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        appTitle.setBounds(60, 10, 400, 30);

        JTextField inputField = new JTextField(15);
        inputField.setBounds(60, 50, 200, 30);
        JLabel kilometer = new JLabel("Kilometer");
        kilometer.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        kilometer.setBounds(300, 50, 200, 30);

        JTextField outputField = new JTextField(15);
        outputField.setEditable(false);
        outputField.setLocation(10, 200);

        outputField.setBounds(60, 100, 200, 30);
        JComboBox outputUnit = new JComboBox<String>();
        for (String u : units) {
            outputUnit.addItem(u);
        }
        outputUnit.setBounds(300, 100, 80, 30);
        JButton convertButton = new JButton("Convert!");
        convertButton.setBounds(60, 150, 200, 30);
        convertButton.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        frame.add(appTitle);
        frame.add(inputField);
        frame.add(kilometer);
        frame.add(outputField);
        frame.add(outputUnit);
        frame.add(convertButton);

        ActionListener convertListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    String input = inputField.getText();
                    double inputValue = Double.parseDouble(input);
                    if (inputValue < 0) {
                        throw new IllegalArgumentException();
                    }
                    String unit = outputUnit.getSelectedItem().toString();
                    Conversion con = new Conversion(unit, inputValue);
                    String result = Converter.convert(con);
                    System.out.println(result);
                    outputField.setText(result);

                } catch (Exception e) {
                    outputField.setText("Please enter a valid number");
                }
            }
        };

        convertButton.addActionListener(convertListener);
    }
}
