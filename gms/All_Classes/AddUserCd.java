package All_Classes;
import Oparetions.*;
import javax.swing.*;
import java.io.*;
public class AddUserCd implements AddUserOp {

    String username;
    String password;
    int k = 0;

    AddUserCd(String username,String password,String name,String email) {
        this.username= username;
        this.password= password;

    }

    public void adduser(String username,String password,String name,String email) {

    {


            try {
                File file = new File(".\\Data\\admin_data.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter FileW = new FileWriter(file, true);
                BufferedWriter BufferW = new BufferedWriter(FileW);
                PrintWriter PrintW = new PrintWriter(BufferW);

                PrintW.println("User_Name:" + username);
                PrintW.println("PassWord:" + password);
                PrintW.println("===============================================");
                PrintW.close();

                JOptionPane.showMessageDialog(null,
                        "New User Successfully Added to the admin panel",
                        "Complete", -1);
                new AdminPanel();
                k = 1;

            } catch (Exception ex) {
                System.out.print(ex);
            }

            
        }
}
    
}
