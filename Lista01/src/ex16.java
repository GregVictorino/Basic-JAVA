import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        float hInicial,hFinal;
        Scanner input =new Scanner(System.in);
        System.out.println("insira a hora inicial e final ");
        hInicial =input.nextFloat();
        hFinal= input.nextFloat();
        if (hInicial > hFinal) {
            System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
        } else if (hFinal > hInicial) {
            System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }


    }
}
