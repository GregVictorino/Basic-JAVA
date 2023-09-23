import java.util.Scanner;
import java.lang.Math;

public class ex2 {

    public static void main (String [] args){
        float b,e,p;
        Scanner input =new Scanner(System.in);
        System.out.println("insira a base");
        b = input.nextFloat();
        System.out.println("insira o expoente");
        e = input.nextFloat();
        System.out.println("a potência é: " + (Math.pow(b, e)));






    }
}
