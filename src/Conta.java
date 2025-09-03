public class Conta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    protected int numeroConta;
    protected double saldo;
    protected int agencia;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void transferir(Conta contaDestino, double valor) {
        if (valor <= this.saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    protected void extrato() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }   


}
