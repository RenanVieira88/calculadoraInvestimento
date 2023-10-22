import java.util.Scanner;

public class SimulacaoInvestimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o investimento inicial: R$ ");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Informe a taxa de juros anual (porcentagem): ");
        double taxaJurosAnual = scanner.nextDouble() / 100; // Converter p decimal - REVER

        System.out.print("Informe o valor alvo: R$ ");
        double valorAlvo = scanner.nextDouble();

        scanner.close(); 

        int anos = 0;
        double valorInvestido = investimentoInicial;

        System.out.println("Simulação de investimento:");
        System.out.println("Investimento Inicial: R$ " + investimentoInicial);
        System.out.println("Taxa de Juros Anual: " + (taxaJurosAnual * 100) + "%");
        System.out.println("Valor Alvo: R$ " + valorAlvo);

        while (valorInvestido < valorAlvo) {
            investimentoInicial += investimentoInicial * taxaJurosAnual; 
            valorInvestido = investimentoInicial;
            anos++;
            System.out.println("Ano " + anos + ": R$ " + valorInvestido);
        }

        System.out.println("Com uma taxa de juros anual de " + (taxaJurosAnual * 100) + "%,");
        System.out.println("levará " + anos + " anos para atingir o valor de R$ " + valorAlvo);
    }
}