/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Jodney {
    Connection con = null;
    
    public static Connection dbConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con =DriverManager.getConnection("JDBC:mysql://localhost:3306/ college ?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                    return con;
            } catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                    return null;
            }
        }
}
