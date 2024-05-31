/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FPTSHOPKM4
 */
public class connect_to_database {
    private static final String url = "jdbc:sqlserver://LAPTOP-NPHA3CV1\\MSSQLSERVER01;databaseName=QLKS;encrypt=false;";
    private static final String user = "sa";
    private static final String password = "123456";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);    
    }
    /*public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection(url, user, password))
        {
            System.out.print("ket noi thanh cong");
        }catch(SQLException EX)
        {
            EX.printStackTrace();
        }
        
    }*/
}
