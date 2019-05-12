
package pack;

import java.awt.Dimension;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import static pack.Dashboard.flag;
import static pack.Dashboard.indexes;
import static pack.Dashboard.searchIndex;
import static pack.Variables.conn;
import static pack.Variables.rs;
import static pack.Variables.statement;
import static pack.Variables.stmt;

public class Records extends javax.swing.JFrame {

    String name="";
    public Records() throws SQLException {
        initComponents();
        
        setLocationRelativeTo(null);
        if(flag==false)
        {
            name = Variables.Fullname.get(searchIndex);
        }
        else
        {
            name = Variables.Fullname.get(indexes.get(searchIndex));
        }
        
        namelbl.setText("Records of "+name);
        recordsTable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recordsP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recordsTable = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        namelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(629, 581));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordsP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recordsTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        recordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record", "Record Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordsTable.setRowHeight(20);
        jScrollPane1.setViewportView(recordsTable);
        if (recordsTable.getColumnModel().getColumnCount() > 0) {
            recordsTable.getColumnModel().getColumn(0).setResizable(false);
            recordsTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            recordsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        recordsP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, -1, 400));

        addbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addbtn.setText("Add Record");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        recordsP.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 120, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("ALL RECORDS");
        recordsP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 210, -1));

        closeBtn.setBackground(new java.awt.Color(255, 255, 255));
        closeBtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        recordsP.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 90, 40));

        getContentPane().add(recordsP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 610, 510));

        namelbl.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        namelbl.setText("jLabel3");
        getContentPane().add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void recordsTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) recordsTable.getModel();
        
        Object rowData[] = new Object[2];

        DefaultTableModel dm = (DefaultTableModel) recordsTable.getModel();
        dm.getDataVector().removeAllElements();
        revalidate();
        
        if(Dashboard.flag==false)
        {
            String query = "select * from RECORD where citizen_Id="+Variables.Unique.get(Dashboard.searchIndex);
            rs = stmt.executeQuery(query);

           while(rs.next()){
               rowData[0] = rs.getString("record");
               rowData[1] = rs.getString("date");
               model.addRow(rowData);
           }
        }
        else
        {
            String query = "select * from RECORD where citizen_Id="+Variables.Unique.get(Dashboard.indexes.get(Dashboard.searchIndex));
            rs = stmt.executeQuery(query);

           while(rs.next()){
               rowData[0] = rs.getString("record");
               rowData[1] = rs.getString("date");
               model.addRow(rowData);
           }
        }
        
           
        
        recordsTable.setModel(model);
        
        
        
        
    }
    
    
    
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        AddBlot ad = new AddBlot();
        ad.setPreferredSize(new Dimension(325, 233));
        ImageIcon icon = new ImageIcon("pass.png");

        String[] options = new String[2];
        options[0] = new String("Add");
        options[1] = new String("Cancel");
        int pick = javax.swing.JOptionPane.showOptionDialog(null, ad, "ADD RECORD", 0, javax.swing.JOptionPane.INFORMATION_MESSAGE, icon, options, null);

        for (;;) {
            String oldpw = AddBlot.stateTxt.getText();
            
            if (pick == 0) {

                    if (oldpw.equals("")) {
                       
                        javax.swing.JOptionPane.showMessageDialog(null, "Please Input Statement!", "NOTICE", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        pick = javax.swing.JOptionPane.showOptionDialog(null, ad, "PASSWORD SETTING", 0, javax.swing.JOptionPane.INFORMATION_MESSAGE, icon, options, null);

                    } else {
                        try
                        {
                            Date dat = new Date();
                            SimpleDateFormat sf = new SimpleDateFormat("MMMM dd,yyyy");
                            String date = sf.format(dat);
                            
                            
                            if(Dashboard.flag==false)
                            {
                                String query = "insert into RECORD (citizen_Id, date, record) values (?,?,?)";
                                statement = conn.prepareStatement(query);
                                statement.setInt(1, Variables.Unique.get(Dashboard.searchIndex));
                                statement.setString(2, date);
                                statement.setString(3,oldpw);
                                statement.executeUpdate();
                                javax.swing.JOptionPane.showMessageDialog(null,"Added Succesfully");
                            }
                            else
                            {
                                String query = "insert into RECORD (citizen_Id, date, record) values (?,?,?)";
                                statement = conn.prepareStatement(query);
                                statement.setInt(1, Variables.Unique.get(Dashboard.indexes.get(Dashboard.searchIndex)));
                                statement.setString(2, date);
                                statement.setString(3, oldpw);
                                statement.executeUpdate();
                                javax.swing.JOptionPane.showMessageDialog(null,"Added Succesfully");
                            }
                            recordsTable();
                            
                            break;
                            
                           
                        }
                        catch(SQLException e)
                        {
                           javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
                        }
                        
                    }
                
            } else {
                break;
            }
        }//unli
        
        
        
    }//GEN-LAST:event_addbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Records().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Records.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelbl;
    private javax.swing.JPanel recordsP;
    private javax.swing.JTable recordsTable;
    // End of variables declaration//GEN-END:variables
}
