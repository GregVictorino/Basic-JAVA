import java.sql.SQLOutput;
import java.util.Scanner;
public class ex12 {
    public static void main (String[] args){
        float L,R,qL,cR;
        double pi= 3.14159;
        Scanner input =new Scanner(System.in);
        System.out.println("insira L");
        L = input.nextFloat();
        System.out.println("insira R");
        R = input.nextFloat();
        qL=L*L;
        cR= (float) (pi*(R*R));
        if(qL>cR) {
            System.out.println("o maior é o QUADRADO");
        } else{
                System.out.println("o maior é o CÍRCULO");
            }


            }
        }

