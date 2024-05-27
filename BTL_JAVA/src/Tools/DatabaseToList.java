/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;
import Entities.*;
import Database.*;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author FPTSHOPKM4
 */
public class DatabaseToList {
    public static ArrayList<PHONG> Doc_PHONG_Tu_CSDL() throws SQLException {
        ArrayList<PHONG> Phong = new ArrayList<>();
        try{
            Connection connection = connect_to_database.getConnection();
            String query ="select * from phong";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                PHONG phong = new PHONG();
                phong.setMaPhong(resultSet.getString("maphong").trim());
                phong.setTenPhong(resultSet.getString("tenphong").trim());
                phong.setMaLP(resultSet.getString("malp").trim());
                phong.setTinhTrangPhong(resultSet.getString("tinhtrangphong").trim());
                Phong.add(phong);
            }
            return Phong;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<PHONG>();
        } 
    }
}
