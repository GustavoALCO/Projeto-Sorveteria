
import Dao.SistemaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alves
 */
public class ListaClientes extends javax.swing.JFrame {

    /**
     * Creates new form ListaClientes
     */
    public ListaClientes() {
        initComponents();
        
        preencherTabela();
    }

   private void preencherTabela(){
        try {
           
             SistemaDao dao;
             dao = new SistemaDao();
             ResultSet resultado = dao.listarClientes();
            
            
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblClientes.getModel();
            tblModelo.setRowCount(0); 
          
            while(resultado.next()){
                Object dados[] = {
                  resultado.getString("cnpj"),
                  resultado.getString("nome"),
                  resultado.getString("cidade"),
                  resultado.getString("cep"),
                  resultado.getString("email"),
                  resultado.getString("telefone")
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
        tblClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCnpjCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Clientes");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNPJ", "Nome", "Cidade", "CEP", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 800, 290);

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 12)); // NOI18N
        jLabel1.setText("Digite o CNPJ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 80, 15);
        getContentPane().add(txtCnpjCliente);
        txtCnpjCliente.setBounds(110, 22, 130, 30);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Caladea", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 23, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\Cor solida de fundo.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 510);

        setSize(new java.awt.Dimension(824, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String c;
        c = txtCnpjCliente.getText();
        
        SistemaDao dao;
        dao = new SistemaDao();
        try {
            ResultSet resultado = dao.buscarClienteCnpj(c);
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblClientes.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[]
                        = {
                            resultado.getString("cnpj"),
                            resultado.getString("nome"),
                            resultado.getString("cidade"),
                            resultado.getString("cep"),
                            resultado.getString("email"),
                            resultado.getString("telefone")
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
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCnpjCliente;
    // End of variables declaration//GEN-END:variables
}
