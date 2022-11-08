
package entities;


public class Contribuinte {
    private String name;
    private double rendaAnual;
    
    
    public Contribuinte(){
        
    }

    public Contribuinte(String name, double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    
    
    public double calcularImposto(){
        return 0;
    }
    
}
