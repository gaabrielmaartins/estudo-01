
public abstract class Trabalhador {
    private String name;
    private String cpf;
    
    public abstract double calculaSalario();

    public Trabalhador(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return "Trabalhador{" + "name=" + name + ", cpf=" + cpf + '}';
    }
    
}
