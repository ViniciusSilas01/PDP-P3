package tech.vsilasmp.classesaux;

import java.util.Scanner;

public class Telefone {
    private int DDD;
    private String numero;
    private Scanner leitor = new Scanner(System.in);

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void cadastrar() {
        System.out.println("Informe o DDD: ");
        this.DDD = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Informe o numero: ");
        this.numero = leitor.nextLine();
    }
}
