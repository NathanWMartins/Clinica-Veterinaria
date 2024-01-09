package hospitalsaudenacama;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaInicial extends javax.swing.JPanel {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BT_CadastrarMedico = new javax.swing.JButton();
        BT_AgendarConsulta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BT_CadastrarPaciente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 92, 130));
        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/c (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 92, 130));
        jLabel7.setText("NOS CONHEÇA MELHOR:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 35, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/Twitter-X-Logo-PNG (2).jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 63, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/whatsapp-logo_icon-icons.com_68338 (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 63, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(27, 92, 130));
        jLabel11.setText("SAÚDE NA CAMA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(27, 92, 130));
        jLabel12.setText("CLÍNICA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/insta (1) (2).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 63, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1049, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/b (1).png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/b.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel4.setBackground(new java.awt.Color(27, 92, 190));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SAÚDE NA CAMA");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/a (1) (1).png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        BT_CadastrarMedico.setBackground(new java.awt.Color(255, 255, 255));
        BT_CadastrarMedico.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BT_CadastrarMedico.setForeground(new java.awt.Color(27, 92, 130));
        BT_CadastrarMedico.setText("CADASTRAR MÉDICO");
        BT_CadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarMedicoActionPerformed(evt);
            }
        });
        add(BT_CadastrarMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 200, 60));

        BT_AgendarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        BT_AgendarConsulta.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BT_AgendarConsulta.setForeground(new java.awt.Color(27, 92, 130));
        BT_AgendarConsulta.setText("AGENDAR CONSULTA");
        BT_AgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AgendarConsultaActionPerformed(evt);
            }
        });
        add(BT_AgendarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 200, 60));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(27, 92, 130));
        jButton3.setText("TRANSFERIR/DESMARCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 200, 60));

        BT_CadastrarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        BT_CadastrarPaciente.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BT_CadastrarPaciente.setForeground(new java.awt.Color(27, 92, 130));
        BT_CadastrarPaciente.setText("CADASTRAR CLIENTE");
        BT_CadastrarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CadastrarPacienteMouseClicked(evt);
            }
        });
        BT_CadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarPacienteActionPerformed(evt);
            }
        });
        add(BT_CadastrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 200, 60));

        jLabel13.setBackground(new java.awt.Color(27, 92, 130));
        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 54)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CLÍNICA");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BT_CadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarMedicoActionPerformed
        Janela.telaD = new TelaCadastroMedicos();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaA);
        janela.getContentPane().remove(Janela.telaA);
        janela.add(Janela.telaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_CadastrarMedicoActionPerformed

    private void BT_AgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AgendarConsultaActionPerformed
        Janela.telaB = new TelaAgendamento();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaA);
        janela.getContentPane().remove(Janela.telaA);
        janela.add(Janela.telaB, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_AgendarConsultaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Janela.telaC = new TelaTransferirExcluir();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaA);
        janela.getContentPane().remove(Janela.telaA);
        janela.add(Janela.telaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BT_CadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarPacienteActionPerformed
        Janela.telaE = new TelaCadastroPacientes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaA);
        janela.getContentPane().remove(Janela.telaA);
        janela.add(Janela.telaE, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_CadastrarPacienteActionPerformed

    private void BT_CadastrarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CadastrarPacienteMouseClicked
         Janela.telaE = new TelaCadastroPacientes();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaA);
        janela.getContentPane().remove(Janela.telaA);
        janela.add(Janela.telaE, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_BT_CadastrarPacienteMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/clinicasaudenacama/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.twitter.com/clinicasaudenacama_/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel10MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_AgendarConsulta;
    private javax.swing.JButton BT_CadastrarMedico;
    private javax.swing.JButton BT_CadastrarPaciente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
