/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaanfinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static perpustakaanfinalproject.DbUtils.getConnection;

/**
 *
 * @author LENOVO
 */
public class FramePeminjaman extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/Perpustakaan";
    String user = "postgres";
    String password = "12345678";
    private PreparedStatement pst;

    /**
     * Creates new form FormPeminjaman
     */
    public FramePeminjaman() {
        initComponents();
        tampil();
    }

    private void tampil() {
        try {
            Class.forName(driver);
            String sql = "SELECT * FROM PEMINJAM";

            try (Connection conn = DriverManager.getConnection(koneksi, user, password); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

                // Mengubah model tabel dengan DbUtils
                this.tblPeminjaman.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException ex) {
                Logger.getLogger(FramePetugas.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Gagal memuat data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FramePetugas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Driver tidak ditemukan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        tfKode.setText("");
        tfNo.setText("");
        tfBulan.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfKode = new javax.swing.JTextField();
        tfNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfBulan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setText("PEMINJAMAN");

        btnInsert.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel1.setText("Kode peminjaman");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("No Anggota");

        tfKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKodeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("Bulan ");

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Peminjaman", "", "No Anggota", "Bulan"
            }
        ));
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        btnUpdate.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCetak.setText("Cetak");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNo)
                            .addComponent(tfKode)
                            .addComponent(tfBulan, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsert)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnCetak))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addGap(6, 6, 6)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCetak))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfKode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKodeActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
    try (Connection conn = getConnection()) { // Gunakan metode getConnection
        String kodePeminjaman = tfKode.getText(); // Kode Peminjaman dari tfKode
        String noAnggota = tfNo.getText();       // Nomor Anggota dari tfNo
        String bulan = tfBulan.getText();        // Bulan dari tfBulan

        if (kodePeminjaman.isEmpty() || noAnggota.isEmpty() || bulan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kode Peminjaman, No Anggota dan Bulan harus diisi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO PEMINJAM (KD_PEMINJAM, NO_ANGGOTA, BULAN) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, kodePeminjaman); // Set kode peminjaman
            pstmt.setString(2, noAnggota);      // Set no anggota
            pstmt.setString(3, bulan);          // Set bulan

            // Eksekusi query dan periksa apakah baris berhasil dimasukkan
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                clearFields(); // Bersihkan kolom input setelah insert
                tampil(); // Update tampilan data terbaru di tabel
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saat menyimpan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Koneksi gagal: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
    int selectedRow = tblPeminjaman.getSelectedRow();

    String kode = tblPeminjaman.getValueAt(selectedRow, 0).toString(); // Kolom pertama untuk kode
    String noAnggota = tblPeminjaman.getValueAt(selectedRow, 1).toString(); // Kolom kedua untuk noAnggota
    String bulan = tblPeminjaman.getValueAt(selectedRow, 2).toString(); // Kolom ketiga untuk bulan
    tfKode.setText(kode);
    tfNo.setText(noAnggota);
    tfBulan.setText(bulan);
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    int selectedRow = tblPeminjaman.getSelectedRow(); 
    if (selectedRow >= 0) {
        String kodePeminjaman = tblPeminjaman.getValueAt(selectedRow, 0).toString();  // Ambil kode peminjaman dari tabel
        String noAnggota = tfNo.getText();  // Ambil nomor anggota dari text field
        String bulan = tfBulan.getText();  // Ambil bulan dari text field

        String sql = "UPDATE PEMINJAM SET no_anggota = ?, bulan = ? WHERE kd_peminjam = ?";  // Query update

        try (Connection conn = DriverManager.getConnection(koneksi, user, password); 
             PreparedStatement pst = conn.prepareStatement(sql)) {

            // Mengisi nilai ke dalam query
            pst.setString(1, noAnggota);  // Set no_anggota
            pst.setString(2, bulan);  // Set bulan
            pst.setString(3, kodePeminjaman);  // Set kode_peminjaman sebagai parameter WHERE

            // Konfirmasi sebelum update
            int confirmation = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin mengupdate data?",
                    "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                pst.executeUpdate();  // Menjalankan query update
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");  // Pesan berhasil
                tampil(); // Memuat ulang data tabel
                clearFields(); // Membersihkan field input
            }

        } catch (SQLException ex) {
            Logger.getLogger(FramePeminjaman.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Gagal mengupdate data: " + ex.getMessage());  // Pesan error
        }
    } else {
        JOptionPane.showMessageDialog(this, "Silakan pilih data yang ingin diperbarui.");
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int selectedRow = tblPeminjaman.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus terlebih dahulu");
                return;
            }

            String idPeminjaman = tblPeminjaman.getValueAt(selectedRow, 0).toString(); // Ambil ID peminjaman

            String sql = "DELETE FROM PEMINJAM WHERE KD_PEMINJAM = ?";
            conn = DriverManager.getConnection(koneksi, user, password);
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, idPeminjaman);

            int confirm = JOptionPane.showConfirmDialog(this,
                    "Apakah Anda yakin ingin menghapus data ini?",
                    "Konfirmasi Hapus",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data peminjaman berhasil dihapus");
            }

            pstmt.close();
            conn.close();

            tampil();  // Memperbarui tampilan tabel setelah penghapusan
            clearFields(); // Membersihkan field input jika ada

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID tidak valid. Pastikan data di tabel benar.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        FrameBeranda beranda = new FrameBeranda();
        beranda.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(FramePeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField tfBulan;
    private javax.swing.JTextField tfKode;
    private javax.swing.JTextField tfNo;
    // End of variables declaration//GEN-END:variables
}