/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

/**
 *
 * @author hp
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.*;

public class Classes_2 extends JFrame {

    private static ClassesVariable ClassesVariableObject = new ClassesVariable();
    public JLabel label[];

    JPanel ui = new JPanel(new GridLayout(10, 1, 4, 4));

    private JButton boxes[];
    private JButton btnAddFlight;

    public Classes_2() {

        ui.setBorder(new EmptyBorder(10, 220, 360, 220));// ( space of frame up button, frame before button, frame down the button ,frame after button)
        setContentPane(ui);
        boxes = new JButton[ClassesVariableObject.counter];

        for (int i = 0; i < ClassesVariableObject.counter; i++) {
            createrCheckBox(i);

        }

        btnAddFlight = new JButton("Back");
        btnAddFlight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TeacherHomePage TeacherHomePageObject = new TeacherHomePage();
                TeacherHomePageObject.setVisible(true);
                dispose();

            }
        });
        btnAddFlight.setBounds(10, 10, 220, 30);// not working
        ui.add(btnAddFlight);

        setTitle("Classes");
        setSize(680, 460);//set the frame in midel( move the frame right to left , move the frame down to up)
        setLocationRelativeTo(null);// set the frame in midel and work with setsize
        pack();
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void createrCheckBox(int i) {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0, 5)));
        boxes[i] = new JButton(ClassesVariableObject.className[i] + "-" + ClassesVariableObject.key[i]);
        boxes[i].setFont(new Font("Georgia", Font.PLAIN, 15));

        boxes[i].setBorder(new EmptyBorder(0, 3, 2, 0));

        ui.add(boxes[i]);

        boxes[i].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                GetStudentUserName GetStudentUserNameObject = new GetStudentUserName();
                GetStudentUserNameObject.get(i);

                ClassStudent ClassStudentObject = new ClassStudent(ClassesVariableObject.className[i]);
                ClassStudentObject.setVisible(true);
                dispose();

            }
        });
    }

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Classes_2();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(0, 0, 666, 410);
                frame.setLocationRelativeTo(null);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
