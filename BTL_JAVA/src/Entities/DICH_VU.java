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
public class DICH_VU implements Serializable{
    private String madv;
    private String tendv;

    public DICH_VU() {
    }

    public DICH_VU(String madv, String tendv) {
        this.madv = madv;
        this.tendv = tendv;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getTendv() {
        return tendv;
    }

    public void setTendv(String tendv) {
        this.tendv = tendv;
    }

    @Override
    public String toString() {
        return "DICH_VU{" + "madv=" + madv + ", tendv=" + tendv + '}';
    }
    public static void main(String[] args) throws SQLException{
       ArrayList<DICH_VU> danhSachdichvu = DatabaseToList.Doc_dichvu_Tu_CSDL();
    }

}
