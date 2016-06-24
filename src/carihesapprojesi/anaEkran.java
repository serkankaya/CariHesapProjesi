package carihesapprojesi;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.parser.TokenType;

public class anaEkran extends javax.swing.JFrame {

    public anaEkran() {
        initComponents();
        musteriGetir();
        kategoriGetir();
        urunGetir();
        kategoriListeleCombobox();
        satisKategoriListeleCombobox();
        satilanToplamUrun();
        karZararHesapla();
        musteriID = "";
        kategoriID = "";
        urunID = "";
        urunKategoriAdi = "";
        jXDatePicker1.setFormats("yyyy-MM-dd");
        jXDatePicker2.setFormats("yyyy-MM-dd");

        jLabel1.setText("Hoşgeldiniz Sn. : " + GirisEkrani.kullaniciAdi);
//        Müşteri Componentleri
        jButton5.setEnabled(false);
        jTextField8.setEnabled(false);
        jTextField7.setEnabled(false);
        jTextField6.setEnabled(false);
        jTextField5.setEnabled(false);
//        Kategori Componentleri
        jButton16.setEnabled(false);
        jTextArea4.setEnabled(false);
        jTextField24.setEnabled(false);
//        Urun Kategori Componentleri
        jTextField19.setEnabled(false);
        jTextField20.setEnabled(false);
        jTextField21.setEnabled(false);
        jTextField22.setEnabled(false);
        jComboBox4.setEnabled(false);
        jTextArea2.setEnabled(false);
        jButton12.setEnabled(false);
//          Satış Yönetimi Componentleri
        jTable3.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jTextField10.setVisible(false);
        jTextField11.setVisible(false);
        jComboBox2.setVisible(false);
        jButton7.setVisible(false);
        jLabel50.setVisible(false);
        jLabel15.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton15 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton16 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jPasswordField5 = new javax.swing.JPasswordField();
        jPasswordField6 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Açılış Ekranı");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Listesi"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Adı", "Soyadi", "Telefon", "Adres"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/musteriduzenle.png"))); // NOI18N
        jButton2.setText("Düzenle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/musterisil.png"))); // NOI18N
        jButton3.setText("Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Müşteri Ekle"));
        jPanel9.setToolTipText("");

        jLabel2.setText("Müşteri Adı");

        jLabel3.setText("Soyadı");

        jLabel4.setText("Telefon");

        jLabel5.setText("Adres");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/musteriekle.png"))); // NOI18N
        jButton4.setText("Ekle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(jTextField4)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.getAccessibleContext().setAccessibleName("Müşteri Adı");
        jTextField2.getAccessibleContext().setAccessibleName("Soyadı");
        jTextField3.getAccessibleContext().setAccessibleName("Telefon");
        jTextField4.getAccessibleContext().setAccessibleName("Adres");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Düzenle"));

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });

        jLabel9.setText("Müşteri Adı");

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jLabel7.setText("Telefon");

        jLabel8.setText("Soyadı");

        jLabel6.setText("Adres");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/musteriduzenle.png"))); // NOI18N
        jButton5.setText("Düzenle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(jTextField7)
                        .addComponent(jTextField6)
                        .addComponent(jTextField5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jLabel10.setText("Yapılan işlem : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MÜŞTERİLER", jPanel1);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrele"));

        jLabel11.setText("Aranılacak Bölge");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Müşteri");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Ürün Adı");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Kategori");

        jLabel12.setText("Arama :");

        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField9MouseReleased(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });

        jLabel13.setText("Tarih Aralığı");

        jLabel14.setText("İlk Tarih");

        jLabel18.setText("Son Tarih");

        jLabel20.setText("Arasında");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Sonuç"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Müşteri Adı", "Ürün Kategori", "Ürün Adı", "Adedi", "Fiyatı", "Eklenme Tarihi"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Genel Kar-Zarar Durumu"));

        jLabel21.setText("KAR-ZARAR DURUMU:");

        jLabel22.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Genel Durum"));

        jLabel23.setText("Satılan Toplam Ürün :");

        jLabel25.setText("Bilgilendirme :");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("RAPORLAR", jPanel2);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Satış Ekranı"));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jComboBox1MouseDragged(evt);
            }
        });
        jComboBox1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jComboBox1InputMethodTextChanged(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/liste.png"))); // NOI18N
        jButton6.setText("Listele");
        jButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton6ItemStateChanged(evt);
            }
        });
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton6InputMethodTextChanged(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ürün Adı", "Satış Fiyatı(TL)", "Açıklama"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel27.setText("Seçilen Ürün");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/tamamla.png"))); // NOI18N
        jButton7.setText("Satışı Tamamla");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel28.setText("Adet");

        jLabel29.setText("Müşteri");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel50.setText("Satış yapmak için listeden seçim yapınız ...");

        jLabel15.setText("Müşteriler bölümünden yeni müşteri ekleyebilirsiniz ...");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel28)
                                .addComponent(jLabel29))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton7)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField10)
                                        .addComponent(jTextField11)
                                        .addComponent(jComboBox2, 0, 156, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel15))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1))
                .addGap(46, 46, 46)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28))
                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SATIŞ YÖNETİMİ", jPanel3);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Yönetimi"));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ürün Adı", "Kategori", "Alış Fiyatı(TL)", "Stok", "Açıklama"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/duzenle.png"))); // NOI18N
        jButton9.setText("Düzenle");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/sil.png"))); // NOI18N
        jButton10.setText("Sil");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Ürün Ekleme"));
        jPanel19.setToolTipText("");

        jLabel34.setText("Ürün Adı");

        jLabel35.setText("Kategorisi");

        jLabel36.setText("Alış Ücreti");

        jLabel37.setText("Satış Ücreti");

        jLabel38.setText("Stok");

        jLabel39.setText("Açıklama");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/ekle.png"))); // NOI18N
        jButton11.setText("EKLE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(21, 21, 21)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField15)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField16)
                        .addComponent(jTextField17)
                        .addComponent(jTextField18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11))
        );

        jComboBox3.getAccessibleContext().setAccessibleName("");

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Düzenle"));

        jLabel40.setText("Ürün Adı:");

        jLabel41.setText("Kategorisi");

        jLabel42.setText("Geliş Ücreti");

        jLabel43.setText("Satış Ücreti");

        jLabel44.setText("Stok");

        jLabel45.setText("Açıklama");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/duzenle.png"))); // NOI18N
        jButton12.setText("Düzenle");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addGap(25, 25, 25)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6)
                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField19)
                        .addComponent(jTextField20)
                        .addComponent(jTextField21)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("ÜRÜN YÖNETİMİ", jPanel4);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Listesi"));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kategori", "Açıklama"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setHeaderValue("Kategori");
            jTable5.getColumnModel().getColumn(1).setHeaderValue("Açıklama");
        }

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/duzenle.png"))); // NOI18N
        jButton13.setText("Düzenle");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/sil.png"))); // NOI18N
        jButton14.setText("Sil");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addGap(49, 49, 49))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Kategori Ekle"));

        jLabel46.setText("Kategori Adı");

        jLabel47.setText("Açıklama");

        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField23KeyPressed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea3KeyPressed(evt);
            }
        });
        jScrollPane8.setViewportView(jTextArea3);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/kaydet.png"))); // NOI18N
        jButton15.setText("KAYDET");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addGap(34, 34, 34)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField23)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Düzenle"));

        jLabel48.setText("Kategori Adı");

        jLabel49.setText("Açıklama");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane9.setViewportView(jTextArea4);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/duzenle.png"))); // NOI18N
        jButton16.setText("DÜZENLE");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 422, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("KATEGORİ YÖNETİMİ", jPanel5);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Şifre Değiştir"));

        jLabel30.setText("Eski Şifre");

        jLabel31.setText("Yeni Şifre");

        jLabel32.setText("Yeni Şifre Tekrar");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/sifredegistir.png"))); // NOI18N
        jButton8.setText("DEĞİŞTİR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel33.setText("Uyarılar ... :");

        jPasswordField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField4KeyPressed(evt);
            }
        });

        jPasswordField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField5KeyPressed(evt);
            }
        });

        jPasswordField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField6, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jPasswordField5)
                            .addComponent(jPasswordField4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jPasswordField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jLabel33))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(522, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("KULLANICI AYARLARI", jPanel6);

        jLabel1.setText("SimdilikBos");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carihesapprojesi/login.png"))); // NOI18N
        jButton1.setText("Çıkış");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String adi = jTextField1.getText();
        String soyadi = jTextField2.getText();
        String telefon = jTextField3.getText();
        String adres = jTextField4.getText();
        if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            try {
                DB db = new DB();
                int sonuc = db.baglan().executeUpdate("call musteriEkle('" + adi + "','" + soyadi + "','" + telefon + "','" + adres + "')");
                if (sonuc > 0) {
                    musteriGetir();
                    jLabel10.setText("Yapılan işlem : Müşteri Ekleme İşlemi yapıldı ...");
                    JOptionPane.showMessageDialog(rootPane, "Müşteri Ekleme işlemi başarılı ...");
                    satisaMusteriCekCombobox();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField1.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Müşteri Ekleme işlemi başarısız ...");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Müşteri Ekleme işlemi başarısız ...");
            }
            musteriID = "";
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    String musteriID = "";
    String kategoriID = "";
    String urunID = "";
    String urunKategoriAdi = "";


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String isim = jTextField8.getText();
        String soyisim = jTextField7.getText();
        String telefon = jTextField6.getText();
        String adres = jTextField5.getText();
        try {
            DB db = new DB();
            int sonuc = db.baglan().executeUpdate("call musteriGuncelle('" + isim + "','" + soyisim + "','" + telefon + "','" + adres + "','" + musteriID + "')");

            if (sonuc > 0) {
                jLabel10.setText("Yapılan işlem : Müşteri Güncelleme İşlemi yapıldı ...");
                JOptionPane.showMessageDialog(rootPane, "Müşteri Güncelleme başarılı ... ");
                musteriGetir();
                satisaMusteriCekCombobox();
                musteriID = "";
                jButton5.setEnabled(false);
                jTextField8.setEnabled(false);
                jTextField7.setEnabled(false);
                jTextField6.setEnabled(false);
                jTextField5.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Müşteri Güncelleme başarısız ... ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri Güncelleme başarısız ... ");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jTextField8.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextField7.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField6.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextField5.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        String isim = jTextField8.getText();
        String soyisim = jTextField7.getText();
        String telefon = jTextField6.getText();
        String adres = jTextField5.getText();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call musteriIDAL('" + isim + "','" + soyisim + "','" + telefon + "','" + adres + "')");
            while (rs.next()) {
                musteriID = rs.getString("musteri_id");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "musteriID çekme hatası ...", "Uyarı", JOptionPane.OK_OPTION, null);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (musteriID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen silinecek veriyi seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            int sonkarar = JOptionPane.showConfirmDialog(rootPane, "Müşteriyi Silmek İstediğinizden Emin misiniz", "Müşteri Silme İşlemi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (sonkarar == 0) {
                DB db = new DB();
                try {
                    int sonuc = db.baglan().executeUpdate("call musteriSIL('" + musteriID + "')");
                    if (sonuc > 0) {
                        jLabel10.setText("Yapılan işlem : Müşteri Silme İşlemi yapıldı ...");
                        JOptionPane.showMessageDialog(rootPane, "Silme işlemi başarılı !!!");
                        jTextField8.setText("");
                        jTextField7.setText("");
                        jTextField6.setText("");
                        jTextField5.setText("");
                    }
                } catch (Exception e) {
                    System.err.println("Silme hatası" + e);
                }
                musteriGetir();
                musteriID = "";
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped

    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton4ActionPerformed(null);
            jTextField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jTextField5.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton5ActionPerformed(null);
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (musteriID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen düzenlenecek veriyi seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            jTextField8.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField6.setEnabled(true);
            jTextField5.setEnabled(true);
            jButton5.setEnabled(true);
            jTextField8.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            jTextField7.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            jTextField6.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            jTextField5.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GirisEkrani girisE = new GirisEkrani();
        girisE.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String kategoriAdi = jTextField23.getText();
        String kategoriAciklama = jTextArea3.getText();
        if (jTextField23.getText().equals("") || jTextArea3.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            try {
                DB db = new DB();
                int sonuc = db.baglan().executeUpdate("call kategoriEkle('" + kategoriAdi + "','" + kategoriAciklama + "')");
                if (sonuc > 0) {
                    kategoriGetir();
                    JOptionPane.showMessageDialog(rootPane, "Kategori Ekleme işlemi başarılı ...");
                    kategoriListeleCombobox();
                    jTextField23.setText("");
                    jTextArea3.setText("");
                    jTextField23.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Kategori Ekleme işlemi başarısız ...");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Kategori Ekleme işlemi başarısız ...");
                System.out.println("hata : " + e);
            }
            kategoriID = "";
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jTextArea3.requestFocus();
        }
    }//GEN-LAST:event_jTextField23KeyPressed

    private void jTextArea3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea3KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton15ActionPerformed(null);
        }
    }//GEN-LAST:event_jTextArea3KeyPressed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        jTextField24.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString());
        jTextArea4.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString());
        String kategoriAdi = jTextField24.getText();
        String kategoriAciklama = jTextArea4.getText();

        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call kategoriIDAL('" + kategoriAdi + "','" + kategoriAciklama + "')");
            while (rs.next()) {
                kategoriID = rs.getString("kategori_id");
                System.out.println("KategoriID :" + kategoriID);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "kategoriID çekme hatası ...", "Uyarı", JOptionPane.OK_OPTION, null);
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (kategoriID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen düzenlenecek veriyi seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            jTextField24.setEnabled(true);
            jTextArea4.setEnabled(true);
            jButton16.setEnabled(true);
            jTextField24.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString());
            jTextArea4.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String kategoriAdi = jTextField24.getText();
        String kategoriAciklama = jTextArea4.getText();
        try {
            DB db = new DB();
            int sonuc = db.baglan().executeUpdate("call kategoriGuncelle('" + kategoriAdi + "','" + kategoriAciklama + "'," + kategoriID + ")");
            if (sonuc > 0) {
                JOptionPane.showMessageDialog(rootPane, "Müşteri Güncelleme başarılı ... ");
                kategoriGetir();
                kategoriID = "";
                jButton16.setEnabled(false);
                jTextField24.setEnabled(false);
                jTextArea4.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Kategori Güncelleme başarısız ... ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Kategori Güncelleme başarısız ... ");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (kategoriID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen silinecek veriyi seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            int sonkarar = JOptionPane.showConfirmDialog(rootPane, "Kategoriyi Silmek İstediğinizden Emin misiniz", "Müşteri Silme İşlemi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (sonkarar == 0) {
                DB db = new DB();
                try {
                    int sonuc = db.baglan().executeUpdate("call kategoriSIL('" + kategoriID + "')");
                    if (sonuc > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Kategori Silme işlemi başarılı !!!");
                        jTextField24.setText("");
                        jTextArea4.setText("");
                        kategoriListeleCombobox();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Kategori Silme işlemi başarısız !!!", "Hata", JOptionPane.OK_OPTION, null);
                }
                kategoriGetir();
                kategoriID = "";
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String eskiSifre = jPasswordField4.getText();
        String yeniSifre = jPasswordField5.getText();
        String yeniSifreTekrar = jPasswordField6.getText();
        GirisEkrani giris = new GirisEkrani();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call kullaniciGetir('" + giris.kullaniciID + "')");
            while (rs.next()) {
                if (jPasswordField4.getText().equals("") || jPasswordField5.getText().equals("") || jPasswordField6.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz ...", "Uyarı", JOptionPane.OK_OPTION, null);
                } else {
                    if (yeniSifre.equals(yeniSifreTekrar) && eskiSifre.equals(rs.getString("kullanici_sifre"))) {
                        try {
                            int sonuc = db.baglan().executeUpdate("call kullaniciSifreDegistir('" + yeniSifre + "','" + giris.kullaniciID + "')");
                            if (sonuc > 0) {
                                jLabel33.setForeground(Color.BLUE);
                                jLabel33.setText("Uyarı : Şifre Değiştirme İşlemi Başarılı");
                                jPasswordField4.setText("");
                                jPasswordField5.setText("");
                                jPasswordField6.setText("");
                                jPasswordField4.requestFocus();

                            } else {
                                jLabel33.setForeground(Color.red);
                                jLabel33.setText("Uyarı : Şifre Değiştirme İşlemi Başarısız");
                            }

                        } catch (Exception e) {
                            System.err.println("Hata ..." + e);
                        }
                    } else if (!(yeniSifre.equals(yeniSifreTekrar))) {
                        jLabel33.setForeground(Color.red);
                        jLabel33.setText("Uyarı : Yeni Şifre Tekrarı Yanlış ...");
                        jPasswordField5.setText("");
                        jPasswordField6.setText("");
                        jPasswordField5.requestFocus();
                    } else if (!(eskiSifre.equals(rs.getString("kullanici_sifre")))) {
                        jLabel33.setForeground(Color.red);
                        jLabel33.setText("Uyarı : Eski Şifre Yanlış ...");
                        jPasswordField4.setText("");
                        jPasswordField4.requestFocus();
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Hata2 ..." + e);
        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jPasswordField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField4KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jPasswordField5.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField4KeyPressed

    private void jPasswordField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField5KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jPasswordField6.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField5KeyPressed

    private void jPasswordField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField6KeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            jButton8ActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordField6KeyPressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (urunID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen düzenlenecek veriyi seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {

            jTextField19.setEnabled(true);
            jTextField20.setEnabled(true);
            jTextField21.setEnabled(true);
            jTextField22.setEnabled(true);
            jComboBox4.setEnabled(true);
            jTextArea2.setEnabled(true);
            jButton12.setEnabled(true);

//            jTextField8.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
//            jTextField7.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString());
//            jTextField6.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString());
//            jTextField5.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        jTextField19.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
//        jComboBox4.setSelectedIndex(duzenlecekCombo.getIndexOf(jTable4.getValueAt(jTable4.getSelectedRow(), 1)));
//        jComboBox4.setSelectedItem();
        String urunKategorisi = jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString();
        for (int i = 0; i < duzenlecekCombo.getSize(); i++) {
            if (duzenlecekCombo.getElementAt(i).toString().equals(urunKategorisi)) {
                jComboBox4.setSelectedIndex(i);
            }
        }
        jTextField20.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString());
        jTextField21.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 3).toString());
        jTextField22.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 4).toString());
        jTextArea2.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 5).toString());
        String urunAdi = jTextField19.getText();

        String urunAlisUcreti = jTextField20.getText();
        String urunSatisUcreti = jTextField21.getText();
        String urunStok = jTextField22.getText();
        String urunAciklama = jTextArea2.getText();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call urunIDAL('" + urunAdi + "','" + urunKategorisi + "','" + urunAlisUcreti + "','" + urunSatisUcreti + "','" + urunStok + "','" + urunAciklama + "')");
            while (rs.next()) {
                urunID = rs.getString("urun_id");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "urunID çekme hatası ...", "Uyarı", JOptionPane.OK_OPTION, null);
        }


    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (urunID.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen silinecek veriyi seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            int sonkarar = JOptionPane.showConfirmDialog(rootPane, "Müşteriyi Silmek İstediğinizden Emin misiniz", "Müşteri Silme İşlemi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            System.out.println(urunID);
            if (sonkarar == 0) {
                DB db = new DB();
                try {
                    int sonuc = db.baglan().executeUpdate("call urunSIL('" + urunID + "')");
                    if (sonuc > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Silme işlemi başarılı !!!");
                        jTextField15.setText("");
                        jTextField16.setText("");
                        jTextField17.setText("");
                        jTextField18.setText("");
                        jTextArea1.setText("");
                        jComboBox3.setSelectedIndex(0);
                    }
                } catch (Exception e) {
                    System.err.println("Silme hatası" + e);
                }
                urunGetir();
                urunID = "";
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (jTextField15.getText().equals("") || jTextField16.getText().equals("") || jTextField17.getText().equals("") || jTextField18.getText().equals("") || jTextArea1.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            if (jComboBox3.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Kategori Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
            } else {
                String urunAdi = jTextField15.getText();
                String urunKategoriAdi = jComboBox3.getSelectedItem().toString();
                String urunAlisUcreti = jTextField16.getText();
                String urunSatisUcreti = jTextField17.getText();
                String urunStok = jTextField18.getText();
                String urunAciklama = jTextArea1.getText();
                try {
                    DB db = new DB();
                    int sonuc = db.baglan().executeUpdate("call urunEkle('" + urunAdi + "','" + urunKategoriAdi + "','" + urunAlisUcreti + "','" + urunSatisUcreti + "','" + urunStok + "','" + urunAciklama + "')");
                    if (sonuc > 0) {
                        urunGetir();
                        JOptionPane.showMessageDialog(rootPane, "Ürün Ekleme işlemi başarılı ...");
                        kategoriListeleCombobox();
                        jTextField15.setText("");
                        jTextField16.setText("");
                        jTextField17.setText("");
                        jTextField18.setText("");
                        jComboBox3.setSelectedIndex(0);
                        jTextArea1.setText("");
                        jTextField15.requestFocus();

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Ürün Ekleme işlemi başarısız ...");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Ürün Ekleme işlemi başarısız2 ...");
                    System.out.println("hata : " + e);
                }
                urunID = "";
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String urunAdi = jTextField19.getText();
        String urunKategoriAdi = jComboBox4.getSelectedItem().toString();
        String urunAlisUcreti = jTextField20.getText();
        String urunSatisUcreti = jTextField21.getText();
        String urunStok = jTextField22.getText();
        String urunAciklama = jTextArea2.getText();
        if (jTextField19.getText().equals("") || jTextField20.getText().equals("") || jTextField21.getText().equals("") || jTextField22.getText().equals("") || jTextArea2.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tüm Alanları Doldurunuz ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {
            if (jComboBox4.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Kategori Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
            } else {
                try {
                    DB db = new DB();
                    int sonuc = db.baglan().executeUpdate("call urunGuncelle('" + urunAdi + "','" + urunKategoriAdi + "','" + urunAlisUcreti + "','" + urunSatisUcreti + "','" + urunStok + "','" + urunAciklama + "','" + urunID + "')");

                    if (sonuc > 0) {

                        JOptionPane.showMessageDialog(rootPane, "Ürün Güncelleme başarılı ... ");
                        kategoriListeleCombobox();
                        urunGetir();
                        urunID = "";
                        jTextField19.setEnabled(false);
                        jTextField20.setEnabled(false);
                        jTextField21.setEnabled(false);
                        jTextField22.setEnabled(false);
                        jComboBox4.setEnabled(false);
                        jTextArea2.setEnabled(false);
                        jButton12.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Ürün Güncelleme başarısız ... ");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Ürün Güncelleme başarısız2 ... ");
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String satisUrunKontrol = jComboBox1.getSelectedItem().toString();
        if (jComboBox1.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(rootPane, "Lütfen Kategori Seçiminizi Yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
        } else {

            DefaultTableModel dt = new DefaultTableModel();
            dt.addColumn("Ürün Adı");
            dt.addColumn("Stok");
            dt.addColumn("Satış Fiyatı(TL)");
            dt.addColumn("Açıklama");

            try {
                DB db = new DB();
                ResultSet rs = db.baglan().executeQuery("call satilacakUrunListeleme('" + satisUrunKontrol + "')");
                while (rs.next()) {
                    jTable3.setVisible(true);
                    jLabel50.setVisible(true);
                    dt.addRow(new String[]{rs.getString("urun_adi"), rs.getString("urun_stok"), rs.getString("urun_satis"), rs.getString("urun_aciklama")});
                    urunID = rs.getString("urun_id");
                }
                jTable3.setModel(dt);
            } catch (Exception e) {
                System.err.println("hata : " + e);
            }

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

        jLabel27.setVisible(true);
        jLabel28.setVisible(true);
        jLabel29.setVisible(true);
        jLabel15.setVisible(true);
        jTextField10.setVisible(true);
        jTextField10.setEnabled(false);
        jTextField11.setVisible(true);
        jComboBox2.setVisible(true);
        jButton7.setVisible(true);
        satisaMusteriCekCombobox();
        jTextField10.setText(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
        String satilacakAdet = jTextField11.getText();
        String urunAdi = jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString();
        String urunSatisUcreti = jTable3.getValueAt(jTable3.getSelectedRow(), 2).toString();
        String urunAciklama = jTable3.getValueAt(jTable3.getSelectedRow(), 3).toString();

        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call satisIcinUrunIDAL('" + urunAdi + "','" + urunSatisUcreti + "','" + urunAciklama + "')");
            while (rs.next()) {

                urunID = rs.getString("urun_id");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "urunID çekme hatası ...", "Uyarı", JOptionPane.OK_OPTION, null);
            System.out.println(e);
        }


    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton6ItemStateChanged

    }//GEN-LAST:event_jButton6ItemStateChanged

    private void jButton6InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton6InputMethodTextChanged

    }//GEN-LAST:event_jButton6InputMethodTextChanged

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jComboBox1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseDragged

    }//GEN-LAST:event_jComboBox1MouseDragged

    private void jComboBox1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jComboBox1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1InputMethodTextChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        jButton6ActionPerformed(null);

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int adetKontrol = 0;
        int musteriKontrol = 0;
        int musteriSecimKontrol = 0;
        int stokKontrol = 0;
        String girilenStok = jTextField11.getText();
        int veritabaniStok = 0;
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call stokKontrol('" + urunID + "')");
            rs.next();
            String urunAdi = rs.getString("urun_adi");
            veritabaniStok = (Integer.parseInt(rs.getString("urun_stok")));
            if (veritabaniStok >= Integer.parseInt(girilenStok)) {
                veritabaniStok -= Integer.parseInt(girilenStok);
                int sonuc = db.baglan().executeUpdate("call urunStokGuncelle('" + veritabaniStok + "','" + urunID + "')");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Stok sayısı yetersiz ... Satılmak istenen " + urunAdi + " isimli üründen "+veritabaniStok+" adet bulunmaktadır.", "Stok Sayısı Yetersiz", JOptionPane.OK_OPTION, null);
                jTextField11.setText("");
                jTextField11.requestFocus();
                stokKontrol += 1;
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, "Stok Adedi çekme hatası ...", "Uyarı", JOptionPane.OK_OPTION, null);
            System.out.println("Stok Çekme Hata" + e);
        }
        String satilacakUrunAdedi = jTextField11.getText();
        if (jTextField11.getText().equals("") && stokKontrol==0 || Integer.parseInt(jTextField11.getText())==0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen adet girişi yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
            adetKontrol += 1;
        }
        if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen müşteri seçimi yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
            musteriKontrol += 1;
        }
        if (jTextField10.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Tablodan Müşteri seçimi yapınız ...", "Uyarı", JOptionPane.OK_OPTION, null);
            musteriSecimKontrol += 1;
        }

        if (adetKontrol == 0 && musteriKontrol == 0 && musteriSecimKontrol == 0 && stokKontrol == 0) {
            String duzenlenecekMusteriAdiSoyadi = jComboBox2.getSelectedItem().toString();

            String musteriAdSoyad[] = null;
            musteriAdSoyad = duzenlenecekMusteriAdiSoyadi.split(" ");
            String musteriAd = musteriAdSoyad[0];
            String musteriSoyad = musteriAdSoyad[1];

            try {

                DB db = new DB();
                ResultSet rs = db.baglan().executeQuery("call satisIcınMusteriIDAL('" + musteriAd + "','" + musteriSoyad + "')");
                while (rs.next()) {
                    musteriID = rs.getString("musteri_id");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "musteriID çekme hatası ...", "Uyarı", JOptionPane.OK_OPTION, null);
                System.out.println(e);
            }
            //Satıslar ekleme
            try {
                DB db = new DB();
                int sonuc = db.baglan().executeUpdate("insert into satislar values(null,'" + urunID + "','" + musteriID + "','" + satilacakUrunAdedi + "',now())");
                if (sonuc > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Satış İşlemi Başarılı...");
                    jButton6ActionPerformed(null);
                    urunGetir();
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jComboBox2.setSelectedIndex(0);
                    jTextField11.requestFocus();
                    satilanToplamUrun();
                    karZararHesapla();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Satış İşlemi başarısız ...");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Adet Kısmına Sayı Değeri Giriniz ...");

            }
            musteriID = "";

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseReleased

    }//GEN-LAST:event_jTextField9MouseReleased

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        int aranilacakBolgeSecimKontrol = 0;
        int tarihSecimKontrol = 0;
        if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected() && !jRadioButton3.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Aranılacak Bölgeyi Seçiniz ...", "Uyarı", JOptionPane.OK_OPTION, null);
            aranilacakBolgeSecimKontrol += 1;
        }
        try {
            if (jXDatePicker1.getDate().equals(null) || jXDatePicker2.getDate().equals(null)) {
                tarihSecimKontrol += 1;
                System.out.println(jXDatePicker1.getDate().toString());
                tarihSecimKontrol += 1;
            }
        } catch (Exception e) {
            if (tarihSecimKontrol < 1) {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Tarih Aralıklarını Giriniz", "Uyarı", JOptionPane.OK_OPTION, null);

            }
        }

        if (aranilacakBolgeSecimKontrol == 0 && tarihSecimKontrol == 0) {
            SimpleDateFormat tarihDuzenleyici = new SimpleDateFormat("yyyy-MM-dd");
            String ilktarih = (tarihDuzenleyici.format(jXDatePicker1.getDate()));
            String sontarih = (tarihDuzenleyici.format(jXDatePicker2.getDate()));
            String musteriAdi = jTextField9.getText();
            String veri;
            if (jRadioButton1.isSelected()) {
                veri = musteriAdi;
            }
            if (jRadioButton1.isSelected()) {
                try {
                    DefaultTableModel dt = new DefaultTableModel();
                    dt.addColumn("Müşteri Adı");
                    dt.addColumn("Ürün Kategori");
                    dt.addColumn("Ürün Adı");
                    dt.addColumn("Adedi");
                    dt.addColumn("Fiyatı");
                    dt.addColumn("Eklenme Tarihi");
                    DB db = new DB();
                    ResultSet rs = db.baglan().executeQuery("call SatislarMusteriyeGore('" + ilktarih + "','" + sontarih + "','" + musteriAdi + "')");
                    while (rs.next()) {
                        dt.addRow(new String[]{rs.getString("musteri_adi"), rs.getString("urun_kategori_adi"), rs.getString("urun_adi"), rs.getString("satis_adedi"), rs.getString("urun_satis"), rs.getString("satis_tarih")});
                    }
                    jTable2.setModel(dt);
                } catch (Exception e) {
                    System.out.println("hata : " + e);
                }
            }
            if (jRadioButton2.isSelected()) {
                try {
                    DefaultTableModel dt = new DefaultTableModel();
                    dt.addColumn("Müşteri Adı");
                    dt.addColumn("Ürün Kategori");
                    dt.addColumn("Ürün Adı");
                    dt.addColumn("Adedi");
                    dt.addColumn("Fiyatı");
                    dt.addColumn("Eklenme Tarihi");
                    DB db = new DB();
                    ResultSet rs = db.baglan().executeQuery("call SatislarUrunAdinaGore('" + ilktarih + "','" + sontarih + "','" + musteriAdi + "')");
                    while (rs.next()) {
                        dt.addRow(new String[]{rs.getString("musteri_adi"), rs.getString("urun_kategori_adi"), rs.getString("urun_adi"), rs.getString("satis_adedi"), rs.getString("urun_satis"), rs.getString("satis_tarih")});
                    }
                    jTable2.setModel(dt);
                } catch (Exception e) {
                    System.out.println("hata : " + e);
                }
            }
            if (jRadioButton3.isSelected()) {
                try {
                    DefaultTableModel dt = new DefaultTableModel();
                    dt.addColumn("Müşteri Adı");
                    dt.addColumn("Ürün Kategori");
                    dt.addColumn("Ürün Adı");
                    dt.addColumn("Adedi");
                    dt.addColumn("Fiyatı");
                    dt.addColumn("Eklenme Tarihi");
                    DB db = new DB();
                    ResultSet rs = db.baglan().executeQuery("call SatislarKategoriAdinaGore('" + ilktarih + "','" + sontarih + "','" + musteriAdi + "')");
                    while (rs.next()) {
                        dt.addRow(new String[]{rs.getString("musteri_adi"), rs.getString("urun_kategori_adi"), rs.getString("urun_adi"), rs.getString("satis_adedi"), rs.getString("urun_satis"), rs.getString("satis_tarih")});
                    }
                    jTable2.setModel(dt);
                } catch (Exception e) {
                    System.out.println("hata : " + e);
                }
            }

        }
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        jTextField9KeyReleased(null);
    }//GEN-LAST:event_jTextField9KeyPressed
    public void satisaMusteriCekCombobox() {
        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call musteriGetir");
            dc.addElement("Müşteri Seçimi Yapınız");
            while (rs.next()) {
                dc.addElement(rs.getString("musteri_adi") + " " + rs.getString("musteri_soyadi"));

            }
            jComboBox2.setModel(dc);
        } catch (Exception e) {
        }
    }

    DefaultComboBoxModel duzenlecekCombo = new DefaultComboBoxModel();

    public void satisKategoriListeleCombobox() {
        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call kategoriGetir");
            dc.addElement("Lütfen Seçiminizi Yapınız ...");

            while (rs.next()) {
                dc.addElement(rs.getString("kategori_adi"));

            }
            jComboBox1.setModel(dc);

        } catch (Exception e) {
        }
    }

    public void kategoriListeleCombobox() {
        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call kategoriGetir");
            dc.addElement("Lütfen Seçiminizi Yapınız ...");
            duzenlecekCombo.addElement("Lütfen Seçiminizi Yapınız ...");
            while (rs.next()) {
                dc.addElement(rs.getString("kategori_adi"));
                duzenlecekCombo.addElement(rs.getString("kategori_adi"));

            }
            jComboBox1.setModel(dc);
            jComboBox3.setModel(dc);
            jComboBox4.setModel(duzenlecekCombo);

        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(anaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    // End of variables declaration//GEN-END:variables

    private void musteriGetir() {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Adi");
        dt.addColumn("Soyadi");
        dt.addColumn("Telefon");
        dt.addColumn("Adres");
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call musteriGetir");
            while (rs.next()) {

                dt.addRow(new String[]{rs.getString("musteri_adi"), rs.getString("musteri_soyadi"), rs.getString("musteri_telefon"), rs.getString("musteri_adres")});
            }
            jTable1.setModel(dt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Müşteri Listeleme Hatası ", "Uyarı", JOptionPane.OK_OPTION, null);
        }

    }

    public void urunGetir() {
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Ürün Adı");
        dt.addColumn("Kategori");
        dt.addColumn("Alış Fiyatı(TL)");
        dt.addColumn("Satış Fiyatı(TL)");
        dt.addColumn("Stok");
        dt.addColumn("Açıklama");
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call urunGetir");
            while (rs.next()) {
                dt.addRow(new String[]{rs.getString("urun_adi"), rs.getString("urun_kategori_adi"), rs.getString("urun_alis"), rs.getString("urun_satis"), rs.getString("urun_stok"), rs.getString("urun_aciklama")});
            }
            jTable4.setModel(dt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ürün Listeleme Hatası ", "Uyarı", JOptionPane.OK_OPTION, null);
        }
    }

    private void kategoriGetir() {

        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Kategori");
        dt.addColumn("Açıklama");

        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call kategoriGetir");
            while (rs.next()) {
                dt.addRow(new String[]{rs.getString("kategori_adi"), rs.getString("kategori_aciklama")});
            }
            jTable5.setModel(dt);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Kategori Listeleme Hatası ", "Uyarı", JOptionPane.OK_OPTION, null);
            System.out.println("Kategori Listeleme Hatası : " + ex);
        }

    }

    public void satilanToplamUrun() {
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call toplamSatisAdedi");
            rs.next();
            jLabel23.setForeground(Color.BLUE);
            jLabel23.setText("Satılan Toplam Ürün : " + rs.getString("SUM(satis_adedi)"));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Kategori Listeleme Hatası ", "Uyarı", JOptionPane.OK_OPTION, null);
            System.out.println("Kategori Listeleme Hatası : " + ex);
        }
    }

    public void karZararHesapla() {
        try {
            DB db = new DB();
            ResultSet rs = db.baglan().executeQuery("call karZararTL");
            rs.next();
            if ((Integer.parseInt(rs.getString("SUM(satis.satis_adedi*((urun.urun_satis)-(urun.urun_alis)))"))) > 0) {
                jLabel25.setForeground(Color.GREEN);
                jLabel25.setText("Bilgilendirme : Firma KÂRDA");

            } else {
                jLabel25.setForeground(Color.RED);
                jLabel25.setText("Bilgilendirme : Firma ZARARDA");

            }
            jLabel22.setText(rs.getString("SUM(satis.satis_adedi*((urun.urun_satis)-(urun.urun_alis)))"));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Şu ana kadar satılan Ürün bulunmadığı için bilgilendirme işlemleri gerçekleştirilemedi ...", "Uyarı", JOptionPane.OK_OPTION, null);

        }
    }
}
