package com.mycompany.ex9valid;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Validavel email = new ValidadorEmail();
        
        email.validar("fernanda.hallmann@gmail.com");
    }
}
