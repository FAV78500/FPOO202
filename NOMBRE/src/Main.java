import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nombre;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        nombre = scaner.nextLine();
        String minus = nombre.toLowerCase();
        String mayus = nombre.toUpperCase();
        String[] blmay = nombre.split(" ");
        StringBuilder name = new StringBuilder();
        for(String blmays : blmay){
            String PL = blmays.substring(0, 1).toUpperCase();
            String RP = blmays.substring(1).toLowerCase();
        name.append(PL).append(RP).append(" ");
        }

        System.out.println(minus);
        System.out.println(mayus);
        System.out.println(name.toString().trim());
    }
}