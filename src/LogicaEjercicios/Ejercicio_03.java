/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaEjercicios;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author daveh
 */
public class Ejercicio_03 {
    public static void jugar(){
        SecureRandom azar = new SecureRandom();
        Scanner leer = new Scanner(System.in);
        
        String digito1 = String.valueOf(azar.nextInt(10)); 
        String digito2 = String.valueOf(azar.nextInt(10));
        String digito3 = String.valueOf(azar.nextInt(10));
        String codigoSecreto = digito1 + digito2 + digito3;
        
        int sumaSecreto = Character.getNumericValue(codigoSecreto.charAt(0)) +
                          Character.getNumericValue(codigoSecreto.charAt(1)) +
                          Character.getNumericValue(codigoSecreto.charAt(2));

        int intentosMaximos = 10;
        boolean acertó = false;

        System.out.println("Cofre tesoro");
        System.out.println("Adivine el codigo de 3 digitos");

        for (int intentoActual = 1; intentoActual <= intentosMaximos; intentoActual++) {
            String intentoUsuario = "";
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.print("\nIntento " + intentoActual + "/" + intentosMaximos + " - Ingrese un código de 3 dígitos: ");
                intentoUsuario = leer.nextLine().trim();

                if (intentoUsuario.isEmpty()) {
                    System.out.println("Error: La entrada no puede estar vacía.");
                    continue;
                }

                if (intentoUsuario.length() != 3) {
                    System.out.println("Error: Debe tener exactamente 3 caracteres de longitud.");
                    continue;
                }

                boolean todosDigitos = true;
                for (int i = 0; i < intentoUsuario.length(); i++) {
                    if (!Character.isDigit(intentoUsuario.charAt(i))) {
                        todosDigitos = false;
                        break;
                    }
                }

                if (!todosDigitos) {
                    System.out.println("Error: Todos los caracteres deben ser numéricos.");
                } else {
                    entradaValida = true;
                }
            }

            
            if (intentoUsuario.equals(codigoSecreto)) {
                acertó = true;
                System.out.println("\n" + "*".repeat(45));
                System.out.println("Adivinaste el cogio: " + codigoSecreto);
                System.out.println("*".repeat(45));
                break; 
            }

            System.out.println("\n" + "-".repeat(40)); 
            System.out.println(" PISTAS PARA EL INTENTO " + intentoActual);
            System.out.println("-".repeat(40));

            int coincidenciasPosicion = 0;
            for (int i = 0; i < 3; i++) {
                if (intentoUsuario.charAt(i) == codigoSecreto.charAt(i)) {
                    coincidenciasPosicion++;
                }
            }
            System.out.println("1. Posición: " + coincidenciasPosicion + " dígito(s) en la posición correcta.");

            int sumaIntento = 0;
            for (int i = 0; i < 3; i++) {
                sumaIntento += Character.getNumericValue(intentoUsuario.charAt(i));
            }

            System.out.print("2. Sumatoria: La suma de tus dígitos (" + sumaIntento + ") es ");
            if (sumaIntento > sumaSecreto) {
                System.out.println("MAYOR que la suma del código secreto.");
            } else if (sumaIntento < sumaSecreto) {
                System.out.println("MENOR que la suma del código secreto.");
            } else {
                System.out.println("IGUAL a la suma del código secreto.");
            }
            System.out.println("-".repeat(40) + "\n");
        }

        if (!acertó) {
            System.out.println("=".repeat(45));
            System.out.println("Ya no tienes intentos el odigo era " + codigoSecreto);
            System.out.println("=".repeat(45));
        }
    }
}
