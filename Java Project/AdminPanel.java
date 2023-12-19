import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class AdminPanel extends JFrame{
    public JFrame jFrame;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    public JPanel jPanel,P1,P2,P2_1,P2_2,P2_3;
  
    public JButton jButton1,jButton2;

    public AdminPanel() 
    {
        //creating JFrame
        jFrame= new JFrame("Admin Panel");
        jFrame.setSize(750,640);
        jPanel=new JPanel();
        jPanel.setSize(750,600);

        
        P1=new JPanel();
        P1.setBounds(0,0,250,600);
        P1.setBackground(Color.YELLOW);
        P1.setLayout(null);
        jPanel.setLayout(null);
        


        l1=new JLabel("The Death");
        l1.setFont(new Font("Serif", Font.PLAIN, 24)); 
       // Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        //l1.setBorder(border1);
        l1.setOpaque(true);
        l1.setBackground(Color.YELLOW);
        l1.setBounds(10, 10, 200, 30);
        P1.add(l1);

        l2=new JLabel("You Are");
        l2.setFont(new Font("Serif", Font.PLAIN, 24)); 
       // Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        //l1.setBorder(border1);
        l2.setOpaque(true);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(10, 50, 200, 30);
        l2.setOpaque(true);
        P1.add(l2);

        l3=new JLabel("Running");
        l3.setFont(new Font("Serif", Font.PLAIN, 24)); 
       // Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        //l1.setBorder(border1);
        l3.setOpaque(true);
        l3.setBackground(Color.YELLOW);
        l3.setBounds(10, 90, 200, 30);
        l3.setOpaque(true);
        P1.add(l3);
        jPanel.add(P1);

        l4=new JLabel("Away From");
        l4.setFont(new Font("Serif", Font.PLAIN, 24)); 
       // Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        //l1.setBorder(border1);
        l4.setOpaque(true);
        l4.setBackground(Color.YELLOW);
        l4.setBounds(10, 130, 200, 30);
        l4.setOpaque(true);
        P1.add(l4);

        l5=new JLabel("will inevitably");
        l5.setFont(new Font("Serif", Font.PLAIN, 24)); 
       // Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        //l1.setBorder(border1);
        l5.setOpaque(true);
        l5.setBackground(Color.YELLOW);
        l5.setBounds(10, 170, 200, 30);
        l5.setOpaque(true);
        P1.add(l5);

        l6=new JLabel("Come to you");
        l6.setFont(new Font("Serif", Font.PLAIN, 24)); 
       // Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        //l1.setBorder(border1);
        l6.setOpaque(true);
        l6.setBackground(Color.YELLOW);
        l6.setBounds(10, 210, 200, 30);
        l6.setOpaque(true);
        P1.add(l6);

        l7=new JLabel("[Quran 62:8]");
        l7.setFont(new Font("Serif", Font.PLAIN, 24)); 
       // Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        //l1.setBorder(border1);
        l7.setOpaque(true);
        l7.setBackground(Color.yellow);
        l7.setBounds(10, 250, 200, 30);
        l7.setOpaque(true);
        P1.add(l7);
        jPanel.add(P1);


        P2=new JPanel();
        P2.setBackground(Color.gray);
        P2.setBounds(250,0,500,600);
        

        P2_1=new JPanel();
        P2_1.setBounds(50,10,390,40);
        P2_1.setBackground(Color.red);

        l8=new JLabel("Graveyard Management System");
        l8.setFont(new Font("Serif", Font.PLAIN, 24)); 
       // Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        //l1.setBorder(border1);
        l8.setOpaque(true);
        l8.setBackground(Color.red);
        l8.setBounds(5, 0, 380, 30);
        P2_1.add(l8);
        P2.add(P2_1);

        P2_2=new JPanel();
        P2_2.setBounds(50,100,400,197);
        ImageIcon icon = new ImageIcon("third.jpg");
        P2_2.setBackground(Color.gray);
        P2_2.add(new JLabel(icon));
        P2.add(P2_2);

        P2_3=new JPanel();
        P2_3.setBounds(15,310,460,250);
        l9=new JLabel("ADMIN PANEL");
        l9.setFont(new Font("Serif", Font.PLAIN, 26)); 
        l9.setBounds(150,10,200,30);
        l9.setOpaque(true);
        P2_3.setLayout(null);
        P2_3.add(l9);
        P2.add(P2_3);
        


        P2.setLayout(null);
        jPanel.setLayout(null);
        jPanel.add(P2);
        jFrame.add(jPanel);


      /*  P11=new JPanel();
        P11.setBounds(20,0,460,50);

        jLabel1=new JLabel("Graveyard Management System");
        jLabel1.setFont(new Font("Serif", Font.PLAIN, 36)); 
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3); 
       jLabel1.setBorder(border);
        jLabel1.setOpaque(true);
         jLabel1.setBounds(00,00,460,50);
        jLabel1.setBackground(Color.ORANGE); //adding the color of the background
        P11.add(jLabel1);
        P11.setLayout(null);
        P1.add(P11);


        
        P12= new JPanel();
        P12.setBackground(Color.BLUE);
        P12.setBounds(0,55,505,370);
        ImageIcon icon = new ImageIcon("second.jpg");
        P12.add(new JLabel(icon));
        P1.add(P12);
        P1.setLayout(null);
        jPanel.add(P1);



        P2=new JPanel();
        P2.setBackground(Color.green);
        P2.setBounds(10,440,760,200);
        l2=new JLabel("Every soul will taste Death [Quran 3:185]");
        l2.setFont(new Font("Serif", Font.PLAIN, 24)); 
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2); 
        l2.setBorder(border1);
        l2.setOpaque(true);
        l2.setBackground(Color.ORANGE);
        l2.setBounds(160, 3, 440, 30);
        P2.add(l2);

        P21=new JPanel();
        P21.setBackground(Color.red);
        P21.setBounds(10,35,740,300);
        
        l3=new JLabel(" To see the list of death Clict in 'Death List' ");
        l3.setFont(new Font("Serif", Font.PLAIN, 25)); 
        l3.setOpaque(true);
        l3.setBackground(Color.ORANGE);
        l3.setBounds(150, 3, 440, 30);
        P21.add(l3);
        P2.add(P21);
        

        jButton1=new JButton("Death List");
        jButton1.setBounds(240,80,280,25);
        jButton1.setFont(new Font("abadi", Font.PLAIN, 24));
        P2.add(jButton1);


        
        l4=new JLabel(" For Adding and Deleting Go to admin panel ");
        l4.setFont(new Font("Serif", Font.PLAIN, 25)); 
        l4.setOpaque(true);
        l4.setLayout(null);
        l4.setBackground(Color.ORANGE);
        l4.setBounds(140, 80, 480, 30);
        P21.add(l4);
        P2.add(P21);
        

        jButton2=new JButton("Admin Panel");
        jButton2.setBounds(240,155,280,25);
        jButton2.setFont(new Font("abadi", Font.PLAIN, 24));
        P2.add(jButton2);

        jButton2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            jFrame.setVisible(false);
            new FirstHome().setVisible(true);
            System.out.println("Admin Panel Button Clicked");
          }
        });


        
        */
        
        // P2.setLayout(null);
        // jPanel.add(P2);

        // P21.setLayout(null);
        
        
        
        
        
        // jPanel.setLayout(null);
        // jFrame.add(jPanel);
        jFrame.setLayout(null);
      
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        
        
  }
  public static void main(String[] args) {
    new AdminPanel();
  }

}