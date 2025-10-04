 //Esta é a classe base, o relatório simples que contém apenas as informações essenciais de vendas.

public class RelatorioSimples implements Relatorio {
    @Override
    public String gerar() {
        return "--- Relatório de Vendas Básico ---\n" +
                "Pedido 1: R$ 150,00\n" +
                "Pedido 2: R$ 200,50\n" +
                "Pedido 3: R$ 99,90\n";
    }
}