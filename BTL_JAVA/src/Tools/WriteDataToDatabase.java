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
    public static void ghi_phieuthuephong_Vao_CSDL(Phieu_Thue_Phong ptp) throws SQLException {
        String query = "insert into phieuthuephong (maptp,cccd,maphong,madv,ngaynhaphong,ngaytraphong) values (?, ?, ?, ?, ?, ?)";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ptp.getMaptp());
            preparedStatement.setString(2, ptp.getCccd());
            preparedStatement.setString(3, ptp.getMaphong());
            preparedStatement.setString(4, ptp.getMadv());
            preparedStatement.setString(5, ptp.getNgaydatphong());    
            preparedStatement.setString(6, ptp.getNgaytraphong());  
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void capNhat_phieuthuephong_Vao_CSDL(Phieu_Thue_Phong ptp) throws SQLException {
        String query = "update phieuthuephong set cccd = ?,maphong = ?, madv = ?, ngaynhaphong= ?,ngaytraphong= ? WHERE maptp = ?";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(6, ptp.getMaptp());
            preparedStatement.setString(1, ptp.getCccd());
            preparedStatement.setString(2, ptp.getMaphong());
            preparedStatement.setString(3, ptp.getMadv());
            preparedStatement.setString(4, ptp.getNgaydatphong());    
            preparedStatement.setString(5, ptp.getNgaytraphong());  
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Đã ghi phong vào CSDL thành công.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Ném lại ngoại lệ để xử lý ở nơi gọi
        }      
    }
    public static void xoa_phieuthuephong_Vao_CSDL(String maptp) throws SQLException{
        String query = "delete from phieuthuephong where maptp = ?";
        String deleteHoaDonSQL = "DELETE FROM hoadon WHERE maptp = ?";
        try{
            Connection connection = connect_to_database.getConnection();
            PreparedStatement deleteHoaDonStmt = connection.prepareStatement(deleteHoaDonSQL);
            deleteHoaDonStmt = connection.prepareStatement(deleteHoaDonSQL);
            deleteHoaDonStmt.setString(1, maptp);
            deleteHoaDonStmt.executeUpdate();
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, maptp);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void ghi_hoadon_Vao_CSDL(HOA_DON hoadon) throws SQLException {
        String query = "insert into hoadon (mahd, madv, tongtien, ngaythanhtoan, tinhtranghoadon) values (?,?,?,?,?)";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, hoadon.getMaHoaDon());
            preparedStatement.setString(2, hoadon.getMadv());
            preparedStatement.setString(3, hoadon.getTongTien());
            preparedStatement.setString(4, hoadon.getNgayThanhToan()); 
            preparedStatement.setString(5, hoadon.getTinhTrangHD());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void capNhat_hoadon_Vao_CSDL(HOA_DON hoadon) throws SQLException {
        String query = "update hoadon set madv = ?, tongtien = ?, ngaythanhtoan = ?, tinhtranghoadon = ? where mahd = ? ";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(5, hoadon.getMaHoaDon());
            preparedStatement.setString(1, hoadon.getMadv());
            preparedStatement.setString(2, hoadon.getTongTien());
            preparedStatement.setString(3, hoadon.getNgayThanhToan()); 
            preparedStatement.setString(4, hoadon.getTinhTrangHD());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Đã ghi Hoa Don vào CSDL thành công.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Ném lại ngoại lệ để xử lý ở nơi gọi
        }      
    }
    public static void xoa_hoadon_Vao_CSDL(String mahoadon) throws SQLException{
        String query = "delete from hoadon where mahd = ?";
        try{
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, mahoadon);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void ghi_thongke_Vao_CSDL(THONG_KE tk) throws SQLException {
        String query = "insert into thongke (matk,manv,maphong,tyledatphong,doanhthu) values (?, ?, ?, ?, ?)";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, tk.getMaThongKe());
            preparedStatement.setString(2, tk.getMaNV());
            preparedStatement.setString(3, tk.getMaphong());
            preparedStatement.setString(4, tk.getTiLeDatPhong());
            preparedStatement.setString(5, tk.getDoanhthu());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void capNhat_thongke_Vao_CSDL(THONG_KE tk) throws SQLException {
        String query = "update thongke set manv = ?,maphong = ?, tyledatphong = ?,doanhthu = ? WHERE matk = ?";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, tk.getMaNV());
            preparedStatement.setString(2, tk.getMaphong());
            preparedStatement.setString(3, tk.getTiLeDatPhong());
            preparedStatement.setString(4, tk.getDoanhthu());
            preparedStatement.setString(5, tk.getMaThongKe());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Đã ghi thong ke vào CSDL thành công.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Ném lại ngoại lệ để xử lý ở nơi gọi
        }      
    }
    public static void xoa_thongke_Vao_CSDL(String mathongke) throws SQLException{
        String query = "delete from thongke where matk = ?";
        try{
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, mathongke);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void ghi_khachhang_Vao_CSDL(KHACH_HANG kh) throws SQLException {
        String query = "insert into khachhang (cccd,tenkh,gioitinh,diachi,quoctich) values (?, ?, ?, ?, ?)";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, kh.getCccd());
            preparedStatement.setString(2, kh.getTenkh());
            preparedStatement.setString(3, kh.getGioitinh());
            preparedStatement.setString(4, kh.getDiachi());
            preparedStatement.setString(5, kh.getQuoctich());   
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void capNhat_khachhang_Vao_CSDL(KHACH_HANG kh) throws SQLException {
        String query = "update khachhang set tenkh = ?, gioitinh = ?, diachi = ?, quoctich = ? WHERE cccd = ?";
        try {
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(5, kh.getCccd());
            preparedStatement.setString(1, kh.getTenkh());
            preparedStatement.setString(2, kh.getGioitinh());
            preparedStatement.setString(3, kh.getDiachi());
            preparedStatement.setString(4, kh.getQuoctich());   
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Đã ghi vào CSDL thành công.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Ném lại ngoại lệ để xử lý ở nơi gọi
        }      
    }
    public static void xoa_khachhang_Vao_CSDL(String cccd) throws SQLException{
        String query = "delete from khachhang where cccd = ?";
        try{
            Connection connection = connect_to_database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cccd);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
    
