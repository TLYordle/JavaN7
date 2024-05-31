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
   private String maThongKe;
   private String maNV;
   private String maphong;
   private String tiLeDatPhong;
   private String doanhthu;

    public THONG_KE() {
    }

     public THONG_KE(String maThongKe, String maNV, String maphong, String tiLeDatPhong, String doanhthu) {
        this.maThongKe = maThongKe;
        this.maNV = maNV;
        this.maphong = maphong;
        this.tiLeDatPhong = tiLeDatPhong;
        this.doanhthu = doanhthu;
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

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getTiLeDatPhong() {
        return tiLeDatPhong;
    }

    public void setTiLeDatPhong(String tiLeDatPhong) {
        this.tiLeDatPhong = tiLeDatPhong;
    }

    public String getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(String doanhthu) {
        this.doanhthu = doanhthu;
    }

    @Override
    public String toString() {
        return "THONG_KE{" + "maThongKe=" + maThongKe + ", maNV=" + maNV + ", maphong=" + maphong + ", tiLeDatPhong=" + tiLeDatPhong + ", doanhthu=" + doanhthu + '}';
    }
     
   
    public static void main(String[] args) throws SQLException{
       ArrayList<THONG_KE> danhSachThong_kes = DatabaseToList.Doc_ThongKe_Tu_CSDL();
    }

   
}
