
public class Main {
    public static void main(String[] args) {
        // 1. Criação dos topicos
        TopicoDeNoticias esportes = new TopicoDeNoticias("Esportes");
        TopicoDeNoticias tecnologia = new TopicoDeNoticias("Tecnologia");

        // 2. Criação dos leitores
        Leitor leitorA = new LeitorAssinante("José");
        Leitor leitorB = new LeitorAssinante("Jonathan");
        Leitor leitorC = new LeitorAssinante("Escobar");

        // 3. Inscrever os leitores nos tópicos de interesse
        esportes.inscrever(leitorA);
        esportes.inscrever(leitorB);

        tecnologia.inscrever(leitorA);
        tecnologia.inscrever(leitorC);

        // 4. Publicar notícias
        esportes.publicarNovaNoticia("Brasil vence a final da Copa do Mundo!");

        tecnologia.publicarNovaNoticia("Nova geração de processadores é anunciada.");

        // 5. Um leitor cancela a inscrição
        System.out.println("\nLeitor cancelando sua inscrição em esportes");
        esportes.desinscrever(leitorC);

        // 6. Publicar outra notícia em Esportes
        esportes.publicarNovaNoticia("Time local contrata novo jogador estrela.");
        // Agora, apenas Carlos deve ser notificado.
    }
}