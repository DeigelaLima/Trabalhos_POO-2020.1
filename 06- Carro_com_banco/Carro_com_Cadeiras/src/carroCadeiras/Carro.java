package carroCadeiras;

import java.util.ArrayList;

public class Carro {
	
	ArrayList<Pessoa> passageiros; // passagerios: uma estrutura que cabe varias pessoas
	public int maxPass;

	public Carro() {
		this.maxPass = 5;
		this.passageiros = new ArrayList<>(5);// cinco, é a capacidade inicial do vetor
		for(int i = 0; i < this.maxPass; i++)
			this.passageiros.add(null);// cria os bancos
	}
	
	public void in(Pessoa pessoa, int indice) { //entrar
		if(indice < 0 || indice >= this.maxPass) { // indice que não existe
			System.out.println("Posição não existe.");
			return; // não deu para sentar rsrs
	    }
		if(this.passageiros.get(indice) != null) {//existe alguem nessa posição
			System.out.println("Posição está ocupada.");
			return;
		}
		this.passageiros.set(indice, pessoa);//coloca alguem no banco
	}
	
	public void out(String nome) { // sair
		for(int i = 0; i < this.passageiros.size(); i++) {
			if(this.passageiros.get(i) != null && this.passageiros.get(i).nome.equals(nome)) {
				this.passageiros.set(i, null);// a pessoa não está mais no local, coloco nulo
				break;
			}
		}
	}

	public String toString() {
		String saida = "[--o--|--------]\n";
		saida += this.passageiros.get(0) + "|" + this.passageiros.get(1) + "\n";
		saida += this.passageiros.get(2) + "|" + this.passageiros.get(3) + "|" +
				this.passageiros.get(4) + "\n";
			    return saida;
	}
	
}
