/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DatabaseToList;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author FPTSHOPKM4
 */
public class DANH_GIA implements Serializable{
     private String maDanhGia;
     private String cCCD;
     private String ndDanhgia;

    public DANH_GIA(){
        super();
    }

    public DANH_GIA(String maDanhGia, String cCCD, String ndDanhgia) {
        this.maDanhGia = maDanhGia;
        this.cCCD = cCCD;
        this.ndDanhgia = ndDanhgia;
    }

    public String getMaDanhGia() {
        return maDanhGia;
    }

    public void setMaDanhGia(String maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public String getcCCD() {
        return cCCD;
    }

    public void setcCCD(String cCCD) {
        this.cCCD = cCCD;
    }

    public String getNdDanhgia() {
        return ndDanhgia;
    }

    public void setNdDanhgia(String ndDanhgia) {
        this.ndDanhgia = ndDanhgia;
    }

    @Override
    public String toString() {
        return "DANH_GIA{" + "maDanhGia=" + maDanhGia + ", cCCD=" + cCCD + ", ndDanhgia=" + ndDanhgia + '}';
    }
    
    public static void main(String[] args) throws SQLException{
       ArrayList<DANH_GIA> danhSachDanh_gias = DatabaseToList.Doc_danhgia_Tu_CSDL();
    }
}
