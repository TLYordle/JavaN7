/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.LOAIPHONGDAL;
import Entities.LOAI_PHONG;
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
public class LOAIPHONGBLL {
    public static ComboBoxModel cbb_show() throws SQLException{
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<LOAIPHONGDAL.show().size();i++){
            items.append(LOAIPHONGDAL.show().get(i).getMaLP());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
}
