public class ProdutoEletronico extends Produto {
    private int mesesGarantia;

    // Construtor com super [cite: 40]
    public ProdutoEletronico(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int mesesGarantia) {
        super(nome, codigoBarras, precoBase, fornecedor);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public double calcularPrecoFinal() {
        // Preço base mais margem de 50% [cite: 41]
        double precoFinal = getPrecoBase() * 1.50;

        // Taxa extra de 15% se garantia > 12 meses [cite: 42]
        if (mesesGarantia > 12) {
            precoFinal *= 1.15;
        }
        return precoFinal;
    }
}