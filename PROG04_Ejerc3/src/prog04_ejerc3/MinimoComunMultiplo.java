/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog04_ejerc3;

import java.util.Scanner;

/**
 *
 * @author Joseme
 */
public class MinimoComunMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer dos números desde el teclado
        System.out.print("Ingrese el primer número positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número positivo: ");
        int num2 = scanner.nextInt();

        // Verificar que ambos números son positivos
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Ambos números deben ser positivos. Programa finalizado.");
        } else {
            // Calcular el MCM
            int mcm = calcularMCM(num1, num2);

            // Mostrar el resultado
            System.out.println("El MCM de " + num1 + " y " + num2 + " es: " + mcm);
        }
    }

    // Método para calcular el Mínimo Común Múltiplo (MCM) de dos números
    private static int calcularMCM(int num1, int num2) {
        return (num1 * num2) / calcularMCD(num1, num2);
    }

    // Método para calcular el Máximo Común Divisor (MCD) de dos números (Algoritmo de Euclides)
    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
