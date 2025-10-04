/**
Classe responsável felo calculo do frete aéreo, implementando da suma maneira o metodo CalcularTarifa da Interface calculadora
 */
class CalculadoraFreteAereo implements CalculadoraFrete {
    private static final double TAXA_POR_KG = 9.80; // Definido um valor padrão por kg transportado.

    @Override
    public double calcularTarifa(DetalhesEntrega detalhes) {
        System.out.println("Calculando tarifa aérea: " + detalhes.pesoEmKg() + " kg * R$ " + TAXA_POR_KG);
        return detalhes.pesoEmKg() * TAXA_POR_KG;
    }
}