package exercício_7_9;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    Conta(String titular, int numero, String agencia, double saldo, String dataAbertura){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public double calculaRendimento(){
        return this.saldo*0.1;
    }

    public double getSaldo(){
        return saldo;
    }

}
