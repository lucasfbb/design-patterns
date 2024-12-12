package Builder;

// Builder para um hambúrguer extra recheado com tudo que o cliente desejar
public class DeluxeHamburguerBuilder implements HamburguerBuilder {
    private Hamburguer hamburguer;

    public DeluxeHamburguerBuilder() {
        this.hamburguer = new Hamburguer();
    }

    @Override
    public void definirPao(String pao) { 
        hamburguer.setPao(pao); 
    }
    
    @Override
    public void definirCarne(int carne) { 
        hamburguer.setCarne(carne); 
    }
    
    @Override
    public void definirQueijo(String queijo) { 
        hamburguer.setQueijo(queijo + " extra"); 
    }
    
    @Override
    public void definirBacon(int bacon) { 
        hamburguer.setBacon(bacon); 
    }

    @Override
    public void definirMolho(String molho) { 
        hamburguer.setMolho(molho); 
    }
    
    @Override
    public void definirSalada(String salada) { 
        hamburguer.setSalada(salada); 
    }
    
    @Override
    public void definirCebola(String cebola) { 
        hamburguer.setCebola(cebola); 
    }
    
    @Override
    public void definirTomate(String tomate) { 
        hamburguer.setTomate(tomate); 
    }
    
    @Override
    public void definirOvo(String ovo) { 
        hamburguer.setOvo(ovo); 
    }
    
    @Override
    public void definirTipoBacon(String tipoBacon) { 
        hamburguer.setTipoBacon(tipoBacon); 
    }
    
    @Override
    public void definirBatataPalha(String batataPalha) { 
        hamburguer.setBatataPalha(batataPalha); 
    }
    
    @Override
    public void definirPepino(String pepino) { 
        hamburguer.setPepino(pepino); 
    }
    
    @Override
    public void definirTemperoExtra(String temperoExtra) { 
        hamburguer.setTemperoExtra(temperoExtra); 
    }
    
    @Override
    public Hamburguer build() { 
        return hamburguer; 
    }

}