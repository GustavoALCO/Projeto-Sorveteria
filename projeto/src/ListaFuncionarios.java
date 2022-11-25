


import Dao.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListaFuncionarios extends javax.swing.JFrame {

    
    public ListaFuncionarios() {
        initComponents();
       
        preencherTabela();
    }
    
    private void preencherTabela(){
        try {
           
             SistemaDao dao;
             dao = new SistemaDao();
             ResultSet resultado = dao.listarUsuarios();
            
            //3 - Carregar os usuários na tabela tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblFuncionarios.getModel();
            tblModelo.setRowCount(0); //limpa a tabela
            //fazer até chegar no final da tabela (enquanto tiver próximo usuário)
            while(resultado.next()){
                Object dados[] = {
                  resultado.getString("id"),
                  resultado.getString("senha"),
                  resultado.getString("nome"),
                  resultado.getString("cargo"),
                  resultado.getString("salario"),
                  resultado.getString("administrador")
                };
                tblModelo.addRow(dados);
            }
            //4 - Desconectar do banco de dados       
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtIdFuncionario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Funcionarios");
        getContentPane().setLayout(null);

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Senha", "Nome", "Cargo", "Salario", "Administrador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFuncionarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 910, 390);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Caladea", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 30, 90, 30);
        getContentPane().add(txtIdFuncionario);
        txtIdFuncionario.setBounds(70, 30, 160, 30);

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 12)); // NOI18N
        jLabel1.setText("Digite o Id ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 70, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\Cor solida de fundo.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 510);

        setSize(new java.awt.Dimension(936, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String c;
        c = txtIdFuncionario.getText();
        
        SistemaDao dao;
        dao = new SistemaDao();
       if (txtIdFuncionario.getText().equals("")) {
            preencherTabela();
            txtIdFuncionario.requestFocus();
            return; 
        }
        try {
            ResultSet resultado = dao.buscarFuncionarioId(c);
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblFuncionarios.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[]
                        = {
                            resultado.getString("id"),
                            resultado.getString("senha"),
                            resultado.getString("nome"),
                            resultado.getString("cargo"),
                            resultado.getString("salario"),
                            resultado.getString("administrador")
                        };
                tblModelo.addRow(dados);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtIdFuncionario;
    // End of variables declaration//GEN-END:variables
}
