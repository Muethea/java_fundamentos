# Repositório de Fundamentos Java

Bem-vindo ao repositório de Fundamentos Java! Este repositório tem como objetivo fornecer uma introdução aos conceitos básicos de programação em Java. Aqui, você encontrará exemplos e explicações sobre tópicos fundamentais, incluindo classes, polimorfismo, herança, encapsulamento e outros conceitos essenciais da linguagem Java.

## Conteúdo

1. [**Classes em Java**](#1-classes-em-java)
2. [**Herança**](#2-herança)
3. [**Polimorfismo**](#3-polimorfismo)
4. [**Encapsulamento**](#4-encapsulamento)
5. [**Outros Conceitos**](#5-outros-conceitos)

## 1. Classes em Java

Java é uma linguagem orientada a objetos, e a unidade básica de programação é a classe. Classes são usadas para organizar o código de maneira eficiente e modular. Abaixo está um exemplo simples de uma classe Java:

```java
public class MinhaClasse {
    // Código da classe aqui
}


public class ClasseFilha extends ClassePai {
    // Código da classe filha aqui
}


public class MinhaClasse {
    void meuMetodo() {
        // Código do método
    }
}

public class MinhaClasse {
    private int minhaVariavel;
    
    public int getMinhaVariavel() {
        return minhaVariavel;
    }

    public void setMinhaVariavel(int valor) {
        this.minhaVariavel = valor;
    }
}
