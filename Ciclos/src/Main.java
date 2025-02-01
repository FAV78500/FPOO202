import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int numero = sc.nextInt();
        for(int i = 1; i <= numero; i++){
            System.out.println(i);
        }
    }
}