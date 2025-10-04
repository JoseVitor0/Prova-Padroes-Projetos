/**
 * A interface do Produto.
 * Define o contrato comum para todas as calculadoras de frete. O cliente irá interagir com os objetos através desta
 * interface, sem conhecer a implementação concreta. */

public interface CalculadoraFrete {

     // Calcula a tarifa com base nos detalhes da entrega e retorna o valor calculado.

    double calcularTarifa(DetalhesEntrega detalhes);
}