/**
 * Outro Decorador Concreto.
 * Adiciona um rodapé indicando que o relatório pode ser exportado para PDF.
 */
public class RelatorioComExportacaoPDF extends RelatorioDecorator {
    public RelatorioComExportacaoPDF(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String relatorioBase = super.gerar();
        String rodapePDF = adicionarRodapePDF();
        return relatorioBase + rodapePDF;
    }

    private String adicionarRodapePDF() {
        return "\n--- Exportação ---\n" +
                "Relatório gerado em formato PDF.\n";
    }
}