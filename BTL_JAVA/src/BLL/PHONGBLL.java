/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.PHONGDAL;
import Entities.PHONG;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author FPTSHOPKM4
 */
public class PHONGBLL {
    public static TableModel show(){
        
        ArrayList<PHONG> list= PHONGDAL.show();
        String[] columnNames = {"STT","Mã Phòng","Mã Loại Phòng","Tên Phòng","Tình Trạng Phòng"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(PHONG c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaPhong();
            data[row][2] = c.getMaLP();
            data[row][3] = c.getTenPhong();
            data[row][4] = c.getTinhTrangPhong();
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
