import lombok.Generated;
import lombok.Setter;

@Generated
@Setter
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();

    }
}