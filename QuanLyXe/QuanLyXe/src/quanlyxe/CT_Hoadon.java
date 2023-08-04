/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyxe;

import quanlyxe.thucthe.*;
import quanlyxe.xuly.*;
import java.awt.Component;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BND6699
 */
public class CT_Hoadon extends javax.swing.JFrame {

    ct_hoadonTT selectedCTHoaDon = null;
    ct_hoadonXL ct_hoadonservices = new ct_hoadonXL();
    ct_phieuxuatXL phieuXuatCTServices = new ct_phieuxuatXL();

    sanphamXL sanphamService = new sanphamXL();
    hoadonXL hoadonService = new hoadonXL();

    ArrayList<sanphamTT> dsSanpham = new ArrayList<>();
    ArrayList<ct_hoadonTT> dsCTHoaDon = new ArrayList<>();
    ArrayList<hoadonTT> dsHoaDon = new ArrayList<>();
    ArrayList<soluongTT> dsSoluong = new ArrayList<>();

    public void setMHD(String MaHD) {
        this.txt_mahoadon.setText(MaHD);
    }

    public void setTenUser(String user) {
        this.txt_nguoilap.setText(user);

        String b = "admin";

        boolean c = b.equals(user);

        System.out.println(c);
        if (c == true) {
            btn_xoadulieu.setEnabled(true);
        }

        if (c == false) {
            btn_xoadulieu.setEnabled(false);
        }
        System.out.println(user);
    }

