import java.util.Scanner;

public class bitacora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cuenta = 0;
        System.out.println("Ingrese la operacion.");
        while (true) {
            String bitacora = sc.nextLine();
            if (bitacora.isEmpty()) {
                break;
            }
            String[] partes = bitacora.split(" ");
            if (partes.length != 2) {
                System.out.println("Formato incorrecto. Intente de nuevo.");
                continue;
            }
            String operacion = partes[0];
            int ingreso;
            try {
                ingreso = Integer.parseInt(partes[1]);
            } catch (NumberFormatException e) {
                System.out.println("Operacion no valida.");
                continue;
            }
            if (operacion.equals("D")) {
                cuenta += ingreso;
            } else if (operacion.equals("R")) {
                if (ingreso <= cuenta) {
                    cuenta -= ingreso;
                } else {
                    System.out.println("Operacion no valida.");
                }
            } else {
                System.out.println("Operación no inválida.");
            }

            System.out.println("Cuenta actual: " + cuenta);
        }
        System.out.println("Cuenta final: " + cuenta);
        sc.close();
    }
}