# Projeto de Programação Orientada a Objetos (POO) em Java

Este projeto de exemplo demonstra conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, incluindo herança, polimorfismo, encapsulamento, tratamento de exceções e o uso de interfaces. O projeto cria uma hierarquia de classes envolvendo diferentes tipos de pessoas, como Pessoa, Estudante, Professor e Engenheiro, e explora suas características e comportamentos.
Estrutura do Projeto

O projeto consiste em várias classes Java que formam uma hierarquia de herança. Aqui está a estrutura geral do projeto:

    Pessoa: A classe base que representa uma pessoa com atributos como nome e idade.

    Estudante: Uma classe que estende Pessoa e representa um estudante. Inclui atributos adicionais, como o curso que está cursando. Implementa a interface Trabalhador para demonstrar herança múltipla.

    Professor: Uma classe que estende Pessoa e representa um professor. Inclui um atributo adicional, a disciplina que leciona.

    Diretor: Uma classe que estende Professor e representa um diretor de departamento. Inclui um atributo adicional, o departamento que administra.

    Engenheiro: Uma classe que estende Pessoa e representa um engenheiro. Implementa a interface Trabalhador para demonstrar herança múltipla.

    Trabalhador: Uma interface que define um método trabalhar() para representar ações relacionadas ao trabalho. Implementada por Estudante e Engenheiro.

Funcionalidades do Projeto

O projeto inclui as seguintes funcionalidades e demonstrações de conceitos de POO:

    Herança: Classes que estendem outras classes para reutilização de código e modelagem hierárquica.

    Polimorfismo: Uso de métodos sobrescritos para implementar comportamentos específicos de subclasses.

    Encapsulamento: Atributos privados com métodos de acesso para controlar o acesso aos dados.

    Tratamento de Exceções: Lançamento e captura de exceções personalizadas (ExameException) durante o uso de métodos.

    Interfaces: Implementação da interface Trabalhador para mostrar herança múltipla e compartilhamento de comportamento.

Executando o Projeto

Para executar o projeto, siga estas etapas:

    Certifique-se de ter o ambiente de desenvolvimento Java configurado em seu sistema.

    Clone o repositório em sua máquina local.

    Abra o projeto em sua IDE Java favorita.

    Compile e execute o arquivo Main.java para ver a demonstração das funcionalidades do projeto.

Contribuições e Melhorias

Sinta-se à vontade para contribuir com este projeto ou fazer melhorias. Você pode adicionar mais classes, métodos ou funcionalidades para expandir a demonstração de conceitos de POO em Java. Esperamos que este projeto seja útil para você ao aprender e ensinar POO em Java.
