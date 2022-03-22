package exercicio03;

//conta corrente
public class ContaCorrente extends Conta {

	public ContaCorrente(String titular, String numero, double saldo) {
		super(titular, numero, saldo);
	}

	@Override
	double rendimento() {
		return this.saldo * 0.03;
	}

	@Override
	public double calcularImposto() {
		return rendimento() * 0.25;
	}

}