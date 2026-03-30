public class ProdutoAlimenticio extends Produto {
    private int diasValidade;

    // Construtor com super [cite: 33]
    public ProdutoAlimenticio(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int diasValidade) {
        super(nome, codigoBarras, precoBase, fornecedor);
        this.diasValidade = diasValidade;
    }

    @Override
    public double calcularPrecoFinal() {
        // Preço base mais margem de 20% [cite: 34]
        double precoFinal = getPrecoBase() * 1.20;

        // Desconto de 30% para evitar desperdício se validade <= 5 [cite: 35]
        if (diasValidade <= 5) {
            precoFinal *= 0.70;
        }
        return precoFinal;
    }
}