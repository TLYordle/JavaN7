/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DICHVUDAL;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author TLYordle
 */
public class DICHVUBLL {
    public static ComboBoxModel cbb_show() throws SQLException{
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<DICHVUDAL.show().size();i++){
            items.append(DICHVUDAL.show().get(i).getMadv());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
}
