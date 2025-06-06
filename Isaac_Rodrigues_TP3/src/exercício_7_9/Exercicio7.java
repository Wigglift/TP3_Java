package exercício_7_9;

public class Exercicio7 {
    public static void main(String[] args){
        Conta ContaJoao = new Conta("João Batista",51511,"15958-1",3942.42,"14/07/2015");

        System.out.printf("Saldo inicial: %.2f\n", ContaJoao.getSaldo());

        ContaJoao.deposita(231.45);
        System.out.printf("Saldo após depósito de R$231.45: R$%.2f\n", ContaJoao.getSaldo());

        ContaJoao.saca(873.87);
        System.out.printf("Saldo após saque de R$873.87: R$%.2f\n", ContaJoao.getSaldo());

        System.out.printf("A conta está rendendo R$%1$.2f por mês com R$%2$.2f",ContaJoao.calculaRendimento(),ContaJoao.getSaldo());
    }
}
