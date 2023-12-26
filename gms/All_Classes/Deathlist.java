package All_Classes;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Deathlist {                                                  // SHOW Deathlist

   public  JFrame jFrame;
   public  JLabel label2,l11,title;
   public JScrollPane scroll;
   public JTable table;
   public DefaultTableModel model;
   public JButton back;

    private String[] column = { "Name", "Gender", "Date of Birth", "Date of Death","Adding Date & Time" };
    private String[] rows = new String[7];

    Deathlist() {

        jFrame = new JFrame();

        jFrame.setBackground(Color.decode("#F9FFB6"));


        title = new JLabel("Graveyard Management System");
        title.setBounds(200, 0, 700, 45);
        title.setFont(new Font("Segoe UI", Font.BOLD, 25));
        jFrame.add(title);


        l11 = new JLabel("Everyone shall test death");
        l11.setBounds(280, 30, 500, 60);
        l11.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        jFrame.add(l11);




        label2 = new JLabel("The list of death");
        label2.setBounds(10, 150, 500, 40);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 30));
        jFrame.add(label2);
        




        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.decode("#D8F7FF"));
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(240);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        table.getColumnModel().getColumn(2).setPreferredWidth(140);
        table.getColumnModel().getColumn(3).setPreferredWidth(140);
        table.getColumnModel().getColumn(4).setPreferredWidth(160);

        scroll = new JScrollPane(table);
        scroll.setBounds(1, 200, 770, 550);
        scroll.setBackground(Color.cyan);
        jFrame.add(scroll);


        back=new JButton("Back");
        back.setFont(new Font("Serif", Font.PLAIN, 18)); 
        back.setOpaque(true);
        back.setBackground(Color.ORANGE);
        back.setBounds(20, 20, 80, 30);
        jFrame.add(back);

        back.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
            System.out.println("Death list to home");
            new FirstHome().setVisible(true);
            jFrame.setVisible(false);
          }
        });
        String file = ".//Data//death_data.txt";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("Name")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(7); // Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get(i+1).substring(9);// gender
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(16); // date of birth
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(16); // date of death
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(14); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            showMessageDialog(null, " Something is wrong,Try later", "warning", 2);
            return;

        }
        jFrame.setSize(775, 700);
        jFrame.getContentPane().setBackground(new Color (120, 200, 250));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setResizable(false);


    }
    public void setVisible(boolean b) {
    }
}
