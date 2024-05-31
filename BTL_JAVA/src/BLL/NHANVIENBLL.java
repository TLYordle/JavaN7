/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.NHANVIENDAL;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

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
}
