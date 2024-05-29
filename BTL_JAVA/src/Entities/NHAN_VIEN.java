/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DatabaseToList;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author FPTSHOPKM4
 */
public class NHAN_VIEN implements Serializable{
    private String MaNV;
    private String tenNV;
    private String TrangThai;
    private String cccd;

    public NHAN_VIEN() {
    }

    public NHAN_VIEN(String MaNV, String tenNV, String TrangThai, String cccd) {
        this.MaNV = MaNV;
        this.tenNV = tenNV;
        this.TrangThai = TrangThai;
        this.cccd = cccd;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String gettenNV() {
        return tenNV;
    }

    public void settenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getcccd() {
        return cccd;
    }

    public void setcccd(String cccd) {
        this.cccd = cccd;
    }

    @Override
    public String toString() {
        return "NHAN_VIEN{" + "MaNV=" + MaNV + ", tenNV=" + tenNV + ", TrangThai=" + TrangThai + ", cccd=" + cccd +  '}';
    }
    
    public static void main(String[] args) throws SQLException{
       ArrayList<NHAN_VIEN> danhSachnhanvien = DatabaseToList.Doc_nhanvien_Tu_CSDL();
    }
}
