package dev.java10x.CadastroDeClientes;

import jakarta.persistence.*;


// Entity ele transforma uma classe em uma entidade do BD
// JPA - Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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