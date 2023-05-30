package com.mycompany.ex2ordenacao;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Ordenavel bolha = new BubbleSort();
        
        int[] numeros = {45, 65, 12, 40, 87, 55, 22, 8};
        bolha.ordenar(numeros);
        
        System.out.print("Array ordenado");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" - " + numeros[i]);
        } 
    }
}
