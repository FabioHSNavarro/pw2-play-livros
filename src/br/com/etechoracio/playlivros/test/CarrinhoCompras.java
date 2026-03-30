package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;

public class CarrinhoCompras {
    static void main(){
        Livro primeirolivro = new Livro();
        primeirolivro.titulo = "COM SE TORNAR UM SIGMA DA BAHIA!";
        primeirolivro.autor = "Skibt Toiled";
        primeirolivro.duracao = LocalTime.of(6, 7);
        primeirolivro.preco = 67.67;
        primeirolivro.resumo = "MUITO TUFF!!!";
        primeirolivro.narrador = "SIGMA DA BAHIA!";
        primeirolivro.versao = VersaoEnum.INTEGRAL;
        System.out.println(primeirolivro);
    }
}
