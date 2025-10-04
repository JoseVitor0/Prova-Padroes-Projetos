/**
 * Esta fábrica cria a calculadora de frete correta para cada tipo de transporte.

 * A decisão de usar uma fábrica aqui foi pelo objetivo ser criar objetos diferentes mas com uma função comum.
 * Encapsulando a lógica da criação dos objetos
 */
public class FabricaCalculadoraFrete {

    public static CalculadoraFrete criarCalculadora(TipoTransporte tipo) {
        switch (tipo) {
            case TERRESTRE:
                return new CalculadoraFreteTerrestre();
            case AEREO:
                return new CalculadoraFreteAereo();
            case MARITIMO:
                return new CalculadoraFreteMaritimo();
            default:
                throw new IllegalArgumentException("Tipo de transporte desconhecido: " + tipo);
        }
    }
}