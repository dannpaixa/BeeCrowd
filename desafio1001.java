import java.util.Scanner;

public class desafio1001 {
    public static void main(String[] args)
    {
    /*Criar 2 variáveis para input de números inteiros, e uma variável para imprimir na tela o resultado
      da soma dessas 2 variáveis
    */
     Scanner scanner = new Scanner(System.in);

      int a, b, x;

      System.out.println("numero 1: ");
      a = scanner.nextInt();

      System.out.println("numero 2: ");
      b = scanner.nextInt();

      x = a+b;

    System.out.println("X = "+x);
      scanner.close();
    } 
}