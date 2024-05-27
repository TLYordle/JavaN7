/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.LOAI_PHONG;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;;

/**
 *
 * @author FPTSHOPKM4
 */
public class LOAIPHONGDAL {
    public static ArrayList<LOAI_PHONG> show(){
        try{
            ArrayList<LOAI_PHONG> a = new ArrayList<LOAI_PHONG>();
            a = DatabaseToList.Doc_LOAI_PHONG_Tu_CSDL();
            return a;
        }
        catch(SQLException e){
            return null;
        }
    }
}
