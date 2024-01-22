/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog04_ejerc5;

import java.util.Scanner;

/**
 *
 * @author Joseme
 */
public class Divisiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorDivisiones = 0;

        while (true) {
            try {
                // Solicitar dividendo y divisor
                System.out.print("Ingrese el dividendo (-1 para salir): ");
                int dividendo = scanner.nextInt();

                if (dividendo == -1) {
                    break; // Salir del bucle si el dividendo es -1
                }

                System.out.print("Ingrese el divisor: ");
                int divisor = scanner.nextInt();

                // Realizar la división
                int resultado = dividir(dividendo, divisor);

                // Mostrar resultado
                System.out.println("Resultado de la división: " + resultado);

                // Incrementar el contador de divisiones
                contadorDivisiones++;
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por 0. Inténtalo de nuevo.");
            } catch (Exception e) {
                System.out.println("Error: Ingresa números enteros válidos. Inténtalo de nuevo.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }

        // Mostrar el número de divisiones calculadas
        System.out.println("Número total de divisiones calculadas: " + contadorDivisiones);
    }

    // Método para realizar la división con control de división por 0
    private static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("División por 0 no permitida");
        }
        return dividendo / divisor;
    }
}
