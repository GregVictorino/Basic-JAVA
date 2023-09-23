import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {


        float c, ht, vrp, sl;
        Scanner input = new Scanner(System.in);
        System.out.println("insira o cadastro :");
        c= input.nextFloat();
        System.out.println("insira as horas trabalhadas :");
        ht= input.nextFloat();
        System.out.println("insira o valor que recepe por hora :");
        vrp= input.nextFloat();
        sl=ht*vrp;
        System.out.println("o funcionario de cadrastro " +c +  " tem salário de : " +sl);


    }
}