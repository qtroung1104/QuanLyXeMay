/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyxe;

import quanlyxe.thucthe.*;
import quanlyxe.xuly.*;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Hoadon extends javax.swing.JFrame {

    hoadonTT selectedHoaDon = null;
    hoadonXL hoadonservices = new hoadonXL();
    phieuxuatXL phieuxuatServices = new phieuxuatXL();

    taikhoanXL userService = new taikhoanXL();

    ArrayList<taikhoanTT> dsuser = new ArrayList<>();
    ArrayList<hoadonTT> dsHoaDon = new ArrayList<>();

    public void setTenUser(String username, String user) {
        this.txt_nguoilap.setText(username);
        this.txt_user.setText(user);

        String b = "admin";

        boolean c = b.equals(user);

        System.out.println(user);
        System.out.println(c);

        if (c == true) {
            btn_xoa.setEnabled(true);
        }

        if (c == false) {
            btn_xoa.setEnabled(false);
        }
    }

    public Hoadon() {
        initComponents();
        showDataList();
        txt_tongtien.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_user = new javax.swing.JLabel();
        jPanelDetail = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_cthd = new javax.swing.JButton();
        txt_mahoadon = new javax.swing.JLabel();
        txt_tongtien = new javax.swing.JLabel();
        txt_nguoilap = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_ghichu = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JLabel();
        txt_ngaylap = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_in = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_tailai = new javax.swing.JButton();
        cb_chon = new javax.swing.JComboBox<>();

        setTitle("Quản lý hóa đơn");
        setResizable(false);

        jPanelHeader1.setBackground(new java.awt.Color(102, 102, 255));
        jPanelHeader1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HÓA ĐƠN");
        jLabel2.setIconTextGap(10);

        txt_user.setText("Null");

        javax.swing.GroupLayout jPanelHeader1Layout = new javax.swing.GroupLayout(jPanelHeader1);
        jPanelHeader1.setLayout(jPanelHeader1Layout);
        jPanelHeader1Layout.setHorizontalGroup(
            jPanelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeader1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_user)
                .addGap(144, 144, 144)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeader1Layout.setVerticalGroup(
            jPanelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeader1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHeader1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_user))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelDetail.setBackground(new java.awt.Color(204, 204, 255));
        jPanelDetail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Số điện thoại:");

        jLabel5.setText("Tổng tiền:");

        jLabel6.setText("Ngày lập:");

        jLabel8.setText("Người lập:");

        jLabel9.setText("Mã hóa đơn:");

        btn_cthd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/icons8-user-manual-32.png"))); // NOI18N
        btn_cthd.setText("Xem chi tiết");
        btn_cthd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cthdActionPerformed(evt);
            }
        });

        txt_mahoadon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_mahoadon.setForeground(new java.awt.Color(255, 51, 0));
        txt_mahoadon.setText("000");

        txt_tongtien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_tongtien.setText("000");

        txt_nguoilap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nguoilap.setText("null");

        txt_ghichu.setColumns(20);
        txt_ghichu.setRows(5);
        jScrollPane2.setViewportView(txt_ghichu);

        jLabel1.setText("Ghi chú");

        txt_sdt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_sdt.setText("000");

        txt_ngaylap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_ngaylap.setText("00/00/0000");

        javax.swing.GroupLayout jPanelDetailLayout = new javax.swing.GroupLayout(jPanelDetail);
        jPanelDetail.setLayout(jPanelDetailLayout);
        jPanelDetailLayout.setHorizontalGroup(
            jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetailLayout.createSequentialGroup()
                        .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDetailLayout.createSequentialGroup()
                                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tongtien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_sdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(427, 427, 427))
                            .addGroup(jPanelDetailLayout.createSequentialGroup()
                                .addComponent(txt_ngaylap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanelDetailLayout.createSequentialGroup()
                                .addComponent(txt_mahoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nguoilap)
                                .addGap(390, 390, 390))))
                    .addGroup(jPanelDetailLayout.createSequentialGroup()
                        .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDetailLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_cthd))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelDetailLayout.setVerticalGroup(
            jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_mahoadon)
                    .addComponent(jLabel8)
                    .addComponent(txt_nguoilap))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_sdt))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_tongtien))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_ngaylap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cthd, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày lập", "Số điện thoại", "Tổng tiền", "Người lập", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableData.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableData);
        jTableData.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/sua2.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.setIconTextGap(10);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/close2.png"))); // NOI18N
        btnClose.setText("Thoat");
        btnClose.setIconTextGap(10);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/del.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/print.png"))); // NOI18N
        btn_in.setText("In");
        btn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_in, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btn_in, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Chức năng", jPanel2);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/timkiem.png"))); // NOI18N
        btn_timkiem.setText("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Tìm theo");

        btn_tailai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/lammoi.png"))); // NOI18N
        btn_tailai.setText("Tải lại");
        btn_tailai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tailaiActionPerformed(evt);
            }
        });

        cb_chon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hóa đơn", "SĐT" }));
        cb_chon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_chonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_timkiem)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_chon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_tailai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_chon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_timkiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btn_tailai)
                .addGap(20, 20, 20))
        );

        jTabbedPane5.addTab("Tìm kiếm", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5)
                    .addComponent(jPanelDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDataDetail(String MaHoaDon, String Ngay, String SDT, String TongTien, String UserID, String GhiChu) {

        txt_mahoadon.setText(MaHoaDon);
        txt_ngaylap.setText(Ngay);
        txt_sdt.setText(SDT);
        txt_nguoilap.setText(UserID);
        txt_tongtien.setText(TongTien);
        txt_ghichu.setText(GhiChu);
    }

    public void gridSelectedChanged(ListSelectionEvent e) throws ParseException {
        String selectedData = null;
        String selectedID = "";  //Mã hóa đơn

        int[] selectedRows = jTableData.getSelectedRows();
        int[] selectedColumns = jTableData.getSelectedColumns();

        int selectedRow = jTableData.getSelectedRow();
        int selectedColumn = jTableData.getSelectedColumn();

        System.out.println("selectedRow: " + selectedRow);
        System.out.println("selectedColumn: " + selectedColumn);

        if (selectedRow >= 0 && selectedColumn >= 0) {
            selectedData = String.valueOf(jTableData.getValueAt(selectedRow, selectedColumn));
            selectedID = (String) jTableData.getValueAt(selectedRow, 0);

            selectedHoaDon = findHoaDon(selectedID, dsHoaDon);

            System.out.println("Selected: " + selectedData + " , MaHoaDon: " + selectedID);

            showDataDetail(selectedID,
                    (String) jTableData.getValueAt(selectedRow, 1),
                    (String) jTableData.getValueAt(selectedRow, 2),
                    (String) jTableData.getValueAt(selectedRow, 3),
                    (String) jTableData.getValueAt(selectedRow, 4),
                    (String) jTableData.getValueAt(selectedRow, 5));

        }
    }

    private void showSearchDataList() {
        String lua = "";
        String tim = txt_timkiem.getText().trim();
        String chon = String.valueOf(cb_chon.getSelectedItem());

        if (chon.equals("Mã hóa đơn")) {
            lua = "MaHoaDon";
        }
        if (chon.equals("SĐT")) {
            lua = "SDT";
        }

        System.out.println(tim + lua);
        DefaultTableModel model = (DefaultTableModel) this.jTableData.getModel();
        model.setRowCount(0);

        //load data
        ArrayList<hoadonTT> list = hoadonservices.getRecords(tim, lua);
        dsHoaDon = list;

        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");

        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        Object[] row = new Object[7];

        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getMaHoaDon();
            row[1] = formatter2.format(list.get(i).getNgay());
            row[2] = list.get(i).getSDT();
            row[3] = en.format(list.get(i).getTongTien());
            row[4] = list.get(i).getUserID();
            row[5] = list.get(i).getGhiChu();

            model.addRow(row);
        }

        ListSelectionModel cellSelectionModel = jTableData.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Dang ky event click tren danh sach        
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                try {
                    //goi ham show data chi tiet
                    gridSelectedChanged(e);
                } catch (ParseException ex) {
                    Logger.getLogger(Hoadon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void showDataList() {

        DefaultTableModel model = (DefaultTableModel) this.jTableData.getModel();
        model.setRowCount(0);

        //load data
        ArrayList<hoadonTT> list = hoadonservices.getAllRecords();
        dsHoaDon = list;

        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");

        Object[] row = new Object[7];

        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getMaHoaDon();
            row[1] = formatter2.format(list.get(i).getNgay());
            row[2] = list.get(i).getSDT();
            row[3] = en.format(list.get(i).getTongTien());
            row[4] = list.get(i).getUserID();
            row[5] = list.get(i).getGhiChu();

            model.addRow(row);
        }

        ListSelectionModel cellSelectionModel = jTableData.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Dang ky event click tren danh sach        
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                try {
                    //goi ham show data chi tiet
                    gridSelectedChanged(e);
                } catch (ParseException ex) {
                    Logger.getLogger(Hoadon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Cap Nhat record
        String MaHoaDon = txt_mahoadon.getText().trim();
        String SDT = txt_sdt.getText().trim();
        String GhiChu = txt_ghichu.getText().trim();

        int rowEffected = hoadonservices.Update(MaHoaDon, SDT, GhiChu);
        if (rowEffected > 0) {
            showDataList();
            JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
        } else {
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // Thoat form
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btn_cthdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cthdActionPerformed
        CT_Hoadon ct_hoadon = new CT_Hoadon();
        ct_hoadon.setTenUser(txt_user.getText());
        ct_hoadon.setMHD(txt_mahoadon.getText());
        ct_hoadon.showDataList(txt_mahoadon.getText());
        this.dispose();

        //vi tri giua man hinh va maximize
        ct_hoadon.pack();
        ct_hoadon.setLocationRelativeTo(null);
        ct_hoadon.setVisible(true);

    }//GEN-LAST:event_btn_cthdActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        //Load bộ dữ liệu tìm kiếm
        showSearchDataList();
    }//GEN-LAST:event_btn_timkiemActionPerformed

    private void btn_tailaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tailaiActionPerformed
        //Load lại toàn bộ dữ liệu
        showDataList();
    }//GEN-LAST:event_btn_tailaiActionPerformed

    private void cb_chonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_chonActionPerformed

    }//GEN-LAST:event_cb_chonActionPerformed

    //Xóa 
    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        String MaHD = txt_mahoadon.getText().trim();

        if (MaHD.equals("000")) {
            JOptionPane.showMessageDialog(null, "Chọn hóa đơn rồi mới xóa được");
        } else {
            String user = txt_nguoilap.getText();
            String SDT = txt_sdt.getText();

            String MaPX = txt_mahoadon.getText().trim();

            int input = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa toàn bộ hóa đơn " + MaHD + " không?", "Confirmation...",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            System.out.println("Delete data? =" + input);

            if (input == 0) {
                //Xoa
                int rowEffected = hoadonservices.DeleteRecord(MaHD, SDT);
                int rowEffected2 = phieuxuatServices.DeleteRecord(MaPX);
                int rowEffected3 = hoadonservices.DeleteRecord2(MaHD, SDT);

                if (rowEffected > 0) {
                    showDataList();
                    if (rowEffected2 > 0) {
                        showDataList();
                        if (rowEffected3 > 0) {
                            JOptionPane.showMessageDialog(null, "Xóa thành công!");
                            showDataList();
                            this.txt_mahoadon.setText("000");
                            this.txt_sdt.setText("000");
                            this.txt_tongtien.setText("000");
                            this.txt_ngaylap.setText("00/00/0000");
                            this.txt_ghichu.setText("");
                            this.txt_nguoilap.setText(txt_user.getText());
                        }
                    }
                } else {
                    showDataList();
                    JOptionPane.showMessageDialog(null, "Xóa thất bại (Phải xóa chi chi tiết trước)");
                }
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inActionPerformed
        int MaHD = Integer.valueOf(txt_mahoadon.getText().trim());
        if (MaHD == 000) {
            JOptionPane.showMessageDialog(null, "Phải chọn 1 hóa đơn thì mới in được");
        } else {
            XuatHoaDon(MaHD);
        }
    }//GEN-LAST:event_btn_inActionPerformed

    public void XuatHoaDon(int MaHD) {
        try {
            ketnoi_sql sql = new ketnoi_sql();
            Hashtable map = new Hashtable();
            JasperDesign jd = JRXmlLoader.load("D:\\BuiNgocDuy\\QuanLyXe\\src\\quanlyxe\\baocao\\XuatHoaDon.jrxml");
            JasperReport jr = JasperCompileManager.compileReport("D:\\BuiNgocDuy\\QuanLyXe\\src\\quanlyxe\\baocao\\XuatHoaDon.jrxml");

            map.put("MaHoaDon", MaHD);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, sql.getConnection());
            JasperViewer.viewReport(jp, false);
            JasperExportManager.exportReportToPdfFile(jp, "D:\\BuiNgocDuy\\QuanLyXe\\src\\quanlyxe\\baocao\\XuatHoaDon.pdf");

        } catch (ClassNotFoundException | SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, "Cannot show report" + e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(Sanpham.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

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
            java.util.logging.Logger.getLogger(Hoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hoadon().setVisible(true);
            }
        });
    }

    public hoadonTT findHoaDon(String MaHoaDon, ArrayList<hoadonTT> hoaDons) {
        for (hoadonTT item : hoaDons) {
            if (item.getMaHoaDon().equals(MaHoaDon)) {
                return item;
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_cthd;
    private javax.swing.JButton btn_in;
    private javax.swing.JButton btn_tailai;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_chon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDetail;
    private javax.swing.JPanel jPanelHeader1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTableData;
    private javax.swing.JTextArea txt_ghichu;
    private javax.swing.JLabel txt_mahoadon;
    private javax.swing.JLabel txt_ngaylap;
    private javax.swing.JLabel txt_nguoilap;
    private javax.swing.JLabel txt_sdt;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JLabel txt_tongtien;
    private javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables

}
