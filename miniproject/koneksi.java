package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    private String url="jdbc:mysql://localhost/saladmoy";
    private String username_xampp="root";
    private String password_xampp="";
    Connection conDB;
    
    public void connect(){
        try {
            conDB=DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
    }    
    public Connection getCon() {
        return conDB;
    }
    }

