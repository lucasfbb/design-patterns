package Builder;

// Classe Cliente - para testar a solução
public class Cliente {
    public static void main(String[] args) {
        // Pedido personalizado do cliente
        Pedido pedido = new Pedido("Brioche", 150, "Cheddar", 50, "Barbecue", "sim", "não", 
                                   "sim", "sim", "defumado", "sim", "sim", "pimenta");

        // Primeiro teste: usando HamburguerVeganoBuilder
        Diretor diretor = new Diretor();
        HamburguerBuilder veggieBuilder = new HamburguerVeganoBuilder();
        System.out.println("Montagem com HamburguerVeganoBuilder:");
        Hamburguer veggieHamburguer = diretor.montarHamburguer(veggieBuilder, pedido);
        System.out.println("Hambúrguer Montado: " + veggieHamburguer + "\n");

        // Segundo teste: usando DeluxeHamburguerBuilder
        HamburguerBuilder deluxeBuilder = new DeluxeHamburguerBuilder();
        System.out.println("Montagem com DeluxeHamburguerBuilder:");
        Hamburguer deluxeHamburguer = diretor.montarHamburguer(deluxeBuilder, pedido);
        System.out.println("Hambúrguer Montado: " + deluxeHamburguer);
    }
}
