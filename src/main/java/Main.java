import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numero = sc.nextInt();
      System.out.println("O numero digitado foi");
      System.out.println(numero);
      if (numero > 0) {
      System.out.println("O numero digitado é positivo");                                      
      }
      if (numero < 0) {
      System.out.println("O numero digitado é negativo");
      }
      if (numero == 0) {
      System.out.println("O numero digitado é zero");
      }



     sc.close();
   }
}
