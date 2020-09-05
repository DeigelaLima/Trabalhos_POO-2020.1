package JunkFood_machine;

public class Espiral {
	
	public int ind;
	public String nome;
	public int qtd_und;
	public float preco;
	
	public Espiral(int ind, String nome, int qtd_und, float preco) {
		this.ind = ind;
		this.nome = nome;
		this.qtd_und = qtd_und;
		this.preco = preco;
	}

	
	public int getInd() {
		return ind;
	}

	public void setInd(int ind) {
		this.ind = ind;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQtd() {
		return qtd_und;
	}


	public void setQtd_und(int qtd_und) {
		this.qtd_und = qtd_und;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return this.nome + ": " + this.qtd_und + " U : " + this.preco + "0 R$";
	}
	
}
