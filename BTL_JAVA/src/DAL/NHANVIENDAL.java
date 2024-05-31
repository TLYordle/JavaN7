/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.NHAN_VIEN;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;;

/**
 *
 * @author trandangan
 */
public class NHANVIENDAL {
    public static ArrayList<NHAN_VIEN> show(){
            ArrayList<NHAN_VIEN> a = new ArrayList<NHAN_VIEN>();
            a = DatabaseToList.Doc_nhanvien_Tu_CSDL();
            return a;
    }
    public static NHAN_VIEN Getnhanvien(String tennv){
        ArrayList<NHAN_VIEN> a = show();
        for(NHAN_VIEN item:a){
            if(item.gettenNV().equals(tennv))
                return item;
        }
        return null;
    }
    public static boolean insert(ArrayList<NHAN_VIEN> list, NHAN_VIEN a) throws IOException, SQLException{
        if(a.getMaNV().equals("")){
            JOptionPane.showMessageDialog(null,"Mã Nhân Viên không được để trống");
            return false;
        }
        for(NHAN_VIEN item : list)
            if(a.getMaNV().equals(item.getMaNV())){
                JOptionPane.showMessageDialog(null,"Mã CCCD đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaNV().compareTo(list.get(i).getMaNV())>0)
                index = i+1;
        }
        list.add(index,a);
        WriteDataToDatabase.ghi_nhanvien_Vao_CSDL(a);
        return true;
    }
    public static boolean update(ArrayList<NHAN_VIEN> list, NHAN_VIEN a) throws IOException, SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaNV().equals(list.get(i).getMaNV())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            WriteDataToDatabase.capNhat_nhanvien_Vao_CSDL(a);
            return true;
        }
        return false;
        
    }
    public static boolean delete(ArrayList<NHAN_VIEN> list, NHAN_VIEN a) throws SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaNV().equals(list.get(i).getMaNV())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.xoa_khachhang_Vao_CSDL(a.getMaNV());
            return true;
        }
        else
        return false;
    }
}
