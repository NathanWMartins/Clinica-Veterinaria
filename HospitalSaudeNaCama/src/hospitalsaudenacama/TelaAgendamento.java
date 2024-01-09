package hospitalsaudenacama;

import classes.Consulta;
import classes.Medico;
import classes.Paciente;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaAgendamento extends javax.swing.JPanel {
    private DefaultListModel<String> modeloLista;
    
    public TelaAgendamento() {
        initComponents();
        modeloLista = new DefaultListModel<>();
        jList1.setModel(modeloLista);        
        jLabel15.setVisible(false);
        jLabel18.setVisible(false);
        jLabel6.setVisible(false);
        jTextField1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 92, 130));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/white-circle-free-png (1).png"))); // NOI18N
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 180, 190));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/white-circle-free-png (1).png"))); // NOI18N
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 180, 190));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/white-circle-free-png (1).png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 180, 190));

        jPanel7.setBackground(new java.awt.Color(98, 202, 206));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 100, 20));

        jPanel6.setBackground(new java.awt.Color(98, 202, 206));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 280, 20));

        jPanel4.setBackground(new java.awt.Color(98, 202, 206));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 100, 20));

        jPanel3.setBackground(new java.awt.Color(98, 202, 206));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 20));

        jPanel5.setBackground(new java.awt.Color(98, 202, 206));
        jPanel5.setForeground(new java.awt.Color(98, 202, 206));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 20, 460));

        jPanel2.setBackground(new java.awt.Color(98, 202, 206));
        jPanel2.setForeground(new java.awt.Color(98, 202, 206));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 148, 20, 450));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/HOSPITAL (1).jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 460));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/c (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(27, 92, 130));
        jLabel7.setText("NOS CONHEÇA MELHOR:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 35, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/insta (1) (2).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 63, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/Twitter-X-Logo-PNG (2).jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 63, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/whatsapp-logo_icon-icons.com_68338 (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 63, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(27, 92, 130));
        jLabel11.setText("SAÚDE NA CAMA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(27, 92, 130));
        jLabel13.setText("CLÍNICA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(27, 92, 130));
        jLabel14.setText("AGENDAMENTO DE CONSULTAS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1049, 110));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CPF DO PACIENTE:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/MEDICO1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/MEDICO3.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalsaudenacama/MEDICO2.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(27, 92, 130));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 190, 20));

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("<<VOLTAR");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(27, 92, 130));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, -1, -1));

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(27, 92, 130));
        jScrollPane2.setViewportView(jList1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 470, 100));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(27, 92, 130));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 190, 20));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ESPECIALIDADE DO MÉDICO:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public String formatarTable(LocalDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return dateTime.format(formatter);
    }
    
    public void limparTela(){
        jTextField3.setText("");
        jList1.removeSelectionInterval(0, 0);
        jList1.removeSelectionInterval(1, 0);
        jList1.removeSelectionInterval(2, 0);
        jList1.removeSelectionInterval(3, 0);
        jLabel15.setVisible(false);
        jLabel18.setVisible(false);
        jLabel6.setVisible(false);
        modeloLista.removeAllElements();
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jLabel15.setVisible(false);
        jLabel18.setVisible(false);
        jLabel6.setVisible(true);
        jTextField1.setText("Dermatologista");
        Medico medico = new Medico();
        for (int i = 0; i < Janela.h.listaMedicos.size(); i++) {
            if (Janela.h.listaMedicos.get(i).getEspecialidade().equals(jTextField1.getText())) {
                medico = Janela.h.listaMedicos.get(i);
                break;
            }
        }
        LinkedList<LocalDateTime> listaH = medico.getListaHorarios();

        modeloLista.clear();

        for (LocalDateTime horario : listaH) {
            String horarioFormatado = formatarTable(horario);
            modeloLista.addElement(horarioFormatado);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel15.setVisible(true);
        jLabel18.setVisible(false);
        jLabel6.setVisible(false);
        jTextField1.setText("Ortopedista");
        Medico medico = new Medico();
        for (int i = 0; i < Janela.h.listaMedicos.size(); i++) {
            if (Janela.h.listaMedicos.get(i).getEspecialidade().equals(jTextField1.getText())) {
                medico = Janela.h.listaMedicos.get(i);
                break;
            }
        }
        LinkedList<LocalDateTime> listaH = medico.getListaHorarios();

        modeloLista.clear();

        for (LocalDateTime horario : listaH) {
            String horarioFormatado = formatarTable(horario);
            modeloLista.addElement(horarioFormatado);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jLabel15.setVisible(false);
        jLabel18.setVisible(true);
        jLabel6.setVisible(false);
        jTextField1.setText("Urologista");
        Medico medico = new Medico();
        for (int i = 0; i < Janela.h.listaMedicos.size(); i++) {
            if (Janela.h.listaMedicos.get(i).getEspecialidade().equals(jTextField1.getText())) {
                medico = Janela.h.listaMedicos.get(i);
                break;
            }
        }
        LinkedList<LocalDateTime> listaH = medico.getListaHorarios();

        modeloLista.clear();

        for (LocalDateTime horario : listaH) {
            String horarioFormatado = formatarTable(horario);
            modeloLista.addElement(horarioFormatado);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Janela.telaA = new TelaInicial();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.telaB);
        janela.getContentPane().remove(Janela.telaB);
        janela.add(Janela.telaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cpfPaciente = jTextField3.getText();
        String especialidadeMedico = jTextField1.getText();
        try {
            if (jList1.getSelectedValue() == null) {
                throw new Exception("Selecione o horário desejado");
            }
            if (especialidadeMedico.equals("")) {
                throw new Exception("Selecione um médico");
            }
            if (cpfPaciente.equals("")) {
                throw new Exception("Informe o nome do paciente");
            }
            Paciente p = new Paciente();
            boolean achouPaciente = false;
            //acharPaciente
            for (int i = 0; i < Janela.h.listaPacientes.size(); i++) {
                if (cpfPaciente.equals(Janela.h.listaPacientes.get(i).getCpf())) {
                    p = Janela.h.listaPacientes.get(i);
                    achouPaciente = true;
                    break;
                }
            }
            if (achouPaciente == false) {
                throw new Exception("Não foi possível encontrar o paciente");
            }
            //acharMedico
            Medico m = new Medico();
            for (int i = 0; i < Janela.h.listaMedicos.size(); i++) {
                if (especialidadeMedico.equals(Janela.h.listaMedicos.get(i).getEspecialidade())) {
                    m = Janela.h.listaMedicos.get(i);
                    break;
                }
            }
            String dataHorarioString = jList1.getSelectedValue();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
            LocalDateTime dataHorario = LocalDateTime.parse(dataHorarioString, formatter);  
            m.removerHorario(dataHorario);
            
            Consulta consulta = new Consulta(p, m, 0001, dataHorario);
            Janela.h.listaConsulta.add(consulta);

            JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso");
            limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/nathanwmartins/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
