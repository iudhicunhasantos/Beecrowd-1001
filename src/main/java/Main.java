
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ///variavel
    int A, B, X;

        ///entrada
    A = Integer.parseInt(sc.nextLine());
    B = Integer.parseInt(sc.nextLine());
    
    ///processamento
    X = A + B;
    
    ///saida
    System.out.println("X = " + X);
    }
}
