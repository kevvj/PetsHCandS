/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UseView;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import src.*;

/**
 *
 * @author Kevin
 */
public class viewPr extends javax.swing.JFrame {


    public viewPr() {
        initComponents();
        setLocationRelativeTo(null);
        String rutaImagen1 = "./img/a1.jpg";
        String rutaImagen2 = "./img/a2.jpg";

        String rutaLogo = "./img/logo.png";

        // Cargar la imagen desde el archivo
        ImageIcon icono = new ImageIcon(getClass().getClassLoader().getResource(rutaImagen1));
        ImageIcon icono2 = new ImageIcon(getClass().getClassLoader().getResource(rutaImagen2));

        ImageIcon icono3 = new ImageIcon(getClass().getClassLoader().getResource(rutaLogo));

        // Obtener el tamaño del JLabel
        int anchoLabel = LabelImg.getWidth();
        int altoLabel = LabelImg.getHeight();

        int anchoLabe2 = LabelImg2.getWidth();
        int altoLabel2 = LabelImg2.getHeight();

        int anchoLabe3 = Logo.getWidth();
        int altoLabel3 = Logo.getHeight();

        // Obtener la imagen del icono
        Image imagen = icono.getImage();
        Image imagen2 = icono2.getImage();
        Image imagen3 = icono3.getImage();

        // Ajustar el tamaño de la imagen para que se ajuste al JLabel
        Image imagenAjustada = imagen.getScaledInstance(anchoLabel, altoLabel, Image.SCALE_SMOOTH);
        Image imagenAjustada2 = imagen2.getScaledInstance(anchoLabe2, altoLabel2, Image.SCALE_SMOOTH);
        Image imagenAjustada3 = imagen3.getScaledInstance(anchoLabe3, altoLabel3, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen ajustada
        ImageIcon iconoAjustado = new ImageIcon(imagenAjustada);
        ImageIcon iconoAjustado2 = new ImageIcon(imagenAjustada2);
        ImageIcon iconoAjustado3 = new ImageIcon(imagenAjustada3);

        // Establecer el nuevo ImageIcon en el JLabel
        LabelImg.setIcon(iconoAjustado);
        LabelImg2.setIcon(iconoAjustado2);
        Logo.setIcon(iconoAjustado3);

        ButtonHC.setUI(new RoundedButtonUI(new Color(100, 180, 255), Color.BLACK));
        ButtonSpa.setUI(new RoundedButtonUI(new Color(100, 180, 255), Color.BLACK));

        ButtonHC.setBounds(50, 50, 200, 50);
        ButtonSpa.setBounds(50, 50, 200, 50);
        ScrollPrincipal.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPrincipal.getVerticalScrollBar().setUI(new CustomScrollBarUI());

        Cerrar.setUI(new RoundedButtonUI(new Color(182, 184, 214), Color.BLACK));

        jTextArea1.setDisabledTextColor(Color.BLACK);
        jTextArea2.setDisabledTextColor(Color.BLACK);
        RedesPanel.setVisible(false);
        UsuarioPanel.setVisible(false);
        AcercaDePanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RedesButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        UsuarioButton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        AcercadeButton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        RedesPanel = new javax.swing.JPanel();
        RedsText = new javax.swing.JLabel();
        UsuarioPanel = new javax.swing.JPanel();
        UsuarioLabel = new javax.swing.JLabel();
        AcercaDePanel = new javax.swing.JPanel();
        AboutText = new javax.swing.JLabel();
        ScrollPrincipal = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        ButtonHC = new javax.swing.JButton();
        LabelImg = new javax.swing.JLabel();
        LabelImg2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ButtonSpa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        AcercaDePanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Principal");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 40));

        RedesButton.setBackground(new java.awt.Color(255, 255, 255));
        RedesButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        RedesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RedesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RedesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RedesButtonMouseExited(evt);
            }
        });
        RedesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Redes ");
        RedesButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(RedesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 40));

        UsuarioButton.setBackground(new java.awt.Color(255, 255, 255));
        UsuarioButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        UsuarioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuarioButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuarioButtonMouseExited(evt);
            }
        });
        UsuarioButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Usuario");
        UsuarioButton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(UsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 40));

        AcercadeButton.setBackground(new java.awt.Color(255, 255, 255));
        AcercadeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        AcercadeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcercadeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AcercadeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcercadeButtonMouseExited(evt);
            }
        });
        AcercadeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Acerca de ");
        AcercadeButton.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.add(AcercadeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, 40));
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 190, 620));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setText("X");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel4.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 43, 17));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 918, 50));

        RedesPanel.setBackground(new java.awt.Color(255, 255, 255));

        RedsText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RedsText.setText("Seccion de redes*");

        javax.swing.GroupLayout RedesPanelLayout = new javax.swing.GroupLayout(RedesPanel);
        RedesPanel.setLayout(RedesPanelLayout);
        RedesPanelLayout.setHorizontalGroup(
            RedesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedesPanelLayout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addComponent(RedsText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        RedesPanelLayout.setVerticalGroup(
            RedesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedesPanelLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(RedsText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        getContentPane().add(RedesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 920, 640));

        UsuarioPanel.setBackground(new java.awt.Color(255, 255, 255));

        UsuarioLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(0, 153, 153));
        UsuarioLabel.setText("Seccion de usuarios*");

        javax.swing.GroupLayout UsuarioPanelLayout = new javax.swing.GroupLayout(UsuarioPanel);
        UsuarioPanel.setLayout(UsuarioPanelLayout);
        UsuarioPanelLayout.setHorizontalGroup(
            UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuarioPanelLayout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(UsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        UsuarioPanelLayout.setVerticalGroup(
            UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        getContentPane().add(UsuarioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 920, 640));

        AcercaDePanel.setBackground(new java.awt.Color(255, 255, 255));

        AboutText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AboutText.setText("Seccion acerca de*");

        javax.swing.GroupLayout AcercaDePanelLayout = new javax.swing.GroupLayout(AcercaDePanel);
        AcercaDePanel.setLayout(AcercaDePanelLayout);
        AcercaDePanelLayout.setHorizontalGroup(
            AcercaDePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AcercaDePanelLayout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(AboutText, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        AcercaDePanelLayout.setVerticalGroup(
            AcercaDePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcercaDePanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(AboutText, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(AcercaDePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 920, 640));

        ScrollPrincipal.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonHC.setText("Solicita ahora");
        ButtonHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHCActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        LabelImg.setToolTipText("");
        jPanel3.add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 32, 400, 340));
        jPanel3.add(LabelImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 400, 330));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Corte de pelo");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 157, -1));

        ButtonSpa.setText("Solicita ahora");
        ButtonSpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSpaActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonSpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1060, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Fabuloso Spa para mascotas");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 920, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Corte de pelo con estilo a tu eleccion, incluyendo, baño, \ncorte de pelo cuerpo completo, corte de uñas, limpieza de\noidos, y cepillado de dientes");
        jTextArea1.setEnabled(false);
        jPanel3.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 381, 59));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Bienvenido a Paws & Relax Spa, el refugio perfecto para \nconsentir a tus amadas mascotas. Nuestro spa se especializa\n en ofrecer una experiencia de lujo y relajación tanto para \nperros como para gatos, garantizando que cada visita sea\n un momento inolvidable y placentero para ellos.");
        jTextArea2.setEnabled(false);
        jPanel3.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 950, -1, 64));

        ScrollPrincipal.setViewportView(jPanel3);

        getContentPane().add(ScrollPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 58, 720, 620));

        AcercaDePanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout AcercaDePanel1Layout = new javax.swing.GroupLayout(AcercaDePanel1);
        AcercaDePanel1.setLayout(AcercaDePanel1Layout);
        AcercaDePanel1Layout.setHorizontalGroup(
            AcercaDePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        AcercaDePanel1Layout.setVerticalGroup(
            AcercaDePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(AcercaDePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 920, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonHCActionPerformed

    private void ButtonSpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSpaActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        dispose();
        System.exit(0);

    }//GEN-LAST:event_CerrarActionPerformed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void RedesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedesButtonMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RedesButtonMouseEntered

    private void UsuarioButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioButtonMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_UsuarioButtonMouseEntered

    private void AcercadeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcercadeButtonMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_AcercadeButtonMouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));    }//GEN-LAST:event_jPanel5MouseExited

    private void RedesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedesButtonMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));    }//GEN-LAST:event_RedesButtonMouseExited

    private void UsuarioButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioButtonMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));    }//GEN-LAST:event_UsuarioButtonMouseExited

    private void AcercadeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcercadeButtonMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));    }//GEN-LAST:event_AcercadeButtonMouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        RedesPanel.setVisible(false);
        UsuarioPanel.setVisible(false);
        AcercaDePanel.setVisible(false);
        ScrollPrincipal.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void RedesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedesButtonMouseClicked
        RedesPanel.setVisible(true);
        UsuarioPanel.setVisible(false);
        AcercaDePanel.setVisible(false);
        ScrollPrincipal.setVisible(false);
    }//GEN-LAST:event_RedesButtonMouseClicked

    private void UsuarioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioButtonMouseClicked
        RedesPanel.setVisible(false);
        UsuarioPanel.setVisible(true);
        AcercaDePanel.setVisible(false);
        UsuarioLabel.setText("");
        ScrollPrincipal.setVisible(false);
    }//GEN-LAST:event_UsuarioButtonMouseClicked

    private void AcercadeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcercadeButtonMouseClicked
        RedesPanel.setVisible(false);
        UsuarioPanel.setVisible(false);
        AcercaDePanel.setVisible(true);
        ScrollPrincipal.setVisible(false);
    }//GEN-LAST:event_AcercadeButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(viewPr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(viewPr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(viewPr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(viewPr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPr().setVisible(true);
            }
        });
    }

    public JButton getButtonHC() {
        return ButtonHC;
    }

    public void setButtonHC(JButton ButtonHC) {
        this.ButtonHC = ButtonHC;
    }

    public JButton getButtonSpa() {
        return ButtonSpa;
    }

    public void setButtonSpa(JButton ButtonSpa) {
        this.ButtonSpa = ButtonSpa;
    }

    

    public JPanel getAcercaDePanel() {
        return AcercaDePanel;
    }

    public void setAcercaDePanel(JPanel AcercaDePanel) {
        this.AcercaDePanel = AcercaDePanel;
    }

    public JPanel getAcercaDePanel1() {
        return AcercaDePanel1;
    }

    public void setAcercaDePanel1(JPanel AcercaDePanel1) {
        this.AcercaDePanel1 = AcercaDePanel1;
    }

    public JPanel getAcercadeButton() {
        return AcercadeButton;
    }

    public void setAcercadeButton(JPanel AcercadeButton) {
        this.AcercadeButton = AcercadeButton;
    }

    public JButton getCerrar() {
        return Cerrar;
    }

    public void setCerrar(JButton Cerrar) {
        this.Cerrar = Cerrar;
    }

    public JPanel getRedesButton() {
        return RedesButton;
    }

    public void setRedesButton(JPanel RedesButton) {
        this.RedesButton = RedesButton;
    }

    public JPanel getRedesPanel() {
        return RedesPanel;
    }

    public void setRedesPanel(JPanel RedesPanel) {
        this.RedesPanel = RedesPanel;
    }

    public JPanel getUsuarioButton() {
        return UsuarioButton;
    }

    public void setUsuarioButton(JPanel UsuarioButton) {
        this.UsuarioButton = UsuarioButton;
    }

    public JPanel getUsuarioPanel() {
        return UsuarioPanel;
    }

    public void setUsuarioPanel(JPanel UsuarioPanel) {
        this.UsuarioPanel = UsuarioPanel;
    }

    public JLabel getUsuarioLabel() {
        return UsuarioLabel;
    }

    public void setUsuarioLabel(JLabel UsuarioLabel) {
        this.UsuarioLabel = UsuarioLabel;
    }

    public JLabel getAboutText() {
        return AboutText;
    }

    public void setAboutText(JLabel AboutText) {
        this.AboutText = AboutText;
    }

    public JLabel getRedsText() {
        return RedsText;
    }

    public void setRedsText(JLabel RedsText) {
        this.RedsText = RedsText;
    }
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutText;
    private javax.swing.JPanel AcercaDePanel;
    private javax.swing.JPanel AcercaDePanel1;
    private javax.swing.JPanel AcercadeButton;
    private javax.swing.JButton ButtonHC;
    private javax.swing.JButton ButtonSpa;
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel LabelImg;
    private javax.swing.JLabel LabelImg2;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel RedesButton;
    private javax.swing.JPanel RedesPanel;
    private javax.swing.JLabel RedsText;
    private javax.swing.JScrollPane ScrollPrincipal;
    private javax.swing.JPanel UsuarioButton;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel UsuarioPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
