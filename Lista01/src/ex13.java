import java.util.Scanner;
public class ex13 {
    public static void main (String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        System.out.println("insira o número 1");
        n1 = input.nextInt();
        System.out.println("insira o número 2");
        n2 = input.nextInt();
        System.out.println("insira o número 3");
        n3 = input.nextInt();
        if((n1 > n2) && (n1 > n3)){
            System.out.println("o maior número é " +n1);
        }
        // o segundo número é o maior?
        else if((n2 > n2) && (n2 > n3)){
            System.out.println("o maior número é " +n2);
        }
        // o terceiro número é o maior?
        else if ((n3 > n1) && (n3 > n2)){
            System.out.println("o maior número é " +n3);
        }



        System.out.println("\n");
    }
}



