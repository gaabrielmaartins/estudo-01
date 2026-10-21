
public class TrabalhadorAssalariado extends Trabalhador{
    private double salarioFixo;

    public TrabalhadorAssalariado(double salarioFixo, String name, String cpf) {
        super(name, cpf);
        this.salarioFixo = salarioFixo;
    }
    
    @Override
    public double calculaSalario(){
        return salarioFixo;
    }
}
