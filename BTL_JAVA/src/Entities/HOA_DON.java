/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;
import java.util.Date;
/**
 *
 * @author FPTSHOPKM4
 */
public class HOA_DON {
     private int maHoaDon;
    private double bangGia;
    private double tongTien;
    private Date ngayThanhToan;
    private int tinhTrangHD;

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public double getBangGia() {
        return bangGia;
    }

    public void setBangGia(double bangGia) {
        this.bangGia = bangGia;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public int getTinhTrangHD() {
        return tinhTrangHD;
    }

    public void setTinhTrangHD(int tinhTrangHD) {
        this.tinhTrangHD = tinhTrangHD;
    }

    
    public HOA_DON(int maHoaDon, double bangGia, double tongTien, Date ngayThanhToan, int tinhTrangHD) {
        this.maHoaDon = maHoaDon;
        this.bangGia = bangGia;
        this.tongTien = tongTien;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrangHD = tinhTrangHD;
    }
	
    public HOA_DON() {
	super();
    }
	
    public HOA_DON(double tongTien, Date ngayThanhToan) {
	super();
	this.tongTien = tongTien;
	this.ngayThanhToan = ngayThanhToan;
	}

    @Override
    public String toString() {
        return "HOA_DON{" + "maHoaDon=" + maHoaDon + ", bangGia=" + bangGia + ", tongTien=" + tongTien + ", ngayThanhToan=" + ngayThanhToan + ", tinhTrangHD=" + tinhTrangHD + '}';
    }
}
