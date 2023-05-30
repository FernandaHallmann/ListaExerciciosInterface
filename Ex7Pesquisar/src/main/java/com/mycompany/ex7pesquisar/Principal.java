package com.mycompany.ex7pesquisar;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Pesquisavel pesquisa = new PesquisaBancoDados();
        
        pesquisa.pesquisar("Bart");
    }
}
