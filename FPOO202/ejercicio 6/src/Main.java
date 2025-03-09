import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase ");
        String frase = sc.nextLine();
        String invert = new StringBuilder(frase).reverse().toString();
        System.out.println(invert);
        if(invert.equals(frase)){
            System.out.println("La frase es un palindromo");
        } else {
            System.out.println("La frase no es un palindromo");
        }
    }
}