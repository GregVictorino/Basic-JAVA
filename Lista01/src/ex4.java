import java.util.Scanner;
public class ex4 {
    public static void main (String [] args){
        float n1,n2,s1,s2;
        Scanner input = new Scanner(System.in);
        System.out.println("insira o  número 1: ");
        n1 =input.nextFloat();
        System.out.println("insira o número 2");
        n2 =input.nextFloat();
        s1= n1+1;
        s2= n2+1;
        System.out.println("o sucessor de n1 é: " +s1 + " e o sucessor de n2 é : " +s2);


    }
}
