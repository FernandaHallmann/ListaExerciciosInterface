package com.mycompany.ex3armazena;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Armazenavel arquivo = new ArquivoCache();
        
        arquivo.carregar();
        arquivo.salvar();
    }
}
