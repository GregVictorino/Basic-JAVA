import java.util.Scanner;
public class ex3 {
    public static void main (String [] args){
        float n1,n2,sq;
        Scanner input = new Scanner(System.in);
        System.out.println("insira o primeiro número:  ");
        n1 = input.nextFloat();
        System.out.println("insira o segundo número : ");
        n2 = input.nextFloat();
        sq = ((n1*n1)+(n2*n2));
                System.out.println("a soma dos quadrados é :" +sq);

    }
}
