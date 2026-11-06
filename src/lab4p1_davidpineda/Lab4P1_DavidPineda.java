/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_davidpineda;

import java.util.Scanner;
import LogicaEjercicios.Ejercicio_01;

/**
 *
 * @author daveh
 */
public class Lab4P1_DavidPineda {

    /**
     * @param args the command line arguments
     */
    public static void mostrarMenu() {
        String menu = """
            Main Menu
            1. Tragamonedas
            2. Batallas Navales
            3. Cofre del tesoro
            0. Salir

            Ingrese opcion de Menu: """;

        System.out.print(menu);
    }

    public static int OpcMenu(Scanner leer) {
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1 -> {
                
                System.out.println("Seleccionaste Tragamonedas");
            }

            case 2 -> {
                
                System.out.println("Seleccionaste Batallas Navales");
            }

            case 3 -> {
                
                System.out.println("Seleccionaste Cofre del tesoro");
            }

            case 0 -> {
                System.out.println("FIN DE PROGRAMA");
            }

            default -> {
                System.out.println("elegir ocpcion valida");
            }
        }

        return opcion;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = OpcMenu(leer);

        } while (opcion != 0);

        leer.close();
    }}
