/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.NHAN_VIEN;
import Tools.DatabaseToList;
import java.util.ArrayList;

/**
 *
 * @author trandangan
 */
public class NHANVIENDAL {
    public static ArrayList<NHAN_VIEN> show(){
        ArrayList<NHAN_VIEN> a = new ArrayList<NHAN_VIEN>();
        a = DatabaseToList.Doc_nhanvien_Tu_CSDL();
        return a;
    }
}
