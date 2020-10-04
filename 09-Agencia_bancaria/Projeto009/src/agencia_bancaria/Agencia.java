package agencia_bancaria;

import java.util.TreeMap;

public class Agencia {
	
	TreeMap<Integer, Conta> contas; //guarda as contas
	TreeMap<String, Cliente> clientes; //guarda os clientes
	int proxId;
	
	public Agencia() {
		int proxId = 0;
		contas = new TreeMap<Integer, Conta>();
		clientes = new TreeMap<String, Cliente>();
	}

	public void adicionarCliente(String id) {
		if(clientes.get(id) == null) {// verifica se o cliente existe
		   Conta corrente = new ContaCorrente(proxId++, id);
		   Conta poupanca = new ContaPoupanca(proxId++, id);
		   Cliente cliente = new Cliente(id);
		   
		   cliente.addConta(corrente);
		   cliente.addConta(poupanca);
		  
		   clientes.put(id, cliente); // guarda cliente no banco
		   contas.put(corrente.id, corrente); //guarda contas
		   contas.put(poupanca.id, poupanca);
		}
	}

	@Override
	public String toString() {
		String saida = "";
		for(Conta conta : contas.values())// todos clientes
			saida += conta + "\n";
		return saida;
	}
}
