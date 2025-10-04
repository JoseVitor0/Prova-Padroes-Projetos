import java.util.HashMap;
import java.util.Map;

/**
 * Esse padrão foi escolhido por ser a maneira mais eficiente de criar novos objetos quando eles são cópias de
 * um "molde" já existente, evitando o custo de recriar tudo novamente.
 * Esta classe funciona como uma especie de catálogo de modelos prontos.
 * Ela carrega os modelos pesados (os protótipos) apenas uma vez.
 * Depois, sempre que precisar de um novo documento, em vez de criar do zero,
 * nós simplesmente pedimos uma cópia do modelo que está no catálogo.
 */
public class GerenciadorDeModelos {
    private Map<String, Documento> catalogoDeModelos = new HashMap<>();

    public GerenciadorDeModelos() {
        carregarModelos();
    }

    private void carregarModelos() {
        catalogoDeModelos.put("CURRICULO", new ModeloCurriculo());
        catalogoDeModelos.put("PROPOSTA", new ModeloPropostaComercial());
    }

    public Documento obterClone(String chaveDoModelo) {
        Documento modelo = catalogoDeModelos.get(chaveDoModelo);
        return modelo.clonar();
    }
}