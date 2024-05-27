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
public class KHACH_HANG implements Serializable{
    private String cccd;
    private String tenkh;
    private String gioitinh;
    private String diachi;
    private String quoctich;

    public KHACH_HANG() {
    }

    public KHACH_HANG(String cccd, String tenkh, String gioitinh, String diachi, String quoctich) {
        this.cccd = cccd;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.quoctich = quoctich;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    @Override
    public String toString() {
        return "KHACH_HANG{" + "cccd=" + cccd + ", tenkh=" + tenkh + ", gioitinh=" + gioitinh + ", diachi=" + diachi + ", quoctich=" + quoctich + '}';
    }
    
    public static void main(String[] args) throws SQLException{
       ArrayList<KHACH_HANG> danhSachkhachhang = DatabaseToList.Doc_khachhang_Tu_CSDL();
    }
}
