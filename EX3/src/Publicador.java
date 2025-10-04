// Interface do publicador

public interface Publicador {
    void inscrever(Leitor leitor);
    void desinscrever(Leitor leitor);
    void notificarLeitores();
}