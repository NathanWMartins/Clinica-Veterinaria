package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaCadastroAnimais extends javax.swing.JPanel {

    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    int contAnimais = 0;
    int contClientes = 0;
    private boolean acharDono = false;
    private ResourceBundle traducoes;

    public TelaCadastroAnimais(ResourceBundle traducoes) {
        initComponents();
        this.traducoes = traducoes;
        acharQuantAnimal();
        acharQuantCliente();
        JOptionPane.showMessageDialog(null, "Caso o cliente já esteja cadastrado, basta informar o cpf e apertar no botão a baixo.");
        traduzirPagina();
    }

    public void traduzirPagina() {
        LB_ClinicaMedica.setText(traducoes.getString("lbl_clinica"));
        LB_SelecioneServiço2.setText(traducoes.getString("cadAnimais_lbl_cadastroPet"));
        LB_Nome.setText(traducoes.getString("lbl_nome"));
        jLabel3.setText(traducoes.getString("cadAnimais_lbl_cpfDono"));
        BT_AcharDono.setText(traducoes.getString("cadAnimais_btn_acharDono"));
        LB_Raca.setText(traducoes.getString("cadAnimais_lbl_raca"));
        LB_NomeDono.setText(traducoes.getString("cadAnimais_lbl_nomeDono"));
        LB_Especie.setText(traducoes.getString("cadAnimais_lbl_especie"));
        LB_Idade.setText(traducoes.getString("cadAnimais_lbl_idade"));
        LB_Endereco.setText(traducoes.getString("lbl_endereco"));
        LB_Gênero.setText(traducoes.getString("lbl_genero"));
        LB_Email.setText(traducoes.getString("lbl_email"));        
        LB_Telefone.setText(traducoes.getString("lbl_telefone"));                        
        BT_Cadastrar.setText(traducoes.getString("btn_cadastrar"));
        BT_Cadastrar.setBackground(new Color(86,86,86));
        BT_AcharDono.setBackground(new Color(86,86,86));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_SelecioneServiço2 = new javax.swing.JLabel();
        LB_Home = new javax.swing.JLabel();
        LB_PetShop4 = new javax.swing.JLabel();
        LB_ClinicaMedica = new javax.swing.JLabel();
        BT_AcharDono = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TF_CPFDono = new javax.swing.JTextField();
        LB_Email = new javax.swing.JLabel();
        TF_Email = new javax.swing.JTextField();
        LB_Telefone = new javax.swing.JLabel();
        TF_Telefone = new javax.swing.JTextField();
        LB_Endereco = new javax.swing.JLabel();
        TF_Endereco = new javax.swing.JTextField();
        TF_NomeDono = new javax.swing.JTextField();
        LB_NomeDono = new javax.swing.JLabel();
        LB_Nome = new javax.swing.JLabel();
        TF_Nome = new javax.swing.JTextField();
        LB_Especie = new javax.swing.JLabel();
        TF_Especie = new javax.swing.JTextField();
        LB_Raca = new javax.swing.JLabel();
        TF_Raca = new javax.swing.JTextField();
        LB_Idade = new javax.swing.JLabel();
        TF_Idade = new javax.swing.JTextField();
        LB_Gênero = new javax.swing.JLabel();
        CB_Genero = new javax.swing.JComboBox<>();
        BT_Cadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_SelecioneServiço2.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        LB_SelecioneServiço2.setForeground(new java.awt.Color(51, 51, 51));
        LB_SelecioneServiço2.setText("CADASTRO DE PET:");
        LB_SelecioneServiço2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_SelecioneServiço2MouseClicked(evt);
            }
        });
        add(LB_SelecioneServiço2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 420, 50));

        LB_Home.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_Home.setForeground(new java.awt.Color(255, 255, 255));
        LB_Home.setText("HOME");
        add(LB_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        LB_PetShop4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_PetShop4.setForeground(new java.awt.Color(255, 255, 255));
        LB_PetShop4.setText("PET SHOP");
        LB_PetShop4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_PetShop4MouseClicked(evt);
            }
        });
        add(LB_PetShop4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 130, 30));

        LB_ClinicaMedica.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LB_ClinicaMedica.setForeground(new java.awt.Color(255, 255, 255));
        LB_ClinicaMedica.setText("CLÍNICA MÉDICA");
        LB_ClinicaMedica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB_ClinicaMedicaMouseClicked(evt);
            }
        });
        add(LB_ClinicaMedica, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 230, -1));

        BT_AcharDono.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BT_AcharDono.setForeground(new java.awt.Color(115, 153, 250));
        BT_AcharDono.setText("ACHAR DONO");
        BT_AcharDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AcharDonoActionPerformed(evt);
            }
        });
        add(BT_AcharDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 250, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeConfiguracoes.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, -1, -1));

        TF_CPFDono.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_CPFDono.setForeground(new java.awt.Color(102, 102, 255));
        TF_CPFDono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_CPFDonoKeyPressed(evt);
            }
        });
        add(TF_CPFDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 260, -1));

        LB_Email.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Email.setForeground(new java.awt.Color(115, 153, 250));
        LB_Email.setText("Email:");
        add(LB_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 100, 40));

        TF_Email.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Email.setForeground(new java.awt.Color(102, 102, 255));
        TF_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EmailKeyPressed(evt);
            }
        });
        add(TF_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, 260, -1));

        LB_Telefone.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Telefone.setForeground(new java.awt.Color(115, 153, 250));
        LB_Telefone.setText("Telefone:");
        add(LB_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 140, 40));

        TF_Telefone.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Telefone.setForeground(new java.awt.Color(102, 102, 255));
        TF_Telefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_TelefoneKeyPressed(evt);
            }
        });
        add(TF_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 260, -1));

        LB_Endereco.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Endereco.setForeground(new java.awt.Color(115, 153, 250));
        LB_Endereco.setText("Endereço:");
        add(LB_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 140, 40));

        TF_Endereco.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Endereco.setForeground(new java.awt.Color(102, 102, 255));
        TF_Endereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EnderecoKeyPressed(evt);
            }
        });
        add(TF_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 260, -1));

        TF_NomeDono.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_NomeDono.setForeground(new java.awt.Color(102, 102, 255));
        TF_NomeDono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_NomeDonoKeyPressed(evt);
            }
        });
        add(TF_NomeDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 300, 260, -1));

        LB_NomeDono.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_NomeDono.setForeground(new java.awt.Color(115, 153, 250));
        LB_NomeDono.setText("Nome do Dono(a):");
        add(LB_NomeDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 200, 40));

        LB_Nome.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Nome.setForeground(new java.awt.Color(115, 153, 250));
        LB_Nome.setText("Nome:");
        add(LB_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 60));

        TF_Nome.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Nome.setForeground(new java.awt.Color(102, 102, 255));
        TF_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_NomeKeyPressed(evt);
            }
        });
        add(TF_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 270, -1));

        LB_Especie.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Especie.setForeground(new java.awt.Color(115, 153, 250));
        LB_Especie.setText("Espécie:");
        add(LB_Especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 60));

        TF_Especie.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Especie.setForeground(new java.awt.Color(102, 102, 255));
        TF_Especie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_EspecieKeyPressed(evt);
            }
        });
        add(TF_Especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 270, -1));

        LB_Raca.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Raca.setForeground(new java.awt.Color(115, 153, 250));
        LB_Raca.setText("Raça:");
        add(LB_Raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, 40));

        TF_Raca.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Raca.setForeground(new java.awt.Color(102, 102, 255));
        TF_Raca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_RacaKeyPressed(evt);
            }
        });
        add(TF_Raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 270, -1));

        LB_Idade.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Idade.setForeground(new java.awt.Color(115, 153, 250));
        LB_Idade.setText("Idade:");
        add(LB_Idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, 40));

        TF_Idade.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TF_Idade.setForeground(new java.awt.Color(102, 102, 255));
        TF_Idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_IdadeKeyPressed(evt);
            }
        });
        add(TF_Idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 270, -1));

        LB_Gênero.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        LB_Gênero.setForeground(new java.awt.Color(115, 153, 250));
        LB_Gênero.setText("Gênero:");
        add(LB_Gênero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 100, 50));

        CB_Genero.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        CB_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Macho", "Fêmea", " " }));
        add(CB_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 270, 30));

        BT_Cadastrar.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        BT_Cadastrar.setForeground(new java.awt.Color(115, 153, 250));
        BT_Cadastrar.setText("FINALIZAR CADASTRO");
        BT_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CadastrarActionPerformed(evt);
            }
        });
        add(BT_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 340, 70));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(115, 153, 250));
        jLabel3.setText("CPF Dono:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeSair.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaCadastroPet.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que conta a quantidade de animais cadastrados e descobre qual o
     * valor do ID que o animal que será cadastrado na sequência irá receber.
     */
    private void acharQuantAnimal() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT idAnimal FROM animal";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                if (Integer.valueOf(resultSet.getString("idAnimal")) == null) {
                    contAnimais = 1;
                } else {
                    contAnimais = Integer.valueOf(resultSet.getString("idAnimal")) + 1;
                }
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

    /**
     * Metodo que conta a quantidade de clientes cadastrados e descobre qual o
     * valor do ID que o cliete que será cadastrado na sequência irá receber.
     */
    private void acharQuantCliente() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT idCliente FROM cliente";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                if (Integer.valueOf(resultSet.getString("idCliente")) == null) {
                    contAnimais = 1;
                } else {
                    contAnimais = Integer.valueOf(resultSet.getString("idCliente")) + 1;
                }
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

    /**
     * Metodo que relaciona o id do animal com o id do seu dono, assim, se o
     * dono já estiver cadastrado mas seu animal não, não será necessário
     * recadastrá-lo.
     */
    private void acharDono(String cpf) {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.execute("USE mydb");

            String query = "SELECT idCliente FROM cliente WHERE cpf = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cpf);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                contClientes = resultSet.getInt("idCliente");
                JOptionPane.showMessageDialog(null, "Cliente encontrado, não é necessário adicionar as outras informações relacionada ao cliente");
                TF_Email.setEnabled(false);
                TF_CPFDono.setEnabled(false);
                TF_Endereco.setEnabled(false);
                TF_NomeDono.setEnabled(false);
                TF_Telefone.setEnabled(false);
                acharDono = true;
            } else {
                acharDono = false;
                JOptionPane.showMessageDialog(null, "CPF não está cadastrado");
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

    public void setarLayout() {
        TF_Nome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_CPFDono.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        CB_Genero.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Idade.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Endereco.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_NomeDono.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Especie.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Raca.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        TF_Telefone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public void cleanTF() {
        TF_CPFDono.setText("");
        TF_Email.setText("");
        TF_Endereco.setText("");
        TF_Especie.setText("");
        TF_Idade.setText("");
        TF_Nome.setText("");
        TF_NomeDono.setText("");
        TF_Raca.setText("");
        TF_Telefone.setText("");
        CB_Genero.setSelectedIndex(0);
    }


    private void BT_AcharDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AcharDonoActionPerformed
        if (TF_CPFDono.getText().length() == 14) {
            acharDono(TF_CPFDono.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Informe um CPF válido(14 caracteres)");
        }

    }//GEN-LAST:event_BT_AcharDonoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Janela.TelaJ = new TelaConfiguracoes(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaJ, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void TF_CPFDonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CPFDonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CPFDonoKeyPressed

    private void TF_EmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_EmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_EmailKeyPressed

    private void TF_TelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_TelefoneKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Telefone.setEditable(false);
        } else {
            TF_Telefone.setEditable(true);
        }
    }//GEN-LAST:event_TF_TelefoneKeyPressed

    private void TF_EnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_EnderecoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_EnderecoKeyPressed

    private void TF_NomeDonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_NomeDonoKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_NomeDono.setEditable(true);
        } else {
            TF_NomeDono.setEditable(false);
        }
    }//GEN-LAST:event_TF_NomeDonoKeyPressed

    private void TF_NomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_NomeKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Nome.setEditable(true);
        } else {
            TF_Nome.setEditable(false);
        }
    }//GEN-LAST:event_TF_NomeKeyPressed

    private void TF_EspecieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_EspecieKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Especie.setEditable(true);
        } else {
            TF_Especie.setEditable(false);
        }
    }//GEN-LAST:event_TF_EspecieKeyPressed

    private void TF_RacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_RacaKeyPressed
        char c = evt.getKeyChar();
        int keyCode = evt.getKeyCode();
        if (Character.isLetter(c) || keyCode == KeyEvent.VK_SPACE || keyCode == KeyEvent.VK_BACK_SPACE) {
            TF_Raca.setEditable(true);
        } else {
            TF_Raca.setEditable(false);
        }
    }//GEN-LAST:event_TF_RacaKeyPressed

    private void TF_IdadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_IdadeKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            TF_Idade.setEditable(false);
        } else {
            TF_Idade.setEditable(true);
        }
    }//GEN-LAST:event_TF_IdadeKeyPressed

    private void BT_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CadastrarActionPerformed
        setarLayout();
        try {
            if (!acharDono) {
                if (TF_NomeDono.getText().equals("")) {
                    TF_NomeDono.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
                if (TF_CPFDono.getText().equals("")) {
                    TF_CPFDono.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
                if (TF_Email.getText().equals("")) {
                    TF_Email.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
                if (TF_Endereco.getText().equals("")) {
                    TF_Endereco.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
                if (TF_Telefone.getText().equals("")) {
                    TF_Telefone.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
                if (TF_CPFDono.getText().equals("") || TF_NomeDono.getText().equals("") || TF_Endereco.getText().equals("")
                        || TF_Telefone.getText().equals("") || TF_Email.getText().equals("")) {
                    throw new Exception("Preencha ou selecione os campos necessários");
                }
            }
            if (CB_Genero.getSelectedIndex() == 0) {
                CB_Genero.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (TF_Idade.getText().equals("")) {
                TF_Idade.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (TF_Nome.getText().equals("")) {
                TF_Nome.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (TF_Especie.getText().equals("")) {
                TF_Especie.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (TF_Raca.getText().equals("")) {
                TF_Raca.setBorder(BorderFactory.createLineBorder(Color.RED));
            }
            if (TF_Nome.getText().equals("") || TF_Idade.getText().equals("")
                    || CB_Genero.getSelectedIndex() == 0 || TF_Especie.getText().equals("") || TF_Raca.getText().equals("")) {
                throw new Exception("Preencha ou selecione os campos necessários");
            }

            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("Conexao realizada com sucesso na base de dados: " + url);
                String query = "USE mydb";
                Statement statement = connection.createStatement();
                statement.execute(query);
                PreparedStatement consulta;
                String idAnimais = String.valueOf(contAnimais);
                String idCliente = String.valueOf(contClientes);

                if (!acharDono) {
                    query = "INSERT INTO Cliente VALUES (?, ?, ?, ?, ?, ?)";
                    consulta = connection.prepareStatement(query);

                    consulta.setString(1, idCliente);
                    consulta.setString(2, TF_NomeDono.getText());
                    consulta.setString(3, TF_Endereco.getText());
                    consulta.setString(4, TF_Telefone.getText());
                    consulta.setString(5, TF_Email.getText());
                    consulta.setString(6, TF_CPFDono.getText());
                    consulta.execute();
                }
                query = "INSERT INTO Animal VALUES (?, ?, ?, ?, ?, ?, ?)";
                consulta = connection.prepareStatement(query);
                consulta.setString(1, idAnimais);
                consulta.setString(2, TF_Nome.getText());
                consulta.setString(3, TF_Especie.getText());
                consulta.setString(4, TF_Raca.getText());
                consulta.setString(5, TF_Idade.getText());
                consulta.setString(6, (String) CB_Genero.getSelectedItem());
                consulta.setString(7, idCliente);
                consulta.execute();

                contAnimais++;
                contClientes++;
                JOptionPane.showMessageDialog(null, "Cadastrado feito com Sucesso!");
                cleanTF();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BT_CadastrarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Janela.TelaA = new TelaLogin(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaA, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void LB_PetShop4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_PetShop4MouseClicked
        Janela.TelaD = new TelaPetShop(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaD, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_PetShop4MouseClicked

    private void LB_ClinicaMedicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_ClinicaMedicaMouseClicked
        Janela.TelaH = new TelaClinicaMedica(traducoes);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(Janela.TelaE);
        janela.getContentPane().remove(Janela.TelaE);
        janela.add(Janela.TelaH, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_LB_ClinicaMedicaMouseClicked

    private void LB_SelecioneServiço2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_SelecioneServiço2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LB_SelecioneServiço2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_AcharDono;
    private javax.swing.JButton BT_Cadastrar;
    private javax.swing.JComboBox<String> CB_Genero;
    private javax.swing.JLabel LB_ClinicaMedica;
    private javax.swing.JLabel LB_Email;
    private javax.swing.JLabel LB_Endereco;
    private javax.swing.JLabel LB_Especie;
    private javax.swing.JLabel LB_Gênero;
    private javax.swing.JLabel LB_Home;
    private javax.swing.JLabel LB_Idade;
    private javax.swing.JLabel LB_Nome;
    private javax.swing.JLabel LB_NomeDono;
    private javax.swing.JLabel LB_PetShop4;
    private javax.swing.JLabel LB_Raca;
    private javax.swing.JLabel LB_SelecioneServiço2;
    private javax.swing.JLabel LB_Telefone;
    private javax.swing.JTextField TF_CPFDono;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Endereco;
    private javax.swing.JTextField TF_Especie;
    private javax.swing.JTextField TF_Idade;
    private javax.swing.JTextField TF_Nome;
    private javax.swing.JTextField TF_NomeDono;
    private javax.swing.JTextField TF_Raca;
    private javax.swing.JTextField TF_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
