import java.util.Scanner;
public class ex10 {
    public static void main (String [] args){
        float c = 0.15f;
        float n,sf,tv,st;
        Scanner input = new Scanner (System.in);
        System.out.println("insira o nome do vendedor ");
        n=input.nextFloat();
        System.out.println("insira o salário fixo desse vendedor ");
        sf= input.nextFloat();
        System.out.println("insira o total de vendas desse vendedor em dinheiro ");
        tv= input.nextFloat();
        st= (float) (sf+(tv*c));
        System.out.println("o salário de " +n +"é de R$: " +st);




    }
}
