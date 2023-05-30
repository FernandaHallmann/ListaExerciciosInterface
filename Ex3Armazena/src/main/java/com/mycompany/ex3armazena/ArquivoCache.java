package com.mycompany.ex3armazena;

/**
 *
 * @author Ferna
 */
public class ArquivoCache implements Armazenavel {
    public void salvar() {
        System.out.println("Os dados foram salvos");
    }

    public void carregar() {
        System.out.println("Os dados foram carregados");
    }
    
}
