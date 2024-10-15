
public class Main {
    public static void main(String[] args) {

        // criando dois jogadores no jogo
        Player player1 = new Player("Jogador 1");
        Player player2 = new Player("Jogador 2");

        // os jogadores atacam inimigos e verificam o status do jogo
        player1.atacarInimigo();
        player2.atacarInimigo();

        player1.checarStatus();
        player2.checarStatus();

        // mudando a fase do jogo
        GameStatus status = GameStatus.getInstance();
        status.setLevelAtual("Castelo Sombrio");

        // os jogadores verificam o status novamente após a mudança
        player1.checarStatus();
        player2.checarStatus();

        // somente o jogador 1 ataca um inimigo
        player1.atacarInimigo();

        // os 2 jogadores verificam o status novamente após o ataque somente do jogador 1
        player1.checarStatus();
        player2.checarStatus();

    }
}