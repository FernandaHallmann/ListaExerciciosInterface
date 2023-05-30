package com.mycompany.ex5registrar;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Registravel registro = new RegistroConsole();
        
        registro.registrar("Mensagem de log");
    }
}
