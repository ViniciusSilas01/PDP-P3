package tech.vsilasmp.Composicao;

import java.util.Scanner;

public class Telefone {
    private String DDD;
    private String numero;
    private Scanner leitor = new Scanner(System.in);

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
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
        this.DDD = leitor.nextLine();
        System.out.println("Informe o numero: ");
        this.numero = leitor.nextLine();
    }
}
