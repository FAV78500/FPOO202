//zona de importacion//
import java.util.Scanner;
//Clase principal
public class Main {
    //Metodo Main
    public static void main(String[] args) {
        System.out.println("Hola mundo soy Fernando viva korn, deftones, el metal y las goticas");
        /*Comentario
        Comentario
        comentario*/

        /*2. Cadenas
        String cadena= "fernando " + " avila " + " valencia ";
        System.out.println(cadena);
        System.out.println(cadena.length());*/

        /*Extraccion de caracteres en base a parametros

       System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));*/


        /*3. variables
        String cadena = "333", cadena2;
        int entero = 3,entero2,entero3;
        double decimal=3.3, decimal2,decimal3;

        //convertir cadena a int
        entero2=Integer.parseInt(cadena);
        System.out.println(entero2);
        //Convertir double a int
        entero3=(int) decimal;
        System.out.println(entero3);

        //convertir double a cadena

        cadena2= String.valueOf(decimal);
        System.out.println(cadena2);

        //convertir int a double
        decimal2=Double.valueOf(entero);
        System.out.println(decimal2);*/

        //4. solicitud de datos
        Scanner scn= new Scanner(System.in);
        System.out.println("Escriba una cadena");
        String cadena= scn.nextLine();

        System.out.println("Escribe un numero entero");
        int entero= scn.nextInt();

        System.out.println("Escribe un numero decimal");
        double decimal= scn.nextDouble();

        //5. boolean, operadores logicos y de comparacion
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        //Operadores logicos
        int x= 3;
        System.out.println(x<5 && x>10);
        System.out.println(x<5 || x>10);
        System.out.println(!(x<5 && x>10));
        System.out.println(!(x<5 || x>10));


    }
}