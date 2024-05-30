/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.KHACH_HANG;
import Tools.DatabaseToList;
import java.util.ArrayList;

/**
 *
 * @author TLYordle
 */
public class KHACHHANGDAL {
    public static ArrayList<KHACH_HANG> show(){
        ArrayList<KHACH_HANG> a = new ArrayList<KHACH_HANG>();
        a = DatabaseToList.Doc_khachhang_Tu_CSDL();
        return a;
    }
}
