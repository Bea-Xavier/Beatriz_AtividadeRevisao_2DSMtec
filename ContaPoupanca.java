public class ContaPoupanca implements Conta {
    private double saldo;

    @Override
    public void depositar(double valor){
        this.saldo += valor;
        GeradorExtratos.registrarAcao("Depósito realizado na Conta Poupança");
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        GeradorExtratos.registrarAcao("Saque realizado na Conta Poupança");
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}