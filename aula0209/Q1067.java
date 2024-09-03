package aula0209;

import java.util.Scanner;

/*

Questão 1067:

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

*/

public class Q1067 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ValorTwitter = sc.nextInt();

        for (int i = 0; i <= ValorTwitter; i++) {

            if (i % 2 != 0 && i > 1 && i < 1000) {

                System.out.println(i);

            }

        }

        sc.close();

    }

}

