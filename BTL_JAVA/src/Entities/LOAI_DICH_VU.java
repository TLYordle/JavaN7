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
public class LOAI_DICH_VU implements Serializable{
    private String maldv;
    private String tenldv;
    private String dongia;

    public LOAI_DICH_VU() {
    }

    public LOAI_DICH_VU(String maldv, String tenldv, String dongia) {
        this.maldv = maldv;
        this.tenldv = tenldv;
        this.dongia = dongia;
    }

    public String getMaldv() {
        return maldv;
    }

    public void setMaldv(String maldv) {
        this.maldv = maldv;
    }

    public String getTenldv() {
        return tenldv;
    }

    public void setTenldv(String tenldv) {
        this.tenldv = tenldv;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "LOAI_DICH_VU{" + "maldv=" + maldv + ", tenldv=" + tenldv + ", dongia=" + dongia + '}';
    }
    
    public static void main(String[] args) throws SQLException{
       ArrayList<LOAI_DICH_VU> danhSachkhachhang = DatabaseToList.Doc_loaidichvu_Tu_CSDL();
    }

    public void getMaldv(String trim) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
