
package Modelo;


public class portfolio {
    private String nome;
    private String endereco;
    private String email;
    private String empresa;
    private String cidade;
    private String mensagem;
    
    //set
    public void setNome(String nome){this.nome=nome;}
    public void setEndereco(String endereco){this.endereco=endereco;}
    public void setEmail(String email){this.email=email;}
    public void setEmpresa(String empresa){this.empresa=empresa;}
    public void setCidade(String cidade){this.cidade=cidade;}
    public void setMensagem(String mensagem){this.mensagem=mensagem;}
    
    //get
    public String getNome(){return nome;}   
    public String getEndereco() {return endereco;}
    public String getEmail() {return email;}
    public String getEmpresa() {return empresa;}
    public String getCidade() {return cidade;}
    public String getMensagem() {return mensagem;}
    
    
}
