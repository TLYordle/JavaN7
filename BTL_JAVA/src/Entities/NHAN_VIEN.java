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
 * @author 
 */
public class NHAN_VIEN implements Serializable{
    private String MaNV;
    private String tenNV;
    private String ngaysinh;
    private String sdt;
    private String diachi;
    private String lichlamviec;
    private String chucvu;

    public NHAN_VIEN() {
    }

    public NHAN_VIEN(String MaNV, String tenNV, String TrangThai, String cccd) {
        this.MaNV = MaNV;
        this.tenNV = tenNV;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.lichlamviec = lichlamviec;
        this.chucvu = chucvu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String gettenNV() {
        return tenNV;
    }

    public void settenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getngaysinh() {
        return ngaysinh;
    }

    public void setngaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getsdt() {
        return sdt;
    }

    public void setsdt(String sdt) {
        this.sdt = sdt;
    }
        public String getdiachi() {
        return diachi;
    }

    public void setdiachi(String diachi) {
        this.diachi = diachi;
    }

        public String getlichlamviec() {
        return lichlamviec;
    }

    public void setlichlamviec(String lichlamviec) {
        this.lichlamviec = lichlamviec;
    }
    public String getchucvu() {
        return chucvu;
    }

    public void setchucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    @Override
    public String toString() {
        return "NHAN_VIEN{" + "MaNV=" + MaNV + ", tenNV=" + tenNV + ", ngaysinh=" + ngaysinh + ", sdt=" + sdt + ",diachi=" + diachi + ",lichlamviec=" + lichlamviec + ",chucvu=" + chucvu +   '}';
    }
    
    public static void main(String[] args) throws SQLException{
       ArrayList<NHAN_VIEN> danhSachnhanvien = DatabaseToList.Doc_nhanvien_Tu_CSDL();
    }
}
