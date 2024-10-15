package Singleton;
// Classe Singleton para gerenciar o Status do Jogo
class GameStatus {
    private static GameStatus instance;
    
    private int inimigosRestantes;
    private String levelAtual;
    
    // para evitar a criação de instâncias externas
    private GameStatus() {
        this.inimigosRestantes = 10;  // Exemplo de valor inicial
        this.levelAtual = "Floresta Encantada";
    }
    
    // para obter a única instância da classe
    public static GameStatus getInstance() {
        if (instance == null) {
            instance = new GameStatus();
        }
        return instance;
    }

    // para acessar o número de inimigos restantes
    public int getInimigosRestantes() {
        return inimigosRestantes;
    }

    // Método para alterar o número de inimigos restantes
    public void setInimigosRestantes(int inimigosRestantes) {
        this.inimigosRestantes =inimigosRestantes;
    }

    // para acessar o nome da fase atual
    public String getLevelAtual() {
        return levelAtual;
    }

    // para alterar o nome da fase atual
    public void setLevelAtual(String levelAtual) {
        this.levelAtual = levelAtual;
    }
    
    // para imprimir o status do jogo
    public void mostrarStatus() {
        System.out.println("");
        System.out.println("=============== STATUS ===============");
        System.out.println("Inimigos restantes: " + inimigosRestantes);
        System.out.println("Fase atual: " + levelAtual);
        System.out.println("======================================");
        System.out.println("");
    }
}