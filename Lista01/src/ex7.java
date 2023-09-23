import java.util.Scanner;
import java.lang.Math;

public class ex7 {
    public static void main (String[] args){
        float a,b,h;
        Scanner input = new Scanner(System.in);
        System.out.println("insira os catetos do triângulo ");
        a= input.nextFloat();
        b= input.nextFloat();
        System.out.println("a hipotenusa é: " + (Math.sqrt((a*a)+(b*b))));


    }
}
