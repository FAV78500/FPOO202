import java.util.Scanner;

public class arbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de asteriscos en la base (debe ser impar): ");
        int base = sc.nextInt();


        if (base % 2 == 0) {
            System.out.println("Por favor, ingrese un número impar.");
            return;
        }

        int espacios = base / 2;
        int asteriscos = 1;
        // Dibujar la copa del árbol
        while (asteriscos <= base) {
            // Imprimir los espacios antes de los asteriscos
            int i = 0;
            while (i < espacios) {
                System.out.print(" ");
                i++;
            }

            // Imprimir los asteriscos
            int j = 0;
            while (j < asteriscos) {
                System.out.print("*");
                j++;
            }

            // Saltar a la siguiente línea
            System.out.println();

            // Reducir espacios y aumentar la cantidad de asteriscos
            espacios--;
            asteriscos += 2;
        }

        // Dibujar el tronco del árbol (centrado)
        int troncoAltura = 2; // Número de filas del tronco
        int troncoAncho = 1; // Número de asteriscos en el tronco
        espacios = base / 2; // Centrar el tronco

        int k = 0;
        while (k < troncoAltura) {
            int m = 0;
            while (m < espacios) {
                System.out.print(" ");
                m++;
            }

            int n = 0;
            while (n < troncoAncho) {
                System.out.print("*");
                n++;
            }

            System.out.println();
            k++;
        }

        sc.close();
    }
}