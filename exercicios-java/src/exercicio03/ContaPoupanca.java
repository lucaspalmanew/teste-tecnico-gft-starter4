package exercicio03;

//conta poupança
public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular, String numero, double saldo) {
		super(titular, numero, saldo);
	}

	@Override
	double rendimento() {
		return this.saldo * 0.05;
	}

	@Override
	public double calcularImposto() {
		return rendimento() * 0.1;
	}

}