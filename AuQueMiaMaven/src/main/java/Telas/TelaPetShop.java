package Telas;

import java.awt.BorderLayout;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaPetShop extends javax.swing.JPanel {

    private ResourceBundle traducoes;

    public TelaPetShop(ResourceBundle traducoes) {
        initComponents();
        this.traducoes = traducoes;
        setarGifs();
    }

    public void setarGifs() {
        LB_GifBanho1.setVisible(false);
        LB_GifBanho2.setVisible(false);
        LB_GifTosa1.setVisible(false);
        LB_GifTosa2.setVisible(false);
        LB_GifBanhoeTosa1.setVisible(false);
        LB_GifBanhoeTosa2.setVisible(false);
        traduzirPagina();
    }

    public void traduzirPagina() {
        LB_ClinicaMedica.setText(traducoes.getString("lbl_clinica"));
        LB_SelecioneServiço.setText(traducoes.getString("petshop_lbl_selecioneServico"));
        LB_FraseBanho.setText(traducoes.getString("petshop_lbl_banho"));
        LB_Frase1Banho.setText(traducoes.getString("petshop_lbl_banhoFrase1"));
        LB_Frase2Banho.setText(traducoes.getString("petshop_lbl_banhoFrase2"));
        LB_Frase3Banho.setText(traducoes.getString("petshop_lbl_banhoFrase3"));
        LB_Frase4Banho.setText(traducoes.getString("petshop_lbl_banhoFrase4"));
        LB_FraseTosa.setText(traducoes.getString("petshop_lbl_tosa"));
        LB_Frase1Tosa.setText(traducoes.getString("petshop_lbl_tosaFrase1"));
        LB_Frase2Tosa.setText(traducoes.getString("petshop_lbl_tosaFrase2"));
        LB_Frase3Tosa.setText(traducoes.getString("petshop_lbl_tosaFrase3"));
        LB_FraseBanhoTosa.setText(traducoes.getString("petshop_lbl_banhotosa"));
        LB_Frase1BanhoTosa.setText(traducoes.getString("petshop_lbl_banhotosaFrase1"));
        if (traducoes.getString("linguagem").equals("en")) {
            LB_FraseBanhoTosa1.setText(traducoes.getString("petshop_lbl_banhotosa2"));
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_GifTosa2 = new javax.swing.JLabel();
        LB_GifTosa1 = new javax.swing.JLabel();
        LB_Home = new javax.swing.JLabel();
        LB_FraseBanhoTosa1 = new javax.swing.JLabel();
        LB_Frase1BanhoTosa = new javax.swing.JLabel();
        LB_Frase1Tosa = new javax.swing.JLabel();
        LB_Frase2Tosa = new javax.swing.JLabel();
        LB_Frase3Tosa = new javax.swing.JLabel();
        LB_Frase4Banho = new javax.swing.JLabel();
        LB_Frase3Banho = new javax.swing.JLabel();
        LB_Frase2Banho = new javax.swing.JLabel();
        LB_Frase1Banho = new javax.swing.JLabel();
        LB_FraseBanhoTosa = new javax.swing.JLabel();
        LB_FraseTosa = new javax.swing.JLabel();
        LB_FraseBanho = new javax.swing.JLabel();
        LB_SelecioneServiço = new javax.swing.JLabel();
        LB_PetShop1 = new javax.swing.JLabel();
        LB_ClinicaMedica = new javax.swing.JLabel();
        LB_Configuracoes = new javax.swing.JLabel();
        LB_GifBanho1 = new javax.swing.JLabel();
        LB_GifBanho2 = new javax.swing.JLabel();
        LB_Banho = new javax.swing.JLabel();
        LB_Tosa = new javax.swing.JLabel();
        LB_BanhoeTosa = new javax.swing.JLabel();
        LB_GifBanhoeTosa1 = new javax.swing.JLabel();
        LB_GifBanhoeTosa2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_GifTosa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border (1).gif"))); // NOI18N
        add(LB_GifTosa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, -1, -1));

        LB_GifTosa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border.gif"))); // NOI18N
        add(LB_GifTosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        LB_Home.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Home.setForeground(new java.awt.Color(255, 255, 255));
        LB_Home.setText("HOME");
        LB_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_HomeMouseClicked(evt);
            }
        });
        add(LB_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        LB_FraseBanhoTosa1.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        LB_FraseBanhoTosa1.setForeground(new java.awt.Color(51, 51, 51));
        LB_FraseBanhoTosa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_FraseBanhoTosa1MouseClicked(evt);
            }
        });
        add(LB_FraseBanhoTosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 260, 30));

        LB_Frase1BanhoTosa.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        LB_Frase1BanhoTosa.setForeground(new java.awt.Color(51, 51, 51));
        LB_Frase1BanhoTosa.setText("Combinação entre banho e tosa");
        LB_Frase1BanhoTosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Frase1BanhoTosaMouseClicked(evt);
            }
        });
        add(LB_Frase1BanhoTosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 220, -1));

        LB_Frase1Tosa.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        LB_Frase1Tosa.setForeground(new java.awt.Color(51, 51, 51));
        LB_Frase1Tosa.setText("Tosa higiênica");
        LB_Frase1Tosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Frase1TosaMouseClicked(evt);
            }
        });
        add(LB_Frase1Tosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 110, 20));

        LB_Frase2Tosa.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        LB_Frase2Tosa.setForeground(new java.awt.Color(51, 51, 51));
        LB_Frase2Tosa.setText("Diferentes estilos de tosa");
        LB_Frase2Tosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Frase2TosaMouseClicked(evt);
            }
        });
        add(LB_Frase2Tosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 200, 20));

        LB_Frase3Tosa.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        LB_Frase3Tosa.setForeground(new java.awt.Color(51, 51, 51));
        LB_Frase3Tosa.setText("Técnicas para cada pelagem");
        LB_Frase3Tosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Frase3TosaMouseClicked(evt);
            }
        });
        add(LB_Frase3Tosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 200, -1));

        LB_Frase4Banho.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        LB_Frase4Banho.setForeground(new java.awt.Color(51, 51, 51));
        LB_Frase4Banho.setText("Limpeza de ouvidos");
        LB_Frase4Banho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Frase4BanhoMouseClicked(evt);
            }
        });
        add(LB_Frase4Banho, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, 20));

        LB_Frase3Banho.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        LB_Frase3Banho.setForeground(new java.awt.Color(51, 51, 51));
        LB_Frase3Banho.setText("Secagem manual ou secador");
        LB_Frase3Banho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Frase3BanhoMouseClicked(evt);
            }
        });
        add(LB_Frase3Banho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 200, 10));

        LB_Frase2Banho.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        LB_Frase2Banho.setForeground(new java.awt.Color(51, 51, 51));
        LB_Frase2Banho.setText("Shampoo para cada pelagem");
        LB_Frase2Banho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Frase2BanhoMouseClicked(evt);
            }
        });
        add(LB_Frase2Banho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 200, 20));

        LB_Frase1Banho.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        LB_Frase1Banho.setForeground(new java.awt.Color(51, 51, 51));
        LB_Frase1Banho.setText("Chuveiro quente e frio");
        LB_Frase1Banho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_Frase1BanhoMouseClicked(evt);
            }
        });
        add(LB_Frase1Banho, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 180, 20));

        LB_FraseBanhoTosa.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        LB_FraseBanhoTosa.setForeground(new java.awt.Color(51, 51, 51));
        LB_FraseBanhoTosa.setText("BANHO E TOSA");
        LB_FraseBanhoTosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_FraseBanhoTosaMouseClicked(evt);
            }
        });
        add(LB_FraseBanhoTosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 260, 30));

        LB_FraseTosa.setFont(new java.awt.Font("Monotype Corsiva", 1, 38)); // NOI18N
        LB_FraseTosa.setForeground(new java.awt.Color(51, 51, 51));
        LB_FraseTosa.setText("        TOSA");
        LB_FraseTosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_FraseTosaMouseClicked(evt);
            }
        });
        add(LB_FraseTosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 230, 50));

        LB_FraseBanho.setFont(new java.awt.Font("Monotype Corsiva", 1, 38)); // NOI18N
        LB_FraseBanho.setForeground(new java.awt.Color(51, 51, 51));
        LB_FraseBanho.setText("BANHO");
        LB_FraseBanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_FraseBanhoMouseClicked(evt);
            }
        });
        add(LB_FraseBanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 140, 50));

        LB_SelecioneServiço.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        LB_SelecioneServiço.setForeground(new java.awt.Color(51, 51, 51));
        LB_SelecioneServiço.setText("SELECIONE O SERVIÇO:");
        LB_SelecioneServiço.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_SelecioneServiçoMouseClicked(evt);
            }
        });
        add(LB_SelecioneServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 440, 50));

        LB_PetShop1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_PetShop1.setForeground(new java.awt.Color(51, 51, 51));
        LB_PetShop1.setText("PET SHOP");
        LB_PetShop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShop1MouseClicked(evt);
            }
        });
        add(LB_PetShop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 130, 30));

        LB_ClinicaMedica.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_ClinicaMedica.setForeground(new java.awt.Color(255, 255, 255));
        LB_ClinicaMedica.setText("CLÍNICA MÉDICA");
        LB_ClinicaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedicaMouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 230, -1));

        LB_Configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        LB_Configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ConfiguracoesMouseClicked(evt);
            }
        });
        add(LB_Configuracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, -1, -1));

        LB_GifBanho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border.gif"))); // NOI18N
        add(LB_GifBanho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        LB_GifBanho2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border (1).gif"))); // NOI18N
        add(LB_GifBanho2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        LB_Banho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LB_BanhoMouseMoved(evt);
            }
        });
        LB_Banho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_BanhoMouseClicked(evt);
            }
        });
        add(LB_Banho, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 240, 350));

        LB_Tosa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LB_TosaMouseMoved(evt);
            }
        });
        LB_Tosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_TosaMouseClicked(evt);
            }
        });
        add(LB_Tosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 230, 350));

        LB_BanhoeTosa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LB_BanhoeTosaMouseMoved(evt);
            }
        });
        LB_BanhoeTosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_BanhoeTosaMouseClicked(evt);
            }
        });
        add(LB_BanhoeTosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 230, 350));

        LB_GifBanhoeTosa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border.gif"))); // NOI18N
        add(LB_GifBanhoeTosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, -1, -1));

        LB_GifBanhoeTosa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/border (1).gif"))); // NOI18N
        add(LB_GifBanhoeTosa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPetShop.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void LB_ConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ConfiguracoesMouseClicked
        Janela.TelaJ = new TelaConfiguracoes(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ConfiguracoesMouseClicked

    private void LB_BanhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BanhoMouseMoved
        LB_GifBanho1.setVisible(true);
        LB_GifBanho2.setVisible(true);
        LB_GifTosa1.setVisible(false);
        LB_GifTosa2.setVisible(false);
        LB_GifBanhoeTosa1.setVisible(false);
        LB_GifBanhoeTosa2.setVisible(false);
    }//GEN-LAST:event_LB_BanhoMouseMoved

    private void LB_BanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BanhoMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Banho", traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_BanhoMouseClicked

    private void LB_TosaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_TosaMouseMoved
        LB_GifBanho1.setVisible(false);
        LB_GifBanho2.setVisible(false);
        LB_GifTosa1.setVisible(true);
        LB_GifTosa2.setVisible(true);
        LB_GifBanhoeTosa1.setVisible(false);
        LB_GifBanhoeTosa2.setVisible(false);
    }//GEN-LAST:event_LB_TosaMouseMoved

    private void LB_TosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_TosaMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Tosa", traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_TosaMouseClicked

    private void LB_BanhoeTosaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BanhoeTosaMouseMoved
        LB_GifBanho1.setVisible(false);
        LB_GifBanho2.setVisible(false);
        LB_GifTosa1.setVisible(false);
        LB_GifTosa2.setVisible(false);
        LB_GifBanhoeTosa1.setVisible(true);
        LB_GifBanhoeTosa2.setVisible(true);
    }//GEN-LAST:event_LB_BanhoeTosaMouseMoved

    private void LB_BanhoeTosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BanhoeTosaMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Banho e Tosa", traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_BanhoeTosaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Janela.TelaA = new TelaLogin(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LB_PetShop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShop1MouseClicked
        Janela.TelaD = new TelaPetShop(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_PetShop1MouseClicked

    private void LB_ClinicaMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedicaMouseClicked
        Janela.TelaH = new TelaClinicaMedica(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedicaMouseClicked

    private void LB_SelecioneServiçoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_SelecioneServiçoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_SelecioneServiçoMouseClicked

    private void LB_FraseBanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_FraseBanhoMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Banho", traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_FraseBanhoMouseClicked

    private void LB_FraseTosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_FraseTosaMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Tosa", traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_FraseTosaMouseClicked

    private void LB_FraseBanhoTosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_FraseBanhoTosaMouseClicked
        Janela.TelaG = new TelaServicoPetShop("Banho e Tosa", traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaG, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_FraseBanhoTosaMouseClicked

    private void LB_Frase1BanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Frase1BanhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_Frase1BanhoMouseClicked

    private void LB_Frase2BanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Frase2BanhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_Frase2BanhoMouseClicked

    private void LB_Frase3BanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Frase3BanhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_Frase3BanhoMouseClicked

    private void LB_Frase4BanhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Frase4BanhoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_Frase4BanhoMouseClicked

    private void LB_Frase1TosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Frase1TosaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_Frase1TosaMouseClicked

    private void LB_Frase2TosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Frase2TosaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_Frase2TosaMouseClicked

    private void LB_Frase3TosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Frase3TosaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_Frase3TosaMouseClicked

    private void LB_Frase1BanhoTosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_Frase1BanhoTosaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_Frase1BanhoTosaMouseClicked

    private void LB_FraseBanhoTosa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_FraseBanhoTosa1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_FraseBanhoTosa1MouseClicked

    private void LB_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_HomeMouseClicked
        Janela.TelaC = new TelaHome(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaD);
        janela.getContentPane().remove(Janela.TelaD);
        janela.add(Janela.TelaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_HomeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Banho;
    private javax.swing.JLabel LB_BanhoeTosa;
    private javax.swing.JLabel LB_ClinicaMedica;
    private javax.swing.JLabel LB_Configuracoes;
    private javax.swing.JLabel LB_Frase1Banho;
    private javax.swing.JLabel LB_Frase1BanhoTosa;
    private javax.swing.JLabel LB_Frase1Tosa;
    private javax.swing.JLabel LB_Frase2Banho;
    private javax.swing.JLabel LB_Frase2Tosa;
    private javax.swing.JLabel LB_Frase3Banho;
    private javax.swing.JLabel LB_Frase3Tosa;
    private javax.swing.JLabel LB_Frase4Banho;
    private javax.swing.JLabel LB_FraseBanho;
    private javax.swing.JLabel LB_FraseBanhoTosa;
    private javax.swing.JLabel LB_FraseBanhoTosa1;
    private javax.swing.JLabel LB_FraseTosa;
    private javax.swing.JLabel LB_GifBanho1;
    private javax.swing.JLabel LB_GifBanho2;
    private javax.swing.JLabel LB_GifBanhoeTosa1;
    private javax.swing.JLabel LB_GifBanhoeTosa2;
    private javax.swing.JLabel LB_GifTosa1;
    private javax.swing.JLabel LB_GifTosa2;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_PetShop1;
    private javax.swing.JLabel LB_SelecioneServiço;
    private javax.swing.JLabel LB_Tosa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
