import java.util.Scanner;

public class desafio1003 
{
    public static void main(String[] args)
    {
    /* Soma de 2 nÃºmeros inteiros e impressÃ£o na tela utilizando a formataÃ§Ã£o "Soma = "
    imprimindo a end line no final do resultado.
    */
    Scanner scan = new Scanner(System.in);
    int A, B, SOMA;

    System.out.println("");
    A = scan.nextInt();
    System.out.println("");
    B = scan.nextInt();

    SOMA = A+B;
    System.out.println("SOMA = "+SOMA);

    scan.close();
    }
}
