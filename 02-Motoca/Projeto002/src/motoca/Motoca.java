package motoca;

public class Motoca {
	
	Pessoa pessoa;
	int potencia;
	int tempo;
	

	public Motoca(int potencia) {
		this.potencia = potencia;
		System.out.println("VAMOS PASSEAR NA MOTOCA!");
		
	}
	void embarcar(Pessoa pessoa) {
		if(this.pessoa == null)
			this.pessoa = pessoa;
		else
			System.out.println("Ja tem gente na motoca");
	}
	void pagar(int valor) {
		this.tempo += valor;
	}
	void desembarcar() {
		if(this.pessoa != null)
			this.pessoa = null;
		else
			System.out.println("Nao tem ninguem na moto");
	}

	void dirigir(int tempo){
		if(this.pessoa == null) {
			System.out.println("Nao tem ninguem na moto");
			return;
		}
		if(this.tempo < tempo) {
			System.out.println("Compre mais minutos!");
			return;
		}
		if(this.pessoa.idade < 2)
			System.out.println("Muito pequeno pra andar de moto");
		else if(this.pessoa.idade > 10)
			System.out.println("Muito grande pra andar de moto");
		else { 
			this.tempo -= tempo; //diminuindo o tempo
			System.out.println(this.pessoa.nome + " "  + this.fazerBarulho());//imprime o nome mais o espaco
			
		}
		
	}
	String fazerBarulho() {
		String out = ""; // strings de run's
		for(int i = 0; i < this.potencia; i++)
			out += " run";
		return out;
	}
	
  }