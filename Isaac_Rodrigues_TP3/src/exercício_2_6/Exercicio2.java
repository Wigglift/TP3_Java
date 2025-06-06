package exercício_2_6;


public class Exercicio2 {
    public static void main(String[] args){

        Produto fone = new Produto("Fone HyperX", 99.99, 2930);


        System.out.println("Quantidade em estoque = " + fone.getQuantidadeEmEstoque());

        System.out.println("Preco = " + fone.getPreco());

        System.out.println("Nome = " + fone.getNome());
    }
}
