package dev.com.Java10x.CadastroDeNinjas;

import jakarta.persistence.*;

//Ele faz a classe de Entidade para o BD(Banco De Dados)
@Entity
@Table(name = "tb_cadastro") // Nomeia nossa tabela para o banco de dados
public class NinjaModel {

    @Id // Agora com estas anotações o Java proprio cuida do Id assim nao precisando que nos modifiquemos ela fara automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica a forma de contar o ID( EX: 1,2,3,4...)
    private Long Id;
    private String Nome;
    private String Email;
    private int idade;

    public NinjaModel(String nome, String email, int idade) {
        Nome = nome;
        Email = email;
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
