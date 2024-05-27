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
    public static ArrayList<LOAI_PHONG> Doc_LOAI_PHONG_Tu_CSDL() throws SQLException {
        ArrayList<LOAI_PHONG> loaiPhongList = new ArrayList<>();
        try {
            Connection connection = connect_to_database.getConnection();
            String query = "SELECT * FROM loaiphong";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                LOAI_PHONG phong = new LOAI_PHONG();
                phong.setMaLP(resultSet.getString("malp").trim());
                phong.setTenLP(resultSet.getString("tenlp").trim());
                phong.setDonGia(resultSet.getDouble("dongia"));  // Assuming column name for money type is don_gia
                phong.setSoNguoiToiDa(resultSet.getInt("songuoitoida"));  // Assuming column name for int type is so_nguoi_toi_da
                loaiPhongList.add(phong);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;  // Rethrow the exception to be handled by the calling method
        }
        return loaiPhongList;
    }

    public static ArrayList<Phieu_Thue_Phong> Doc_phieuthuephong_Tu_CSDL() {
        ArrayList<Phieu_Thue_Phong> ptplist =  new ArrayList<>();
        try{
            Connection connection = connect_to_database.getConnection();
            String query ="select * from phieuthuephong";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                Phieu_Thue_Phong ptp = new Phieu_Thue_Phong();
                ptp.setMaptp(resultSet.getString("maptp").trim());
                ptp.setCccd(resultSet.getString("cccd"));
                ptp.setMaphong(resultSet.getString("maphong"));
                ptp.setMadv(resultSet.getString("madv"));
                ptp.setNgaydatphong(resultSet.getString("ngaynhaphong").trim());
                ptp.setNgaytraphong(resultSet.getString("ngaytraphong").trim());
                ptplist.add(ptp);
            }
            return ptplist;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<Phieu_Thue_Phong>();
        } 
            
    }
    public static ArrayList<KHACH_HANG> Doc_khachhang_Tu_CSDL() {
        ArrayList<KHACH_HANG> khachhanglist =  new ArrayList<>();
        try{
            Connection connection = connect_to_database.getConnection();
            String query ="select * from khachhang";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                KHACH_HANG kh = new KHACH_HANG();
                kh.setCccd(resultSet.getString("cccd").trim());
                kh.setTenkh(resultSet.getString("tenkh").trim());
                kh.setGioitinh(resultSet.getString("gioitinh").trim());
                kh.setDiachi(resultSet.getString("diachi").trim());
                kh.setQuoctich(resultSet.getString("quoctich").trim());
                khachhanglist.add(kh);
            }
            return khachhanglist;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<KHACH_HANG>();
        } 
            
    }
    public static ArrayList<DICH_VU> Doc_dichvu_Tu_CSDL() {
        ArrayList<DICH_VU> dichvulist =  new ArrayList<>();
        try{
            Connection connection = connect_to_database.getConnection();
            String query ="select * from dichvu";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                DICH_VU dv = new DICH_VU();
                dv.setMadv(resultSet.getString("madv").trim());
                dv.setTendv(resultSet.getString("tendv").trim());
                dichvulist.add(dv);
            }
            return dichvulist;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<DICH_VU>();
        } 
            
    }
    public static ArrayList<LOAI_DICH_VU> Doc_loaidichvu_Tu_CSDL() {
        ArrayList<LOAI_DICH_VU> ldvlist =  new ArrayList<>();
        try{
            Connection connection = connect_to_database.getConnection();
            String query ="select * from loaidichvu";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                LOAI_DICH_VU ldv = new LOAI_DICH_VU();
                ldv.setMaldv(resultSet.getString("maldv").trim());
                ldv.setTenldv(resultSet.getString("tenldv").trim());
                ldvlist.add(ldv);
            }
            return ldvlist;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<LOAI_DICH_VU>();
        } 
            
    }
}
