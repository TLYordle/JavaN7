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
public class PHONG implements Serializable{
    private String MaPhong;
    private String MaLP;
    private String TenPhong;
    private String TinhTrangPhong;
    
    public PHONG()
    {
        
    }
    public PHONG(String MaPhong,String MaLP,String TenPhong,String TinhTrangPhong)
    {
        this.MaPhong = MaPhong;
        this.MaLP = MaLP;
        this.TenPhong =  TenPhong;
        this.TinhTrangPhong = TinhTrangPhong;
    }
    public String getMaPhong()
    {
        return MaPhong;
    }
    public void setMaPhong(String MaPhong)
    {
        this.MaPhong = MaPhong;
    }
    public String getMaLP()
    {
        return MaLP;
    }
    public void setMaLP(String MaLP)
    {
        this.MaLP = MaLP;
    }
    public String getTenPhong()
    {
        return TenPhong;
    }
    public void setTenPhong(String TenPhong)
    {
        this.TenPhong = TenPhong;
    }
    public String getTinhTrangPhong()
    {
        return TinhTrangPhong;
    }
    public void setTinhTrangPhong(String TinhTrangPhong)
    {
        this.TinhTrangPhong = TinhTrangPhong;
    }
    @Override
    public String toString() {
        return "Phong{" +"MaPhong=" + MaPhong +", TenPhong=" + TenPhong +", MaLoaiPhong=" + MaLP +", TinhTrangPhong=" + TinhTrangPhong +'}';
    }
     public static void main(String[] args) throws SQLException{
       ArrayList<PHONG> danhSachPhong = DatabaseToList.Doc_PHONG_Tu_CSDL();
    }
}
