package org.example.src.models;

import org.example.interfaces.Apresentavel;
import org.example.exceptions.ExameException;
import org.example.interfaces.Trabalhador;

public class Estudante extends Pessoa implements Apresentavel, Trabalhador {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void fazerExame() throws ExameException {
        if (getIdade() < 18) {
            throw new ExameException("O estudante é menor de idade e não pode fazer o exame.");
        }
        System.out.println("Estudante realizando exame...");
    }

    public void podeDirigir() {
        if (getIdade() >= 18) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }
    }

    public void estudar() {
        System.out.println("Estou estudando " + curso + ".");
    }

    @Override
    public void apresentar() {
        System.out.println("Eu sou um estudante de " + curso + ".");
    }

    @Override
    public void trabalhar() {
        System.out.println("Estou estudando java para conseguir um novo emprego");
    }
}
