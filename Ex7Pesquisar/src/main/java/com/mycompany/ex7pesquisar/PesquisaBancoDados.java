package com.mycompany.ex7pesquisar;

/**
 *
 * @author Ferna
 */
public class PesquisaBancoDados implements Pesquisavel {
    String[] bancoDeDados = {"Vinicius", "Fernanda", "Bart", "Alice", "Suzi", "Tobi"};
    
    public void pesquisar(String palavraChave) {
        for (int i = 0; i < bancoDeDados.length; i++) {
            if (palavraChave == bancoDeDados[i]) {
               System.out.println("Palavra encontrada na posição " + i);
               break;
           }
        }
    }
}
