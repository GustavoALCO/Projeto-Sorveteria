import Dao.SistemaDao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {

    //Construtor da classe Menu
    public Menu(String nome, String cargo, String administrador) {
        initComponents();
        
        lblSaudacao.setText("Bem vindo " + nome + " - Cargo: " + cargo);
        if(administrador.equalsIgnoreCase("nao")){
            mnuAdmin.setVisible(false);
            itmExcluirCliente.setVisible(false);
            itmExcluirProdutos.setVisible(false);
            
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        btnBloco = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        lblClientes = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblSair1 = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        itmListaProdutos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        mnuClientes = new javax.swing.JMenu();
        itmAdicinarCliente = new javax.swing.JMenuItem();
        itmAlterarCliente = new javax.swing.JMenuItem();
        itmExcluirCliente = new javax.swing.JMenuItem();
        itmListaCliente = new javax.swing.JMenuItem();
        mnuAdmin = new javax.swing.JMenu();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionario = new javax.swing.JMenuItem();
        itmAdicionarFuncionario = new javax.swing.JMenuItem();
        itmListaFuncionario = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do sistema");
        getContentPane().setLayout(null);

        lblSaudacao.setForeground(new java.awt.Color(204, 0, 204));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(230, 10, 310, 30);

        btnBloco.setBackground(new java.awt.Color(102, 255, 255));
        btnBloco.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\—Pngtree—vector folder icon_3788101.png")); // NOI18N
        btnBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlocoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBloco);
        btnBloco.setBounds(120, 160, 110, 60);

        btnCliente.setBackground(new java.awt.Color(102, 255, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\pngegg.png")); // NOI18N
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCliente);
        btnCliente.setBounds(330, 60, 110, 60);

        btnProdutos.setBackground(new java.awt.Color(102, 255, 255));
        btnProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\Delicious-ice-cream-cartoon-on-transparent-background 2-PNG.png")); // NOI18N
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdutos);
        btnProdutos.setBounds(120, 60, 110, 60);

        btnSair1.setBackground(new java.awt.Color(102, 255, 255));
        btnSair1.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\exit.png")); // NOI18N
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair1);
        btnSair1.setBounds(330, 160, 110, 60);

        lblClientes.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblClientes.setText("Clientes");
        getContentPane().add(lblClientes);
        lblClientes.setBounds(360, 120, 60, 20);

        lblProdutos.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblProdutos.setText("Produtos");
        getContentPane().add(lblProdutos);
        lblProdutos.setBounds(150, 120, 60, 20);

        lblSair1.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblSair1.setText("Bloco de notas");
        getContentPane().add(lblSair1);
        lblSair1.setBounds(130, 230, 110, 18);

        lblSair.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        lblSair.setText("Sair");
        getContentPane().add(lblSair);
        lblSair.setBounds(370, 230, 37, 18);

        imagem.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\soft-ice-cream_1f366.png")); // NOI18N
        getContentPane().add(imagem);
        imagem.setBounds(0, 0, 560, 300);

        mnuProdutos.setText("Produtos");

        itmCadastrarProdutos.setText("Cadatrar Produto");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setText("Alterar Produto");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAlterarProdutos);

        itmExcluirProdutos.setText("Excluir Produto");
        itmExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmExcluirProdutos);

        itmListaProdutos.setText("Tabela de Produtos");
        itmListaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListaProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmListaProdutos);
        mnuProdutos.add(jSeparator1);

        itmSair.setText("Sair");
        itmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmSair);

        barMenu.add(mnuProdutos);

        mnuClientes.setText("Clientes");

        itmAdicinarCliente.setText("Cadastrar Cliente");
        itmAdicinarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdicinarClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmAdicinarCliente);

        itmAlterarCliente.setText("Alterar Cliente");
        itmAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmAlterarCliente);

        itmExcluirCliente.setText("Excluir Cliente");
        itmExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmExcluirCliente);

        itmListaCliente.setText("Lista Cliente");
        itmListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListaClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(itmListaCliente);

        barMenu.add(mnuClientes);

        mnuAdmin.setText("Funcionarios");

        itmAlterarFuncionarios.setText("Alterar Dados do Funcionario");
        itmAlterarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarFuncionariosActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmAlterarFuncionarios);

        itmExcluirFuncionario.setText("Excluir Funcionarios");
        itmExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirFuncionarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmExcluirFuncionario);

        itmAdicionarFuncionario.setText("Adicionar Funcionarios");
        itmAdicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdicionarFuncionarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmAdicionarFuncionario);

        itmListaFuncionario.setText("Tabela Funcionarios");
        itmListaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListaFuncionarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmListaFuncionario);

        barMenu.add(mnuAdmin);

        mnuAjuda.setText("Ajuda");

        jMenuItem1.setText("Ajuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuAjuda.add(jMenuItem1);

        barMenu.add(mnuAjuda);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(574, 354));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmAdicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdicionarFuncionarioActionPerformed
       Funcionarios tela;
       tela = new Funcionarios();
       tela.setVisible(true);
    }//GEN-LAST:event_itmAdicionarFuncionarioActionPerformed

    private void itmExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirFuncionarioActionPerformed
      abrirTelaUsuario("excluir");
    }//GEN-LAST:event_itmExcluirFuncionarioActionPerformed

    private void itmListaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListaFuncionarioActionPerformed
       new ListaFuncionarios().setVisible(true);
    }//GEN-LAST:event_itmListaFuncionarioActionPerformed

    private void itmAlterarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarFuncionariosActionPerformed
        abrirTelaUsuario("alterar");
    }//GEN-LAST:event_itmAlterarFuncionariosActionPerformed

    private void btnBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlocoActionPerformed
     String srt= "Notepad.exe";
     try{
         Runtime.getRuntime().exec(srt);
     }
     catch(IOException e){
         System.out.println("Erro");
     }
    }//GEN-LAST:event_btnBlocoActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
     new ListaProdutos().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void itmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_itmSairActionPerformed

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
    Produtos tela;
    tela = new Produtos();
    tela.setVisible(true);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
        abrirProdutos("alterar");
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
        abrirProdutos("excluir");       // TODO add your handling code here:
    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void itmListaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListaProdutosActionPerformed
      new ListaProdutos().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_itmListaProdutosActionPerformed

    private void itmAdicinarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdicinarClienteActionPerformed
    Clientes tela;
    tela = new Clientes();
    tela.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_itmAdicinarClienteActionPerformed

    private void itmAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarClienteActionPerformed
    abrirClientes ("alterar");       // TODO add your handling code here:
    }//GEN-LAST:event_itmAlterarClienteActionPerformed

    private void itmExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirClienteActionPerformed
    abrirClientes("excluir");        // TODO add your handling code here:
    }//GEN-LAST:event_itmExcluirClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      JOptionPane.showMessageDialog(null,"Contatos para Suporte:\nEmail:suporte@site.com\nTelefone: +55(11)94025-0807","Suporte",1);  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListaClienteActionPerformed
    new ListaClientes().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_itmListaClienteActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        new ListaClientes().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void abrirTelaUsuario(String operacao){
        // 1 - Solicitar o usuário
        String u;
        u = JOptionPane.showInputDialog(null,"Digite o usuário a " + operacao,"Usuário",1);
        if(u == null){
            return; //stop
        }
        try {
             SistemaDao dao;
             dao = new SistemaDao();
             ResultSet resultado = dao.buscarUsuario(u);

            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega o nome e o cargo que veio na consulta ao banco de dados
                String id, senha, nome, cargo, salario, administrador;
                id = resultado.getString("id");
                senha = resultado.getString("senha");
                nome = resultado.getString("nome");
                cargo = resultado.getString("cargo");
                salario = resultado.getString("salario");
                administrador = resultado.getString("administrador");
                
               Funcionarios tela;
               tela = new Funcionarios(id, senha, nome, cargo, salario, administrador, operacao);
               tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }      
    }   
    
    private void abrirProdutos(String operacao){
        // 1 - Solicitar o usuário
        String u;
        u = JOptionPane.showInputDialog(null,"Digite o Produto a  " + operacao,"Codigo",1);
        if(u == null){
            return; //stop
        }
        try {
             SistemaDao dao;
             dao = new SistemaDao();
             ResultSet resultado = dao.buscarProdutos(u);

            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega o nome e o cargo que veio na consulta ao banco de dados
                String codigo, nome, embalagem, preco;
                codigo = resultado.getString("codigo");
                nome = resultado.getString("nome");
                embalagem = resultado.getString("embalagem");
                preco = resultado.getString("preco");
                
               Produtos tela;
               tela = new Produtos(codigo, nome, embalagem, preco, operacao);
               tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }      
    }   
      
    private void abrirClientes(String operacao){
        // 1 - Solicitar o usuário
        String u;
        u = JOptionPane.showInputDialog(null,"Digite o Cliente a  " + operacao,"CPF",1);
        if(u == null){
            return; //stop
        }
        try {
             SistemaDao dao;
             dao = new SistemaDao();
             ResultSet resultado = dao.buscarClientes(u);

            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega o nome e o cargo que veio na consulta ao banco de dados
                String Cnpj, nome, cidade, cep, email, telefone;
                Cnpj = resultado.getString("Cnpj");
                nome = resultado.getString("nome");
                cidade = resultado.getString("cidade");
                cep = resultado.getString("cep");
                email = resultado.getString("email");
                telefone = resultado.getString("telefone");
                
               Clientes tela;
               tela = new Clientes(Cnpj, nome, cidade, cep, email, telefone,operacao);
               tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }      
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnBloco;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnSair1;
    private javax.swing.JLabel imagem;
    private javax.swing.JMenuItem itmAdicinarCliente;
    private javax.swing.JMenuItem itmAdicionarFuncionario;
    private javax.swing.JMenuItem itmAlterarCliente;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmExcluirCliente;
    private javax.swing.JMenuItem itmExcluirFuncionario;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmListaCliente;
    private javax.swing.JMenuItem itmListaFuncionario;
    private javax.swing.JMenuItem itmListaProdutos;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSair1;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JMenu mnuProdutos;
    // End of variables declaration//GEN-END:variables
}
