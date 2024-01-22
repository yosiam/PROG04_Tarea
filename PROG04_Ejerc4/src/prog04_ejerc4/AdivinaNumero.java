/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog04_ejerc4;

import java.util.Scanner;

/**
 *
 * @author Joseme
 */
public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        int numInt = 5; // Valor por defecto
        int numMax = 10; // Valor por defecto
        int numOculto = 0;
        int intentos = 0;

        do {
            // Mostrar menú
            System.out.println("----- Menú -----");
            System.out.println("1. Configurar");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Configurar
                    System.out.print("Ingrese el número de intentos permitidos: ");
                    numInt = scanner.nextInt();
                    System.out.print("Ingrese el número máximo para generar el número oculto: ");
                    numMax = scanner.nextInt();
                    break;
                case 2:
                    // Jugar
                    numOculto = generarNumeroAleatorio(numMax);
                    intentos = jugar(numOculto, numInt);
                    break;
                case 3:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }

    // Método para generar un número aleatorio entre 0 y numMax
    private static int generarNumeroAleatorio(int numMax) {
        return (int) Math.floor(Math.random() * (numMax + 1));
    }

    // Método para jugar a adivinar el número
    private static int jugar(int numOculto, int numInt) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        do {
            System.out.print("Adivina el número (entre 0 y " + numOculto + "): ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numOculto) {
                System.out.println("¡Has ganado! Has necesitado " + intentos + " intentos.");
                break;
            } else if (intento < numOculto) {
                System.out.println("El número oculto es mayor.");
            } else {
                System.out.println("El número oculto es menor.");
            }

            if (intentos == numInt) {
                System.out.println("Perdiste. Se han consumido todos los intentos. El número oculto era: " + numOculto);
                break;
            }
        } while (true);

        return intentos;
    }
}
