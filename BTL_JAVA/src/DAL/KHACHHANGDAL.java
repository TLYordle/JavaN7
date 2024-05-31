/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.KHACH_HANG;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;;

/**
 *
 * @author TLYordle
 */
public class KHACHHANGDAL {
    public static ArrayList<KHACH_HANG> show(){
            ArrayList<KHACH_HANG> a = new ArrayList<KHACH_HANG>();
            a = DatabaseToList.Doc_khachhang_Tu_CSDL();
            return a;
    }
    public static KHACH_HANG Getkhachhang(String tenkh){
        ArrayList<KHACH_HANG> a = show();
        for(KHACH_HANG item:a){
            if(item.getTenkh().equals(tenkh))
                return item;
        }
        return null;
    }
    public static boolean insert(ArrayList<KHACH_HANG> list, KHACH_HANG a) throws IOException, SQLException{
        if(a.getCccd().equals("")){
            JOptionPane.showMessageDialog(null,"Mã CCCD không được để trống");
            return false;
        }
        for(KHACH_HANG item : list)
            if(a.getCccd().equals(item.getCccd())){
                JOptionPane.showMessageDialog(null,"Mã CCCD đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getCccd().compareTo(list.get(i).getCccd())>0)
                index = i+1;
        }
        list.add(index,a);
        WriteDataToDatabase.ghi_khachhang_Vao_CSDL(a);
        return true;
    }
    public static boolean update(ArrayList<KHACH_HANG> list, KHACH_HANG a) throws IOException, SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getCccd().equals(list.get(i).getCccd())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            WriteDataToDatabase.capNhat_khachhang_Vao_CSDL(a);
            return true;
        }
        return false;
        
    }
    public static boolean delete(ArrayList<KHACH_HANG> list, KHACH_HANG a) throws SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getCccd().equals(list.get(i).getCccd())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.xoa_khachhang_Vao_CSDL(a.getCccd());
            return true;
        }
        else
        return false;
    }
}
