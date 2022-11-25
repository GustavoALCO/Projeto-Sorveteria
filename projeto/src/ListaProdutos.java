
import Dao.SistemaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListaProdutos extends javax.swing.JFrame {

    
    public ListaProdutos() {
        initComponents();
        
        preencherTabela();
    }

    private void preencherTabela(){
        try {
         
             SistemaDao dao;
             dao = new SistemaDao();
             ResultSet resultado = dao.listarProdutos();
            
           
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblProdutos.getModel();
            tblModelo.setRowCount(0); //limpa a tabela
           
            while(resultado.next()){
                Object dados[] = {
                  resultado.getString("codigo"),
                  resultado.getString("nome"),
                  resultado.getString("embalagem"),
                  resultado.getString("preco") 
                };
                tblModelo.addRow(dados);
            }
            
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
        tblProdutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Produtos");
        getContentPane().setLayout(null);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Embalagem", "Preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 73, 770, 350);

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Caladea", 1, 12)); // NOI18N
        jButton1.setText("Buscar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 30, 80, 30);
        getContentPane().add(txtCodigoProduto);
        txtCodigoProduto.setBounds(101, 32, 130, 30);

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 12)); // NOI18N
        jLabel1.setText("Digite o Codigo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 36, 90, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\alves\\Downloads\\imagens para o trabalho em java\\Cor solida de fundo.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1310, 700);

        setSize(new java.awt.Dimension(793, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String c;
        c = txtCodigoProduto.getText();
        
        SistemaDao dao;
        dao = new SistemaDao();
        try {
            ResultSet resultado = dao.buscarProdutoCodigo(c);
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblProdutos.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[]
                        = {
                            resultado.getInt("codigo"),
                            resultado.getString("nome"),
                            resultado.getString("embalagem"),
                            resultado.getDouble("preco")
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
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCodigoProduto;
    // End of variables declaration//GEN-END:variables
}
