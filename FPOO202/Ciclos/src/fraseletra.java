import java.util.Scanner;
public class fraseletra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese una frase: ");
    String frase = sc.nextLine();
    System.out.println("Ingrese una letra: ");
    char letra = sc.nextLine().charAt(0);
    int contador = 0;
for (int i = 0; i < frase.length(); i++) {
   if (frase.charAt(i) == letra) {
       contador++;
   }

}
        System.out.println("Cantidad de letras "+ letra +" en la frase: "+contador);
    }

}
