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
			this.espirais.add(null);//criando espiral
	}

	public int getQtdEspirais() {
		return qtdEspirais;
	}

	public void setQtdEspirais(int qtdEspirais) {
		this.qtdEspirais = qtdEspirais;
	}

	public int getMaxProdutos() {
		return maxProdutos;
	}

	public void setMaxProdutos(int maxProdutos) {
		this.maxProdutos = maxProdutos;
	}

	public float getLucro() {
		return lucro;
	}

	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
	
	public float getSaldoCliente() {
		return saldoCliente;
	}
	
	public void setSaldoCliente(float saldoCliente) {
		this.saldoCliente = saldoCliente;
	}

	//inserindo comida na espiral
	public boolean set(int ind, String nome, int qtd, float valor) {
		if(ind < 0 || ind >= getQtdEspirais()) {
			System.out.println("fail: indice digitando não existe");
			return false;
		}
		if(espirais.get(ind) != null) {
			System.out.println("fail: Estorou o limite da espiral");
			return false;
		}
		espirais.set(ind, new Espiral(ind, nome, qtd, valor));
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
	public void comprar(int indice) {
		int sizeEspirais = getQtdEspirais()-1; //diminui 1
		
		for(Espiral produto : espirais) {
			if(produto != null) {
				if(produto.ind == indice) {
					if((this.saldoCliente > produto.preco) && (produto.qtd_und > 0)) {
						System.out.println("Você comprou um " + produto.getNome());
						setSaldoCliente(this.saldoCliente - produto.preco);
						produto.setQtd_und(produto.getQtd()-1); //diminui 1 na unidade
						break;
					}
					else if((this.saldoCliente > 0) && (produto.qtd_und == 0)) {
						System.out.println("fail: A espiral está sem produto.");
						break;
					}
					else if((this.saldoCliente < produto.preco) && (this.saldoCliente > 0 || 
							this.saldoCliente == 0) && (produto.qtd_und > 0)) {
						System.out.println("fail: Seu saldo é insuficiente.");
						break;
					}
				}
				else if(indice > sizeEspirais) {
					System.out.println("fail: indice digitado não existe.");
					break;
				}
			}
		}
		
	}
	
	public void troco() {
		System.out.println("Você recebeu: " + getSaldoCliente() + "0 R$");
		setSaldoCliente(0);
	}
	@Override
	public String toString(){
		int ind = 0;
		//for(int i = 0; i < espirais.size(); i++)
			//saida += i + " " + espirais.get(i) + "\n";
		String saida = "Saldo: " + getSaldoCliente() + "0\n";
			for(Espiral produto : espirais) {
				if((produto == null) && ind < (getQtdEspirais())) {
					saida += ind + " [ empty : 0 U : 0.00 R$ ] \n";
			    }else if((produto != null) && (ind < getQtdEspirais())) {
			    	saida += ind + " [ "+ produto + "] \n";
			    }ind ++; //incrementar o ind da espiral
		
	        }
			return saida;
  }
}
