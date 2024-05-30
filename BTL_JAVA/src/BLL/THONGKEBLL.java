/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.THONGKEDAL;
import Entities.THONG_KE;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Admin
 */
public class THONGKEBLL {
    public static ComboBoxModel c_show() throws SQLException{
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<THONGKEDAL.show().size();i++){
            items.append(THONGKEDAL.show().get(i).getCccd());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    } 
    public static TableModel show(){
        
        ArrayList<THONG_KE> list= THONGKEDAL.show();
        String[] columnNames = {"STT","Mã Thống Kê","CCCD","Mã Đánh Giá","Mã Nhân Viên","Doanh Thu","Ngày Thống Kê"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(THONG_KE c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaThongKe();
            data[row][2] = c.getCccd();
            data[row][3] = c.getMaDanhGia();
            data[row][4] = c.getMaNV();
            data[row][5] = c.getDoanhthu();
            data[row][6] = c.getNgayThongKe();
            row++;
        }
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0:return int.class;
                    case 1:return String.class;
                    case 2: return String.class;
                    case 3: return int.class;
                    case 4: return int.class;
                    case 5: return String.class;
                    case 6: return String.class;
                    case 7: return float.class;
                    default: return int.class;
                }
            };
            
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        
       return table;
    }
}
