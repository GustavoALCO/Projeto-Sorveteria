package Dados;

public class Cliente{
    
private String cnpj;
private String nome;
private String cidade;
private String cep;
private String email;
private String telefone;
  
public Cliente(){
}
  
public String getCnpj(){
return cnpj;
}

public void setCnpj(String cnpj){
    this.cnpj = cnpj;
}   

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getCidade(){
    return cidade;
}

public void setCidade(String cidade){
    this.cidade = cidade;
}

public String getCep(){
    return cep;
}

public void setCep(String cep){
    this.cep = cep;
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
    this.email = email;
}

public String getTelefone(){
    return telefone;
}

public void setTelefone(String telefone){
    this.telefone = telefone;
}
}