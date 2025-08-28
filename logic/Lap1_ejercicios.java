package logic;

import java.util.*;

public class Lap1_ejercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- MENÚ DE EJERCICIOS ---");
            System.out.println("1. A - Cuadrado con asteriscos");
            System.out.println("2. B - Triangulo invertido");
            System.out.println("3. C - Triangulo invertido alineado a la derecha");
            System.out.println("4. D - Ponga 10 números y ordenar ascendentemente");
            System.out.println("5. E - Generar 100 números y ordenar descendentemente");
            System.out.println("6. F - Mostrar tablero con fichas 'N' y 'R'");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicioA();
                    break;
                case 2:
                    ejercicioB();
                    break;
                case 3:
                    ejercicioC();
                    break;
                case 4:
                    ejercicioD(scanner);
                    break;
                case 5:
                    ejercicioE();
                    break;
                case 6:
                    ejercicioF();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    // ---------------- ejercicio A ----------------
    public static void ejercicioA() {
        int n = 6;
        System.out.println("\nFigura A:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // ---------------- ejercicio B ----------------
    public static void ejercicioB() {
        System.out.println("\nFigura B:");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ---------------- ejercicio C ----------------
    public static void ejercicioC() {
        System.out.println("\nFigura C:");
        for (int i = 10; i >= 1; i--) {
            for (int espacio = 0; espacio < 10 - i; espacio++) {
                System.out.print(" ");
            }
            for (int estrella = 1; estrella <= i; estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // ---------------- ejercicio D ----------------
    public static void ejercicioD(Scanner scanner) {
        System.out.println("\nIngrese 10 números enteros:");

        int[] arreglo = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        Arrays.sort(arreglo);

        System.out.println("Arreglo ordenado ascendentemente:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ---------------- ejercicio E ----------------
    public static void ejercicioE() {
        Integer[] arreglo = new Integer[100];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(1000); // 0 a 999
        }

        Arrays.sort(arreglo, Collections.reverseOrder());

        System.out.println("\nArreglo ordenado descendientemente:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
            if ((i + 1) % 20 == 0) System.out.println(); // Salto de línea cada 20 números
        }
    }

    // ---------------- ejercicio F ----------------
    public static void ejercicioF() {
        String[][] tablero = new String[8][8];

        // Inicializa el tablero sin nada 
        for (int i = 0; i < 8; i++) {
            Arrays.fill(tablero[i], " ");
        }

        // Coloca fichas negras 'N'
        tablero[0][1] = "N"; tablero[0][3] = "N"; tablero[0][5] = "N"; tablero[0][7] = "N";
        tablero[1][0] = "N"; tablero[1][2] = "N"; tablero[1][4] = "N"; tablero[1][6] = "N";
        tablero[2][1] = "N"; tablero[2][3] = "N"; tablero[2][5] = "N"; tablero[2][7] = "N";

        // Coloca fichas rojas 'R'
        tablero[5][0] = "R"; tablero[5][2] = "R"; tablero[5][4] = "R"; tablero[5][6] = "R";
        tablero[6][1] = "R"; tablero[6][3] = "R"; tablero[6][5] = "R"; tablero[6][7] = "R";
        tablero[7][0] = "R"; tablero[7][2] = "R"; tablero[7][4] = "R"; tablero[7][6] = "R";

        // Imprime el tablero
        System.out.println("\nTablero:");
        System.out.print("  ");
        for (int col = 1; col <= 8; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
