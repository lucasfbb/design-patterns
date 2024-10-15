// Classe Player simulando os jogadores no jogo
class Player {
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    // para o jogador atacar um inimigo
    public void atacarInimigo() {
        GameStatus status = GameStatus.getInstance();
        int remainingEnemies = status.getInimigosRestantes();
        if (remainingEnemies > 0) {
            status.setInimigosRestantes(remainingEnemies - 1);
            System.out.println(playerName + " derrotou um inimigo!");
        } else {
            System.out.println("Nenhum inimigo restante para " + playerName + " atacar.");
        }
    }

    // para o jogador acessar o status do jogo
    public void checarStatus() {
        GameStatus status = GameStatus.getInstance();
        System.out.println(playerName + " verifica o status do jogo:");
        status.mostrarStatus();
    }
}