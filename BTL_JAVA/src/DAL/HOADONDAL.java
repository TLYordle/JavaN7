/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Database.connect_to_database;
import Entities.HOA_DON;
/**
 *
 * @author Admin
 */
public class HOADONDAL {
    public static ArrayList<HOA_DON> show(){
        try{
            ArrayList<HOA_DON> a = new ArrayList<HOA_DON>();
            a = DatabaseToList.Doc_HoaDon_Tu_CSDL();
            return a;
        }
        catch(SQLException e){
            return null;
        }
    }
    public static HOA_DON GetHoa_don(String maHoaDon){
        ArrayList<HOA_DON> a = show();
        for(HOA_DON item:a){
            if(item.getMaHoaDon().equals(maHoaDon))
                return item;
        }
        return null;
    }
    public static boolean insert(ArrayList<HOA_DON> list, HOA_DON a) throws IOException, SQLException{
        if(a.getMaHoaDon().equals("")){
            JOptionPane.showMessageDialog(null,"Mã Hoá đơn không được để trống");
            return false;
        }
        for(HOA_DON item : list)
            if(a.getMaHoaDon().equals(item.getMaHoaDon())){
                JOptionPane.showMessageDialog(null,"Mã Hóa Đơn đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaHoaDon().compareTo(list.get(i).getMaHoaDon())>0)
                index = i+1;
        }
        list.add(index,a);
        WriteDataToDatabase.ghi_hoadon_Vao_CSDL(a);
        return true;
    }
    public static boolean update(ArrayList<HOA_DON> list, HOA_DON a) throws IOException, SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaHoaDon().equals(list.get(i).getMaHoaDon())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            WriteDataToDatabase.capNhat_hoadon_Vao_CSDL(a);
            return true;
        }
        return false;
        
    }
      public static boolean delete(ArrayList<HOA_DON> list, HOA_DON a) throws SQLException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaHoaDon().equals(list.get(i).getMaHoaDon())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.xoa_hoadon_Vao_CSDL(a.getMaHoaDon());
            return true;
        }
        else
        return false;
    }
}
