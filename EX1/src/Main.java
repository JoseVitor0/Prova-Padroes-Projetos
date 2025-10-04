public class Main {

    public static void main(String[] args) {

        // Cenário 1: Uma entrega local por terra.

        System.out.println("Cenário 1: Terrestre");
        DetalhesEntrega entregaTerrestre = new DetalhesEntrega(150.0, 20.0);

        // O cliente pede à fábrica para criar a calculadora apropriada.
        CalculadoraFrete calculadora1 = FabricaCalculadoraFrete.criarCalculadora(TipoTransporte.TERRESTRE);
        double tarifa1 = calculadora1.calcularTarifa(entregaTerrestre);

        System.out.printf("Custo final da entrega terrestre: R$ %.2f%n%n", tarifa1);

        // Cenário 2: Uma carga internacional por avião.
        System.out.println("Cenário 2: Aereo");
        DetalhesEntrega entregaAerea = new DetalhesEntrega(8000.0, 50.0);

        // O cliente não precisa saber qual classe está sendo usada, apenas pede por "AEREO".
        CalculadoraFrete calculadora2 = FabricaCalculadoraFrete.criarCalculadora(TipoTransporte.AEREO);
        double tarifa2 = calculadora2.calcularTarifa(entregaAerea);
        System.out.printf("Custo final da entrega aérea: R$ %.2f%n%n", tarifa2);

        // Cenário 3: Um contêiner enviado por navio.
        System.out.println("Cenário 2: Maritimo");

        DetalhesEntrega entregaMaritima = new DetalhesEntrega(12000.0, 5000.0);
        CalculadoraFrete calculadora3 = FabricaCalculadoraFrete.criarCalculadora(TipoTransporte.MARITIMO);
        double tarifa3 = calculadora3.calcularTarifa(entregaMaritima);

        System.out.printf("Custo final da entrega marítima: R$ %.2f%n", tarifa3);
    }
}