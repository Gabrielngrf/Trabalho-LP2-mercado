public class Main {
    public static void main(String[] args) {
        // 1. Instanciar fornecedores [cite: 86]
        Fornecedor f1 = new Fornecedor("Fazenda Local", "123456789", "Brasil");
        Fornecedor f2 = new Fornecedor("Samsung", "987654321", "Coreia Do Sul");

        // 2. Instanciar produtos passando os fornecedores (Composição) [cite: 87]
        ProdutoAlimenticio maca = new ProdutoAlimenticio("Maçã Gala", 1001, 5.00, f1, 3);
        ProdutoAlimenticio arroz = new ProdutoAlimenticio("Arroz Branco", 1002, 20.00, f1, 180);
        ProdutoEletronico tv = new ProdutoEletronico("Smart TV 50", 2001, 2000.00, f2, 24);

        // 3. Instanciar carrinho e adicionar produtos [cite: 88]
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(maca);
        carrinho.adicionarItem(arroz);
        carrinho.adicionarItem(tv);

        // 4. Invocar método e imprimir talão final [cite: 89]
        carrinho.processarCompra();
    }
}
