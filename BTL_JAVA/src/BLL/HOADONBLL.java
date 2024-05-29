/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.HOADONDAL;
import Entities.HOA_DON;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Admin
 */
public class HOADONBLL {
    public static ComboBoxModel cbb_show() throws SQLException{
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<HOADONDAL.show().size();i++){
            items.append(HOADONDAL.show().get(i).getMaHoaDon());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
    public static TableModel show(){
        
        ArrayList<HOA_DON> list= HOADONDAL.show();
        String[] columnNames = {"STT","Mã Hóa Đơn","Bảng Giá","Tổng Tiền","Ngày Thanh Toán","Trang Hóa Đơn"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(HOA_DON c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaHoaDon();
            data[row][2] = c.getBangGia();
            data[row][3] = c.getTongTien();
            data[row][4] = c.getNgayThanhToan();
            data[row][5] = c.getTinhTrangHD();
            row++;
        }
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                return switch (column) {
                    case 0 -> int.class;
                    case 1 -> String.class;
                    case 2 -> double.class;
                    case 3 -> double.class;
                    case 4 -> int.class;
                    case 5 -> int.class;
                    case 6 -> String.class;
                    case 7 -> float.class;
                    default -> int.class;
                };
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
