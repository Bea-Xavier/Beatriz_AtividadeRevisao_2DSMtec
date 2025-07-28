import java.util.ArrayList;

public class GeradorExtratos {
    public static ArrayList<String> extrato = new ArrayList<>();

    public static void registrarAcao(String acao) {
        extrato.add(acao);
    }

    public void mostrarExtrato() {
        System.out.println("\nExtrato de Ações:");
        for (String acao : extrato) {
            System.out.println(acao);
        }
    }

    public void geradorConta(Conta conta) {
        System.out.println("\nSaldo atual: " + conta.getSaldo());
    }
}