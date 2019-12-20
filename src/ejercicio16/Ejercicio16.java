/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio16 {

    /**
     * Escribe una aplicación con un String que contenga una contraseña
     * cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
     * intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
     * mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3
     * intentos y si acierta sale, aunque le queden intentos).
     */
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        String Digitado, Contrasena = "1234";
        int Intentos = 3;

        System.out.println("Digite la contraseña: ");
        Digitado = Teclado.next();
        
        

        while ((Contrasena.equals(Digitado) != true) && (Intentos >= 1)) {
            Intentos--;
            System.out.println("Contraseña incorrecta Digitela otra ves. " + "Intentos Restantes: " + Intentos);
            if (Intentos >= 1) {
                Digitado = Teclado.next();
            } else {
                System.out.println("Has agotado los intentos");
            }
        }
        
        if(Contrasena.equals(Digitado) == true)
            System.out.println("Enhorabuena");

    }

}
