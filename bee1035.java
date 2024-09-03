import java.util.Scanner;

public class bee1035 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valorA = leitor.nextInt();
        int valorB = leitor.nextInt();
        int valorC = leitor.nextInt();
        int valorD = leitor.nextInt();

        //valores
        //se B for maior que C e
        //se D for maior do que A.
        //e a soma de C com D for maior que a soma de A e B
        //e se C e D, ambos, forem positivos
        //e se a variável A for par

        if ((valorB > valorC) && (valorD > valorA)
                && ((valorC + valorD) > (valorA + valorB))
                && (valorC > 0) && (valorD > 0)
                && (valorA % 2 ==0)) {
            System.out.println("Valores aceitos");
        }   else {
            System.out.println("Valores não aceitos");

        }
    }
}

