import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = Integer.parseInt(sc.nextLine());
        if (edad < 4) {
            System.out.println("Puede entrar gratis");
        } else{
                if (edad > 4 && edad < 18) {
                    System.out.println("Costo 110 pesos");
                } else {
                    if (edad > 18) {
                        System.out.println("Costo 190 pesos");
                    }
                }
            }
            }
        }