package com.mycompany.ex6criptografia;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Criptografavel cript = new AESCryptografia();
        
        byte[] textoCriptografado = cript.criptografar("Fernanda Hallmann");
        System.out.println("Texto criptografado: " + textoCriptografado);
        System.out.println("Texto descriptografado: " + cript.descriptografar(textoCriptografado));
    }
}
