package dev.java10x.CadastroDeClientes;

public class ClienteModel {

    Long id;
    String nome;
    String email;
    int idade;

 public ClienteModel(){
 }

 public ClienteModel(String nome, String email, int idade){
    this.nome = nome;
    this.email = email;
    this.idade = idade;
 }

}