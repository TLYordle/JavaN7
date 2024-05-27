/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Database.*;
import Entities.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author FPTSHOPKM4
 */
public class WriteDataToDatabase {
    public static void ghi_PHONG_Vao_CSDL(PHONG phong) throws SQLException {
        String query = "insert into phong (maphong,malp,tenphong,tinhtrangphong) values (?, ?, ?, ?)";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, phong.getMaPhong());
            preparedStatement.setString(2, phong.getMaLP());
            preparedStatement.setString(3, phong.getTenPhong());
            preparedStatement.setString(4, phong.getTinhTrangPhong());            
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void capNhat_PHONG_Vao_CSDL(PHONG phong) throws SQLException {
        String query = "update phong set malp = ?,tenphong = ?, tinhtrangphong = ? WHERE maphong = ?";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, phong.getMaLP());
            preparedStatement.setString(2, phong.getTenPhong());
            preparedStatement.setString(3, phong.getTinhTrangPhong());
            preparedStatement.setString(4, phong.getMaPhong());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Đã ghi phong vào CSDL thành công.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Ném lại ngoại lệ để xử lý ở nơi gọi
        }      
    }
    public static void xoa_PHONG_Vao_CSDL(String maphong) throws SQLException{
        String query = "delete from phong where maphong = ?";
        try{
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, maphong);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
