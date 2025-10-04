/**
 * A interface do Protótipo.
 * Define os métodos essenciais que todo documento do sistema deve ter:
 * a capacidade de ser clonado, de ser personalizado e de ser exibido.
 */

public interface Documento extends Cloneable {
    Documento clonar();
    void personalizar(String cor, String logotipo);
    void exibir();
}