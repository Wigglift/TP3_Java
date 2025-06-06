package exercício_1;

public class Exercicio1 {
    public static void main(String[] args){

        Pessoa Joao = new Pessoa();

        Joao.altura = 1.69f;
        Joao.peso = 57f;

        System.out.printf("Joao tem %1$.2f de índice de massa corporea", Joao.imc());

    }
}
