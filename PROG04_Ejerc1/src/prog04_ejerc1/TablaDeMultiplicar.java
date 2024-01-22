/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog04_ejerc1;

import java.util.Scanner;

/**
 *
 * @author Joseme
 */
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número desde el teclado
        System.out.print("Ingrese un número (menor que 30): ");
        int numero = scanner.nextInt();

        // Verificar si el número es menor que 30
        if (numero >= 30) {
            System.out.println("El número ingresado debe ser menor que 30. Programa finalizado.");
        } else {
            // Método 1: Bucle for
            System.out.println("Tabla de multiplicar usando bucle for:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            // Método 2: Bucle while
            System.out.println("\nTabla de multiplicar usando bucle while:");
            int j = 1;
            while (j <= 10) {
                System.out.println(numero + " x " + j + " = " + (numero * j));
                j++;
            }

            // Método 3: Bucle do-while
            System.out.println("\nTabla de multiplicar usando bucle do-while:");
            int k = 1;
            do {
                System.out.println(numero + " x " + k + " = " + (numero * k));
                k++;
            } while (k <= 10);
        }
    }
}
