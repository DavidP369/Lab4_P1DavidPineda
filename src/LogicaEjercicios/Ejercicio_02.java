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
public class Ejercicio_02 {
    public static void jugar(){
        Scanner leer = new Scanner(System.in);
        SecureRandom azar = new SecureRandom();
        int lugarBarco = azar.nextInt(10);
        
        int disparo1;
        int disparo2;
        int disparo3;
        int disparo4;
        int disparo5;
        
        int intentos = 5;
        do {
            System.out.println("Batalla naval");
            System.out.println("Adivina donde esta el barco (1-10)");
            System.out.println("Agua: - - - - - - - - - -");
            System.out.println("Ingrese su disparo(Intento 1): ");
            disparo1 = leer.nextInt();
            if (disparo1 == lugarBarco) {
                System.out.println("Adivinaste el lugar de barco ");
                
            } else {
                System.out.println("AGUA");
            
            
            }
            System.out.println("Ingrese su disparo (Intento 2), disparos fallidos: "+disparo1);
            disparo2 = leer.nextInt();
            if (disparo2 == lugarBarco) {
                System.out.println("Adivinaste el lugar de barco ");
                
            } else {
                System.out.println("AGUA");
            
            
            }
            
            System.out.println("Ingrese su disparo (Intento 3), disparos fallidos: "+disparo1+" "+disparo2);
            disparo3 =  leer.nextInt();
            if (disparo3 == lugarBarco) {
                System.out.println("Adivinaste el lugar de barco ");
                
            } else {
                System.out.println("AGUA");
            
            
            }
            System.out.println("Ingrese su disparo (Intento 4), disparos fallidos: "+disparo1+" "+disparo2+" "+disparo3);
            disparo4 = leer.nextInt();
            if (disparo4 == lugarBarco) {
                System.out.println("Adivinaste el lugar de barco ");
                
            } else {
                System.out.println("AGUA");
                
             System.out.println("Ingrese su disparo (Intento 5), disparos fallidos: "+disparo1+" "+disparo2+" "+disparo3+" "+disparo4);
            disparo5 = leer.nextInt();
            if (disparo5 == lugarBarco) {
                System.out.println("Adivinaste el lugar de barco ");
                
            } else {
                System.out.println("AGUA");
            
            
            }
            
            }
            

            
            
            
            
            
         
                
                
                
            
            
            
            
                
            
            
        } while (intentos == 0);
        if (disparo1 != lugarBarco || disparo2 != lugarBarco || disparo2 != lugarBarco || disparo3 != lugarBarco || disparo4 != lugarBarco ) {
            System.out.println("No adivinaste, el barco estaba en la posicion: "+lugarBarco);
        }
        
    }
    
}
