package entities;

public class PessoaJuridica extends Contribuinte {

    private int numeroFuncionarios;

    public PessoaJuridica() {

    }

    public PessoaJuridica(int numeroFuncionarios, String name, double rendaAnual) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calcularImposto() {
        if (numeroFuncionarios <= 10) {
            return getRendaAnual() * 0.16;
        } else {
            return getRendaAnual() * 0.14;
        }
    }

}
