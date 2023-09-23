import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        float n1, n2, UMmaiorQ2, DOISmaiorQ1;
        Scanner input = new Scanner(System.in);
        System.out.println("escreva n1");
        n1 = input.nextFloat();
        System.out.println("escreva n2");
        n2 = input.nextFloat();
        UMmaiorQ2 = n1 / n2;
        DOISmaiorQ1 = n2 / n1;
        if (n1 > n2)
        {
            System.out.println("a divisão de n1 por n2 é: " + UMmaiorQ2);
        }else{
            System.out.println("a divisão de n2 por n1 é :"+DOISmaiorQ1);


        }
    }
}
