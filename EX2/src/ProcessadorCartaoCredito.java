// Classe responsavel pelo cartão de crédito, implementando o metodo processar genérico.

public class ProcessadorCartaoCredito implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        // Simula a lógica de autorização com a operadora do cartão.
        System.out.println("Processando R$ " + String.format("%.2f", valor) + " no cartão de crédito...");
        System.out.println("Pagamento aprovado!");
    }
}