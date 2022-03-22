package exercicio03;

//principal
public class Principal {
	
	public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente("Lucas Palma", "1811", 5000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Gustavo Palma", "1105", 3500.00);

        System.out.println("CONTA CORRENTE: ");
        System.out.println("NOME: " + contaCorrente.getTitular());
        System.out.println("NÚMERO: " + contaCorrente.getNumero());
        System.out.println("SALDO: " + contaCorrente.getSaldo());
        System.out.println("RENDIMENTO: " + contaCorrente.rendimento());
        System.out.println("IMPOSTO: " + contaCorrente.calcularImposto());

        System.out.println("*************************************************");

        System.out.println("CONTA POUPANÇA: ");
        System.out.println("NOME: " +contaPoupanca.getTitular());
        System.out.println("NÚMERO: " + contaPoupanca.getNumero());
        System.out.println("SALDO: " + contaCorrente.getSaldo());
        System.out.println("RENDIMENTO: " + contaPoupanca.rendimento());
		System.out.println("IMPOSTO: " + contaPoupanca.calcularImposto());

        System.out.println("*************************************************");

	}

}