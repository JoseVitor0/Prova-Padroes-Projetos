// Classe responsavel pelo boleto, implementando o metodo processar genérico.

public class ProcessadorBoleto implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        // Simula a geração do código de barras e o registro do boleto.
        System.out.println("Gerando boleto no valor de R$ " + String.format("%.2f", valor) + "...");
        System.out.println("Boleto emitido com sucesso.");
    }
}