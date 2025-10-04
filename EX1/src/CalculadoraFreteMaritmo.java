/**
 Classe responsável felo calculo do frete maritmo, implementando da suma maneira o metodo CalcularTarifa da Interface calculadora
 */

class CalculadoraFreteMaritimo implements CalculadoraFrete {
    private static final double TAXA_BASE = 200.0;   // Definido um valor fixo como taxa e um valor variavel por kg transportado
    private static final double TAXA_POR_KG = 2.15;

    @Override
    public double calcularTarifa(DetalhesEntrega detalhes) {
        System.out.println("Calculando tarifa marítima: Taxa base R$ " + TAXA_BASE + " + " + detalhes.pesoEmKg() + " kg * R$ " + TAXA_POR_KG);
        return TAXA_BASE + (detalhes.pesoEmKg() * TAXA_POR_KG);
    }
}