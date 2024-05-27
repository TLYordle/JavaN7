/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.LOAIDICHVUDAL;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author TLYordle
 */
public class LOAIDICHVUBLL {
    public static ComboBoxModel cbb_show() throws SQLException{
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<LOAIDICHVUDAL.show().size();i++){
            items.append(LOAIDICHVUDAL.show().get(i).getMaldv());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
}
