/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.PHIEUTHUEPHONGDAL;
import Entities.Phieu_Thue_Phong;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author TLYordle
 */
public class PHIEUTHUEPHONGBLL {
    public static TableModel show(){
        
        ArrayList<Phieu_Thue_Phong> list= PHIEUTHUEPHONGDAL.show();
        String[] columnNames = {"STT","Mã PTP","CCCD","Mã Phòng","Mã Dịch Vụ","Ngày Đặt Phòng","Ngày Trả Phòng"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(Phieu_Thue_Phong c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaptp();
            data[row][2] = c.getCccd();
            data[row][3] = c.getMaphong();
            data[row][4] = c.getMadv();
            data[row][5] = c.getNgaydatphong();
            data[row][6] = c.getNgaytraphong();
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
