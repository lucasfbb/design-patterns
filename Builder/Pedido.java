package Builder;

// classe Pedido com o que o cliente quer
public class Pedido {
    public String tipoPao;
    public int quantidadeCarne;
    public String tipoQueijo;
    public int quantidadeBacon;
    public String tipoMolho;
    public String salada;
    public String cebola;
    public String tomate;
    public String ovo;
    public String tipoBacon;
    public String batataPalha;
    public String pepino;
    public String temperoExtra;

    public Pedido(String tipoPao, int quantidadeCarne, String tipoQueijo, int quantidadeBacon,
                  String tipoMolho, String salada, String cebola, String tomate, String ovo,
                  String tipoBacon, String batataPalha, String pepino, String temperoExtra) {
        this.tipoPao = tipoPao;
        this.quantidadeCarne = quantidadeCarne;
        this.tipoQueijo = tipoQueijo;
        this.quantidadeBacon = quantidadeBacon;
        this.tipoMolho = tipoMolho;
        this.salada = salada;
        this.cebola = cebola;
        this.tomate = tomate;
        this.ovo = ovo;
        this.tipoBacon = tipoBacon;
        this.batataPalha = batataPalha;
        this.pepino = pepino;
        this.temperoExtra = temperoExtra;
    }
}