    public CT_Hoadon() {

        initComponents();
        txt_soluong.setText("1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelHeader1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nguoilap = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        jPanelDetail = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_xoadulieu = new javax.swing.JButton();
        txt_macthoadon = new javax.swing.JLabel();
        txt_mahoadon = new javax.swing.JLabel();
        txt_thanhtien = new javax.swing.JLabel();
        txt_masp = new javax.swing.JLabel();
        txt_soluong = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        setTitle("Quản lý chi tiết hóa đơn");
        setResizable(false);

        jPanelHeader1.setBackground(new java.awt.Color(102, 102, 255));
        jPanelHeader1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHI TIẾT HÓA ĐƠN");
        jLabel2.setIconTextGap(10);

        txt_nguoilap.setText("Null");

        javax.swing.GroupLayout jPanelHeader1Layout = new javax.swing.GroupLayout(jPanelHeader1);
        jPanelHeader1.setLayout(jPanelHeader1Layout);
        jPanelHeader1Layout.setHorizontalGroup(
            jPanelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeader1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nguoilap)
                .addGap(197, 197, 197)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeader1Layout.setVerticalGroup(
            jPanelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeader1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHeader1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_nguoilap))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chi tiết hóa đơn", "Mã hóa đơn", "Mã sản phẩm", "Số lượng", "Thành tiền"
            }
        ));
        jTableData.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableData);
        jTableData.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanelDetail.setBackground(new java.awt.Color(204, 204, 255));
        jPanelDetail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Số lượng");

        jLabel3.setText("Mã hóa đơn:");

        jLabel6.setText("Mã sản phẩm");

        jLabel9.setText("Mã chi tiết hóa đơn:");

        jLabel1.setText("Thành tiền:");

        btn_xoadulieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/icons8-close-32.png"))); // NOI18N
        btn_xoadulieu.setText("Xóa có dữ liệu");
        btn_xoadulieu.setEnabled(false);
        btn_xoadulieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoadulieuActionPerformed(evt);
            }
        });

        txt_macthoadon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_macthoadon.setForeground(new java.awt.Color(255, 51, 0));
        txt_macthoadon.setText("000");

        txt_mahoadon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_mahoadon.setText("000");

        txt_thanhtien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_thanhtien.setText("000");

        txt_masp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_masp.setText("Null");

        txt_soluong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_soluong.setText("000");

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/icons8-logout-32.png"))); // NOI18N
        btnClose.setText("Thoát");
        btnClose.setIconTextGap(10);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDetailLayout = new javax.swing.GroupLayout(jPanelDetail);
        jPanelDetail.setLayout(jPanelDetailLayout);
        jPanelDetailLayout.setHorizontalGroup(
            jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailLayout.createSequentialGroup()
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_xoadulieu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDetailLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_macthoadon)
                            .addComponent(txt_mahoadon)
                            .addComponent(txt_thanhtien)
                            .addComponent(txt_masp)
                            .addComponent(txt_soluong))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDetailLayout.setVerticalGroup(
            jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDetailLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDetailLayout.createSequentialGroup()
                        .addComponent(txt_macthoadon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_mahoadon))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDetailLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_masp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_soluong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_thanhtien)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoadulieu)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ct_hoadonTT findCTHoaDon(String MaCTHoaDon, ArrayList<ct_hoadonTT> cT_HoaDons) {
        for (ct_hoadonTT item : cT_HoaDons) {
            if (item.getMaCTHoaDon().equals(MaCTHoaDon)) {
                return item;
            }
        }
        return null;
    }

    public sanphamTT findSanpham(String ID, ArrayList<sanphamTT> sanpham) {
        for (sanphamTT item : sanpham) {
            if (item.getID().equals(ID)) {
                return item;
            }
        }
        return null;
    }

    private void showDataDetail(String MaCTHoaDon, String MaHoaDon, String MaSP, long SoLuong, String ThanhTien) {

        txt_macthoadon.setText(MaCTHoaDon);
        txt_mahoadon.setText(MaHoaDon);

        txt_masp.setText(MaSP);

        String b = "admin";

        if (MaSP.equals("null")) {
            btn_xoadulieu.setEnabled(false);
        } else {
            btn_xoadulieu.setEnabled(true);
        }

        txt_thanhtien.setText(ThanhTien);
        txt_soluong.setText(String.valueOf(SoLuong));
    }

    public void gridSelectedChanged(ListSelectionEvent e) {
        String selectedData = null;
        String selectedID = "";  //Mã chi tiết hóa đơn

        int[] selectedRows = jTableData.getSelectedRows();
        int[] selectedColumns = jTableData.getSelectedColumns();

        int selectedRow = jTableData.getSelectedRow();
        int selectedColumn = jTableData.getSelectedColumn();

        System.out.println("selectedRow: " + selectedRow);
        System.out.println("selectedColumn: " + selectedColumn);

        if (selectedRow >= 0 && selectedColumn >= 0) {
            selectedData = String.valueOf(jTableData.getValueAt(selectedRow, selectedColumn));
            selectedID = (String) jTableData.getValueAt(selectedRow, 0);
            //Find chi tiết hóa đơn
            selectedCTHoaDon = findCTHoaDon(selectedID, dsCTHoaDon);

            System.out.println("Selected: " + selectedData + " , MaHoaDon: " + selectedID);

            showDataDetail(selectedID,
                    (String) jTableData.getValueAt(selectedRow, 1),
                    (String) jTableData.getValueAt(selectedRow, 2),
                    (long) jTableData.getValueAt(selectedRow, 3),
                    (String) jTableData.getValueAt(selectedRow, 4));
        }
    }

    public void showDataList(String MaHD) {

        DefaultTableModel model = (DefaultTableModel) this.jTableData.getModel();
        model.setRowCount(0);

        //load data
        ArrayList<ct_hoadonTT> list = ct_hoadonservices.getAllRecords(MaHD);
        dsCTHoaDon = list;

        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        Object[] row = new Object[7];

        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getMaCTHoaDon();
            row[1] = list.get(i).getMaHoaDon();
            row[2] = list.get(i).getMaSP();
            row[3] = list.get(i).getSoLuong();
            row[4] = en.format(list.get(i).getThanhTien());

            model.addRow(row);
        }

        ListSelectionModel cellSelectionModel = jTableData.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Dang ky event click tren danh sach        
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                //goi ham show data chi tiet
                gridSelectedChanged(e);
            }
        });
    }


    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // Hóa đơn
        Hoadon hoadon = new Hoadon();
        hoadon.setTenUser(txt_nguoilap.getText(), txt_nguoilap.getText());
        this.dispose();

        //vi tri giua man hinh
        hoadon.pack();
        hoadon.setLocationRelativeTo(null);
        hoadon.setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    // Xóa toàn bộ dữ liệu của 1 hóa đơn
    private void btn_xoadulieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoadulieuActionPerformed
        String MaSP = txt_masp.getText().trim();

        if (MaSP.equals("Null")) {
            JOptionPane.showMessageDialog(null, "Chọn sản phẩm mới xóa được");
        } else {
            String user = txt_nguoilap.getText();

            String MaCTHoaDon = txt_macthoadon.getText().trim();
            String MaHD = txt_mahoadon.getText().trim();

            String MaCTPX = txt_macthoadon.getText().trim();
            String MaPX = txt_mahoadon.getText().trim();

            int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn sản phẩm " + MaSP + " không?", "Confirmation...",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            System.out.println("Delete data? =" + input);
            Hoadon hoadon = new Hoadon();

            if (input == 0) {
                //Xoa
                int rowEffected = ct_hoadonservices.DeleteRecord(MaCTHoaDon, MaHD);
                int rowEffected2 = phieuXuatCTServices.DeleteRecord(MaCTPX, MaSP);

                if (rowEffected > 0) {
                    if (rowEffected2 > 0) {
                        JOptionPane.showMessageDialog(null, "Xóa thành công!");
                        showDataList(MaHD);
                        this.txt_macthoadon.setText("000");
                        this.txt_mahoadon.setText("000");
                        this.txt_masp.setText("Null");
                        this.txt_soluong.setText("000");
                        this.txt_thanhtien.setText("000");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Xóa thất bại");
                }
            }
        }
    }//GEN-LAST:event_btn_xoadulieuActionPerformed

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
            java.util.logging.Logger.getLogger(CT_Hoadon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CT_Hoadon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CT_Hoadon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CT_Hoadon.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CT_Hoadon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btn_xoadulieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelDetail;
    private javax.swing.JPanel jPanelHeader1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableData;
    private javax.swing.JLabel txt_macthoadon;
    private javax.swing.JLabel txt_mahoadon;
    private javax.swing.JLabel txt_masp;
    private javax.swing.JLabel txt_nguoilap;
    private javax.swing.JLabel txt_soluong;
    private javax.swing.JLabel txt_thanhtien;
    // End of variables declaration//GEN-END:variables
}