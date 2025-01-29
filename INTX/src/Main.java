import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int numb;
System.out.println("Ingrese un numero entero: ");
numb = sc.nextInt();
int suma = 0;
for ( int i = 1; i <= numb; i++) {
    suma += i;
    System.out.println(i);
}
System.out.println("El resultado es: " + suma);
    }
}