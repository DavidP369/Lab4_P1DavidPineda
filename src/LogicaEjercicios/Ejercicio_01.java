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
public class Ejercicio_01 {

    public static void jugar() {
        int fichasUsuario = 50;
        Scanner leer = new Scanner(System.in);
        String opcMenu;

        do {

            System.out.println("Tragamonedas");
            System.out.println("Fichas actuales: " + fichasUsuario);
            System.out.println("Desea girar los rodillos? (Cuesta 10 fichas) S/N");
            opcMenu = leer.nextLine();

            SecureRandom azar = new SecureRandom();
            int numeroRandom1 = azar.nextInt(7);
            int numeroRandom2 = azar.nextInt(7);
            int numeroRandom3 = azar.nextInt(7);

            System.out.println("[" + numeroRandom1 + "]" + "=======" + "[" + numeroRandom2 + "]" + "=======" + "[" + numeroRandom3 + "]");
            if (numeroRandom1 == numeroRandom2 && numeroRandom2 == numeroRandom3) {
                System.out.println("JACKPOT GANASTE 100 fichas");
                fichasUsuario += 90;
                System.out.println("Las fichas totales son" + fichasUsuario);
                System.out.println("Continuar? S/N");
                opcMenu = leer.nextLine();
            } else if (numeroRandom1 == numeroRandom2 || numeroRandom1 == numeroRandom3 || numeroRandom2 == numeroRandom3) {
                System.out.println("Casi! dos numeros son iguales, has ganado 20 fichas");
                fichasUsuario += 10;
                System.out.println("Las fichas totales son" + fichasUsuario);
                System.out.println("Continuar? S/N");
                opcMenu = leer.nextLine();
            } else if (numeroRandom1 != numeroRandom2 || numeroRandom1 != numeroRandom3 || numeroRandom2 != numeroRandom3) {
                System.out.println("Mejor suerte a la sigiente");
                fichasUsuario -= 10;
                System.out.println("Fichas actuales" + fichasUsuario);
                System.out.println("Continuar? S/N");
                opcMenu = leer.nextLine();
            } else if (fichasUsuario >=10) {
                System.out.println("Ya no tienes fichas suficientes para jugar");
                break;
            }

        } while (opcMenu.equalsIgnoreCase("s"));

    }

}
