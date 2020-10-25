package agencia_bancaria;

public class ContaPoupanca extends Conta {
	
	public float rendimento;

	public ContaPoupanca(int id, String idCliente) {
		super(id, idCliente);
		this.type = "CP";
		
	}
	
	public void atualizarMensal() {
		rendimento = (saldo*1)/100; //aumenta 1 porcento
		saldo = saldo + rendimento;
	}

	
}
