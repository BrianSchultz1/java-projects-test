package org.example;


import org.example.src.models.*;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        Estudante estudante1 = new Estudante("Carlos", 20, "Ciências da Computação");
        Professor professor1 = new Professor("Ana", 40, "Matemática");
        Diretor diretor1 = new Diretor("Marta", 50, "Administração", "Recursos Humanos");
        Engenheiro engenheiro1 = new Engenheiro("Lucas", 30);

        pessoa1.aniversario();

        pessoa1.cumprimentar();
        estudante1.cumprimentar();
        professor1.cumprimentar();
        diretor1.cumprimentar();
        engenheiro1.cumprimentar();

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        estudante1.estudar();
        professor1.ensinar();
        diretor1.administrar();
        engenheiro1.trabalhar();
        System.out.println("O curso de " + estudante1.getNome() + " é " + estudante1.getCurso() + ".");

        Pessoa[] pessoas = {pessoa1, estudante1, professor1, diretor1, engenheiro1};

        for (Pessoa pessoa : pessoas) {
            pessoa.apresentar();
            pessoa.podeDirigir();
        }

        professor1.avaliar(estudante1);
    }
}
