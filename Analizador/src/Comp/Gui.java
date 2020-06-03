package Comp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Gui extends javax.swing.JFrame {

    File f;
    JFileChooser fc;
    Scanner sc;
    BufferedReader br;
    String l;
    String args[] = new String[1];

    public Gui() throws IOException {
        fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Archivos de texto plano", "txt"));
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        btnAnalizar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbArchivo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cobra - Analizador léxico y sintáctico");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.BorderLayout());

        panel1.setBackground(new java.awt.Color(35, 98, 236));

        btnAnalizar.setBackground(new java.awt.Color(255, 255, 255));
        btnAnalizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAnalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comp/search.png"))); // NOI18N
        btnAnalizar.setText("   Analizar");
        btnAnalizar.setContentAreaFilled(false);
        btnAnalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnalizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAnalizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        btnAbrir.setBackground(new java.awt.Color(255, 255, 255));
        btnAbrir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comp/folder.png"))); // NOI18N
        btnAbrir.setText("   Abrir");
        btnAbrir.setBorderPainted(false);
        btnAbrir.setContentAreaFilled(false);
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbrir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comp/snake.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ANALIZADOR LÉXICO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COBRA");

        lbArchivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lbArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67))
                    .addComponent(lbArchivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(panel1, java.awt.BorderLayout.WEST);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        txtCodigo.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jPanel1.add(txtCodigo, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        fc.showOpenDialog(null);
        if (fc.getSelectedFile() != null) {
            f = fc.getSelectedFile();
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException ex) {
            }
            
            try {
                l = br.readLine();
                txtCodigo.setText(null);
            } catch (IOException ex) {
            }
            while (l != null) {
                txtCodigo.append(l);
                txtCodigo.append(System.lineSeparator());
                try {
                    l = br.readLine();
                } catch (IOException ex) {
                }
            }
            txtCodigo.append(System.lineSeparator());
            lbArchivo.setText(fc.getSelectedFile().getName());
            args[0] = fc.getSelectedFile().getAbsolutePath();
        } else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        FrmAnalisis f = new FrmAnalisis();
        if (!txtCodigo.getText().equals("")) {
            try {
                ByteArrayInputStream texto = new ByteArrayInputStream(txtCodigo.getText().getBytes());
                analizador a = new analizador(texto);
                try{
                    a.Input();
                    FrmAnalisis.lbAnalisis.setText("Análisis completado");
                    FrmAnalisis.lbAnalisis.setForeground(Color.green);
                } catch (ParseException e){
                    FrmAnalisis.lbAnalisis.setText("Error sintáctico");
                    FrmAnalisis.lbAnalisis.setForeground(Color.red);
                    FrmAnalisis.txtCodigo.setText(e.getMessage());
                } catch (TokenMgrError e){
                    FrmAnalisis.lbAnalisis.setText("Error Léxico");
                    FrmAnalisis.lbAnalisis.setForeground(Color.yellow);
                    FrmAnalisis.txtCodigo.setText(e.getMessage());
                }
                f.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    new Gui().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAbrir;
    public static javax.swing.JButton btnAnalizar;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbArchivo;
    public static java.awt.Panel panel1;
    public static java.awt.TextArea txtCodigo;
    // End of variables declaration//GEN-END:variables
}
