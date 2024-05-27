/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.Phieu_Thue_Phong;
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
public class PHIEUTHUEPHONGDAL {
    public static ArrayList<Phieu_Thue_Phong> show(){
        ArrayList<Phieu_Thue_Phong> a = new ArrayList<Phieu_Thue_Phong>();
        a = DatabaseToList.Doc_phieuthuephong_Tu_CSDL();
        return a;
    }
    public static Phieu_Thue_Phong GetPhieuthuphong(String maptp){
        ArrayList<Phieu_Thue_Phong> a = show();
        for(Phieu_Thue_Phong item:a){
            if(item.getMaptp().equals(maptp))
                return item;
        }
        return null;
    }
    public static boolean insert(ArrayList<Phieu_Thue_Phong> list, Phieu_Thue_Phong a) throws IOException, SQLException{
        if(a.getMaptp().equals("")){
            JOptionPane.showMessageDialog(null,"Mã phiếu thuê phòng không được để trống");
            return false;
        }
        for(Phieu_Thue_Phong item : list)
            if(a.getMaptp().equals(item.getMaptp())){
                JOptionPane.showMessageDialog(null,"Mã phiếu thuê Phòng đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaptp().compareTo(list.get(i).getMaptp())>0)
                index = i+1;
        }
        list.add(index,a);
        WriteDataToDatabase.ghi_phieuthuephong_Vao_CSDL(a);
        return true;
    }
    public static boolean update(ArrayList<Phieu_Thue_Phong> list, Phieu_Thue_Phong a) throws IOException, SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaptp().equals(list.get(i).getMaptp())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            WriteDataToDatabase.capNhat_phieuthuephong_Vao_CSDL(a);
            return true;
        }
        return false;
        
    }
    public static boolean delete(ArrayList<Phieu_Thue_Phong> list, Phieu_Thue_Phong a) throws SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaptp().equals(list.get(i).getMaptp())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.xoa_phieuthuephong_Vao_CSDL(a.getMaptp());
            return true;
        }
        else
        return false;
    }
}
