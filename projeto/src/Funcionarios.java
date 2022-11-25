
import Dao.SistemaDao;
import Dados.Funcionario;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcionarios extends javax.swing.JFrame {


    public Funcionarios() {
        initComponents();
        btnExcluir.setVisible(false);
        btnAlterar.setVisible(false);
    }

   
    public Funcionarios(String usuario, String senha, String nome, String cargo,String salario,String adm, String operacao) {
        initComponents();
        txtId.setText(usuario);
        txtSenha.setText(senha);
        txtNome.setText(nome);
        txtCargo.setText(cargo);
        txtSalario.setText(salario);
        txtAdm.setText(adm);
        if (operacao.equals("excluir")) {
            btnExcluir.setVisible(true);
            btnSalvar.setVisible(false);
            btnAlterar.setVisible(false);
            txtId.setEnabled(false);
            txtSenha.setEnabled(false);
            txtSalario.setEnabled(false);
            txtAdm.setEnabled(false);
            txtNome.setEnabled(false);
            txtCargo.setEnabled(false);
        } else if (operacao.equals("alterar")) {
            btnAlterar.setVisible(true);
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
            txtId.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lblUsuario1 = new javax.swing.JLabel();
        txtAdm = new javax.swing.JTextField();
        lblUsuario2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Funcionarios");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblUsuario.setText("Administrador");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(210, 60, 100, 40);

        lblSenha.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(230, 10, 90, 40);

        txtSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(310, 20, 140, 30);

        lblNome.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(10, 110, 90, 40);

        txtCargo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCargoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCargo);
        txtCargo.setBounds(70, 170, 180, 30);

        lblCargo.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(10, 160, 90, 40);

        btnSalvar.setBackground(new java.awt.Color(102, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(30, 230, 100, 40);

        btnExcluir.setBackground(new java.awt.Color(102, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(170, 230, 100, 40);

        btnAlterar.setBackground(new java.awt.Color(102, 255, 255));
        btnAlterar.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(310, 230, 110, 40);

        lblUsuario1.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblUsuario1.setText("ID");
        getContentPane().add(lblUsuario1);
        lblUsuario1.setBounds(30, 10, 90, 40);

        txtAdm.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtAdm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdmKeyPressed(evt);
            }
        });
        getContentPane().add(txtAdm);
        txtAdm.setBounds(310, 70, 140, 30);

        lblUsuario2.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblUsuario2.setText("Salario");
        getContentPane().add(lblUsuario2);
        lblUsuario2.setBounds(10, 60, 90, 40);

        txtId.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        getContentPane().add(txtId);
        txtId.setBounds(70, 20, 130, 30);

        txtSalario.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtSalario);
        txtSalario.setBounds(70, 70, 130, 30);

        txtNome.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 120, 400, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\soft-ice-cream_1f366.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, -120, 560, 540);

        setSize(new java.awt.Dimension(508, 325));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setId(txtId.getText());
        funcionario.setSenha(txtSenha.getText());
        funcionario.setSalario(Double.parseDouble(txtSalario.getText()));
        funcionario.setAdministrador(txtAdm.getText());
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        
        SistemaDao dao;
        dao = new SistemaDao();
        try {
            dao.salvarFuncionario(funcionario);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        txtId.setText("");
        txtSenha.setText("");
        txtSalario.setText("");
        txtAdm.setText("");
        txtNome.setText("");
        txtCargo.setText("");
        txtId.requestFocus();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtCargo.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyPressed

    }//GEN-LAST:event_txtCargoKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvar.doClick();
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Funcionario funcionario = new Funcionario();
        int resposta; 
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
       
        if (resposta == 0) { 
            funcionario.setId(txtId.getText());

            try {
               
                SistemaDao dao;
                dao = new SistemaDao();
                dao.excluirUsuario(funcionario);

                
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
                
                dispose();

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
            }
           
        } else {
            dispose();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Funcionario funcionario = new Funcionario();
        
        
        funcionario.setId(txtId.getText());
        funcionario.setSenha(txtSenha.getText());
        funcionario.setSalario(Integer.parseInt(txtSalario.getText()));
        funcionario.setAdministrador(txtAdm.getText());
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        try {
            
            SistemaDao dao;
            dao = new SistemaDao();
            dao.alterarFuncionario(funcionario);

            
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");

            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtAdmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdmKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmKeyPressed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JTextField txtAdm;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
