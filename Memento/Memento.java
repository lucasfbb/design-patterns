import java.util.ArrayList;
import java.util.List;

// Memento: Armazena o estado do mapa
class Memento {
    private final List<Elemento> state;

    public Memento(List<Elemento> state) {
        // Cria uma cópia do estado para garantir imutabilidade
        this.state = new ArrayList<>(state);
    }

    public List<Elemento> getState() {
        return state;
    }
}
