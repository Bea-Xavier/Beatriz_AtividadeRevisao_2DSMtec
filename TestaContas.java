public class TestaContas {
    public static void main(String[] args) {
        GeradorExtratos gerador = new GeradorExtratos();

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(300);
        gerador.geradorConta(cc);
        gerador.mostrarExtrato();

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.50);
        cp.sacar(25);
        gerador.geradorConta(cp);
        gerador.mostrarExtrato();
    }
}