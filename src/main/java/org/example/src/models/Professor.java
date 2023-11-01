package org.example.src.models;

import org.example.exceptions.ExameException;

import java.util.Random;

public class Professor extends Pessoa {

    private Random random = new Random();
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void podeDiridir() {
        if (getIdade() >= 21) {
            System.out.println("Pode ensinar");
        } else {
            System.out.println("Não pode ensinar");
        }
    }

    public void ensinar() {
        System.out.println("Estou ensinando a disciplina de " + disciplina + ".");
    }

    public void avaliar(Estudante estudante) {
        try {
            estudante.fazerExame();
            int nota = random.nextInt(11);
            System.out.println("Nota atribuida para o estudande: " + estudante.getNome() + ": " + nota);
        } catch (ExameException e) {
            System.out.println("Erro ao fazer o exame: " + e.getMessage());
        }

    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Eu sou um professor de " + disciplina + " chamado " + getNome() + ".");
    }

}
