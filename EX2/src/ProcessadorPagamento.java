// Interface responsavel por processar o meio de pagamento escolhido pelo cliente.

public interface ProcessadorPagamento {
    void processar(double valor);
}