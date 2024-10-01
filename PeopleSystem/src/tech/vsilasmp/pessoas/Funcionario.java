package tech.vsilasmp.pessoas;

import tech.vsilasmp.composicao.Cargo;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int matricula;
    private Cargo cargo;
    private String salario;
    private LocalDate dataAdmissao;
    private Scanner leitor = new Scanner(System.in);

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe a matrícula do funcionário: ");
        this.matricula = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Informe o cargo do funcionário: ");
        this.cargo = Cargo.valueOf(leitor.nextLine().toUpperCase());

        System.out.println("Informe o salário do funcionário: ");
        this.salario = leitor.nextLine();

        boolean dataValida = false;
        while (!dataValida) {
            System.out.println("Informe o data de admissão do funcionário: ");
            try {
                System.out.println("Informe o dia: ");
                int dia = leitor.nextInt();
                System.out.println("Informe o mês: ");
                int mes = leitor.nextInt();
                System.out.println("Informe o ano: ");
                int ano = leitor.nextInt();
                leitor.nextLine();

                this.dataAdmissao = LocalDate.of(ano, mes, dia);
                dataValida = true;
            } catch (DateTimeException e) {
                System.out.println("Data inválida! Verifique se os valores de dia, mês e ano estão corretos.");
                leitor.nextLine();
            }
        }
    }

    public String toString() {
            return "Funcionario{" +
                    "matricula='" + matricula + '\'' +
                    ", cargo='" + cargo + '\'' +
                    ", salario='" + salario + '\'' +
                    ", dataAdmissao=" + dataAdmissao +
                    "} ";
    }
}
