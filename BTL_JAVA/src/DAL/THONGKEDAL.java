/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import Entities.THONG_KE;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class THONGKEDAL {
     public static ArrayList<THONG_KE> show(){
         ArrayList<THONG_KE> a = new ArrayList<THONG_KE>();
         a = DatabaseToList.Doc_ThongKe_Tu_CSDL();
         return a;
    }
    public static THONG_KE GetThong_ke(String maThongKe){
        ArrayList<THONG_KE> a = show();
        for(THONG_KE item:a){
            if(item.getMaThongKe().equals(maThongKe))
                return item;
        }
        return null;
    }
    public static boolean insert(ArrayList<THONG_KE> list, THONG_KE a) throws IOException, SQLException{
        if(a.getMaThongKe().equals("")){
            JOptionPane.showMessageDialog(null,"Mã Thống Kê không được để trống");
            return false;
        }
        for(THONG_KE item : list)
            if(a.getMaThongKe().equals(item.getMaThongKe())){
                JOptionPane.showMessageDialog(null,"Mã Thống Kê đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaThongKe().compareTo(list.get(i).getMaThongKe())>0)
                index = i+1;
        }
        list.add(index,a);
        WriteDataToDatabase.ghi_thongke_Vao_CSDL(a);
        return true;
    }
    public static boolean update(ArrayList<THONG_KE> list, THONG_KE a) throws IOException, SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaThongKe().equals(list.get(i).getMaThongKe())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            WriteDataToDatabase.capNhat_thongke_Vao_CSDL(a);
            return true;
        }
        return false;
        
    }
      public static boolean delete(ArrayList<THONG_KE> list, THONG_KE a) throws SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaThongKe().equals(list.get(i).getMaThongKe())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.xoa_thongke_Vao_CSDL(a.getMaThongKe());
            return true;
        }
        else
        return false;
    }
}
