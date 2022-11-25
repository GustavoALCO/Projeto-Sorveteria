package Dados;

public class Funcionario {
    private String id;
    private String senha;
    private String nome;
    private String cargo;
    private double salario;
    private String administrador;
    
    
    public Funcionario() {
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario; 
    }
    
    public void setAdministrador(String administrador){
        this.administrador = administrador;
    }
    
    public String getAdministrador(){
        return administrador;
    }
}
