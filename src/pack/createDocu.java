/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.io.File;
import java.awt.*;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.filechooser.FileSystemView;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import static pack.Dashboard.flag;
import static pack.Dashboard.indexes;
import static pack.Dashboard.searchIndex;

/**
 *
 * @author Justine
 */
public class createDocu extends javax.swing.JFrame {

    private static File home = FileSystemView.getFileSystemView().getHomeDirectory();
    private static String DIR = home.getAbsolutePath();
    String name = "", address = "" ,father="",mother="",stat="",gender="";
    int age;
    String bday = "";

    Date dat = new Date();
    SimpleDateFormat sf = new SimpleDateFormat("MMMM dd, yyyy");
    String date = sf.format(dat);

    /**
     * Creates new form createDocu
     */
    public createDocu() {
        System.out.println("asd");
        initComponents();
        this.setResizable(false);
        this.setTitle("Select Document");
        if (flag == false) {
            name = Variables.Fullname.get(searchIndex);
            bday = (String) Variables.Birthday.get(searchIndex);
            address = (String) Variables.FullAddress.get(searchIndex);
            father = (String) Variables.FullnameFather.get(searchIndex);
            mother = (String) Variables.FullnameMother.get(searchIndex);
            gender = (String) Variables.Gender.get(searchIndex);

        } else {
            name = Variables.Fullname.get(indexes.get(searchIndex));
            bday = (String) Variables.Birthday.get(indexes.get(searchIndex));
            address = (String) Variables.FullAddress.get(indexes.get(searchIndex));
            father = (String) Variables.FullnameFather.get(indexes.get(searchIndex));
            mother = (String) Variables.FullnameMother.get(indexes.get(searchIndex));
            gender = (String) Variables.Gender.get(indexes.get(searchIndex));
        }

        if(gender.equals("Male"))
        {
            stat = "BINATA";
        }
        else if(gender.equals("Female"))
        {
            stat = "DALAGA";
        }
        
        int bdayD = Integer.parseInt((String) bday.subSequence(bday.length() - 4, bday.length()));
        int currentD = Integer.parseInt((String) date.subSequence(date.length() - 4, date.length()));

        age = currentD - bdayD;

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Indigency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setText("Barangay Clearance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton3.setText("Electric Clearance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton4.setText("CENOMAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton5.setText("Cohabitation");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton6.setText("Pagpapatunay");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Cohabitation coha = new Cohabitation();
        coha.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
                FileOutputStream outStream = new FileOutputStream(home.getAbsolutePath() + "\\Pagpapatunay.docx");
                XWPFDocument doc = new XWPFDocument();

//            InputStream pic = new FileInputStream("C:\\Users\\carlj\\Desktop\\staIlenaLogo.png");
//            byte [] picbytes = IOUtils.toByteArray(pic);
//            doc.addPictureData(picbytes, Document.PICTURE_TYPE_PNG);
                XWPFParagraph para = doc.createParagraph();
                para.setAlignment(ParagraphAlignment.CENTER);
                XWPFRun paraRun = para.createRun();

                paraRun.setBold(true);
                paraRun.setFontSize(12);
                paraRun.setFontFamily("Times New Roman");
                paraRun.setText("Republic of the Philippines");
                paraRun.addBreak();
                paraRun.setText("Province of Bulacan");
                paraRun.addBreak();
                paraRun.setText("Municipality of Hagonoy");
                paraRun.addBreak();
                paraRun.setText("Barangay Sta. Elena");
                paraRun.addBreak();

                XWPFParagraph para2 = doc.createParagraph();
                para2.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun2 = para2.createRun();

                paraRun2.setBold(true);
                paraRun2.setFontSize(13);
                paraRun2.setFontFamily("Times New Roman");
                paraRun2.setText("DOROTEO M. REYES III                                                      Telephone#: 794-0541");

                XWPFParagraph para3 = doc.createParagraph();
                para3.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun3 = para3.createRun();

                paraRun3.setBold(false);
                paraRun3.setFontSize(13);
                paraRun3.setFontFamily("Times New Roman");
                paraRun3.setText("BARANGAY CAPTAIN");
                paraRun3.addBreak();
                paraRun3.setText("=============================================================");

                XWPFParagraph para4 = doc.createParagraph();
                para4.setAlignment(ParagraphAlignment.CENTER);
                XWPFRun paraRun4 = para4.createRun();

                paraRun4.setBold(true);
                paraRun4.setFontSize(17);
                paraRun4.setFontFamily("Times New Roman");
                paraRun4.setText("P-A-G-P-A-P-A-T-U-N-A-Y");
                paraRun4.addBreak();

                XWPFParagraph para5 = doc.createParagraph();
                para5.setAlignment(ParagraphAlignment.RIGHT);
                XWPFRun paraRun5 = para5.createRun();

                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("EEE, MMMM dd, yyyy");
                String date = s.format(d);

                paraRun5.setBold(false);
                paraRun5.setFontSize(12);
                paraRun5.setFontFamily("Times New Roman");
                paraRun5.setUnderline(UnderlinePatterns.SINGLE);
                paraRun5.setText(date);

                XWPFParagraph para6 = doc.createParagraph();
                para6.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun6 = para6.createRun();

                paraRun6.setBold(false);
                paraRun6.setFontSize(12);
                paraRun6.setFontFamily("Times New Roman");
                paraRun6.setText("Sa Kinauukulan:");

                XWPFParagraph para7 = doc.createParagraph();
                para7.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun7 = para7.createRun();
                para7.setFirstLineIndent(300);
                
                paraRun7.setBold(false);
                paraRun7.setFontSize(12);
                paraRun7.setFontFamily("Times New Roman");
                paraRun7.setText("Ito po ay nagpapatunay na si "+name+",  "+age+" na taong gulang, ipinanganak noong "+bday+" ay kasalukuyang naninirahan sa "+address+".");
                        
                XWPFParagraph para8 = doc.createParagraph();
                para8.setAlignment(ParagraphAlignment.LEFT);
                para8.setFirstLineIndent(300);
                XWPFRun paraRun8 = para8.createRun();

                paraRun8.setBold(false);
                paraRun8.setFontSize(12);
                paraRun8.setFontFamily("Times New Roman");
                paraRun8.setText("Ang pagpapatunay na ito ay sa kahilingan ni "+name+", upang magamit sa anumang hangarin o layunin na naaayon sa batas.");

                XWPFParagraph para11 = doc.createParagraph();
                para11.setAlignment(ParagraphAlignment.RIGHT);
                XWPFRun paraRun11 = para11.createRun();

                paraRun11.setBold(true);
                paraRun11.setFontSize(13);
                paraRun11.setFontFamily("Times New Roman");
                paraRun11.addBreak();             
                paraRun11.addBreak();
                paraRun11.addBreak();
                paraRun11.setText("______________________");
                paraRun11.addBreak();
                paraRun11.setText("DOROTEO M. REYES III");

                XWPFParagraph para12 = doc.createParagraph();
                para12.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun12 = para12.createRun();

                paraRun12.setBold(false);
                paraRun12.setFontSize(12);
                paraRun12.setFontFamily("Times New Roman");
                paraRun12.setText("                                                                                                                      Barangay Captain");

                doc.write(outStream);
                outStream.close();
                //pic.close();
                JOptionPane.showMessageDialog(null, "Document created.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            Desktop desktop = Desktop.getDesktop();
            try {
                File f = new File(DIR + "\\Pagpapatunay.docx");
                desktop.open(f);  // opens application (MSWord) associated with .doc file
            } catch (Exception ex) {
                // WordDocument.this is to refer to outer class's instance from inner class
                JOptionPane.showMessageDialog(createDocu.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Indigency in = new Indigency();
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clearance cl = new Clearance();
        cl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            FileOutputStream outStream = new FileOutputStream(home.getAbsolutePath() + "\\ElectircClearance.docx");
            XWPFDocument doc = new XWPFDocument();

//            InputStream pic = new FileInputStream("C:\\Users\\carlj\\Desktop\\staIlenaLogo.png");
//            byte [] picbytes = IOUtils.toByteArray(pic);
//            doc.addPictureData(picbytes, Document.PICTURE_TYPE_PNG);
            XWPFParagraph para = doc.createParagraph();
            para.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun paraRun = para.createRun();

            paraRun.setBold(true);
            paraRun.setFontSize(12);
            paraRun.setFontFamily("Times New Roman");
            paraRun.setText("Republic of the Philippines");
            paraRun.addBreak();
            paraRun.setText("Province of Bulacan");
            paraRun.addBreak();
            paraRun.setText("Municipality of Hagonoy");
            paraRun.addBreak();
            paraRun.setText("Barangay Sta. Elena");
            paraRun.addBreak();

            XWPFParagraph para2 = doc.createParagraph();
            para2.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun paraRun2 = para2.createRun();

            paraRun2.setBold(true);
            paraRun2.setFontSize(15);
            paraRun2.setFontFamily("Times New Roman");
            paraRun2.setText("TANGGAPAN NG PUNONG BARANGAY");

            XWPFParagraph para3 = doc.createParagraph();
            para3.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun paraRun3 = para3.createRun();

            paraRun3.setBold(false);
            paraRun3.setFontSize(13);
            paraRun3.setFontFamily("Times New Roman");
            paraRun3.setText(date);

            XWPFParagraph para4 = doc.createParagraph();
            para4.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun paraRun4 = para4.createRun();

            paraRun4.setBold(true);
            paraRun4.setFontSize(13);
            paraRun4.setFontFamily("Times New Roman");
            paraRun4.setText("Barangay Electric Clearance");
            paraRun4.addBreak();

            XWPFParagraph para5 = doc.createParagraph();
            para5.setAlignment(ParagraphAlignment.LEFT);
            XWPFRun paraRun5 = para5.createRun();

            paraRun5.setBold(false);
            paraRun5.setFontSize(12);
            paraRun5.setFontFamily("Times New Roman");
            paraRun5.setText("Sa Kinauukulan:");

            XWPFParagraph para6 = doc.createParagraph();
            para6.setAlignment(ParagraphAlignment.LEFT);
            para6.setFirstLineIndent(300);
            XWPFRun paraRun6 = para6.createRun();

            paraRun6.setBold(false);
            paraRun6.setFontSize(12);
            paraRun6.setFontFamily("Times New Roman");
            paraRun6.setText("Kaugnay po ng Barangay Electric Permit na isa sa kailangang dokumento sa pagkuha ng Certificate of Final Electrical Inspection ( CFEI ). Na kailangan sa pagkakaroon ng kuryente mula sa MERALCO ay magalang naming hinihiling na mailagay sa Barangay Electrical Permit ang mga sumusunod;");
            paraRun6.addBreak();
            paraRun6.setText("Ito ay nakapangalan kay "+name+" at dito nakatirik ang kanyang bahay sa "+address);
            
            XWPFParagraph para7 = doc.createParagraph();
            para7.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun paraRun7 = para7.createRun();

            paraRun7.setBold(false);
            paraRun7.setFontSize(12);
            paraRun7.setFontFamily("Times New Roman");
            paraRun7.setText("1.      Lupang kinatatayuan ng bahay o istrukturang lalagyan ng kuryente?");
            paraRun7.addBreak();
            paraRun7.addBreak();
            paraRun7.setText("( ) Pribadong Pag-aari		( ) Lupang Gobyerno");
            paraRun7.addBreak();
            paraRun7.addBreak();
            paraRun7.addBreak();
            paraRun7.setText("2.      Gaano na katagal nakatayo ang kanilang bahay o istruktura sa lupang kinatitirikan?");
            paraRun7.addBreak();
            paraRun7.addBreak();
            paraRun7.setText("___  Taon     ___ Buwan     ___ Linggo     ___ Itatayo pa lamang");
            paraRun7.addBreak();
            paraRun7.addBreak();
            paraRun7.addBreak();
            paraRun7.setText("3.      Ano ang dahilan ng pagpapakabit ng kuryente?");
            paraRun7.addBreak();
            paraRun7.addBreak();
            paraRun7.setText("( ) Bagong Gawa            ( ) Rekoneksyon o naputulan ng kuryente");
            paraRun7.addBreak();
            paraRun7.addBreak();
            paraRun7.setText("( ) Paglilipat ng pangalan sa kuntador              ( ) Lumang Straktura");
            paraRun7.addBreak();

            XWPFParagraph para8 = doc.createParagraph();
            para8.setAlignment(ParagraphAlignment.LEFT);
            para8.setFirstLineIndent(300);
            XWPFRun paraRun8 = para8.createRun();

            paraRun8.setBold(false);
            paraRun8.setFontSize(12);
            paraRun8.setFontFamily("Times New Roman");
            paraRun8.setText("Mahalaga po ang mga nasabing datus ay nakalagay sa Barangay Electrical Permit na aming ibibigay para sa pagpapabilis ng proseso sa inyong pagkuha ng kuryente lalo na at ang kanilang bahay ay nakatirik sa lupang hindi nila pag-aari o lupang pag-aari ng gobyerno.");
            paraRun8.addBreak();
            paraRun8.setText("Maraming Salamat Po.");
            
            XWPFParagraph para9 = doc.createParagraph();
            para9.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun paraRun9 = para9.createRun();

            paraRun9.setBold(true);
            paraRun9.setFontSize(12);
            paraRun9.setUnderline(UnderlinePatterns.SINGLE);
            paraRun9.setFontFamily("Times New Roman");
            paraRun9.setText("DOROTEO M. REYES III");

            XWPFParagraph para10 = doc.createParagraph();
            para10.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun paraRun10 = para10.createRun();

            paraRun10.setBold(false);
            paraRun10.setFontSize(12);
            paraRun10.setFontFamily("Times New Roman");
            paraRun10.setText("Punong Barangay");

            doc.write(outStream);
            outStream.close();
            //pic.close();
            JOptionPane.showMessageDialog(null, "Document created.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        Desktop desktop = Desktop.getDesktop();
        try {
            File f = new File(DIR + "\\ElectircClearance.docx");
            desktop.open(f);  // opens application (MSWord) associated with .doc file
        } catch (Exception ex) {
            // WordDocument.this is to refer to outer class's instance from inner class
            JOptionPane.showMessageDialog(createDocu.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
                FileOutputStream outStream = new FileOutputStream(home.getAbsolutePath() + "\\CENOMAR.docx");
                XWPFDocument doc = new XWPFDocument();

//            InputStream pic = new FileInputStream("C:\\Users\\carlj\\Desktop\\staIlenaLogo.png");
//            byte [] picbytes = IOUtils.toByteArray(pic);
//            doc.addPictureData(picbytes, Document.PICTURE_TYPE_PNG);
                XWPFParagraph para = doc.createParagraph();
                para.setAlignment(ParagraphAlignment.CENTER);
                XWPFRun paraRun = para.createRun();

                paraRun.setBold(true);
                paraRun.setFontSize(12);
                paraRun.setFontFamily("Times New Roman");
                paraRun.setText("Republic of the Philippines");
                paraRun.addBreak();
                paraRun.setText("Province of Bulacan");
                paraRun.addBreak();
                paraRun.setText("Municipality of Hagonoy");
                paraRun.addBreak();
                paraRun.setText("Barangay Sta. Elena");
                paraRun.addBreak();

                XWPFParagraph para2 = doc.createParagraph();
                para2.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun2 = para2.createRun();

                paraRun2.setBold(true);
                paraRun2.setFontSize(13);
                paraRun2.setFontFamily("Times New Roman");
                paraRun2.setText("DOROTEO M. REYES III                                                      Telephone#: 794-0541");

                XWPFParagraph para3 = doc.createParagraph();
                para3.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun3 = para3.createRun();

                paraRun3.setBold(false);
                paraRun3.setFontSize(13);
                paraRun3.setFontFamily("Times New Roman");
                paraRun3.setText("BARANGAY CAPTAIN");
                paraRun3.addBreak();
                paraRun3.setText("=============================================================");

                XWPFParagraph para4 = doc.createParagraph();
                para4.setAlignment(ParagraphAlignment.CENTER);
                XWPFRun paraRun4 = para4.createRun();

                paraRun4.setBold(true);
                paraRun4.setFontSize(17);
                paraRun4.setFontFamily("Times New Roman");
                paraRun4.setText("C-E-N-O-M-A-R");
                paraRun4.addBreak();

                XWPFParagraph para5 = doc.createParagraph();
                para5.setAlignment(ParagraphAlignment.RIGHT);
                XWPFRun paraRun5 = para5.createRun();

                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("EEE, MMMM dd, yyyy");
                String date = s.format(d);

                paraRun5.setBold(false);
                paraRun5.setFontSize(12);
                paraRun5.setFontFamily("Times New Roman");
                paraRun5.setUnderline(UnderlinePatterns.SINGLE);
                paraRun5.setText(date);

                XWPFParagraph para6 = doc.createParagraph();
                para6.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun6 = para6.createRun();

                paraRun6.setBold(false);
                paraRun6.setFontSize(12);
                paraRun6.setFontFamily("Times New Roman");
                paraRun6.setText("Sa Kinauukulan:");

                XWPFParagraph para7 = doc.createParagraph();
                para7.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun7 = para7.createRun();
                para7.setFirstLineIndent(300);
                
                paraRun7.setBold(false);
                paraRun7.setFontSize(12);
                paraRun7.setFontFamily("Times New Roman");
                paraRun7.setText("Ito po ay nagpapatunay na si "+name+", "+age+" taong gulang, ipinanganak noong "+bday+", kasalukuyang naninirahan sa "+address+", anak nina G. "+father+" at Gng. "+mother+"  ay "+stat+".");
                        
                XWPFParagraph para8 = doc.createParagraph();
                para8.setAlignment(ParagraphAlignment.LEFT);
                para8.setFirstLineIndent(300);
                XWPFRun paraRun8 = para8.createRun();

                paraRun8.setBold(false);
                paraRun8.setFontSize(12);
                paraRun8.setFontFamily("Times New Roman");
                paraRun8.setText("Ang pagpapatunay na ito ay sa kahilingan ni "+name+" para magamit sa anumang hangarin na legal o naaayon sa batas. ");

                XWPFParagraph para11 = doc.createParagraph();
                para11.setAlignment(ParagraphAlignment.RIGHT);
                XWPFRun paraRun11 = para11.createRun();

                paraRun11.setBold(true);
                paraRun11.setFontSize(13);
                paraRun11.setFontFamily("Times New Roman");
                paraRun11.addBreak();             
                paraRun11.addBreak();
                paraRun11.addBreak();
                paraRun11.setText("______________________");
                paraRun11.addBreak();
                paraRun11.setText("DOROTEO M. REYES III");

                XWPFParagraph para12 = doc.createParagraph();
                para12.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun paraRun12 = para12.createRun();

                paraRun12.setBold(false);
                paraRun12.setFontSize(12);
                paraRun12.setFontFamily("Times New Roman");
                paraRun12.setText("                                                                                                                      Barangay Captain");

                doc.write(outStream);
                outStream.close();
                //pic.close();
                JOptionPane.showMessageDialog(null, "Document created.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            Desktop desktop = Desktop.getDesktop();
            try {
                File f = new File(DIR + "\\CENOMAR.docx");
                desktop.open(f);  // opens application (MSWord) associated with .doc file
            } catch (Exception ex) {
                // WordDocument.this is to refer to outer class's instance from inner class
                JOptionPane.showMessageDialog(createDocu.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(createDocu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createDocu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createDocu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createDocu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createDocu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
