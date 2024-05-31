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

public class HOA_DON implements Serializable{
    private String maHoaDon;
    private String madv;
    private String tongTien;
    private String ngayThanhToan;
    private String tinhTrangHD;

    public HOA_DON() {
    }

    public HOA_DON(String maHoaDon, String madv, String tongTien, String ngayThanhToan, String tinhTrangHD) {
        this.maHoaDon = maHoaDon;
        this.madv = madv;
        this.tongTien = tongTien;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrangHD = tinhTrangHD;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTinhTrangHD() {
        return tinhTrangHD;
    }

    public void setTinhTrangHD(String tinhTrangHD) {
        this.tinhTrangHD = tinhTrangHD;
    }
    

    @Override
    public String toString() {
        return "HOA_DON{" + "maHoaDon=" + maHoaDon + ", madv=" + madv + ", tongTien=" + tongTien + ", ngayThanhToan=" + ngayThanhToan + ", tinhTrangHD=" + tinhTrangHD + '}';
    }

    public static void main(String[] args) throws SQLException{
       ArrayList<HOA_DON> danhSachHoa_dons = DatabaseToList.Doc_HoaDon_Tu_CSDL();
    }
}
