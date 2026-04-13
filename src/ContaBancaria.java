public class ContaBancaria {

    // Atributos de instância
    private int numeroConta;
    private String titular;
    private double saldo;

    // Atributos estáticos
    private static int totalContas = 0;
    private static double taxaOperacao = 2.5; // valor padrão

    // Construtor
    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
        totalContas++;
    }

    // Métodos de instância

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        double valorTotal = valor + taxaOperacao;

        if (valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Erro: saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("--------------------------");
    }

    // Métodos estáticos

    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTaxaOperacao(double novaTaxa) {
        if (novaTaxa >= 0) {
            taxaOperacao = novaTaxa;
            System.out.println("Taxa de operação atualizada para: R$ " + taxaOperacao);
        } else {
            System.out.println("Taxa inválida.");
        }
    }

    public static double simularRendimento(double valor, double taxaPercentual) {
        return valor + (valor * taxaPercentual / 100);
    }
}