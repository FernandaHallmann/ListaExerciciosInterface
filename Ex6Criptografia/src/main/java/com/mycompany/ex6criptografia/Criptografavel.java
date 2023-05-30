package com.mycompany.ex6criptografia;

/**
 *
 * @author Ferna
 */
public interface Criptografavel {
    byte[] criptografar(String dados);
    String descriptografar(byte[] dadosCriptografados);
}
