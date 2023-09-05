import java.util.Scanner;
import java.util.Locale;

public class desafio1002 {
    public static void main(String[] args) {
    /* Apresente a mensagem "A=" seguida do valor da variÃ¡vel, conforme exemplo abaixo, 
    *com quatro casas apÃ³s a vÃ­rgula. Use todas as variÃ¡veis â€‹â€‹de precisÃ£o double.
    */
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);
    double R, A;
    double pi = 3.14159;

    System.out.print("");
    R = entrada.nextDouble(); // Recebe o valor escrito pelo usuÃ¡rio no terminal
    
    
    //A =  pi*(R*R); //Classe e mÃ©todo responsÃ¡veis por calcular o quadrado de X variÃ¡vel
    A = pi*Math.pow(R, 2);
    //DecimalFormat df = new DecimalFormat("A=");
    //df.setMaximumFractionDigits(4);
    //System.out.println(df.format(A));
    
    System.out.printf("A=%.4f\n", A);
    /*O printf Ã© o mÃ©todo que permite formatar o tipo de String que serÃ¡ impressa
     * Neste caso, depois do ponto decimal, serÃ¡ impressa 4 casas
    */
    
    entrada.close();

    }
}