
public class TrabalhadorHorista extends Trabalhador{
    
    private int horasTrabalhadas;
    private double valorHora;

    public TrabalhadorHorista(int horasTrabalhadas, double valorHora, String name, String cpf) {
        super(name, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calculaSalario(){
        return horasTrabalhadas * valorHora;
    }
    
}
