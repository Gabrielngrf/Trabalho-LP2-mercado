public class Fornecedor {
    private String nomeEmpresa;
    private String nif;
    private String paisOrigem;

    // Construtor [cite: 18]
    public Fornecedor(String nomeEmpresa, String nif, String paisOrigem) {
        this.nomeEmpresa = nomeEmpresa;
        this.nif = nif;
        this.paisOrigem = paisOrigem;
    }

    // Getters e Setters [cite: 18]
    public String getNomeEmpresa() { return nomeEmpresa; }
    public void setNomeEmpresa(String nomeEmpresa) { this.nomeEmpresa = nomeEmpresa; }

    public String getNif() { return nif; }
    public void setNif(String nif) { this.nif = nif; }

    public String getPaisOrigem() { return paisOrigem; }
    public void setPaisOrigem(String paisOrigem) { this.paisOrigem = paisOrigem; }

    // Método para exibir detalhes [cite: 19]
    public void exibirDetalhesFornecedor() {
        System.out.println("Fornecedor: " + nomeEmpresa + " | NIF: " + nif + " | País: " + paisOrigem);
    }
}