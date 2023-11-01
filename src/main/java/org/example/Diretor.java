package org.example;

public class Diretor extends Professor {
    private String departamento;

    public Diretor(String nome, int idade, String disciplina, String departamento) {
        super(nome, idade, disciplina);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void administrar() {
        System.out.println("Estou administrando o departamento de " + departamento + ".");
    }
    @Override
    public void apresentar() {
        System.out.println("Eu sou um diretor de " + departamento + " chamado " + getNome() + ".");
    }
}
