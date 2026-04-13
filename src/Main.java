public class Main {
    public static void main(String[] args) {

        // Criando contas
        ContaBancaria conta1 = new ContaBancaria(1, "João");
        ContaBancaria conta2 = new ContaBancaria(2, "Maria");

        // Operações conta 1
        conta1.depositar(500);
        conta1.sacar(100);

        // Operações conta 2
        conta2.depositar(1000);
        conta2.sacar(200);

        // Exibindo dados
        System.out.println("=== Dados das Contas ===");
        conta1.exibirDados();
        conta2.exibirDados();

        // Métodos estáticos
        System.out.println("Total de contas: " + ContaBancaria.getTotalContas());

        ContaBancaria.setTaxaOperacao(5.0);

        double rendimento = ContaBancaria.simularRendimento(1000, 10);
        System.out.println("Simulação de rendimento: R$ " + rendimento);
    }
}