//Necessary Imports
import java.awt.*; 
import javax.swing.*;

public class new extends JFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JLabel Font Style Example"); // Creating a new JFrame with a title
        frame.setLayout(null); // To terminate the default flow layout
        frame.setVisible(true); // To display the frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // To Terminate JFrame and the program on close
        frame.setBounds(100, 200, 400, 400); // To set the bounds of the frame.

        Container c = frame.getContentPane(); //To get content pane layer and add objects in the frame.
       
        //Creating First JLabel Object
        JLabel obj1 = new JLabel("Welcome!"); //Creating a JLabel with title as Welcome 
        obj1.setBounds(100, 100, 300, 30); //Setting the bounds of the label.
        obj1.setFont(new Font("Arial", Font.PLAIN, 30)); //Creating an Arial Font Style with size 30 

        //Creating Second Jlabel Object with different font
        JLabel obj2 = new JLabel("Welcome!"); //Creating same JLabel title as before.
        obj2.setBounds(100, 200, 300, 30); //Setting the same bounds as before.
        obj2.setFont(new Font("Times New Roman", Font.PLAIN, 30)); //Creating an Times New Roman Font Style with size 30

        //Adding the objects in the container frame
        c.add(obj1);
        c.add(obj2);
    }
}