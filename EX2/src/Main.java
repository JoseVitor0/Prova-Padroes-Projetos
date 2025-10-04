
public class Main {
    public static void main(String[] args) {
        // Valor de compra genérico.
        double valorDaCompra = 250.50;

        // Cenário 1: Pix
        System.out.println("Fazendo pagamento com PIX");
        ProcessadorPagamento processadorPIX = FabricaProcessadorPagamento.criarProcessador(MeioPagamento.PIX);
        processadorPIX.processar(valorDaCompra);
        System.out.println("----------------------------------\n");

        // Cenário 2: Crédito
        System.out.println("Fazendo pagamento com Cartão de Crédito");
        ProcessadorPagamento processadorCartao = FabricaProcessadorPagamento.criarProcessador(MeioPagamento.CARTAO_CREDITO);
        processadorCartao.processar(valorDaCompra);
        System.out.println("---------------------------------------------\n");

        // Cenário 3: Boleto
        System.out.println("Fazendo pagamento com Boleto");
        ProcessadorPagamento processadorBoleto = FabricaProcessadorPagamento.criarProcessador(MeioPagamento.BOLETO);
        processadorBoleto.processar(valorDaCompra);
        System.out.println("------------------------------------\n");
    }
}