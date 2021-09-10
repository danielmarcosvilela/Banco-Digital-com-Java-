

public class main {

    public static void main(String[] args) {

        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");

        Conta cc = new ContaCorrente(daniel);
        Conta poupanca = new ContaPoupanca(daniel);

        cc.depositar(5000);
        cc.sacar(250);
        poupanca.sacar(60);
        cc.transferir(1500, poupanca);
        poupanca.transferir(100, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
