package Builder;

// Classe Diretor - recebe o pedido e coordena o processo de montagem do hambúrguer
public class Diretor {
    public Hamburguer montarHamburguer(HamburguerBuilder builder, Pedido pedido) {
        builder.definirPao(pedido.tipoPao);
        builder.definirCarne(pedido.quantidadeCarne);
        builder.definirQueijo(pedido.tipoQueijo);
        builder.definirBacon(pedido.quantidadeBacon);
        builder.definirMolho(pedido.tipoMolho);
        builder.definirSalada(pedido.salada);
        builder.definirCebola(pedido.cebola);
        builder.definirTomate(pedido.tomate);
        builder.definirOvo(pedido.ovo);
        builder.definirTipoBacon(pedido.tipoBacon);
        builder.definirBatataPalha(pedido.batataPalha);
        builder.definirPepino(pedido.pepino);
        builder.definirTemperoExtra(pedido.temperoExtra);
        return builder.build();
    }
}
