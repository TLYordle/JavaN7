/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import Entities.PHONG;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author FPTSHOPKM4
 */
public class PHONGDAL {
    public static ArrayList<PHONG> show(){
        try{
            ArrayList<PHONG> a = new ArrayList<PHONG>();
            a = DatabaseToList.Doc_PHONG_Tu_CSDL();
            return a;
        }
        catch(SQLException e){
            return null;
        }
    }
    public static PHONG GetPhong(String tenPhong){
        ArrayList<PHONG> a = show();
        for(PHONG item:a){
            if(item.getTenPhong().equals(tenPhong))
                return item;
        }
        return null;
    }
    public static boolean insert(ArrayList<PHONG> list, PHONG a) throws IOException, SQLException{
        if(a.getMaPhong().equals("")){
            JOptionPane.showMessageDialog(null,"Mã phòng không được để trống");
            return false;
        }
        for(PHONG item : list)
            if(a.getMaPhong().equals(item.getMaPhong())){
                JOptionPane.showMessageDialog(null,"Mã Phòng đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaPhong().compareTo(list.get(i).getMaPhong())>0)
                index = i+1;
        }
        list.add(index,a);
        WriteDataToDatabase.ghi_PHONG_Vao_CSDL(a);
        return true;
    }
    public static boolean update(ArrayList<PHONG> list, PHONG a) throws IOException, SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaPhong().equals(list.get(i).getMaPhong())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            WriteDataToDatabase.capNhat_PHONG_Vao_CSDL(a);
            return true;
        }
        return false;
        
    }
    public static boolean delete(ArrayList<PHONG> list, PHONG a) throws SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaPhong().equals(list.get(i).getMaPhong())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.xoa_PHONG_Vao_CSDL(a.getMaPhong());
            return true;
        }
        else
        return false;
    }
}
