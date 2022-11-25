package Dao;

import Dados.Cliente;
import Dados.Produto;
import Dados.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

//Para executar as operações CRUD (INSERT, UPDATE, DELETE, SELECT)
public class SistemaDao {

    private Connection conectado;
    private PreparedStatement st;
    private ResultSet resultado;
    private final String url = "jdbc:mysql://localhost:3307/projeto";
    private final String user = "root";
    private final String senha = "admin";

    //Conectar com o banco de dados
    private void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectado = DriverManager.getConnection(url, user, senha);
    }

    //Verificar se o usuário digitado está na tabela do BD
    public ResultSet validarUsuario(String id, String senha) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM funcionarios WHERE id = ? AND senha = ?");
        st.setString(1, id);
        st.setString(2, senha);
        
        resultado = st.executeQuery(); 
        return resultado;
    }

    //Inserir usuário na tabela do BD
    public void salvarFuncionario(Funcionario funcionario) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("INSERT INTO funcionarios VALUES(?,?,?,?,?,?)");
        st.setString(1, funcionario.getId());
        st.setString(2, funcionario.getSenha());
        st.setString(3, funcionario.getNome());
        st.setString(4, funcionario.getCargo());
        st.setDouble(5, funcionario.getSalario());
        st.setString(6,funcionario.getAdministrador());
        st.executeUpdate();
    }

    //Excluir usuário
    public void excluirUsuario(Funcionario funcionario) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("DELETE FROM funcionarios WHERE id = ?");
        st.setString(1, funcionario.getId());
        st.executeUpdate(); //INSERT, UPDATE, DELETE
    }

    //Buscar o usuário
    public ResultSet buscarUsuario(String u) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM funcionarios WHERE id = ?");
        st.setString(1, u);
        resultado = st.executeQuery();
        return resultado;
    }

    public void alterarFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException{
        conectar();
        st = conectado.prepareStatement("UPDATE funcionarios SET senha = ?, nome = ?, cargo = ?, salario = ?, administrador = ? WHERE id = ?");
        st.setString(1, funcionario.getSenha());
        st.setString(2, funcionario.getNome());
        st.setString(3, funcionario.getCargo());
        st.setDouble(4, funcionario.getSalario());
        st.setString(5, funcionario.getAdministrador());
        st.setString(6,funcionario.getId());
        st.executeUpdate();
    }

    //Buscar todos os usuários
    public ResultSet listarUsuarios() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM funcionarios ORDER BY nome DESC");
        resultado = st.executeQuery();
        return resultado;
    }
    
    public ResultSet buscarProdutos(String u) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM produtos WHERE codigo = ?");
        st.setString(1, u);
        resultado = st.executeQuery();
        return resultado;
    }
   public void alterarProduto(Produto produto) throws SQLException, ClassNotFoundException{
        conectar();
        st = conectado.prepareStatement("UPDATE produtos SET nome = ?, embalagem = ?, preco = ? WHERE codigo = ?");
        st.setString(1,produto.getNome());
        st.setString(2, produto.getEmbalagem());
        st.setDouble(3,produto.getPreco());
        st.setInt(4, produto.getCodigo());
        st.executeUpdate();
    }
   public void excluirProdutos(Produto produto) throws SQLException, ClassNotFoundException{
        conectar();
        st = conectado.prepareStatement("DELETE FROM Produtos WHERE Codigo = ?");
        st.setInt( 1, produto.getCodigo());
        st.executeUpdate(); //INSERT, UPDATE, DELETE
   }
   public void salvarProdutos(Produto produto) throws ClassNotFoundException, SQLException
   {
      conectar();
        st = conectado.prepareStatement("INSERT INTO Produtos VALUES(?,?,?,?)");
        st.setInt(1, produto.getCodigo());
        st.setString(2, produto.getNome());
        st.setString(3, produto.getEmbalagem());
        st.setDouble(4, produto.getPreco());
        st.executeUpdate();
    }
   
   public ResultSet listarProdutos() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM produtos ORDER BY codigo DESC");
        resultado = st.executeQuery();
        return resultado;
    }
   
   public void alterarClientes(Cliente cliente) throws SQLException, ClassNotFoundException{
        conectar();
        st = conectado.prepareStatement("UPDATE clientes SET nome = ?, cidade = ?, cep = ?, email = ?, telefone = ? WHERE cnpj = ?");
        st.setString(1, cliente.getNome());
        st.setString(2,cliente.getCidade());
        st.setString(3, cliente.getCep());
        st.setString(4, cliente.getEmail());
        st.setString(5, cliente.getTelefone());
        st.setString(6, cliente.getCnpj());
        st.executeUpdate();
    }
   
   public ResultSet buscarClientes(String u) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM clientes WHERE cnpj = ?");
        st.setString(1, u);
        resultado = st.executeQuery();
        return resultado;
    }
   
    public void salvarClientes(Cliente cliente) throws ClassNotFoundException, SQLException
   {
      conectar();
        st = conectado.prepareStatement("INSERT INTO clientes VALUES(?,?,?,?,?,?)");
        st.setString(1, cliente.getCnpj());
        st.setString(2, cliente.getNome());
        st.setString(3, cliente.getCidade());
        st.setString(4, cliente.getCep());
        st.setString(5, cliente.getEmail());
        st.setString(6, cliente.getTelefone());
        
        st.executeUpdate();  
   }
   
   public void excluirClientes(Cliente cliente) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("DELETE FROM Clientes WHERE cnpj = ?");
        st.setString(1, cliente.getCnpj());
        st.executeUpdate(); 
    }
    public ResultSet listarClientes() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM Clientes ORDER BY cnpj DESC");
        resultado = st.executeQuery();
        return resultado;
    }
   
   public ResultSet buscarFuncionarios(String c) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM funcionarios WHERE id = ?");
        st.setString(1, c);
        resultado = st.executeQuery();
        return resultado;
    }
  public ResultSet buscarProdutoCodigo(String c) throws ClassNotFoundException, SQLException{
       
       conectar();
       
       st = conectado.prepareStatement("SELECT * FROM produtos WHERE codigo LIKE ?");
       st.setString(1, "%" + c + "%");
       resultado = st.executeQuery();
       return resultado;
    } 
  
   public ResultSet buscarClienteCnpj(String c) throws ClassNotFoundException, SQLException{
       
       conectar();
       
       st = conectado.prepareStatement("SELECT * FROM clientes WHERE cnpj LIKE ?");
       st.setString(1, "%" + c + "%");
       resultado = st.executeQuery();
       return resultado;
    } 
   
    public ResultSet buscarFuncionarioId(String c) throws ClassNotFoundException, SQLException{
   
       conectar();
       
       st = conectado.prepareStatement("SELECT * FROM funcionarios WHERE id LIKE ?");
       st.setString(1, "%" + c + "%");
       resultado = st.executeQuery();
       return resultado;
    } 
}
