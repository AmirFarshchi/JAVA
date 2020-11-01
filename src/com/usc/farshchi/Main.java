package com.usc.farshchi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {

    public static void main(String[] args) {

        //ComboBox Swing
        JFrame jComboBox = new JFrame("ComboBox Example");
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JButton btn = new JButton("Show");
        btn.setBounds(200, 100, 75, 20);
        String languages[] = {"C", "C++", "C#", "Java", "PHP"};
        JComboBox combo = new JComboBox(languages);
        combo.setBounds(50, 100, 90, 20);
        jComboBox.add(combo);
        jComboBox.add(label);
        jComboBox.add(btn);
        jComboBox.setLayout(null);
        jComboBox.setSize(350, 350);
        jComboBox.setVisible(true);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: "
                        + combo.getItemAt(combo.getSelectedIndex());
                label.setText(data);
            }
        });
        jComboBox.setSize(400, 400);
        jComboBox.setLayout(null);
        jComboBox.setVisible(true);



        //////////////////////////////////CheckBox Swing

//        JFrame jCheckBox = new JFrame("CheckBox Example");
//        JLabel jlabel = new JLabel();
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setSize(400, 100);
//        JCheckBox checkbox1 = new JCheckBox("C++");
//        checkbox1.setBounds(150, 100, 50, 50);
//        JCheckBox checkbox2 = new JCheckBox("Java");
//        checkbox2.setBounds(150, 150, 50, 50);
//        f.add(checkbox1);
//        f.add(checkbox2);
//        f.add(label);
//        checkbox1.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent e) {
//                label.setText("C++ Checkbox: "
//                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
//            }
//        });
//        checkbox2.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent e) {
//                label.setText("Java Checkbox: "
//                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
//            }
//        });
//        jCheckBox.setSize(400, 400);
//        jCheckBox.setLayout(null);
//        jCheckBox.setVisible(true);



        ///////////////////////////////////RadioButton Swing
//        JFrame jRadioButton = new JFrame("CheckBox Example");
//        JRadioButton rbMale, rbFemale;
//        JButton btn = new JButton("Click");
//        rbMale = new JRadioButton("Male");
//        rbMale.setBounds(100, 50, 100, 30);
//        rbFemale = new JRadioButton("Female");
//        rbFemale.setBounds(100, 100, 100, 30);
//        ButtonGroup btnGroup = new ButtonGroup();
//        btnGroup.add(rbMale);
//        btnGroup.add(rbFemale);
//        btn.setBounds(100, 150, 80, 30);
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (rbMale.isSelected()) {
//                    JOptionPane.showMessageDialog(jRadioButton, "You are Male.");
//                }
//                if (rbFemale.isSelected()) {
//                    JOptionPane.showMessageDialog(jRadioButton, "You are Female.");
//                }
//
//            }
//        });
//        jRadioButton.add(rbMale);
//        jRadioButton.add(rbFemale);
//        jRadioButton.add(btn);
//        jRadioButton.setSize(400, 400);
//        jRadioButton.setLayout(null);
//        jRadioButton.setVisible(true);

    }
}
