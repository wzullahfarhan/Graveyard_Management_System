import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.Icon;
public class WelcomeNote {
    public JFrame jFrame;
    public JLabel jLabel;
    public JTextField jTextField;
    public JButton jButton;
    public JTextArea jTextArea;

    public WelcomeNote(){
        //making Frame
        String string = "C:\\Users\\wzull\\Music\\Java Project\\first.jpg";
        jFrame= new JFrame("Welcome Note",ImageIcon(string));
        
        
        //jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // jLabel.setBackground(Color(153, 153, 255));
        //jLabel.setFont(Font("Segoe UI", 1, 36)); // NOI18N
      //  jLabel.setForeground(Color(153, 153, 255));
        jLabel.setText("Graveyard Management System");
        jLabel.setBounds(150, 30, 150,30);
       // jLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        //jLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
       // jLabel.setEnabled(false);



        
    /*    //making Button
        jButton=new JButton("Start");
        jButton.setBounds(150,260,100,30); //button bounds
        jFrame.add(jButton); //adding The button in the frame
        jLabel=new JLabel("my First Project");
        jLabel.setBounds(150, 30, 150,30); //level Bounds
        jFrame.add(jLabel);//adding to the frame
        //making text field
        jTextField=new JTextField();
        jTextField.setBounds(150,70,100,30);//textField Bounds
        jFrame.add(jTextField);
        */
       //  jTextArea=new JTextArea();
      //  jTextArea.setBounds(10,30,380,350);
     //   jTextArea.setBackground(Color.BLACK);
     //   jTextArea.setForeground(Color.WHITE);
       // jFrame.add(jTextArea);
      //  jButton.addActionListener(this);
        jFrame.add(jLabel);

       /* jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                jLabel.setText("My second Project");
                jTextField.setText("I can do it");
                jButton.setVisible(false);
            }
            
        }); */

    }

    
    
            
        

    public static void main(String[] args) {
        new WelcomeNote();
    }
}