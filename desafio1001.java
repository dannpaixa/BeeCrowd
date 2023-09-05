import java.util.Scanner;

public class desafio1001 {
    public static void main(String[] args)
    {
    /*Criar 2 variÃ¡veis para input de nÃºmeros inteiros, e uma variÃ¡vel para imprimir na tela o resultado
      da soma dessas 2 variÃ¡veis
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