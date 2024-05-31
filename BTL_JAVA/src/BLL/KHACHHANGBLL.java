/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.KHACHHANGDAL;
import Entities.KHACH_HANG;
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
 * @author TLYordle
 */
public class KHACHHANGBLL {
    public static ComboBoxModel c_show() throws SQLException{
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<KHACHHANGDAL.show().size();i++){
            items.append(KHACHHANGDAL.show().get(i).getCccd());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
    public static TableModel show(){
        
        ArrayList<KHACH_HANG> list= KHACHHANGDAL.show();
        String[] columnNames = {"STT","CCCD","Tên Khách Hàng","Giới Tính","Địa Chỉ","Quốc Tịch"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(KHACH_HANG c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getCccd();
            data[row][2] = c.getTenkh();
            data[row][3] = c.getGioitinh();
            data[row][4] = c.getDiachi();
            data[row][5] = c.getQuoctich();
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
