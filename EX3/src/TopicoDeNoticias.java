import java.util.ArrayList;
import java.util.List;

/**
 * Representa um tópico de notícias (como 'Esportes' ou 'Tecnologia').
 * Este é o objeto que os leitores irão observar.
 * O tópico mantém uma lista de todos os leitores inscritos e quando uma nova notícia é publicada, ele apenas avisa a todos
 * que estão na sua lista, sem precisar saber quem eles são.
 * A escolha do padrão Observer se dá pois ele resolve exatamente
 * este cenário de inscrição e notificação, permitindo que o tópico e os
 * leitores se comuniquem de forma desacoplada.
 */

public class TopicoDeNoticias implements Publicador {
    private List<Leitor> leitoresInscritos = new ArrayList<>();
    private String nomeDoTopico;
    private String ultimaNoticia;

    public TopicoDeNoticias(String nomeDoTopico) {
        this.nomeDoTopico = nomeDoTopico;
    }

    @Override
    public void inscrever(Leitor leitor) {
        leitoresInscritos.add(leitor);
        System.out.println("-> Leitor inscrito no tópico '" + nomeDoTopico + "'!");
    }

    @Override
    public void desinscrever(Leitor leitor) {
        leitoresInscritos.remove(leitor);
        System.out.println("-> Leitor cancelou a inscrição do tópico '" + nomeDoTopico + "'.");
    }

    @Override
    public void notificarLeitores() {
        // Percorre a lista e chama o metodo de atualização de cada leitor.
        for (Leitor leitor : leitoresInscritos) {
            leitor.atualizar(this.nomeDoTopico, this.ultimaNoticia);
        }
    }


     // O metodo que dispara a mudança de estado e notifica os observadores.

    public void publicarNovaNoticia(String titulo) {
        this.ultimaNoticia = titulo;
        System.out.println("\nPublicando nova notícia em '" + nomeDoTopico + "'...");
        notificarLeitores();
    }
}