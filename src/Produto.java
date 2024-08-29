public class Produto {
    private String name;
    private double preco;
    private int quantidadeEmEstoque;


    public Produto(String name, double preco, int quantityInventory) {
        this.name = name;
        this.preco = preco;
        this.quantidadeEmEstoque = quantityInventory;
    }

    public String getName() {
        return name;
    }

    public void name(){
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double Preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void diminuirEstoque(int quantidade) {
        this.quantidadeEmEstoque -= quantidade;
    }
}
