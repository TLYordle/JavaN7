/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;
import java.util.Date;
import Tools.DatabaseToList;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.IOException;
/**
 *
 * @author FPTSHOPKM4
 */
public class THONG_KE implements Serializable {
   private String maDanhGia;
   private String cccd;
   private String maThongKe;
   private String maNV;
   private Date ngayThongKe;
    private float tiLeDatPhong;
    private double doanhthu;

    public THONG_KE(String maDanhGia, String cccd, String maThongKe, String maNV, Date ngayThongKe, float tiLeDatPhong, double doanhthu) {
        this.maDanhGia = maDanhGia;
        this.cccd = cccd;
        this.maThongKe = maThongKe;
        this.maNV = maNV;
        this.ngayThongKe = ngayThongKe;
        this.tiLeDatPhong = tiLeDatPhong;
        this.doanhthu = doanhthu;
    }

    public String getMaDanhGia() {
        return maDanhGia;
    }

    public void setMaDanhGia(String maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getMaThongKe() {
        return maThongKe;
    }

    public void setMaThongKe(String maThongKe) {
        this.maThongKe = maThongKe;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayThongKe() {
        return ngayThongKe;
    }

    public void setNgayThongKe(Date ngayThongKe) {
        this.ngayThongKe = ngayThongKe;
    }

     public float getTiLeDatPhong() {
        return tiLeDatPhong;
    }

    public void setTiLeDatPhong(float tiLeDatPhong) {
        this.tiLeDatPhong = tiLeDatPhong;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
  
   public THONG_KE() {
    }
    
   @Override
    public String toString() {
        return "THONG_KE{" + "maDanhGia=" + maDanhGia + ", cccd=" + cccd + ", maThongKe=" + maThongKe + ", maNV=" + maNV + ", ngayThongKe=" + ngayThongKe + ", tiLeDatPhong=" + tiLeDatPhong + ", doanhthu=" + doanhthu + '}';
    }
}
