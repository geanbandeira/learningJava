import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    private String nome;
    private String cpf;
    private String contaBancaria;
    private String agenciaBancaria;
    private String cargo;
    private String funcoes;
    private String horarioTrabalho;
    private double salario;

    public Funcionario(String nome, String cpf, String contaBancaria, String agenciaBancaria, String cargo, String funcoes, String horarioTrabalho) {
        this.nome = nome;
        this.cpf = cpf;
        this.contaBancaria = contaBancaria;
        this.agenciaBancaria = agenciaBancaria;
        this.cargo = cargo;
        this.funcoes = funcoes;
        this.horarioTrabalho = horarioTrabalho;
    }

    public void calcularSalario() {
        // Lógica para calcular o salário - exemplo básico
        this.salario = 2000.00; // Valor fixo apenas para exemplo
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionário{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", contaBancaria='" + contaBancaria + '\'' +
                ", agenciaBancaria='" + agenciaBancaria + '\'' +
                ", cargo='" + cargo + '\'' +
                ", funcoes='" + funcoes + '\'' +
                ", horarioTrabalho='" + horarioTrabalho + '\'' +
                ", salario=" + salario +
                '}';
    }
}

public class CadastroFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Calcular Salários");
            System.out.println("3. Exibir Informações dos Funcionários");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner, funcionarios);
                    break;
                case 2:
                    calcularSalarios(funcionarios);
                    break;
                case 3:
                    exibirInformacoes(funcionarios);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        System.out.println("Programa encerrado.");
    }

    private static void cadastrarFuncionario(Scanner scanner, ArrayList<Funcionario> funcionarios) {
        System.out.println("\nCadastro de Funcionário");
        scanner.nextLine(); // Consumir a quebra de linha pendente após o nextInt()
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Conta Bancária: ");
        String contaBancaria = scanner.nextLine();

        System.out.print("Agência Bancária: ");
        String agenciaBancaria = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Funções: ");
        String funcoes = scanner.nextLine();

        System.out.print("Horário de Trabalho: ");
        String horarioTrabalho = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, cpf, contaBancaria, agenciaBancaria, cargo, funcoes, horarioTrabalho);
        funcionarios.add(funcionario);

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void calcularSalarios(ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularSalario();
            System.out.println(funcionario.getSalario());
        }
    }

    private static void exibirInformacoes(ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
