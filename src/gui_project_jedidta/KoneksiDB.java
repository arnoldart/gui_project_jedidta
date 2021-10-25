package gui_project_jedidta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.*;

public class KoneksiDB {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if(koneksi == null) {
            try {
                String url = "jbdc:mysql://localhost:3306/DataKaryawan";
                String username = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.jbdc.Driver());
                koneksi = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                System.out.print("Gagal membuat koneksi");
            }
        }
    }
}
