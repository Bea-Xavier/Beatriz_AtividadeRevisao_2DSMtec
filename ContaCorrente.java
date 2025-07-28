public class ContaCorrente implements Conta {
    private double saldo;
    private double taxaOp = 0.45;

    @Override
    public void depositar(double valor){
        this.saldo += valor - taxaOp;
        GeradorExtratos.registrarAcao("Depósito realizado na Conta Corrente");
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor + taxaOp;
        GeradorExtratos.registrarAcao("Saque realizado na Conta Corrente");
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta Corrente - Saldo " + this.saldo;
    }

}