import java.util.Scanner;
public class ex11 {
    public static void main (String [] args) {
        float n;
        Scanner input = new Scanner(System.in);
        System.out.println("escreve o número ");
        n = input.nextFloat();
        if (n < 0) {
        System.out.println(" número NEGATIVO");
    }else{
            System.out.println("número POSITIVO");
        }
    }

}
