import java.util.Scanner;
public class ex8 {
    public static void main (String [] args){
        float n1,n2,n3,n4,m;
                Scanner input= new Scanner(System.in);
                System.out.println("insira as notas do aluno: ");
                n1= input.nextFloat();
        n2= input.nextFloat();
        n3 = input.nextFloat();
        n4= input.nextFloat();
        m = (n1+n2+n3+n4)/4;
        System.out.println("a média aritimética do aluno é : " +m);



    }
}
