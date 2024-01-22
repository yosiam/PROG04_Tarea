/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog04_ejerc2;

import java.util.Scanner;

/**
 *
 * @author Joseme
 */
public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            // Leer número desde el teclado
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            // Verificar si es negativo
            if (numero < 0) {
                System.out.println("El número es negativo");
            } else {
                // Verificar si es primo
                boolean esPrimo = esPrimo(numero);
                
                if (esPrimo) {
                    System.out.println("El número es primo");
                } else {
                    System.out.println("El número no es primo");
                }
            }
        }
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
