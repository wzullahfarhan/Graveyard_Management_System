package All_Classes;
import Oparetions.*;
import javax.swing.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class AddDeathCd implements AddDeathOp {

    String textF1;
    String textF2;
    String textF3;
    String textF4;
    int k = 0;

    AddDeathCd(String textF1, String textF2, String textF3, String textF4) {
        this.textF1 = textF1;
        this.textF2= textF2;
        this.textF3= textF3;
        this.textF4= textF4;

    }

    public void adddeath(String textF1, String textF2, String textF3,String textF4) {

    {


            try {
                File file = new File(".\\Data\\death_data.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter FileW = new FileWriter(file, true);
                BufferedWriter BufferW = new BufferedWriter(FileW);
                PrintWriter PrintW = new PrintWriter(BufferW);

                LocalDateTime Datentime = LocalDateTime.now();
                DateTimeFormatter FormatDT = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                String TimeAdDate = Datentime.format(FormatDT);

                PrintW.println("Name : " + textF1);
                PrintW.println("Gender : " + textF2);
                PrintW.println("Death of Birth : " + textF3);
                PrintW.println("Death of Death : " + textF4);
                PrintW.println("Adding Date & time : " + TimeAdDate);
                PrintW.println("===============================================");
                PrintW.close();

                JOptionPane.showMessageDialog(null,
                        "New Death Successfully Added to the list",
                        "Complete", -1);
                new AdminPanel();
                k = 1;

            } catch (Exception ex) {
                System.out.print(ex);
            }
        }
}
    
}
