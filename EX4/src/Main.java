public class Main {
    public static void main(String[] args) {
        // Cenário 1: Relatório simples
        System.out.println("### RELATÓRIO SIMPLES ###");
        Relatorio relatorioSimples = new RelatorioSimples();
        System.out.println(relatorioSimples.gerar());
        System.out.println("=========================================\n");

        // Cenário 2: Relatório com estatísticas.
        System.out.println("### RELATÓRIO COM ESTATÍSTICAS ###");
        Relatorio relatorioComEstatisticas = new RelatorioComEstatisticas(new RelatorioSimples());
        System.out.println(relatorioComEstatisticas.gerar());
        System.out.println("=========================================\n");

        // Cenário 3: Relatório completo
        System.out.println("### RELATÓRIO COMPLETO (DECORADO DUAS VEZES) ###");
        Relatorio relatorioBase = new RelatorioSimples();
        Relatorio relatorioComStats = new RelatorioComEstatisticas(relatorioBase);
        Relatorio relatorioCompleto = new RelatorioComExportacaoPDF(relatorioComStats);

        System.out.println(relatorioCompleto.gerar());
        System.out.println("=========================================\n");
    }
}