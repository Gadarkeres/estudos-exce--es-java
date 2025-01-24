package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {
    public static void main(String[] args) {
        var cliente = new Cliente("João");
        var conta = new Conta(cliente, new BigDecimal(150));

        var operacaoSaque = new OperacaoSaque(conta, new BigDecimal(150));

        Thread saqueJoao = new Thread(operacaoSaque);
        Thread saqueMaria = new Thread(operacaoSaque);


        saqueJoao.start();
        saqueMaria.start();


    }
}
