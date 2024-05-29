/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import Entities.DANH_GIA;
import Tools.DatabaseToList;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class DANHGIADAL {
     public static ArrayList<DANH_GIA> show(){
        ArrayList<DANH_GIA> a = new ArrayList<DANH_GIA>();
        a = DatabaseToList.Doc_danhgia_Tu_CSDL();
        return a;
    }
}
