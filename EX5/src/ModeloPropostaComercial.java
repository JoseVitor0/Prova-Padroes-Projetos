/**
 * Outro Protótipo Concreto.
 * Representa um modelo de proposta comercial.
 */
public class ModeloPropostaComercial implements Documento {
    private String corPrincipal = "Azul Corporativo";
    private String logotipo = "Logo Padrão da Empresa";
    private String conteudo = "[Texto padrão da proposta comercial...]";

    @Override
    public Documento clonar() {
        ModeloPropostaComercial novaProposta = new ModeloPropostaComercial();
        novaProposta.corPrincipal = this.corPrincipal;
        novaProposta.logotipo = this.logotipo;
        novaProposta.conteudo = this.conteudo;
        return novaProposta;
    }

    @Override
    public void personalizar(String cor, String logotipo) {
        this.corPrincipal = cor;
        this.logotipo = logotipo;
    }

    @Override
    public void exibir() {
        System.out.println("--- Proposta Comercial ---");
        System.out.println("Cor Principal: " + corPrincipal + ", Logo: " + logotipo);
        System.out.println("Conteúdo: " + conteudo + "\n");
    }
}