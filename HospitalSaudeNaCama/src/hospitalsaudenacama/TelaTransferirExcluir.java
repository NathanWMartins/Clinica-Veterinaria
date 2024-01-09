package hospitalsaudenacama;

import classes.Consulta;
import classes.Medico;
import classes.Paciente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;

public class TelaTransferirExcluir extends javax.swing.JPanel {
    private DefaultListModel<String> modeloLista;
    boolean etapa2 = false;
    public TelaTransferirExcluir() {
        initComponents();
        modeloLista = new DefaultListModel<>();
        jList1.setModel(modeloLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TF_Medico = new javax.swing.JTextField();
        TF_Paciente = new javax.swing.JTextField();
        RB_Excluir = new javax.swing.JRadioButton();
        RB_Transferir = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(27, 92, 130));
        jLabel14.setText("TRANSFERIR/EXCLUIR CONSULTAS");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(27, 92, 130));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/c (1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 92, 130));
        jLabel7.setText("NOS CONHEÇA MELHOR:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 35, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/Twitter-X-Logo-PNG (2).jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 63, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/whatsapp-logo_icon-icons.com_68338 (1).png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 63, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(27, 92, 130));
        jLabel11.setText("SAÚDE NA CAMA");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(27, 92, 130));
        jLabel12.setText("CLÍNICA");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/insta (1) (2).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 63, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1049, 110));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CPF DO PACIENTE:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CPF DO MÉDICO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        TF_Medico.setBackground(new java.awt.Color(255, 255, 255));
        TF_Medico.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TF_Medico.setForeground(new java.awt.Color(27, 92, 130));
        jPanel1.add(TF_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 250, 20));

        TF_Paciente.setBackground(new java.awt.Color(255, 255, 255));
        TF_Paciente.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TF_Paciente.setForeground(new java.awt.Color(27, 92, 130));
        jPanel1.add(TF_Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 250, 20));

        RB_Excluir.setBackground(new java.awt.Color(27, 92, 130));
        RB_Excluir.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        RB_Excluir.setForeground(new java.awt.Color(255, 255, 255));
        RB_Excluir.setText("EXCLUIR");
        RB_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_ExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(RB_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        RB_Transferir.setBackground(new java.awt.Color(27, 92, 130));
        RB_Transferir.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        RB_Transferir.setForeground(new java.awt.Color(255, 255, 255));
        RB_Transferir.setText("TRANSFERIR");
        RB_Transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_TransferirActionPerformed(evt);
            }
        });
        jPanel1.add(RB_Transferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jPanel3.setBackground(new java.awt.Color(98, 202, 206));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 280, 20));

        jPanel4.setBackground(new java.awt.Color(98, 202, 206));
        jPanel4.setForeground(new java.awt.Color(98, 202, 206));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 20, 360));

        jPanel5.setBackground(new java.awt.Color(98, 202, 206));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 100, 20));

        jPanel6.setBackground(new java.awt.Color(98, 202, 206));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 280, 20));

        jPanel7.setBackground(new java.awt.Color(98, 202, 206));
        jPanel7.setForeground(new java.awt.Color(98, 202, 206));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 20, 360));

        jPanel8.setBackground(new java.awt.Color(98, 202, 206));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/Sem título (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 440, -1));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("<<VOLTAR");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(27, 92, 130));
        jButton1.setText("CONFIRMAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(27, 92, 130));
        jButton2.setText("PROCURAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(27, 92, 130));
        jTextField1.setText("                 CONSULTAS");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 480, -1));

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(27, 92, 130));
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 480, 100));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));
    }// </editor-fold>//GEN-END:initComponents
    
    public String formatarList(LocalDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return dateTime.format(formatter);
    }
    
    public String formatarTable(LocalDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return dateTime.format(formatter);
    }
    
    public void limparTela(){
        TF_Medico.setText("");
        TF_Paciente.setText("");
        modeloLista.clear();
        modeloLista.removeAllElements();
        RB_Excluir.setSelected(false);
        RB_Transferir.setSelected(false);
    }
    
    private void RB_TransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_TransferirActionPerformed
        
    }//GEN-LAST:event_RB_TransferirActionPerformed

    private void RB_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_ExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_ExcluirActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Janela.telaA = new TelaInicial();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaC);
        janela.getContentPane().remove(Janela.telaC);
        janela.add(Janela.telaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cpfMedico = TF_Medico.getText();
        String cpfPaciente = TF_Paciente.getText();
        boolean achouMedico = false, achouPaciente = false, achouConsulta = false;
        try {
            if (cpfMedico.equals("")) {
                TF_Medico.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (cpfPaciente.equals("")) {
                TF_Paciente.setBorder(BorderFactory.createLineBorder(Color.RED));
            }if (cpfMedico.equals("") || cpfPaciente.equals("")){
                throw new Exception("Preencha os campos necessários");
            }
            for (Medico m : Janela.h.listaMedicos) {
                if (cpfMedico.equals(m.getCpf())) {
                    achouMedico = true;
                    break;
                }
            }for (Paciente p : Janela.h.listaPacientes) {
                if (cpfPaciente.equals(p.getCpf())) {
                    achouPaciente = true;
                    break;
                }
            }
            if (achouPaciente == false) {
                throw new Exception("O CPF do Paciente não está na nossa base de dados");
            }if (achouPaciente == false) {
                throw new Exception("O CPF do Médico não está na nossa base de dados");
            }
            modeloLista.clear();
            Consulta consulta = new Consulta();
            for(Consulta c : Janela.h.listaConsulta){
                if (c.getMedico().getCpf().equals(cpfMedico) && c.getPaciente().getCpf().equals(cpfPaciente)) {
                    consulta = c;
                    String horarioFormatado = formatarList(consulta.getDataHora());
                    modeloLista.addElement(horarioFormatado);
                    achouConsulta = true;
                }
            }if (achouConsulta == false) {
                throw new Exception("Os CPF's não possuem uma consulta marcada");
            }                                                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Medico medico = new Medico();
        Paciente paciente = new Paciente();
        String cpfMedico = TF_Medico.getText();
        String cpfPaciente = TF_Paciente.getText();
        for (int i = 0; i < Janela.h.listaPacientes.size(); i++) {
                if (cpfPaciente.equals(Janela.h.listaPacientes.get(i).getCpf())) {
                    paciente = Janela.h.listaPacientes.get(i);
            }
        }
        for (int i = 0; i < Janela.h.listaMedicos.size(); i++) {
                if (cpfMedico.equals(Janela.h.listaMedicos.get(i).getCpf())) {
                    medico = Janela.h.listaMedicos.get(i);
            }
        }
        if (etapa2) {
            String dataHorarioString = jList1.getSelectedValue();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
            LocalDateTime dataHorario = LocalDateTime.parse(dataHorarioString, formatter);
            medico.removerHorario(dataHorario);
            Consulta c = new Consulta(paciente, medico, 0001, dataHorario);
            for (int i = 0; i < Janela.h.listaConsulta.size(); i++) {
                if(medico.getCpf().equals(Janela.h.listaConsulta.get(i).getMedico().getCpf()) && 
                        paciente.getCpf().equals(Janela.h.listaConsulta.get(i).getPaciente().getCpf())) {
                    Janela.h.listaConsulta.set(i, c);
                    limparTela();
                    JOptionPane.showMessageDialog(null, "Consulta transferida com sucesso");
                    break;
                }
            }
        }else{
            try {
                if (!RB_Excluir.isSelected() && !RB_Transferir.isSelected()) {
                    throw new Exception("Selecione um botão");
                }
                if (RB_Excluir.isSelected() && RB_Transferir.isSelected()) {
                    throw new Exception("Selecione apenas um botão");
                }
                
                String dataHorarioString = jList1.getSelectedValue();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
                LocalDateTime dataHorario = LocalDateTime.parse(dataHorarioString, formatter);
                
                if (RB_Excluir.isSelected()) {
                    for (int i = 0; i < Janela.h.listaConsulta.size(); i++) {
                        if (dataHorario.isEqual(Janela.h.listaConsulta.get(i).getDataHora())) {
                            Janela.h.listaConsulta.remove(i);
                            medico.addHorario(dataHorario);
                            limparTela();
                            JOptionPane.showMessageDialog(null, "Consulta excluida com sucesso");
                            break;
                        }
                    }
                }
                if (RB_Transferir.isSelected()) {
                    modeloLista.removeAllElements();
                    RB_Transferir.setSelected(false);
                    RB_Excluir.setSelected(false);
                    RB_Excluir.setEnabled(true);
                    RB_Transferir.setEnabled(true);
                    medico.addHorario(dataHorario);
                    LinkedList<LocalDateTime> listaH = medico.getListaHorarios();
                    for (LocalDateTime horario : listaH) {
                        String horarioFormatado = formatarTable(horario);
                        modeloLista.addElement(horarioFormatado);                
                    }
                    JOptionPane.showMessageDialog(null, "SELECIONE UM NOVO HORÁRIO"); 
                    etapa2 = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/nathanwmartins/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RB_Excluir;
    private javax.swing.JRadioButton RB_Transferir;
    private javax.swing.JTextField TF_Medico;
    private javax.swing.JTextField TF_Paciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
