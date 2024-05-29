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
}
