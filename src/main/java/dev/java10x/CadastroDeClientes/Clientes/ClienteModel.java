package dev.java10x.CadastroDeClientes.Clientes;

import dev.java10x.CadastroDeClientes.Carros.CarrosModel;
import jakarta.persistence.*;

import java.util.List;


// Entity ele transforma uma classe em uma entidade do BD
// JPA - Java Persistence api
@Entity
@Table(name = "tb_cadastro")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String email;
    private int idade;

    // um cliente tem vários carros
    @ManyToMany (mappedBy = "carro")
    private CarrosModel carro;

 public ClienteModel(){
 }

 public ClienteModel(String cliente, String email, int idade){
    this.cliente = cliente;
    this.email = email;
    this.idade = idade;
 }
 public String getCliente() {
     return cliente;
 }

 public void setCliente(String cliente) {
     this.cliente = cliente;
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public int getIdade() {
     return idade;
 }
 public void setIdade(int idade) {
     this.idade = idade;
 }
}