package dev.java10x.CadastroDeClientes.Carros;

import dev.java10x.CadastroDeClientes.Clientes.ClienteModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carro")

public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nome;
     private String tipo;
     private int ano;
     private String descricao;

     // um carro pode ter somente um cliente
     @ManyToOne
     @JoinColumn(name = "clientes_id") // Foreing Key ou Chave estrangeira
     private List<ClienteModel> clientes;


}
