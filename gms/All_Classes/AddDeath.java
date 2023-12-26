package All_Classes;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;



public class AddDeath extends AddDeathCd{        
    JFrame jframe;

    JLabel title,label1,label2,label3,label4,label5;
    JPanel panel1;
    JTextField field1, field2, field3, field4;
    JButton  submit;

    AddDeath(String textF1,String textF2,String textF3,String textF4) {
        super(textF1, textF2, textF3,textF4);
        jframe = new JFrame();
        jframe.setSize(700, 600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setLayout(null);
        jframe.getContentPane().setBackground(new Color (135, 206, 235));

        title = new JLabel("Graveyard Management System ");
        title.setBounds(50, 30, 580, 80);
        title.setFont(new Font("Segoe UI", Font.BOLD, 35));
        jframe.add(title);


       


      
   


        label1 = new JLabel("Add New Death");
        label1.setBounds(150, 157, 500, 60);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Segoe UI", Font.BOLD, 40));
        jframe.add(label1);

        label2 = new JLabel("   Name    :");
        label2.setBounds(100, 248, 200, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        jframe.add(label2);
        
        
        //for name field1 

        field1 = new JTextField();
        field1.setBounds(270, 250, 250, 30);
        field1.setForeground(Color.black);
        field1.setCaretColor(Color.black);
        field1.setBorder(null);
        jframe.add(field1);


        label3 = new JLabel("   Gender     :");
        label3.setBounds(100, 298, 200, 40);
        label3.setForeground(Color.black);
        label3.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        jframe.add(label3);
        

        //field2 in for gender
        field2 = new JTextField();
        field2.setBounds(270, 300, 250, 30);
        field2.setForeground(Color.black);
        field2.setBorder(null);
        jframe.add(field2);


        label4 = new JLabel("Date of birth :");
        label4.setBounds(100, 348, 200, 40);
        label4.setForeground(Color.black);
        label4.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        jframe.add(label4);

        //field3 is for date of birth
        field3 = new JTextField();
        field3.setBounds(270, 350, 250, 30);
        field3.setForeground(Color.black);
        field3.setBorder(null);
        jframe.add(field3);


        label5 = new JLabel("Date of death :");
        label5.setBounds(100, 398, 200, 40);
        label5.setForeground(Color.black);
        label5.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        jframe.add(label5);




        //field4 is for date of death
        field4 = new JTextField();
        field4.setBounds(270, 400, 250, 30);
        field4.setForeground(Color.black);
        field4.setBorder(null);
        jframe.add(field4);

        submit = new JButton("Submit");
        submit.setBounds(220, 450, 135, 40);
        submit.setFont(new Font("Segoe UI", Font.BOLD, 20));
        submit.setBackground(Color.red);
        submit.setForeground(Color.white);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.setFocusPainted(false);
        jframe.add(submit);

        
        jframe.setVisible(true);
        jframe.setResizable(false);


        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textF1 = field1.getText().toLowerCase(); 
                String textF2 = field2.getText(); 
                String textF3= field3.getText(); 
                String textF4= field4.getText(); 


                if ( textF1.isEmpty() || textF2.isEmpty() || textF3.isEmpty() || textF4.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);

                } else {


                    adddeath(textF1, textF2, textF3,textF4);

                    if (k == 1) {
                        jframe.setVisible(false);
                    }




                }
            }
        });


    }

}