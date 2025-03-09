import java.util.Scanner;
public class triangulo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un numero ");
    int numero = sc.nextInt();
for (int i = 1; i <= numero; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
}
}

