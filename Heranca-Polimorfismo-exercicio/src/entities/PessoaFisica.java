package entities;

public class PessoaFisica extends Contribuinte {

    private double gastosSaude;

    public PessoaFisica() {

    }

    public PessoaFisica(String name, double rendaAnual) {
        super(name, rendaAnual);
    }

    
    public PessoaFisica(double gastosSaude, String name, double rendaAnual) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0;
        if (getRendaAnual() < 20000) {
          return (getRendaAnual() * 0.15) - (getGastosSaude() * 0.5);
        } else {
           return (getRendaAnual() * 0.25) - (getGastosSaude() * 0.5);
        }
        
    }

}
