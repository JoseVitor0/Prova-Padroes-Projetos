/**
 * Um Decorador Concreto.
 * Adiciona estatísticas de faturamento ao relatório.
 */

public class RelatorioComEstatisticas extends RelatorioDecorator {
    public RelatorioComEstatisticas(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String relatorioBase = super.gerar(); // Pega o conteúdo do relatório que ele embrulha
        String estatisticas = adicionarEstatisticas(); // Adiciona sua própria funcionalidade
        return relatorioBase + estatisticas;
    }

    private String adicionarEstatisticas() {
        return "\n--- Estatísticas ---\n" +
                "Faturamento Total: R$ 450,40\n";
    }
}