package br.com.etechoracio.playlivros.test;

public class TestaReferencias {
    static void main() {
        var idade = 10;
        Livro livroA = new Livro();
        livroA.titulo = "Meu Livro A";
        System.out.println(livroA.titulo);
        Livro livroB = livroA;
        livroB.titulo = "Meu Livro B";
        System.out.println(livroB.titulo);
    }
}
