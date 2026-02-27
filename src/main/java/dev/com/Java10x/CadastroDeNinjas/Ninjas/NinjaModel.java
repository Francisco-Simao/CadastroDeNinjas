package dev.com.Java10x.CadastroDeNinjas.Ninjas;

import dev.com.Java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Ele faz a classe de Entidade para o BD(Banco De Dados)
@Entity
@Table(name = "tb_cadastro")// Nomeia nossa tabela para o banco de dados
@Data // Cria todos os GETTERS E SETTERS
@NoArgsConstructor // Cria um construtor vazio
@AllArgsConstructor // Cria um construtor com todos os atributos
public class NinjaModel {

    @Id // Agora com estas anotações o Java proprio cuida do Id assim não precisando que nos modifiquemos ela fara automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica a forma de contar o ID( EX: 1,2,3,4...)
    private Long Id;
    private String Nome;
    private String Email;
    private int idade;

    // ManyToOne - Para que um Ninja tenha uma unica misssão - Muitos Para Um
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key - Chave Estrangeira - relaciona esta tabela com a tabela do MissoesModel
    private MissoesModel missoes;

}
