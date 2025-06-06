package exercício_2_6;

public class Produto {

     private int quantidadeEmEstoque;
     private double preco;
     private String nome;

     Produto(String nome, double preco, int quantidadeEmEstoque){
         this.quantidadeEmEstoque = quantidadeEmEstoque;
         this.preco = preco;
         this.nome = nome;
     }

    public void alterarPreco(double newPrice){
        this.preco = newPrice;
    }

    public void alterarQuantidade(int newQuant){
        this.quantidadeEmEstoque = newQuant;
    }

    public void exibirInformacoes(){
        System.out.printf("Nome: %1$s\nQuantidade no estoque: %2$d\nPreço: %3$.2f", this.nome, this.quantidadeEmEstoque, this.preco);
    }

    public int  getQuantidadeEmEstoque(){
        return this.quantidadeEmEstoque;
    }

    public double getPreco(){
        return this.preco;
    }

    public String  getNome(){
        return this.nome;
    }

    public void setQuantidadeEmEstoque (int quantidadeEmEstoque){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }



};