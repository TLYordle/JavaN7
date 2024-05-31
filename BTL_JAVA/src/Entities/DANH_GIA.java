/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DatabaseToList;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FPTSHOPKM4
 */
public class DANH_GIA {
    private String madg;
    private String cccd;
    private String nddg;

    public DANH_GIA() {
    }

    public DANH_GIA(String madg, String cccd, String nddg) {
        this.madg = madg;
        this.cccd = cccd;
        this.nddg = nddg;
    } 

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getNddg() {
        return nddg;
    }

    public void setNddg(String nddg) {
        this.nddg = nddg;
    }

    @Override
    public String toString() {
        return "DANH_GIA{" + "madg=" + madg + ", cccd=" + cccd + ", nddg=" + nddg + '}';
    }
    public static void main(String[] args) throws SQLException{
       ArrayList<DANH_GIA> danhSachDanhGia = DatabaseToList.Doc_danhgia_Tu_CSDL();
    }
}
