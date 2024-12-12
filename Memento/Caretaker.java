import java.util.ArrayList;
import java.util.Stack;

// Caretaker: Gerencia os estados do mapa (pilhas para Undo e Redo)
class Caretaker {
    private Stack<Memento> history = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void salvar(Memento memento) {
        history.push(memento);
        redoStack.clear(); // Limpa a pilha de Redo ao salvar um novo estado
    }

    public Memento desfazer() {
        if (!history.isEmpty()) {
            Memento memento = history.pop();
            redoStack.push(memento);
            return history.isEmpty() ? new Memento(new ArrayList<>()) : history.peek();
        }
        return null;
    }

    public Memento refazer() {
        if (!redoStack.isEmpty()) {
            Memento memento = redoStack.pop();
            history.push(memento);
            return memento;
        }
        return null;
    }
}