package id.smkn4.pbo.studentData.classes;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection getKoneksi(String host, String port, String username, String password, String db) {
        String konString = "jdbc:mysql://" + host + ":" + port + "/" + db;
        Connection koneksi;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(konString, username, password);
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Koneksi database error");
            koneksi = null;
        }

        return koneksi;
    }
}
