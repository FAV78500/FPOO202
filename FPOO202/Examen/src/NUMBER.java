import java.util.Scanner;

public class NUMBER {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero entre 200 y 400: ");
            int num = sc.nextInt();
            for (int i = num; i <= 400; i++) {
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
    }
}
