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
 * @author TLYordle
 */
public class Phieu_Thue_Phong implements Serializable{

    private String maptp;
    private String cccd;
    private String maphong;
    private String madv;
    private String ngaydatphong;
    private String ngaytraphong;

    public Phieu_Thue_Phong() {
    }

    public Phieu_Thue_Phong(String maptp, String cccd, String maphong, String madv, String ngaydatphong, String ngaytraphong) {
        this.maptp = maptp;
        this.cccd = cccd;
        this.maphong = maphong;
        this.madv = madv;
        this.ngaydatphong = ngaydatphong;
        this.ngaytraphong = ngaytraphong;
    }

    public String getMaptp() {
        return maptp;
    }

    public void setMaptp(String maptp) {
        this.maptp = maptp;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getNgaydatphong() {
        return ngaydatphong;
    }

    public void setNgaydatphong(String ngaydatphong) {
        this.ngaydatphong = ngaydatphong;
    }

    public String getNgaytraphong() {
        return ngaytraphong;
    }

    public void setNgaytraphong(String ngaytraphong) {
        this.ngaytraphong = ngaytraphong;
    }

    @Override
    public String toString() {
        return "Phieu_Thue_Phong{" + "maptp=" + maptp + ", cccd=" + cccd + ", maphong=" + maphong + ", madv=" + madv + ", ngaydatphong=" + ngaydatphong + ", ngaytraphong=" + ngaytraphong + '}';
    }
    
    public static void main(String[] args) throws SQLException{
       ArrayList<Phieu_Thue_Phong> danhSachPhieuThuePhong = DatabaseToList.Doc_phieuthuephong_Tu_CSDL();
    }
}
