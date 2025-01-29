import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese su nombre ");
String nombre = sc.nextLine();
String mayus = nombre.toUpperCase();
int letras = mayus.length();
System.out.println(mayus + " tiene " +letras + " letras.");
    }
}