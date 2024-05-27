/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.*;
import Entities.*;
import DAL.*;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author FPTSHOPKM4
 */
public class TrangChuUI extends javax.swing.JFrame {
    java.util.List<PHONG> list;
    DefaultTableModel model;
    /**
     * Creates new form TrangChuUI
     */
    public TrangChuUI() throws SQLException{
        initComponents();
        show_PHONG();
        MaLoaiPhongcbo.setModel(LOAIPHONGBLL.cbb_show());
    }
    //show table
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    public void show_PHONG() throws SQLException{
        model = (DefaultTableModel) tbPhong.getModel();
        tbPhong.setModel(PHONGBLL.show()); 
        
        renderer.setHorizontalAlignment( JLabel.LEFT );
        tbPhong.setDefaultRenderer(Object.class, renderer);     
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        AdminTabPane = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MaPhongtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TenPhongtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TinhTrangPhongtxt = new javax.swing.JTextField();
        but_Sua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        javax.swing.JButton but_delete_phong = new javax.swing.JButton();
        MaLoaiPhongcbo = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbPhong = new javax.swing.JTable();
        javax.swing.JButton but_refresh = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH SẠN");

        AdminTabPane.setBackground(new java.awt.Color(255, 255, 153));
        AdminTabPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        AdminTabPane.setToolTipText("0");
        AdminTabPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AdminTabPaneStateChanged(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Mã Phòng");

        MaPhongtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaPhongtxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Tên Phòng");

        TenPhongtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenPhongtxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Mã Loại phòng");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Tình Trạng phòng");

        TinhTrangPhongtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinhTrangPhongtxtActionPerformed(evt);
            }
        });

        but_Sua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        but_Sua.setText("Sửa phòng");
        but_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_SuaActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnThem.setText("Thêm mới");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        but_delete_phong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        but_delete_phong.setText("Xóa Phòng");
        but_delete_phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but_delete_phongMouseClicked(evt);
            }
        });
        but_delete_phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_delete_phongActionPerformed(evt);
            }
        });

        MaLoaiPhongcbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbPhong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Phòng", "Mã Loại Phòng", "Tên Phòng", "Tình Trạng Phòng"
            }
        ));
        tbPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhongMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbPhong);

        but_refresh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        but_refresh.setText("Làm Mới");
        but_refresh.setActionCommand("Làm Mới");
        but_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but_refreshMouseClicked(evt);
            }
        });
        but_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(78, 78, 78)
                        .addComponent(but_Sua))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(26, 26, 26)
                            .addComponent(MaPhongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(26, 26, 26)
                            .addComponent(TenPhongtxt))))
                .addGap(66, 66, 66)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MaLoaiPhongcbo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TinhTrangPhongtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(but_delete_phong)
                        .addGap(52, 52, 52)
                        .addComponent(but_refresh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MaPhongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(MaLoaiPhongcbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TenPhongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TinhTrangPhongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_Sua)
                    .addComponent(btnThem)
                    .addComponent(but_delete_phong)
                    .addComponent(but_refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
        );

        AdminTabPane.addTab("Quản lý thông tin phòng", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        AdminTabPane.addTab("Quản lý khách hàng", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        AdminTabPane.addTab("Quản lý đặt phòng", jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        AdminTabPane.addTab("Quản lý thanh toán", jPanel10);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        AdminTabPane.addTab("Quản lý nhân viên", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        AdminTabPane.addTab("Báo cáo thống kê", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdminTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaPhongtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaPhongtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaPhongtxtActionPerformed

    private void TenPhongtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenPhongtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenPhongtxtActionPerformed

    private void TinhTrangPhongtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinhTrangPhongtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinhTrangPhongtxtActionPerformed

    private void but_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_SuaActionPerformed
        // TODO add your handling code here:
        try{
            PHONG setPhong = new PHONG();
            setPhong.setMaPhong(MaPhongtxt.getText());
            setPhong.setTenPhong(TenPhongtxt.getText());
            setPhong.setTinhTrangPhong(TinhTrangPhongtxt.getText());
            setPhong.setMaLP(MaLoaiPhongcbo.getSelectedItem().toString());
            int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn sửa?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                try {
                    if(PHONGDAL.update(PHONGDAL.show(),setPhong)){
                        JOptionPane.showMessageDialog(null,"Sửa Phòng thành công!");
                        try {
                            show_PHONG();
                        } catch (SQLException ex) {
                            Logger.getLogger(TrangChuUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Mã Phòng không tồn tại!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TrangChuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                delJtextFieldTbSach();
            } 
            
        }
        catch(HeadlessException | IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_but_SuaActionPerformed

    private void but_delete_phongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_delete_phongMouseClicked
        // TODO add your handling code here:
        // Hiển thị hộp thoại xác nhận
    int response = JOptionPane.showConfirmDialog(
            this, // Sử dụng "this" nếu bạn đang ở trong JFrame hoặc JDialog
            "Bạn có chắc chắn muốn xóa không?", 
            "Xác nhận xóa", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        // Xử lý phản hồi từ hộp thoại xác nhận
        if (response == JOptionPane.YES_OPTION) {
            // Hành động khi người dùng đồng ý xóa
            // Thực hiện hành động xóa thông tin (ví dụ: gọi phương thức xóa dữ liệu)
            //deleteInformation();

            // Hiển thị hộp thoại thông báo xóa thành công
            JOptionPane.showMessageDialog(
                this, 
                "Thông tin đã được xóa thành công.", 
                "Thông báo", 
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_but_delete_phongMouseClicked

    private void AdminTabPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AdminTabPaneStateChanged
        // TODO add your handling code here:
        int index = AdminTabPane.getSelectedIndex();
    }//GEN-LAST:event_AdminTabPaneStateChanged
    
    public void show_Row_tbPhong(){
        int i = tbPhong.getSelectedRow();
        PHONG s = PHONGDAL.show().get(i);
        TenPhongtxt.setText((String)(tbPhong.getValueAt(i,3)));
        MaPhongtxt.setText((String)(tbPhong.getValueAt(i,1)));
        TinhTrangPhongtxt.setText(String.valueOf(tbPhong.getValueAt(i, 4)));
        MaLoaiPhongcbo.setSelectedItem((String)(tbPhong.getValueAt(i,2)));
    }
    
    private void tbPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhongMouseClicked
        // TODO add your handling code here:
        show_Row_tbPhong();
    }//GEN-LAST:event_tbPhongMouseClicked
    public void delJtextFieldTbSach(){
        MaPhongtxt.setText("");
        TenPhongtxt.setText("");
        TinhTrangPhongtxt.setText("");
        MaLoaiPhongcbo.setSelectedIndex(0);
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try{
            PHONG newPhong = new PHONG();
            newPhong.setMaPhong(MaPhongtxt.getText());
            newPhong.setTenPhong(TenPhongtxt.getText());
            newPhong.setTinhTrangPhong(TinhTrangPhongtxt.getText());
            newPhong.setMaLP(MaLoaiPhongcbo.getSelectedItem().toString());
            try {
                if(PHONGDAL.insert(PHONGDAL.show(),newPhong)){
                    JOptionPane.showMessageDialog(null,"Thêm Phòng thành công!");
                    try {
                        show_PHONG();
                    } catch (SQLException ex) {
                        Logger.getLogger(TrangChuUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(TrangChuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            delJtextFieldTbSach();
        }
        catch(HeadlessException | IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void but_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but_refreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_but_refreshMouseClicked

    private void but_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_refreshActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            show_PHONG();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_but_refreshActionPerformed

    private void but_delete_phongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_delete_phongActionPerformed
        // TODO add your handling code here:
        try{
            if(tbPhong.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(rootPane,"Hãy chọn một dòng để xóa");
            } else if(PHONGDAL.show().size() == 0){
                JOptionPane.showMessageDialog(rootPane,"Không có thông tin để xóa");
            }
            else{
                PHONG delPhong = new PHONG();
                delPhong.setMaPhong(MaPhongtxt.getText());
                int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    try {
                        PHONGDAL.delete(PHONGDAL.show(), delPhong);
                    } catch (SQLException ex) {
                        Logger.getLogger(TrangChuUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    model = (DefaultTableModel) tbPhong.getModel();
                    model.setRowCount(0);
                    try {
                        show_PHONG();
                        JOptionPane.showMessageDialog(null,"Xóa Phòng thành công!");
                    } catch (SQLException ex) {
                        Logger.getLogger(TrangChuUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    delJtextFieldTbSach();
                } 
                
            }
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_but_delete_phongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TrangChuUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TrangChuUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AdminTabPane;
    private javax.swing.JComboBox<String> MaLoaiPhongcbo;
    private javax.swing.JTextField MaPhongtxt;
    private javax.swing.JTextField TenPhongtxt;
    private javax.swing.JTextField TinhTrangPhongtxt;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton but_Sua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tbPhong;
    // End of variables declaration//GEN-END:variables
}
