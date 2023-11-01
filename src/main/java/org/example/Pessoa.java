package org.example;

public class Pessoa implements Apresentavel {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void podeDirigir() {
        if (getIdade() >= 18) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }
    }

    public void aniversario() {
        idade++;
    }

    public void cumprimentar() {
        System.out.println("Olá, meu nome é " + nome + ".");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public void apresentar() {
        System.out.println("Eu sou uma pessoa chamada " + nome + ".");
    }
}
