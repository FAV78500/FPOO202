import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int payasos = 112, muñecas = 75;
        System.out.println("Ingrese la cantidad de payasos vendidos: ");
        int contadorp = sc.nextInt();
        System.out.println("Ingrese la cantidad de muñecas vendidas");
        int contadorm = sc.nextInt();

        int suma = (contadorp * payasos) + (contadorm * muñecas);
        System.out.println("El peso total es de: " + suma + "g");
    }
}