package aula0209;

import java.util.Scanner;

/*

Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha,
inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

*/

public class Q1070 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ValorTwitter = sc.nextInt(), rep = 0;

        while (rep < 6) {

            if (ValorTwitter % 2 == 1) {

                System.out.println(ValorTwitter);
                rep++;

            }

            ValorTwitter++;

        }

        sc.close();

    }

}

