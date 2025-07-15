package iphone;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<String> listaDeReproducao;
    private int indiceMusicaAtual;

    public ReprodutorMusical() {
        this.listaDeReproducao = new ArrayList<>();
        this.indiceMusicaAtual = -1;
    }

    public void adicionarMusica(String musica) {
            this.listaDeReproducao.add(musica);
    }

    public void verListaDeReproducao() {
        if (this.listaDeReproducao.isEmpty()) {
            System.out.println("A lista de reprodução está vazia.");
        } else {
            System.out.println("--- Lista de Reprodução Atual ---");
            for (int i = 0; i < this.listaDeReproducao.size(); i++) {
                String musica = this.listaDeReproducao.get(i);
                System.out.println((i == this.indiceMusicaAtual ? "▶ " : "  ") + (i + 1) + ". " + musica);
            }
            System.out.println("--------------------------------");
        }
    }

    // --- Novos Métodos para Reprodução ---

    public void tocarPrimeiraMusica() {
        if (!this.listaDeReproducao.isEmpty()) {
            this.indiceMusicaAtual = 0; // Define o índice para a primeira música
            System.out.println("Começando a tocar...");
            mostrarMusicaAtual();
        } else {
            System.out.println(" Não há músicas na lista para tocar.");
        }
    }

    /**
     * Toca a próxima música na lista.
     */
    public void tocarProximaMusica() {
        if (this.listaDeReproducao.isEmpty()) {
            System.out.println("Não há músicas na lista para tocar.");
            return;
        }

        if (this.indiceMusicaAtual == -1) {
            tocarPrimeiraMusica();
            return;
        }

        if (this.indiceMusicaAtual < this.listaDeReproducao.size() - 1) {
            this.indiceMusicaAtual++; // Avança para a próxima música
            System.out.println("\nTocando próxima...");
            mostrarMusicaAtual();
        } else {
            System.out.println("\nFim da lista de reprodução. Voltando ao início.");
            this.indiceMusicaAtual = 0; // Opcional: voltar ao início da lista
            mostrarMusicaAtual();
        }
    }

    /**
     * Toca a música anterior na lista.
     */
    public void tocarMusicaAnterior() {
        if (this.listaDeReproducao.isEmpty()) {
            System.out.println("\nNão há músicas na lista para tocar.");
            return;
        }

        if (this.indiceMusicaAtual == -1) { // Se nada está tocando, não faz sentido tocar anterior
            System.out.println("\nNenhuma música está tocando para voltar.");
            return;
        }

        if (this.indiceMusicaAtual > 0) {
            this.indiceMusicaAtual--; // Volta para a música anterior
            System.out.println("\nTocando anterior...");
            mostrarMusicaAtual();
        } else {
            System.out.println("\nJá está na primeira música da lista.");
        }
    }

    /**
     * Pausa a reprodução (remove a indicação de música atual).
     */
    public void pausarMusica() {
        if (this.indiceMusicaAtual != -1) {
            String musicaPausada = this.listaDeReproducao.get(this.indiceMusicaAtual);
            this.indiceMusicaAtual = -1; // Nenhuma música tocando
            System.out.println("\n" + musicaPausada + " foi pausada.");
        } else {
            System.out.println("\nNenhuma música está tocando para ser pausada.");
        }
    }

    /**
     * **MÉTODO PRINCIPAL: Mostra a música que está tocando agora.**
     */
    public void mostrarMusicaAtual() {
        if (this.indiceMusicaAtual != -1 && this.indiceMusicaAtual < this.listaDeReproducao.size()) {
            String musicaAtual = this.listaDeReproducao.get(this.indiceMusicaAtual);
            System.out.println("▶ Tocando agora: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando no momento.");
        }
    }

}