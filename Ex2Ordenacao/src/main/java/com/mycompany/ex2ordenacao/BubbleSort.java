package com.mycompany.ex2ordenacao;

/**
 *
 * @author Ferna
 */
public class BubbleSort implements Ordenavel {
    public int[] ordenar(int[] vetor) {
        boolean houveTroca = true;
        
        while(houveTroca) {
            houveTroca = false;
            
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i+1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    houveTroca = true;
                }
            }
        }
        
        return vetor;
    } 
}
