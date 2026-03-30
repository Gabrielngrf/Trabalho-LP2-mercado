import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // Uso de ArrayList para armazenar itens 
    private List<Produto> itens = new ArrayList<>();

    // Método para adicionar itens [cite: 46]
    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    // Processar a compra iterando a lista 
    public void processarCompra() {
        double totalAPagar = 0.0;
        System.out.println("==== TALÃO DE COMPRAS ====");

        for (Produto produto : itens) {
            produto.exibirResumo();
            produto.getFornecedor().exibirDetalhesFornecedor();

            // Polimorfismo sendo aplicado aqui
            double precoFinal = produto.calcularPrecoFinal();
            System.out.println("Valor Final: R$ " + String.format("%.2f", precoFinal));
            System.out.println("--------------------------");

            totalAPagar += precoFinal;
        }

        System.out.println("VALOR TOTAL A PAGAR: R$ " + String.format("%.2f", totalAPagar));
        System.out.println("==========================");
    }
}