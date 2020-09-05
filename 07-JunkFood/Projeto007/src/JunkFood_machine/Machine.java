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

	ArrayList<Espiral> getEspirais() {
		return espirais;
	}

	void setEspirais(ArrayList<Espiral> espirais) {
		this.espirais = espirais;
	}

	int getQtdEspirais() {
		return qtdEspirais;
	}

	void setQtdEspirais(int qtdEspirais) {
		this.qtdEspirais = qtdEspirais;
	}

	int getMaxProdutos() {
		return maxProdutos;
	}

	void setMaxProdutos(int maxProdutos) {
		this.maxProdutos = maxProdutos;
	}

	float getLucro() {
		return lucro;
	}

	void setLucro(float lucro) {
		this.lucro = lucro;
	}
	
	float getSaldoCliente() {
		return saldoCliente;
	}
	
	void setSaldoCliente(float saldoCliente) {
		this.saldoCliente = saldoCliente;
	}

	public String toString() {
		String saida = "";
		for(int i = 0; i < espirais.size(); i++)
			saida += i + " " + espirais.get(i) + "\n";
		return saida;
			
	}
	//inserindo comida na espiral
	public boolean set(int ind, String nome, int qtd, float valor) {
		if(ind < 0 || ind >= getQtdEspirais()) {
			System.out.println("fail: indice digitando não existe");
			return false;
		}
		//if(espirais.get(ind) != null) {
			//System.out.println("fail: Estorou o limite da espiral");
			//return false;
		//}
		espirais.set(ind, new Espiral());
		return true;
	}
	//limpando espiral
	public void limpar(int ind) {
		if(espirais.get(ind) != null) {
			espirais.set(ind, null);
		}else if(ind > getQtdEspirais()-1) {
			System.out.println("Indice digitado não existe.");
		}else {
			System.out.println("O produto não existe na posição indicada" + ind);
		}
	}
	//Inserir dinheiro na espiral
	public void dinheiro(float valor) {
		setSaldoCliente(getSaldoCliente() + valor);
	}
	//comprar produto de uma espiral
	public void comprar(int ind) {
		
		
	}
	public void troco() {
		System.out.println("Você recebeu" + getSaldoCliente() + "R$");
		setSaldoCliente(0);
	}
	
}
