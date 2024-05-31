/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.NHANVIENDAL;
import Entities.KHACH_HANG;
import Entities.NHAN_VIEN;
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
 * 
 */
public class NHANVIENBLL {
    public static ComboBoxModel c_show() throws SQLException{
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<NHANVIENDAL.show().size();i++){
            items.append(NHANVIENDAL.show().get(i).getMaNV());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
    public static TableModel show(){
        
        ArrayList<NHAN_VIEN> list= NHANVIENDAL.show();
        String[] columnNames = {"STT","Mã Nhân Viên","Tên Nhân Viên","Ngày Sinh","Số Điện Thoại","Địa Chỉ","Lịch Làm Việc","Chức Vụ"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(NHAN_VIEN c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaNV();
            data[row][2] = c.gettenNV();
            data[row][3] = c.getngaysinh();
            data[row][4] = c.getsdt();
            data[row][5] = c.getdiachi();
            data[row][6] = c.getlichlamviec();
            data[row][7] = c.getchucvu();
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
