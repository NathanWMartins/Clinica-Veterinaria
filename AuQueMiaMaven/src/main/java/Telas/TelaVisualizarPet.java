package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaVisualizarPet extends javax.swing.JPanel {

    DefaultTableModel model;
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    private ResourceBundle traducoes;

    public TelaVisualizarPet(ResourceBundle traducoes) {
        initComponents();
        this.traducoes = traducoes;
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Nome");
        model.addColumn("Espécie");
        model.addColumn("Raça");
        model.addColumn("Idade");
        model.addColumn("Genero");
        inserirDadosNaTabela();
        jTable1.setEnabled(false);
        traduzirPagina();
        verificarLinguagem();
    }

    public void traduzirPagina() {
        LB_ClinicaMedica.setText(traducoes.getString("lbl_clinica"));
        LB_VisualizarPet.setText(traducoes.getString("visuPet_lbl_visualizar"));
        jButton1.setText(traducoes.getString("visuPet_btn_mudar"));
        jButton1.setBackground(new Color(86,86,86));
    }

    public void verificarLinguagem() {
        if (traducoes.getString("linguagem").equals("en")) {
            String[] novosNomes = {"Name", "Specie", "Breed", "Age", "Gender"};
            DefaultTableModel model2 = (DefaultTableModel) this.jTable1.getModel();
            model2.setColumnIdentifiers(novosNomes);
            jTable1.setModel(model2);
        }else{
            String[] novosNomes = {"Nombre", "Especie", "Raza", "Edad", "Género"};
            DefaultTableModel model2 = (DefaultTableModel) this.jTable1.getModel();
            model2.setColumnIdentifiers(novosNomes);
            jTable1.setModel(model2);
        }
    }

    private void inserirDadosNaTabela() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT nomeAnimal, especie, raca, idade, genero FROM animal";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String nome = resultSet.getString("nomeAnimal");
                String especie = resultSet.getString("especie");
                String raca = resultSet.getString("raca");
                String idade = resultSet.getString("idade");
                String genero = resultSet.getString("genero");
                model.addRow(new Object[]{nome, especie, raca, idade, genero});
            }

            // Fechando recursos
            resultSet.close();
            preparedStatement.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_VisualizarPet = new javax.swing.JLabel();
        LB_Home = new javax.swing.JLabel();
        LB_PetShop = new javax.swing.JLabel();
        LB_ClinicaMedica = new javax.swing.JLabel();
        LB_Configuracoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_VisualizarPet.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        LB_VisualizarPet.setForeground(new java.awt.Color(51, 51, 51));
        LB_VisualizarPet.setText("VISUALIZAR PET:");
        LB_VisualizarPet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_VisualizarPetMouseClicked(evt);
            }
        });
        add(LB_VisualizarPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 430, 50));

        LB_Home.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Home.setForeground(new java.awt.Color(255, 255, 255));
        LB_Home.setText("HOME");
        LB_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_HomeMouseClicked(evt);
            }
        });
        add(LB_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        LB_PetShop.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_PetShop.setForeground(new java.awt.Color(255, 255, 255));
        LB_PetShop.setText("PET SHOP");
        LB_PetShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShopMouseClicked(evt);
            }
        });
        add(LB_PetShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 130, 30));

        LB_ClinicaMedica.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_ClinicaMedica.setForeground(new java.awt.Color(255, 255, 255));
        LB_ClinicaMedica.setText("CLÍNICA MÉDICA");
        LB_ClinicaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedicaMouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 230, -1));

        LB_Configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        LB_Configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ConfiguracoesMouseClicked(evt);
            }
        });
        add(LB_Configuracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, -1, -1));

        jTable1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Especie", "Raça", "Idade", "Genero"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 760, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 153, 250));
        jButton1.setText("Mudar Informações");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 420, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaVisualizarPet.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void LB_ConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ConfiguracoesMouseClicked
        Janela.TelaJ = new TelaConfiguracoes(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ConfiguracoesMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Janela.TelaA = new TelaLogin(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText().equals("Mudar Informações")) {
            jTable1.setEnabled(true);
            jButton1.setText("Confirmar");
        } else {
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                statement.execute("USE mydb");

                for (int i = 0; i < model.getRowCount(); i++) {
                    String nome = (String) model.getValueAt(i, 0);
                    String especie = (String) model.getValueAt(i, 1);
                    String raca = (String) model.getValueAt(i, 2);
                    String idade = (String) model.getValueAt(i, 3);
                    String genero = (String) model.getValueAt(i, 4);

                    String query = "UPDATE animal SET especie=?, raca=?, idade=?, genero=? WHERE nomeAnimal=?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, especie);
                    preparedStatement.setString(2, raca);
                    preparedStatement.setString(3, idade);
                    preparedStatement.setString(4, genero);
                    preparedStatement.setString(5, nome);
                    preparedStatement.executeUpdate();

                    preparedStatement.close();
                }

                statement.close();
                connection.close();

                JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");
                jButton1.setText("Mudar Informações");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao atualizar os dados.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LB_PetShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShopMouseClicked
        Janela.TelaD = new TelaPetShop(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_PetShopMouseClicked

    private void LB_ClinicaMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedicaMouseClicked
        Janela.TelaH = new TelaClinicaMedica(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedicaMouseClicked

    private void LB_VisualizarPetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_VisualizarPetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_VisualizarPetMouseClicked

    private void LB_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_HomeMouseClicked
        Janela.TelaC = new TelaHome(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaI);
        janela.getContentPane().remove(Janela.TelaI);
        janela.add(Janela.TelaC, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_HomeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_ClinicaMedica;
    private javax.swing.JLabel LB_Configuracoes;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_PetShop;
    private javax.swing.JLabel LB_VisualizarPet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
