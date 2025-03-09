import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();
        String invert = new StringBuilder(palabra).reverse().toString();
        System.out.println(invert);
        if (palabra.equals(invert)) {
            System.out.println("La palabra es: palindromo");
        } else {
            System.out.println("La palabra es: no palindromo");
        }
    }
}