import java.util.Scanner;

public class ENTERO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
            System.out.println("Ingrese un NUMERO ");
            numero = sc.nextInt();
        StringBuilder resultado = new StringBuilder();
        for (int i = numero; i >= 0; i--) {
            resultado.append(i);
            if(i>0){
                resultado.append(",");
            }
        }
        System.out.print(resultado.toString());
    }
}