// Elemento: Representa um objeto no mapa
class Elemento {
    private final String nome;
    private final int x;
    private final int y;

    public Elemento(String nome, int x, int y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return nome + "(" + x + ", " + y + ")";
    }
}
