package All_Classes;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel extends LogInCd{
    public JFrame jFrame;
    public JLabel l1,l2,l3,l4,l5;
    public JPanel jPanel,P1,P2,P2_1,P2_2,P3,P4,P5,P6;
    public JTextField textField;
    public JPasswordField passwordField;
    public JButton jButton1,jButton3,back;

    public AdminPanel() 
    {
        //creating JFrame
        jFrame= new JFrame("Admin Panel");
        jFrame.setSize(750,640);
        jPanel=new JPanel();
        jPanel.setSize(730,600);
        P1=new JPanel();
        P1.setBounds(5,5,730,70);
        P1.setBackground(Color.decode("#42f5ad"));
        P1.setLayout(null);

        l1=new JLabel("Welcome to the admin panel");
        l1.setBounds(180,6,500,60);
        l1.setFont(new Font("Serif", Font.PLAIN, 34));
        l1.setBackground(Color.decode("#42f5ad"));
        l1.setLayout(null);
        P1.add(l1);
        jPanel.add(P1);

        P2 =new JPanel();
        P2.setBounds(5,80,320,510);
        P2.setBackground(Color.red);
        P2.setLayout(null);
        P2_1 =new JPanel();
        P2_1.setBounds(5,130,300,170);
       

        
        ImageIcon icon = new ImageIcon("Images/forth.jpg");
        P2_1.add(new JLabel(icon));
        P2_1.setBackground(Color.red);
        P2.add(P2_1);

        P2_2 =new JPanel();
        P2_2.setBounds(5,300,300,90);
        P2_2.setBackground(Color.green);


        back=new JButton("Back in Login");
        back.setFont(new Font("Serif", Font.PLAIN, 18)); 
        back.setOpaque(true);
        back.setBackground(Color.ORANGE);
        back.setBounds(20, 20, 140, 30);
        P2.add(back);

        back.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
            System.out.println("Admin Panel to Login");
            new LoginPanel().setVisible(true);
            jFrame.setVisible(false);
          }
        });




        ImageIcon icon1 = new ImageIcon("Images/fifth.jpg");
        P2_2.setBackground(Color.red);
        P2_2.add(new JLabel(icon1));
        P2.add(P2_2);

        P3 =new JPanel();
        P3.setBounds(330,80,400,510);
        P3.setLayout(null);
        //P3.setBackground(Color.green);
        

        l2=new JLabel("  Choose anything you want");
        Border border = BorderFactory.createLineBorder(Color.BLUE, 4); 
        l2.setBorder(border);
        l2.setOpaque(true);
        l2.setBounds(20,10,350,40);
        l2.setFont(new Font("Serif", Font.PLAIN, 28));
        
        P3.add(l2);

        l3=new JLabel(" New 'Death' ADD click 'Add New'");
        l3.setBackground(Color.decode("#FBCCFF"));
        l3.setOpaque(true);
        l3.setBounds(20,100,360,40);
        l3.setFont(new Font("Serif", Font.PLAIN, 24));
       
        P3.add(l3);

        jButton1=new JButton("Add new");
        jButton1.setBounds(130,150,160,30);
        jButton1.setOpaque(true);
        jButton1.setBackground(Color.decode("#D42F566"));
        jButton1.setForeground(Color.WHITE);
        jButton1.setFont(new Font("Serif", Font.PLAIN, 24));
        P3.add(jButton1);
        P3.setBackground(Color.decode("#FBCCFF"));
    

        l5=new JLabel(" New admin add click 'Add Admin'");
        l5.setOpaque(true);
        l5.setBackground(Color.decode("#FBCCFF"));
        l5.setBounds(10,300,360,40);
        l5.setFont(new Font("Serif", Font.PLAIN, 24));
       
        P3.add(l5);

        jButton3=new JButton("Add Admin");
        jButton3.setBounds(130,350,160,30);
        jButton3.setBackground(Color.decode("#D42F566"));
        jButton3.setForeground(Color.WHITE);
        jButton3.setOpaque(true);
        jButton3.setFont(new Font("Serif", Font.PLAIN, 24));
        P3.add(jButton3);

    
        
        jPanel.add(P3);
        jPanel.add(P2);
        jPanel.setLayout(null);
        jFrame.add(jPanel);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
             
                jFrame.setVisible(false);
              new AddDeath("textF1","textF2","textF3","TextF4");
              System.out.println("Add new Button clicked");
            }
          });  


          jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                

              jFrame.setVisible(false);
              new AddUser("username", "password", "name", "email").setVisible(true);
              System.out.println("Delete Button clicked");
            }
          });


      
          jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          jFrame.setLocationRelativeTo(null);
          jFrame.setLayout(null);
          jFrame.setVisible(true);
          jFrame.setResizable(false);
        
  }

public void setVisible(boolean b) {
}
}