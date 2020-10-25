package agencia_bancaria;

import java.util.TreeMap;

public class Agencia{
	
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

	public void sacar(int idConta, float valor) {
		contas.get(idConta).sacar(valor);
	}
	
	public void depositar(int idConta, float valor) {
		contas.get(idConta).depositar(valor);
	}

	public void transferir(int indice1, int indice2, float value) {
		if(contas.containsKey(indice1) && contas.containsKey(indice2)) {
			Conta conta1 = contas.get(indice1);
			Conta conta2 = contas.get(indice2);
			conta1.sacar(value);
			conta2.transferir(conta2, value);
		}
		else {
			System.out.println("Fail: conta não encontrada");
		}
		
	}
	
	public void atualizarMensal() {
		for(Cliente cliente : clientes.values()) {
			for(Conta conta : cliente.contas) {
				if(conta instanceof ContaCorrente)
					((ContaCorrente) conta).atualizacaoMensal();
				else if(conta instanceof ContaPoupanca) {
					((ContaPoupanca) conta).atualizarMensal();
				}
			}
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
