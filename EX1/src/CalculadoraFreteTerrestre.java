/**
 Classe responsável felo calculo do frete terrestre, implementando da suma maneira o metodo CalcularTarifa da Interface calculadora
 */

class CalculadoraFreteTerrestre implements CalculadoraFrete {
    private static final double TAXA_POR_KM = 0.75; // definido um valor fixo para km rodado.

    @Override
    public double calcularTarifa(DetalhesEntrega detalhes) {
        System.out.println("Calculando tarifa terrestre: " + detalhes.distanciaEmKm() + " km * R$ " + TAXA_POR_KM);
        return detalhes.distanciaEmKm() * TAXA_POR_KM;
    }
}