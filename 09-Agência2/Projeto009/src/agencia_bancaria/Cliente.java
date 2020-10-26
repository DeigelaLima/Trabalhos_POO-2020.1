package agencia_bancaria;

import java.util.ArrayList;

public class Cliente {
// o cliente tem a visão da conta, ele não cria a conta
//(relação de agregação)	
	public String id;
	public ArrayList<Conta> contas;

	public Cliente(String id) {
		this.id = id;
		contas = new ArrayList<Conta>();
	}
	public void addConta(Conta conta) {
		contas.add(conta);
	}

	@Override
	public String toString() {
		return id;
	}
	
	
	
}
