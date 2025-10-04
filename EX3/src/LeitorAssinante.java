// Classe especializada do leitor assinante

public class LeitorAssinante implements Leitor {
    private String nome;

    public LeitorAssinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeDoTopico, String tituloDaNoticia) {
        // Ação que o leitor toma ao ser notificado.
        System.out.println(nome + ", nova notícia no tópico '" + nomeDoTopico + "': \"" + tituloDaNoticia + "\"");
    }
}