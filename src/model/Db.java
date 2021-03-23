/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesfix;

import java.sql.*;
import javax.swing.*;

public class Db {
    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public Db() {
        try {
           Class.forName("org.gjt.mm.mysql.Driver");
        } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "" + e.getMessage(), "JDBC Error", JOptionPane.WARNING_MESSAGE); 
        }
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/sampah",dbuser, dbpasswd);
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),
                    "Connection Error",JOptionPane.WARNING_MESSAGE); 
        }   
        
    }
    
    public ResultSet getData(String SQString) {
        try {
            rs = stmt.executeQuery(SQString);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        
        return rs;
    }
    
    public void query(String SQLString) {
        try {
            stmt.executeUpdate(SQLString);
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
        
}