/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vira.miniproject;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Administrator
 */
public class MainClass extends javax.swing.JFrame {

    String filename;

    /**
     * Creates new form NotepadGui
     */
    public MainClass() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        textEditor = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        pdfConvert = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        closeFile = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        boldText = new javax.swing.JMenuItem();
        italicText = new javax.swing.JMenuItem();
        underlineText = new javax.swing.JMenuItem();
        colorRed = new javax.swing.JMenuItem();
        colorYellow = new javax.swing.JMenuItem();
        colorBlue = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 700, 700));

        textEditor.setColumns(20);
        textEditor.setRows(5);
        jScrollPane1.setViewportView(textEditor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pdfConvert.setText("File");

        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        pdfConvert.add(newFile);

        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        pdfConvert.add(openFile);

        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        pdfConvert.add(saveFile);

        jMenuItem1.setText("PDFConverter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        pdfConvert.add(jMenuItem1);

        closeFile.setText("Close");
        closeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFileActionPerformed(evt);
            }
        });
        pdfConvert.add(closeFile);

        jMenuBar1.add(pdfConvert);

        menuEdit.setText("Format");

        boldText.setText("Bold");
        boldText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldTextActionPerformed(evt);
            }
        });
        menuEdit.add(boldText);

        italicText.setText("Italic");
        italicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicTextActionPerformed(evt);
            }
        });
        menuEdit.add(italicText);

        underlineText.setText("Underline");
        underlineText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underlineTextActionPerformed(evt);
            }
        });
        menuEdit.add(underlineText);

        colorRed.setText("Text Color Red");
        colorRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRedActionPerformed(evt);
            }
        });
        menuEdit.add(colorRed);

        colorYellow.setText("Text Color Yellow");
        colorYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorYellowActionPerformed(evt);
            }
        });
        menuEdit.add(colorYellow);

        colorBlue.setText("Text Color Blue");
        colorBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlueActionPerformed(evt);
            }
        });
        menuEdit.add(colorBlue);

        jMenuBar1.add(menuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        textEditor.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        FileDialog filedialog = new FileDialog(MainClass.this, "Buka FIle", FileDialog.LOAD);
        filedialog.setVisible(true);

        if (filedialog.getFile() != null) {
            filename = filedialog.getDirectory() + filedialog.getFile();
            setTitle(filename);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();

            String line = null;
            //add text to jtext

            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                textEditor.setText(sb.toString());
            }
            //add words counter
            int word = 0, lines = 1;
            PushbackInputStream stream = new PushbackInputStream(new FileInputStream(new File(filename)), 100);
            byte[] bit = new byte[(int) filename.length()];
            stream.read(bit);
            System.out.println("Read : " + new String(bit));
            System.out.println("Information : ");
            if (new String(bit).contains("\n")) {
                lines++;
            }
            String[] arr = new String(bit).split("\\s+");
            word += arr.length;

            JOptionPane.showMessageDialog(this, "Read File Successfull\n"
                    + "Total of lines : " + lines
                    + "\nTotal of Words : " + word
                    + "\nTotal of Char : " + filename.length(), "Informasi", JOptionPane.INFORMATION_MESSAGE);
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File not found!");
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        FileDialog fileDialog = new FileDialog(MainClass.this, "Save file ", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile() + ".txt";
            setTitle(filename);
        }

        try {
            OutputStream os = new FileOutputStream(filename);
            os.write(textEditor.getText().getBytes());
            setTitle(filename);
            os.flush();
            os.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void closeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFileActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeFileActionPerformed

    private void boldTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldTextActionPerformed
        textEditor.setFont(textEditor.getFont().deriveFont(Font.BOLD, 14f));
        // TODO add your handling code here:
    }//GEN-LAST:event_boldTextActionPerformed

    private void italicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicTextActionPerformed
        
        textEditor.setFont(textEditor.getFont().deriveFont(Font.ITALIC, 14f));
        // TODO add your handling code here:
    }//GEN-LAST:event_italicTextActionPerformed

    private void underlineTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underlineTextActionPerformed
        Font font = textEditor.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        textEditor.setFont(font.deriveFont(attributes));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_underlineTextActionPerformed

    private void colorRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRedActionPerformed
        textEditor.setForeground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_colorRedActionPerformed

    private void colorBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlueActionPerformed
        textEditor.setForeground(Color.blue);
        // TODO add your handling code here:
    }//GEN-LAST:event_colorBlueActionPerformed

    private void colorYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorYellowActionPerformed
        textEditor.setForeground(Color.yellow);
        // TODO add your handling code here:
    }//GEN-LAST:event_colorYellowActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ConverterGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem boldText;
    private javax.swing.JMenuItem closeFile;
    private javax.swing.JMenuItem colorBlue;
    private javax.swing.JMenuItem colorRed;
    private javax.swing.JMenuItem colorYellow;
    private javax.swing.JMenuItem italicText;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenu pdfConvert;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JTextArea textEditor;
    private javax.swing.JMenuItem underlineText;
    // End of variables declaration//GEN-END:variables
}
