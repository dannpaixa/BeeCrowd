import java.util.Scanner;
import java.util.Locale;

public class desafio1002 {
    public static void main(String[] args) {
    /* Apresente a mensagem "A=" seguida do valor da variável, conforme exemplo abaixo, 
    *com quatro casas após a ví­rgula. Use todas as variáveis com taxa de precisão double.
    */
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);
    double R, A;
    double pi = 3.14159;

    System.out.print("");
    R = entrada.nextDouble(); // Recebe o valor escrito pelo usuário no terminal
    
    
    //A =  pi*(R*R); //Classe e método responsáveis por calcular o quadrado de X variável
    A = pi*Math.pow(R, 2);
    //DecimalFormat df = new DecimalFormat("A=");
    //df.setMaximumFractionDigits(4);
    //System.out.println(df.format(A));
    
    System.out.printf("A=%.4f\n", A);
    /*O printf é o método que permite formatar o tipo de String que serão impressa
     * Neste caso, depois do ponto decimal, serão impressas 4 casas
    */
    
    entrada.close();

    }
} 
