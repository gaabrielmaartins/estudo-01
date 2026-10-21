
public class TesteFolhamento {
    public static void main(String[] args) {
        TrabalhadorAssalariado ta = new TrabalhadorAssalariado(1621.00, "Gabriel Martins", "111.111.111-66");
        TrabalhadorHorista th = new TrabalhadorHorista(14, 50, "Martins", "222.222.222-22");
        
        System.out.println(th.calculaSalario());
        System.out.println(ta.calculaSalario());
    }
}
