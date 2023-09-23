import java.util.Scanner;
public class ex5 {
    public static void main (String [] args) {

        float L,A;
        Scanner input = new Scanner(System.in);
        System.out.println("insira o valor do lado do quadrado: ");
        L = input.nextFloat();
        A= L*L;
        System.out.println("a área do quadrado é : " +A);


    }
}
