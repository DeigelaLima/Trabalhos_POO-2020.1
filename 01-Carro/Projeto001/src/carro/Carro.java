package carro;

public class Carro {
	
		int nPessoas = 0;
		int maxPessoas = 5;
		float odometro = 0;
		float gasolina = 0;
		float maxGasolina = 100;
		
		boolean embarcar() {
			if(this.nPessoas < this.maxPessoas) {
				this.nPessoas += 1;
				System.out.println("Embarcou!");
				return true;
			}else {
				System.out.println("Carro: Número de Pessoas = " + this.nPessoas);
			}
			System.out.println("Está lotado!");
			return false;
		}
		
		boolean desembarcar() {
			if(this.nPessoas > 0) {
				nPessoas -= 1;
				System.out.println("Desembarcou!");
				return true;
			}
			System.out.println("Está vazia");
			return false;
			
		}
		
		void abastecer(float gasolina) {
			this.gasolina += gasolina;
			if(this.gasolina > this.maxGasolina) // se estorei o maximo
				this.gasolina = this.maxGasolina;
				System.out.println("Tanque com gasolina, pode dirigir!");
				return;
		}
		
		void dirigir(float distancia) {
			if(this.nPessoas == 0) {
				System.out.println("Não tem quem dirija!");
				return;
			}
			if(this.gasolina >= distancia) {
				this.gasolina -= distancia;
				this.odometro += distancia;
				System.out.println("Dirigindo!");
				return;
			}
			System.out.println("Não tem gasolina");
			
		}
		
}
		
