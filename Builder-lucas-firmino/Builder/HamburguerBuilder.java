package Builder;

// Interface HamburguerBuilder - define os métodos de construção para cada parte do hambúrguer
public interface HamburguerBuilder {
    void definirPao(String pao);
    void definirCarne(int carne);
    void definirQueijo(String queijo);
    void definirBacon(int bacon);
    void definirMolho(String molho);
    void definirSalada(String salada);
    void definirCebola(String cebola);
    void definirTomate(String tomate);
    void definirOvo(String ovo);
    void definirTipoBacon(String tipoBacon);
    void definirBatataPalha(String batataPalha);
    void definirPepino(String pepino);
    void definirTemperoExtra(String temperoExtra);
    Hamburguer build();
}
