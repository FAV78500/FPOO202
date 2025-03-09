import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contracomp = "Contraseña1234";
        System.out.println("Ingrese una contraseña");
        String contraseña = sc.nextLine();
        if (contraseña.equals(contracomp)) {
            System.out.println("Contraseña correcta");
        }
        else {
            System.out.println("Contraseña incorrecta");
        }
    }
}