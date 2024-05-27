/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.LOAI_DICH_VU;
import Tools.DatabaseToList;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author TLYordle
 */
public class LOAIDICHVUDAL {
    public static ArrayList<LOAI_DICH_VU> show(){
        ArrayList<LOAI_DICH_VU> a = new ArrayList<LOAI_DICH_VU>();
        a = DatabaseToList.Doc_loaidichvu_Tu_CSDL();
        return a;
    }
}
