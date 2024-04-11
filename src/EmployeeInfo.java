import net.coobird.thumbnailator.Thumbnails;
import net.proteanit.sql.DbUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeInfo extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public EmployeeInfo() {
        initComponents();
        conn = MysqlConnect.ConnectDB();
        this.setLocationRelativeTo(null);
        setSize((900), 500);
        update_table();

    }

    public void Clear() {
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jComboBox1.setSelectedIndex(-1);
        jDateChooser1.setDate(null);
        txt_addres.setText("");
        txt_imagepath.setText("");
        buttonGroup1.clearSelection();
        jRadioButton_male.setSelected(false);
        jRadioButton_fammelle.setSelected(false);

        imglabel.setIcon(null);

    }

    public void update_table() {
        try {
            String sql = "SELECT * FROM employeeinfo";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));




        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }

        }
    }
    
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        imglabel = new javax.swing.JLabel();
        txt_addres = new javax.swing.JTextField();
        btn_uploadimage = new javax.swing.JButton();
        txt_imagepath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_fammelle = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusTraversalPolicyProvider(true);

        imglabel.setBackground(new java.awt.Color(102, 102, 102));
        imglabel.setAlignmentX(0.5F);
        imglabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imglabel.setFocusable(false);

        txt_addres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));

        btn_uploadimage.setText("Upload Image");
        btn_uploadimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        btn_uploadimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadimageActionPerformed(evt);
            }
        });

        txt_imagepath.setEditable(false);

        jLabel2.setText("Adress");

        jLabel3.setText("Image Path");

        jLabel4.setText("EmployeeID");

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));

        jLabel5.setText("Name");

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));

        buttonGroup1.add(jRadioButton_male);
        jRadioButton_male.setText("Male");
        jRadioButton_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_fammelle);
        jRadioButton_fammelle.setText("Fammelle");
        jRadioButton_fammelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_fammelleActionPerformed(evt);
            }
        });

        jLabel6.setText("Gender");

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));

        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));

        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MBA", "MBBS", "B.TECH", "M.TECH", "B.COM", "BCA", "MCA", "PHD", " " }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));

        jLabel7.setText("Age");

        jLabel8.setText("BloodGroup");

        jLabel9.setText("ContactNo");

        jLabel10.setText("Qualification");

        jLabel12.setText("Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton_male, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_fammelle, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_uploadimage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton_fammelle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton_male, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_addres, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addComponent(btn_uploadimage, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_imagepath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Search");

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });

        btn_new.setText("New");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new)
                    .addComponent(btn_save)
                    .addComponent(btn_update)
                    .addComponent(jButton5)
                    .addComponent(btn_clear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EmployeeID", "Nom", "Gender", "Age", "BloodGroup", "ContactNo", "Qualification", "DOJ", "Address", "EmpImage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_uploadimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadimageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        txt_imagepath.setText(filename);

        try {

            File image = new File(filename);
            BufferedImage thumbnail = Thumbnails.of(image).size(180, 200).asBufferedImage();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(thumbnail, "jpg", os);
            InputStream is = new ByteArrayInputStream(os.toByteArray());
            ByteArrayOutputStream os2 = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int num; (num = is.read(buf)) != -1;) {

                os2.write(buf, 0, num);
            }
            img = new ImageIcon(thumbnail);
            imglabel.setIcon(img);
            employeeimage = os2.toByteArray();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_uploadimageActionPerformed

    private void jRadioButton_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_maleActionPerformed
        gender = "Male";       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_maleActionPerformed

    private void jRadioButton_fammelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_fammelleActionPerformed
        gender = "Femmelle";         // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_fammelleActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
         
        
        
       
        try {

            String sql = "INSERT INTO employeeinfo ( Name,Gender, Age, BloodGroup, ContactNo, Qualification, DOJ, Address, EmpImage) VALUES(?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField4.getText());
            pst.setString(2, gender);
            pst.setString(3, jTextField5.getText());
            pst.setString(4, jTextField6.getText());
            pst.setString(5, jTextField7.getText());

            String combovalue = jComboBox1.getSelectedItem().toString();
            pst.setString(6, combovalue);

            java.util.Date date = jDateChooser1.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            String strDateOutput = sdf.format(date);

            pst.setString(7, strDateOutput);

            pst.setString(8, txt_addres.getText());

            pst.setBytes(9, employeeimage);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Données sauvegardées avec succées");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }

        }
        update_table();
        //Clear();

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        Clear();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        Clear();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
           //personne p = new personne(firstname, lastname, tel, adresse, email, pass);
             try {

            String sql = "UPDATE employeeinfo SET Name=?, Gender=?, Age=?, BloodGroup=?, ContactNo=?, Qualification=?, DOJ=?, Address=? WHERE EmployeeID=?";
             txt_imagepath.enableInputMethods(true);
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField4.getText());
            pst.setString(2, gender);
            pst.setString(3, jTextField5.getText());
            pst.setString(4, jTextField6.getText());
            pst.setString(5, jTextField7.getText());

            String combovalue = jComboBox1.getSelectedItem().toString();
            pst.setString(6, combovalue);

            java.util.Date date = jDateChooser1.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            String strDateOutput = sdf.format(date);

            pst.setString(7, strDateOutput);

            pst.setString(8, txt_addres.getText());

            // pst.setBytes(9, employeeimage);
            
            pst.setString(9, jTextField3.getText());
            pst.executeUpdate();
            

            pst.execute();
            JOptionPane.showMessageDialog(null, "Données Update");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }

        }
        update_table();
        //Clear();
          
        
        
        
        
        
        update_table();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            String sql = "delete from employeeinfo  where EmployeeID=?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField3.getText());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "L'employee" + " " + " " + jTextField4.getText() + "" + "à été supprimer en toute sécurité ");
            update_table();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

       
            
            
            int selectedRowIndex = jTable1.getSelectedRow(); //get selected row
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

       /*     
             try {
             Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) dtm.getValueAt(selectedRowIndex, 7));
            jDateChooser1.setDate(date);
             } catch (ParseException ex) {
            Logger.getLogger(EmployeeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }*/
          
            String a = dtm.getValueAt(selectedRowIndex, 2).toString();
            

            
            jTextField3.setText(dtm.getValueAt(selectedRowIndex, 0).toString());
            jTextField4.setText(dtm.getValueAt(selectedRowIndex, 1).toString());
            jTextField5.setText(dtm.getValueAt(selectedRowIndex, 3).toString());
            jTextField6.setText(dtm.getValueAt(selectedRowIndex, 4).toString());
            jTextField7.setText(dtm.getValueAt(selectedRowIndex, 5).toString());
            if( a.equals("Male")){
                buttonGroup1.clearSelection();
                jRadioButton_male.setSelected(true);}
            else {
                buttonGroup1.clearSelection();
                jRadioButton_fammelle.setSelected(true);}
            
            jComboBox1.setSelectedItem(dtm.getValueAt(selectedRowIndex, 6).toString());
             txt_addres.setText(dtm.getValueAt(selectedRowIndex, 8).toString());
             // else (dtm.getValueAt(selectedRowIndex, 2).toString()=="fammelle"){jRadioButton_fammelle.setSelected(true);}       
                   
             imglabel.setIcon(img);
             byte[] i = (byte[]) dtm.getValueAt(selectedRowIndex, 9);
             ImageIcon image= new ImageIcon(i);
             Image im =image.getImage();
             Image myimag= im.getScaledInstance(imglabel.getWidth(), imglabel.getHeight(), Image.SCALE_FAST);
             ImageIcon imaggg= new ImageIcon(myimag);
             imglabel.setIcon(imaggg);
                   
     
            // TODO add your handling code here:
       
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed

      DefaultTableModel table = (DefaultTableModel)jTable1.getModel(); 
      String search = jTextField8.getText(); 
      TableRowSorter<DefaultTableModel> tr = new  TableRowSorter<DefaultTableModel>(table);

      jTable1.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(search));
       
    }//GEN-LAST:event_jTextField8KeyPressed

    
    
    
    
    
    
    
    /*
    
    public  void findByTextOfEpmloye(String text_search) throws SQLException {
	    	String sql = "select employeID as 'ID Employé',e.nom as 'Nom',SALAIRE as 'Salaire',e.societeID as 'Id Societé',s.NOM as 'Nom de Société' from employe as e , societe as s where e.societeID=s.societeID and (UPPER(e.nom) LIKE ? OR e.salaire LIKE ? OR  e.employeID LIKE ?)";
	    	Modele_PrepareExecuteQuery mpeq = new Modele_PrepareExecuteQuery(sql);
	    	statement = mpeq.getStatement();
			statement.setString(1,"%" +  text_search.toUpperCase() + "%");
			statement.setString(2,"%" +  text_search+ "%" );
			statement.setString(3,"%" +  text_search+ "%" );
			Modele_ExecuteQuery meq = new Modele_ExecuteQuery(statement);
			connection = meq.getConnection();
			resultat = statement.getResultSet();
			table.setModel(DbUtils.resultSetToTableModel(resultat));
			new Modele_CloseBase(resultat, statement, con);
    }
   *******************************************************************************************/
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
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_uploadimage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imglabel;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_fammelle;
    private javax.swing.JRadioButton jRadioButton_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txt_addres;
    private javax.swing.JTextField txt_imagepath;
    // End of variables declaration//GEN-END:variables
   String filename = null;
    private ImageIcon img = null;
    private String gender;
    byte[] employeeimage = null;
}
