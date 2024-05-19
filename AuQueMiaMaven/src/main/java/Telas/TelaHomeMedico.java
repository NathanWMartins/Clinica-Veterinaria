package Telas;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaHomeMedico extends javax.swing.JPanel {

    DefaultTableModel model;
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    String nomeVeterinario = "";
    private ResourceBundle traducoes;

    public TelaHomeMedico(String cpf, ResourceBundle traducoes) {
        initComponents();
        this.traducoes = traducoes;
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Data/Hora");
        model.addColumn("Descrição");
        model.addColumn("Nome do Pet");
        acharMedico(cpf);
        traduzirPagina();
        verificarLinguagem();
    }

    public void traduzirPagina() {
        LB_BemVindo.setText(traducoes.getString("homeMedico_lbl_bemVindo"));
        LB_SuasConsultas.setText(traducoes.getString("homeMedico_lbl_suasConsultas"));
        jButton1.setText(traducoes.getString("cad_btn_voltar"));
    }
    
    public void verificarLinguagem() {
        if (traducoes.getString("linguagem").equals("en")) {
            String[] novosNomes = {"Date", "Description", "Pet's Name"};
            DefaultTableModel model2 = (DefaultTableModel) this.jTable1.getModel();
            model2.setColumnIdentifiers(novosNomes);
            jTable1.setModel(model2);
        }else{
            String[] novosNomes = {"Fecha", "Descipción", "Nombre Pet"};
            DefaultTableModel model2 = (DefaultTableModel) this.jTable1.getModel();
            model2.setColumnIdentifiers(novosNomes);
            jTable1.setModel(model2);
        }
    }
    
    /**
     * Procura e seleciona o veterinário que está fazendo login usando o CPF
     * dele como parâmero. É retirada informações (id e nome) do banco de dados.
     *
     * @param cpf
     */
    public void acharMedico(String cpf) {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT idVeterinario, nome FROM veterinario WHERE cpf = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cpf);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String idMedico = resultSet.getString("idVeterinario");
                nomeVeterinario = resultSet.getString("nome");
                preencherTabela(idMedico);
            }
            LB_NOME.setText(nomeVeterinario);
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void preencherTabela(String idVet) {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT dataHora, tratamento, idPet FROM consulta WHERE idVet = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, idVet);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String data = resultSet.getString("dataHora");
                String descricao = resultSet.getString("tratamento");
                String idPet = resultSet.getString("idPet");
                String nomePet = acharPet(idPet);
                model.addRow(new Object[]{data, descricao, nomePet});
            }

            query = "SELECT dataHora, descricao, id_animal FROM servicos WHERE id_veterinario = ?";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, idVet);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String data = resultSet.getString("dataHora");
                String descricao = resultSet.getString("descricao");
                String idPet = resultSet.getString("id_animal");
                String nomePet = acharPet(idPet);
                model.addRow(new Object[]{data, descricao, nomePet});
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

    public String acharPet(String idPet) {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT nomeAnimal FROM animal WHERE idAnimal = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, idPet);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String nomeAnimal = resultSet.getString("nomeAnimal");
                return nomeAnimal;
            }
            // Fechando recursos
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_BemVindo = new javax.swing.JLabel();
        LB_SuasConsultas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LB_NOME = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_BemVindo.setFont(new java.awt.Font("Monotype Corsiva", 1, 42)); // NOI18N
        LB_BemVindo.setForeground(new java.awt.Color(255, 255, 255));
        LB_BemVindo.setText("BEM VINDO,");
        LB_BemVindo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_BemVindoMouseClicked(evt);
            }
        });
        add(LB_BemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 390, 40));

        LB_SuasConsultas.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        LB_SuasConsultas.setForeground(new java.awt.Color(255, 255, 255));
        LB_SuasConsultas.setText("SUAS CONSULTAS:");
        LB_SuasConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_SuasConsultasMouseClicked(evt);
            }
        });
        add(LB_SuasConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 550, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, -1, -1));

        LB_NOME.setFont(new java.awt.Font("Monospaced", 1, 44)); // NOI18N
        LB_NOME.setForeground(new java.awt.Color(255, 255, 255));
        LB_NOME.setText("<NOME>");
        add(LB_NOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, 70));

        jTable1.setBackground(new java.awt.Color(49, 47, 48));
        jTable1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(115, 153, 250));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data ", "Descrição", "Nome do Pet"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 680, 200));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(115, 153, 250));
        jButton1.setText("<<< VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 190, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaHomeMedico.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Janela.TelaA = new TelaLogin(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaF);
        janela.getContentPane().remove(Janela.TelaF);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Janela.TelaA = new TelaLogin(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaF);
        janela.getContentPane().remove(Janela.TelaF);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void LB_SuasConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_SuasConsultasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_SuasConsultasMouseClicked

    private void LB_BemVindoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BemVindoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_BemVindoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_BemVindo;
    private javax.swing.JLabel LB_NOME;
    private javax.swing.JLabel LB_SuasConsultas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
