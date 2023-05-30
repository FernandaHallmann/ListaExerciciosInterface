package com.mycompany.ex1desenho;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel retangulo = new Retangulo();
        Desenhavel triangulo = new Triangulo();
        
        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }
}
