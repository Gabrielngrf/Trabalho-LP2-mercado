public abstract class Produto {
    private String nome;
    private int codigoBarras;
    private double precoBase;
    private Fornecedor fornecedor; // Composição: Produto tem-um Fornecedor [cite: 23, 24]

    // Construtor [cite: 25]
    public Produto(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.precoBase = precoBase;
        this.fornecedor = fornecedor;
    }

    // Getters necessários para as subclasses
    public double getPrecoBase() { return precoBase; }
    public String getNome() { return nome; }
    public Fornecedor getFornecedor() { return fornecedor; }

    // Método abstrato [cite: 26]
    public abstract double calcularPrecoFinal();

    // Método concreto [cite: 28]
    public void exibirResumo() {
        System.out.println("Produto: " + nome + " | Preço Base: R$ " + String.format("%.2f", precoBase));
    }
}