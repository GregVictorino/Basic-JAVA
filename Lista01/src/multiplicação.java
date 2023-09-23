import java.util.Scanner;
public class multiplicação {

    public static void main(String[] args ) {
        float n1, n2,m;
        Scanner input = new Scanner(System.in);
        System.out.println("insira o n1: ");
         n1 = input.nextFloat();
         System.out.println("insira o n2");
         n2 = input.nextFloat();
         m = n1*n2;
                 System.out.println(("a multiplicação desses números é: " + m));


    }
}
