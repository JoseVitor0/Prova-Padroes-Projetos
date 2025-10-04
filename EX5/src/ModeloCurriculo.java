/**
 * Um Protótipo Concreto.
 * Representa um modelo de currículo que pode ser clonado e personalizado.
 */

public class ModeloCurriculo implements Documento {
    private String corDeFundo = "Branco";
    private String tipoDeFonte = "Arial";
    private String logotipo = "Nenhum";
    private String conteudo = "[Conteúdo Padrão do Currículo]";

    // Metodo de clonagem: cria um novo objeto com os mesmos valores.
    @Override
    public Documento clonar() {
        // A clonagem é feita criando uma nova instância e copiando os valores. Isso garante que o clone seja um objeto independente.
        ModeloCurriculo novoCurriculo = new ModeloCurriculo();
        novoCurriculo.corDeFundo = this.corDeFundo;
        novoCurriculo.tipoDeFonte = this.tipoDeFonte;
        novoCurriculo.logotipo = this.logotipo;
        novoCurriculo.conteudo = this.conteudo;
        return novoCurriculo;
    }

    @Override
    public void personalizar(String cor, String logotipo) {
        this.corDeFundo = cor;
        this.logotipo = logotipo;
    }

    @Override
    public void exibir() {
        System.out.println("--- Currículo ---");
        System.out.println("Cor: " + corDeFundo + ", Fonte: " + tipoDeFonte + ", Logo: " + logotipo);
        System.out.println("Conteúdo: " + conteudo + "\n");
    }
}