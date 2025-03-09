import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese que accion desea hacer");
        System.out.println("Ingrese 1 para suma");
        System.out.println("Ingrese 2 para resta");
        System.out.println("Ingrese 3 para multiplicacion");
        System.out.println("Ingrese 4 para division");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer numero");
                float num1 = sc.nextFloat();
                System.out.println("Ingrese el segundo numero");
                float num2 = sc.nextFloat();
                float suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    float num3 = sc.nextFloat();
                    System.out.println("Ingrese el segundo numero");
                    float num4 = sc.nextFloat();
                    float resta = num3 - num4;
                    System.out.println("La resta es: " + resta);
                    break;
                    case 3:
                        System.out.println("Ingrese el primer numero");
                        float num5 = sc.nextFloat();
                        System.out.println("Ingrese el segundo numero");
                        float num6 = sc.nextFloat();
                        float multiplicacion = num5 * num6;
                        System.out.println("La multiplicacion es: " + multiplicacion);
                        break;
                        case 4:
                            System.out.println("Ingrese el primer numero");
                            float num7 = sc.nextFloat();
                            System.out.println("Ingrese el segundo numero");
                            float num8 = sc.nextFloat();
                            float division = num7 / num8;
                            System.out.println("La division es: " + division);
                            break;
                            default:
                                    System.out.println("Opcion no valida");
        }


    }
}