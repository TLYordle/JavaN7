/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DatabaseToList;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FPTSHOPKM4
 */
public class LOAI_PHONG implements Serializable{
    private String MaLP;
    private String TenLP;
    private double DonGia;
    private int SoNguoiToiDa;
    
    public LOAI_PHONG(){
        
    }
    public LOAI_PHONG(String MaLP,String TenLP,double DonGia,int SoNguoiToiDa)
    {
        this.MaLP = MaLP;
        this.TenLP =  TenLP;
        this.DonGia = DonGia;
        this.SoNguoiToiDa = SoNguoiToiDa;
    }
    // Getter và Setter cho MaLP
    public String getMaLP() {
        return MaLP;
    }

    public void setMaLP(String MaLP) {
        this.MaLP = MaLP;
    }

    // Getter và Setter cho TenLP
    public String getTenLP() {
        return TenLP;
    }

    public void setTenLP(String TenLP) {
        this.TenLP = TenLP;
    }

    // Getter và Setter cho DonGia
    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    // Getter và Setter cho SoNguoiToiDa
    public int getSoNguoiToiDa() {
        return SoNguoiToiDa;
    }

    public void setSoNguoiToiDa(int SoNguoiToiDa) {
        this.SoNguoiToiDa = SoNguoiToiDa;
    }
    @Override
    public String toString() {
        return "LOAI_PHONG{" +
                "MaLP='" + MaLP + '\'' +
                ", TenLP='" + TenLP + '\'' +
                ", DonGia=" + DonGia +
                ", SoNguoiToiDa=" + SoNguoiToiDa +
                '}';
    }
    public static void main(String[] args) throws SQLException{
       ArrayList<LOAI_PHONG> danhSachLoaiPhong = DatabaseToList.Doc_LOAI_PHONG_Tu_CSDL();
    }
    
    
}
