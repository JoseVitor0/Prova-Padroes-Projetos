// Classe responsavel pelo pix, implementando o metodo processar genérico.

public class ProcessadorPix implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        // Simula a geração de um QR Code PIX.
        System.out.println("Gerando QR Code PIX para pagamento de R$ " + String.format("%.2f", valor) + "...");
        System.out.println("Aguardando pagamento...");
    }
}