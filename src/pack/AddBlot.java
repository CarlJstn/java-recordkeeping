/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Justine
 */
public class AddBlot extends javax.swing.JPanel {

    /**
     * Creates new form AddBlot
     */
    public AddBlot() {
        initComponents();
        
        stateTxt.setLineWrap(true);
        
        
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
        stateTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 168));
        setLayout(null);

        stateTxt.setColumns(20);
        stateTxt.setRows(5);
        jScrollPane1.setViewportView(stateTxt);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 42, 380, 122);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Add Statement");
        add(jLabel1);
        jLabel1.setBounds(10, 20, 130, 14);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea stateTxt;
    // End of variables declaration//GEN-END:variables
}
