
import java.util.Scanner;
public class ex15 {
    public static void main (String [] args){
      double A,B,C,delta,r1,r2;
        Scanner input =new Scanner(System.in);
        System.out.println("insira o A");
        A=input.nextFloat();
        System.out.println("insira o B");
        B=input.nextFloat();
        System.out.println("insira o C");
        C=input.nextFloat();
        delta= (B*B) -(4*A*C);
        if (2*A==0  && delta<0){
            System.out.println("IMPOSSIVÉL CALCULAR");
        }else{
            r1 = ((-1 * B) + Math.sqrt(delta))/(2*A);
            r2 = ((-1 * B) - Math.sqrt(delta))/(2*A);
            System.out.print("R1 = ");
            System.out.printf("%.5f", r1);
            System.out.print("\nR2 = ");
            System.out.printf("%.5f", r2);
            System.out.print("\n");
        }
    }
}
