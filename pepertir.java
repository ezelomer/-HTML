

import java.util.Scanner;

public class pepertir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Arreglo de tamaño 10

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int num : numeros) {
            System.out.println(num);
        }

      
    }
}
