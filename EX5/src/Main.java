public class Main {
    public static void main(String[] args) {
        // 1. O sistema inicia e o gerenciador carrega os modelos uma única vez.
        GerenciadorDeModelos gerenciador = new GerenciadorDeModelos();

        System.out.println("### Criando documentos para o Cliente A ###");

        // 2. Fazendo um clone de curriculo
        Documento curriculoClienteA = gerenciador.obterClone("CURRICULO");
        curriculoClienteA.personalizar("Cinza", "Logo_Cliente_A.png");
        curriculoClienteA.exibir();

        // 3. Fazendo um clone de proposta
        Documento propostaClienteA = gerenciador.obterClone("PROPOSTA");
        propostaClienteA.personalizar("Cinza", "Logo_Cliente_A.png");
        propostaClienteA.exibir();


        System.out.println("### Criando documentos para o Cliente B ###");

        // 4. Novo clone de curriculo
        Documento curriculoClienteB = gerenciador.obterClone("CURRICULO");
        curriculoClienteB.personalizar("Verde Musgo", "Logo_Cliente_B.png");
        curriculoClienteB.exibir();
    }
}