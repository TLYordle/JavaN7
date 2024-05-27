/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.DICH_VU;
import Tools.DatabaseToList;
import java.util.ArrayList;

/**
 *
 * @author TLYordle
 */
public class DICHVUDAL {
    public static ArrayList<DICH_VU> show(){
        ArrayList<DICH_VU> a = new ArrayList<DICH_VU>();
        a = DatabaseToList.Doc_dichvu_Tu_CSDL();
        return a;
    }
}
