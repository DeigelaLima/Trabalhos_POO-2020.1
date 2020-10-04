package agencia_bancaria;

public class ContaCorrente extends Conta{
	
	public float tarifaMensal = 20;

	public ContaCorrente(int id, String idCliente) {
		super(id, idCliente);
		this.type = "CC";
	}
	
	public void atualizacaoMensal() {
		saldo = saldo - tarifaMensal;
	}

}
