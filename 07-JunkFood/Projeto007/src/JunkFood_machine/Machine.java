package JunkFood_machine;

import java.util.ArrayList;

public class Machine {
	
	private ArrayList<Espiral> espirais;
	private int qtdEspirais;
	private int maxProdutos;
	private float saldoCliente;
	private float lucro;
	
	
	
	public Machine(int qtdEspirais, int maxProdutos ) {
		this.qtdEspirais = qtdEspirais;
		this.maxProdutos = maxProdutos;
		
		espirais = new ArrayList<Espiral>();
		for(int i = 0; i < qtdEspirais; i++)
			this.espirais.add(new Espiral());//criando espiral
	}

	public String toString() {
		String saida = "";
		for(int i = 0; i < espirais.size(); i++)
			saida += i + " " + espirais.get(i) + "\n";
		return saida;
			
	}
	
	/*public boolean inserirDinheiro(int valor) {
		
	}
	
	public float pedirTroco() {
		
	}
	
	public boolean vender(int indice) {
		
	}
	
	public boolean alterarEspiral(int indice, String nome, int qtd, float preco) {
		
	}*/
	
	float getSaldoCliente() {
		return saldoCliente;
	}
	
	
}
