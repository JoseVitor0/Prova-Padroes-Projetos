/**
 * A função desta classe é conectar um decorador a um relatório existente.
 * Ela garante que qualquer decorador possa se passar por um relatório normal
 * e, ao mesmo tempo, adicionar suas próprias funcionalidades em camadas.
 * O padrão Decorator foi escolhido por sua flexibilidade em adicionar responsabilidades a um objeto dinamicamente,
 * sem precisar alterar o código original
 */

public abstract class RelatorioDecorator implements Relatorio {
    // Guarda a referência para o objeto que está sendo decorado.
    protected Relatorio relatorioEmbrulhado;

    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorioEmbrulhado = relatorio;
    }

    @Override
    public String gerar() {
        return relatorioEmbrulhado.gerar();
    }
}