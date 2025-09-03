public class Main {
       public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");

        ContaCorrente cc = new ContaCorrente(null);
        ContaPoupanca cp = new ContaPoupanca(null);

        cc.depositar(150);
        cc.transferir(cp, 50);

        cc.extrato();
        cp.extrato();
    }
}
