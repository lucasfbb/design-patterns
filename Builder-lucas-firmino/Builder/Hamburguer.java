package Builder;

public class Hamburguer {
    private String pao;
    private int carne;
    private String queijo;
    private int bacon;
    private String molho;
    private String salada;
    private String cebola;
    private String tomate;
    private String ovo;
    private String tipoBacon;
    private String batataPalha;
    private String pepino;
    private String temperoExtra;

    // Métodos para definir cada ingrediente
    public void setPao(String pao) { this.pao = pao; }
    public void setCarne(int carne) { this.carne = carne; }
    public void setQueijo(String queijo) { this.queijo = queijo; }
    public void setBacon(int bacon) { this.bacon = bacon; }
    public void setMolho(String molho) { this.molho = molho; }
    public void setSalada(String salada) { this.salada = salada; }
    public void setCebola(String cebola) { this.cebola = cebola; }
    public void setTomate(String tomate) { this.tomate = tomate; }
    public void setOvo(String ovo) { this.ovo = ovo; }
    public void setTipoBacon(String tipoBacon) { this.tipoBacon = tipoBacon; }
    public void setBatataPalha(String batataPalha) { this.batataPalha = batataPalha; }
    public void setPepino(String pepino) { this.pepino = pepino; }
    public void setTemperoExtra(String temperoExtra) { this.temperoExtra = temperoExtra; }

    @Override
    public String toString() {
        return "Hamburguer [Pão: " + pao + ", Carne: " + carne + "g, Queijo: " + queijo +
               ", Bacon: " + bacon + "g, Molho: " + molho + ", Salada: " + salada +
               ", Cebola: " + cebola + ", Tomate: " + tomate + ", Ovo: " + ovo + 
               ", Tipo de Bacon: " + tipoBacon + ", Batata Palha: " + batataPalha + 
               ", Pepino: " + pepino + ", Tempero Extra: " + temperoExtra + "]";
    }
}
