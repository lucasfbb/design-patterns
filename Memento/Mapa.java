import java.util.ArrayList;
import java.util.List;

// Originator: Gerencia os elementos do mapa
class Mapa {
    private List<Elemento> elementos = new ArrayList<>();

    public void adicionarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void removerElemento(Elemento elemento) {
        elementos.remove(elemento);
    }

    public Memento salvarEstado() {
        return new Memento(elementos);
    }

    public void restaurarEstado(Memento memento) {
        elementos = memento.getState();
    }

    @Override
    public String toString() {
        return "Mapa: " + elementos;
    }
}
