package All_Classes;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;



public class AddUser extends AddUserCd{        
    public JFrame jframe;

    public JLabel title,label1,label2,label3,label4,label5;
    public JPanel panel1;
    public JTextField user_name, Password, Name, Email;
    public JButton  submit;

    AddUser(String username,String password,String name,String email) {
        super(username, password, name, email);
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


       


      
   


        label1 = new JLabel("Add New admin");
        label1.setBounds(150, 157, 500, 60);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Segoe UI", Font.BOLD, 40));
        jframe.add(label1);

        label2 = new JLabel("   Name is :");
        label2.setBounds(100, 248, 200, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        jframe.add(label2);
        
        
        //for name field1 

        Name =new JTextField();
        Name.setBounds(270, 250, 250, 30);
        Name.setForeground(Color.black);
        Name.setCaretColor(Color.black);
        Name.setBorder(null);
        jframe.add(Name);


        label3 = new JLabel("   Email is  :");
        label3.setBounds(100, 298, 200, 40);
        label3.setForeground(Color.black);
        label3.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        jframe.add(label3);
        

        //field2 in for Email
        Email = new JTextField();
        Email.setBounds(270, 300, 250, 30);
        Email.setForeground(Color.black);
        Email.setBorder(null);
        jframe.add(Email);


        label4 = new JLabel("User name   :");
        label4.setBounds(100, 348, 200, 40);
        label4.setForeground(Color.black);
        label4.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        jframe.add(label4);

        //field3 is for UserName
        user_name = new JTextField();
        user_name.setBounds(270, 350, 250, 30);
        user_name.setForeground(Color.black);
        user_name.setBorder(null);
        jframe.add(user_name);


        label5 = new JLabel("Password :");
        label5.setBounds(100, 398, 200, 40);
        label5.setForeground(Color.black);
        label5.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        jframe.add(label5);




        //field4 is for password
        Password = new JTextField();
        Password.setBounds(270, 400, 250, 30);
        Password.setForeground(Color.black);
        Password.setBorder(null);
        jframe.add(Password);

        submit = new JButton("Sign Up");
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
                String textF1 = user_name.getText().toLowerCase(); 
                String textF2 = Password.getText(); 
                String textF3= Name.getText(); 
                String textF4= Email.getText(); 


                if ( textF1.isEmpty() || textF2.isEmpty() || textF3.isEmpty() || textF4.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);

                } else {


                    adduser(textF1, textF2, textF3,textF4);

                    if (k == 1) {
                        jframe.setVisible(false);
                    }




                }
            }
        });


    }

    public void setVisible(boolean b) {
    }

}