import Dados.Produto;
import Dao.SistemaDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Produtos extends javax.swing.JFrame {

    /**
     * Creates new form Produtos
     */
    public Produtos() {
        initComponents();
    }

  

    public Produtos(String codigo, String nome, String embalagem, String preco, String operacao) {
    
        initComponents();
        txtCodigo.setText(codigo);
        txtNome.setText(nome);
        txtEmbalagem.setText(embalagem);
        txtPreco.setText(preco);
       
        if (operacao.equals("excluir")) {
            btnExcluir.setVisible(true);
            btnSalvar.setVisible(false);
            btnAlterar.setVisible(false);
            txtCodigo.setEnabled(false);
            txtNome.setEnabled(false);
            txtEmbalagem.setEnabled(false);
            txtPreco.setEnabled(false);
            
        } else if (operacao.equals("alterar")) {
            btnAlterar.setVisible(true);
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
            txtCodigo.setEnabled(false);
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmbalagem = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 87, 18);

        jLabel2.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 49, 25);

        jLabel4.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel4.setText("Embalagem");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 94, 25);

        jLabel5.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel5.setText("Preço");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 180, 44, 25);
        getContentPane().add(txtPreco);
        txtPreco.setBounds(100, 180, 320, 22);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(100, 30, 320, 20);
        getContentPane().add(txtNome);
        txtNome.setBounds(100, 80, 320, 20);
        getContentPane().add(txtEmbalagem);
        txtEmbalagem.setBounds(100, 130, 320, 20);

        btnExcluir.setBackground(new java.awt.Color(102, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(170, 240, 100, 40);

        btnSalvar.setBackground(new java.awt.Color(102, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setActionCommand("Salvar");
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
        btnSalvar.setBounds(40, 240, 100, 40);

        btnAlterar.setBackground(new java.awt.Color(102, 255, 255));
        btnAlterar.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(310, 240, 100, 40);

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\soft-ice-cream_1f366.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-30, -30, 520, 350);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\Cor solida de fundo.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1410, 710);

        setSize(new java.awt.Dimension(472, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
                
        int resposta; 
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        Produto produto;
        produto = new Produto();
        
        if (resposta == 0) { 
            
            produto.setCodigo(Integer.parseInt(txtCodigo.getText()));

            try {
            
                SistemaDao dao;
                dao = new SistemaDao();
                dao.excluirProdutos(produto);

                
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
               
                dispose();

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
            }
             
        } else {
            dispose();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Produto produto;
        produto = new Produto();
        
        produto.setCodigo(Integer.parseInt(txtCodigo.getText()));
        produto.setNome(txtNome.getText());
        produto.setEmbalagem(txtEmbalagem.getText());
        produto.setPreco(Double.parseDouble(txtPreco.getText()));
        
        SistemaDao dao;
        dao = new SistemaDao();
        try {
            dao.salvarProdutos(produto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Funcionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        //4.1 Mostrar a mensagem "Usuário salvo com sucesso" e limpar os campos.
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
        txtCodigo.setText("");
        txtNome.setText("");
        txtEmbalagem.setText("");
        txtPreco.setText("");
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
     
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Produto produto;
        produto = new Produto();
        produto.setCodigo(Integer.parseInt(txtCodigo.getText()));
        produto.setNome(txtNome.getText());
        produto.setEmbalagem(txtEmbalagem.getText());
        produto.setPreco(Double.parseDouble(txtPreco.getText()));
      
        try {
           
            SistemaDao dao;
            dao = new SistemaDao();
            dao.alterarProduto(produto);

            
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");

            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmbalagem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
