package org.example.src.models;

import org.example.interfaces.Trabalhador;

public class Engenheiro extends Pessoa implements Trabalhador {

    public Engenheiro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void trabalhar() {
        System.out.println("Estou trabalhando em um projeto de engenharia");
    }
}
