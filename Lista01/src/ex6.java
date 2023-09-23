import java. util.Scanner;
public class ex6 {
    public static void main (String[] args){
       double pi= 3.14159;

        float a,b,c,ra,rb,rc,rd,re,rf;
        Scanner input = new Scanner(System.in);
        System.out.println("insira a,b,c");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        ra = a*c;
        rb = (float) (pi*(c*c));
        rc =((a+b)*c)/2;
        rd =b*b;
        re =a*b;
        rf =2*(a+b);
        System.out.println("resposta letra a :" +ra);
        System.out.println("resposta letra b :" +rb);
        System.out.println("resposta letra c :" +rc);
        System.out.println("resposta letra d :" +rd);
        System.out.println("resposta letra e :" +re);
        System.out.println("resposta letra f :" +rf);




    }
}
