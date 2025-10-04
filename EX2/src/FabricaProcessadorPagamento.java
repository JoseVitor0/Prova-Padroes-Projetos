/**
 * Esta fábrica cria o processador de pagamento correto para cada meio de pagamento.
 * A fabrica se encaixa nesse contexto pois tratamos de um objetivo central, processar um pagamento, mas com variações desse processo.
 * PIX, cartão ou boleto. Portanto a fábrica fornece de forma simples ao cliente a alternativa de pagamento sem ele precisar saber como o pagamento é processado.
 */

public class FabricaProcessadorPagamento {

    public static ProcessadorPagamento criarProcessador(MeioPagamento meio) {
        switch (meio) {
            case CARTAO_CREDITO:
                return new ProcessadorCartaoCredito();
            case BOLETO:
                return new ProcessadorBoleto();
            case PIX:
                return new ProcessadorPix();
            default:
                throw new IllegalArgumentException("Meio de pagamento não suportado: " + meio);
        }
    }
}