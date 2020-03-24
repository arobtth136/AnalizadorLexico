package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main extends javax.swing.JFrame {

    File f;
    JFileChooser fc;
    BufferedReader br;
    String l;

    public Main() {
        initComponents();
        //Mostrar Frame al centro
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelBotones = new java.awt.Panel();
        btnAnalizar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        lbAnalizadorLexico = new javax.swing.JLabel();
        lbCobra = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        panelCodigo = new javax.swing.JPanel();
        txtCodigo = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cobra - Analizador léxico");
        setBackground(new java.awt.Color(255, 255, 255));

        panelBotones.setBackground(new java.awt.Color(35, 98, 236));
        panelBotones.setPreferredSize(new java.awt.Dimension(307, 782));

        btnAnalizar.setBackground(new java.awt.Color(255, 255, 255));
        btnAnalizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAnalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/search.png"))); // NOI18N
        btnAnalizar.setText("   Analizar");
        btnAnalizar.setContentAreaFilled(false);
        btnAnalizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAnalizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        btnAbrir.setBackground(new java.awt.Color(255, 255, 255));
        btnAbrir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/folder (1).png"))); // NOI18N
        btnAbrir.setText("   Abrir");
        btnAbrir.setBorderPainted(false);
        btnAbrir.setContentAreaFilled(false);
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        lbAnalizadorLexico.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbAnalizadorLexico.setForeground(new java.awt.Color(255, 255, 255));
        lbAnalizadorLexico.setText("Analizador léxico");

        lbCobra.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbCobra.setForeground(new java.awt.Color(255, 255, 255));
        lbCobra.setText("Cobra");

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/snake.png"))); // NOI18N

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAnalizadorLexico)
                    .addComponent(lbCobra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLogo)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addComponent(lbCobra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAnalizadorLexico)))
                .addContainerGap())
        );

        getContentPane().add(panelBotones, java.awt.BorderLayout.WEST);

        panelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        panelCodigo.setLayout(new java.awt.BorderLayout());

        txtCodigo.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        panelCodigo.add(txtCodigo, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelCodigo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        fc = new JFileChooser();
        fc.showOpenDialog(null);
        //Cargar TXT
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
                //Llenar el cuadro de texto
                txtCodigo.append(l);
                txtCodigo.append(System.lineSeparator());
                try {
                    l = br.readLine();
                } catch (IOException ex) {

                }
            }
        } else {
            //Beep
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un archivo", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }                                        

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Hacer que se parezca a Windows
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Main().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JLabel lbAnalizadorLexico;
    private javax.swing.JLabel lbCobra;
    private javax.swing.JLabel lbLogo;
    private java.awt.Panel panelBotones;
    private javax.swing.JPanel panelCodigo;
    private java.awt.TextArea txtCodigo;
    // End of variables declaration                   
}