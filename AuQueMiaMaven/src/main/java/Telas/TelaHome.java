package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaHome extends javax.swing.JPanel {

    private ResourceBundle traducoes;

    public TelaHome(ResourceBundle traducoes) {
        initComponents();
        this.traducoes = traducoes;
        setarBotoes();
    }

    private void setarBotoes() {
        BT_CadastrarPet.setBackground(new Color(0, 0, 0, 90));
        BT_CadastrarPet.setBorderPainted(false);
        BT_CadastrarPet.setContentAreaFilled(false);
        BT_CadastrarPet.setFocusPainted(false);
        BT_VisualizarPets.setBackground(new Color(0, 0, 0, 90));
        BT_VisualizarPets.setBorderPainted(false);
        BT_VisualizarPets.setContentAreaFilled(false);
        BT_VisualizarPets.setFocusPainted(false);
        traduzirPagina();
    }

    public void traduzirPagina() {
        LB_ClinicaMedica.setText(traducoes.getString("lbl_clinica"));
        LB_Cadastrar.setText(traducoes.getString("home_lbl_cadastrar"));
        LB_Visualizar.setText(traducoes.getString("home_lbl_visualizar"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_Home = new javax.swing.JLabel();
        LB_Configuracoes = new javax.swing.JLabel();
        LB_Visualizar = new javax.swing.JLabel();
        LB_Pet1 = new javax.swing.JLabel();
        LB_Pet = new javax.swing.JLabel();
        LB_Cadastrar = new javax.swing.JLabel();
        LB_ClinicaMedica = new javax.swing.JLabel();
        BT_VisualizarPets = new javax.swing.JButton();
        BT_CadastrarPet = new javax.swing.JButton();
        LB_PetShop = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_Home.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Home.setForeground(new java.awt.Color(51, 51, 51));
        LB_Home.setText("HOME");
        add(LB_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        LB_Configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        LB_Configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ConfiguracoesMouseClicked(evt);
            }
        });
        add(LB_Configuracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, -1, -1));

        LB_Visualizar.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        LB_Visualizar.setForeground(new java.awt.Color(255, 255, 255));
        LB_Visualizar.setText("VISUALIZAR");
        LB_Visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_VisualizarMouseClicked(evt);
            }
        });
        add(LB_Visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 190, -1));

        LB_Pet1.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        LB_Pet1.setForeground(new java.awt.Color(255, 255, 255));
        LB_Pet1.setText("PET");
        LB_Pet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Pet1MouseClicked(evt);
            }
        });
        add(LB_Pet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 70, -1));

        LB_Pet.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        LB_Pet.setForeground(new java.awt.Color(255, 255, 255));
        LB_Pet.setText("PET");
        LB_Pet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetMouseClicked(evt);
            }
        });
        add(LB_Pet, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 70, -1));

        LB_Cadastrar.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        LB_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        LB_Cadastrar.setText("CADASTRAR");
        LB_Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_CadastrarMouseClicked(evt);
            }
        });
        add(LB_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 230, -1));

        LB_ClinicaMedica.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_ClinicaMedica.setForeground(new java.awt.Color(255, 255, 255));
        LB_ClinicaMedica.setText("CLÍNICA MÉDICA");
        LB_ClinicaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedicaMouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 230, -1));

        BT_VisualizarPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VisualizarPetsActionPerformed(evt);
            }
        });
        add(BT_VisualizarPets, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, 340, 140));

        BT_CadastrarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarPetActionPerformed(evt);
            }
        });
        add(BT_CadastrarPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 340, 140));

        LB_PetShop.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_PetShop.setForeground(new java.awt.Color(255, 255, 255));
        LB_PetShop.setText("PET SHOP");
        LB_PetShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShopMouseClicked(evt);
            }
        });
        add(LB_PetShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaHome.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaHome.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void LB_ConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ConfiguracoesMouseClicked
        Janela.TelaJ = new TelaConfiguracoes(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ConfiguracoesMouseClicked

    private void LB_ClinicaMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedicaMouseClicked
        Janela.TelaH = new TelaClinicaMedica(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedicaMouseClicked

    private void BT_VisualizarPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VisualizarPetsActionPerformed
        Janela.TelaI = new TelaVisualizarPet(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaI, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_VisualizarPetsActionPerformed

    private void BT_CadastrarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarPetActionPerformed
        Janela.TelaE = new TelaCadastroAnimais(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaE, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_CadastrarPetActionPerformed

    private void LB_PetShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShopMouseClicked
        Janela.TelaD = new TelaPetShop(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_PetShopMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Janela.TelaA = new TelaLogin(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void LB_CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_CadastrarMouseClicked
        Janela.TelaE = new TelaCadastroAnimais(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaE, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_CadastrarMouseClicked

    private void LB_PetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetMouseClicked
        Janela.TelaE = new TelaCadastroAnimais(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaE, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_PetMouseClicked

    private void LB_VisualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_VisualizarMouseClicked
        Janela.TelaI = new TelaVisualizarPet(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaI, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_VisualizarMouseClicked

    private void LB_Pet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Pet1MouseClicked
        Janela.TelaI = new TelaVisualizarPet(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaC);
        janela.getContentPane().remove(Janela.TelaC);
        janela.add(Janela.TelaI, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_Pet1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CadastrarPet;
    private javax.swing.JButton BT_VisualizarPets;
    private javax.swing.JLabel LB_Cadastrar;
    private javax.swing.JLabel LB_ClinicaMedica;
    private javax.swing.JLabel LB_Configuracoes;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_Pet;
    private javax.swing.JLabel LB_Pet1;
    private javax.swing.JLabel LB_PetShop;
    private javax.swing.JLabel LB_Visualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
