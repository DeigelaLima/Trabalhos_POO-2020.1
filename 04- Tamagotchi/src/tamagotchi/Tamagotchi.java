package tamagotchi;

public class Tamagotchi {

		String  nome;
		private int energiaMax= 20, fomeMax = 10, limpezaMax = 15;
		private int energia, fome, limpeza;
	    private int diamantes;
		private int idade;
	    boolean vivo;
		
		
		public Tamagotchi(String nome, int energia, int fome, int limpeza) {
			this.nome = nome;
			this.energiaMax = energiaMax;
			this.fomeMax = fomeMax;
			this.limpezaMax = limpezaMax;
			this.energia = energia;
			this.fome = fome;
			this.limpeza = limpeza;
			this.diamantes = 0;
			this.idade = 0;
			this.vivo = true;
		}
		
		public int getEnergia() {
			return energia;
		}
		public void setEnergia(int energia) {
			if(energia > this.energiaMax) {
				this.energia = energiaMax;	
			}else if(energia <= 0) {
				this.energia = 0;
				System.out.println("Falhou: Pet morreu de fraqueza!");
				this.vivo = false;
			}else
				this.energia = energia;
		}
		public int getFome() {
			return fome;
		}
		public void setFome(int fome) {
			if(fome > fomeMax)
				this.fome = fomeMax;
			else if(fome <= 0) {
				this.fome = 0;
				System.out.println("Falhou: Pet morreu de fome!");
				this.vivo = false;
			}else
				this.fome = fome;
		}
		public int getLimpeza() {
			return limpeza;
		}
		public void setLimpeza(int limpeza) {
			if(limpeza > limpezaMax)
				this.limpeza = limpezaMax;
			if(limpeza <= 0) {
				this.limpeza = 0;
				System.out.println("Morreu surjo!");
				vivo = false;
			}
			else
				this.limpeza = limpeza;
		}
		int getEnergiaMax() {
			return energiaMax;
		}
		void setEnergiaMax(int energiaMax) {
			this.energiaMax = energiaMax;
		}
		int getFomeMax() {
			return fomeMax;
		}
		void setFomeMax(int fomeMax) {
			this.fomeMax = fomeMax;
		}
		int getLimpezaMax() {
			return limpezaMax;
		}
		void setLimpezaMax(int limpezaMax) {
			this.limpezaMax = limpezaMax;
		}

		private Tamagotchi pet;
		
		//INIT -> energia-fome-limpeza" recebe os valores do pet.
		//Se algum atributo atingir 0, o pet morre e não poderá executar nenhuma ação.
		public void iniciar(Tamagotchi pet) {
			if(this.pet == null) {
				this.pet = pet;
			}else {
				System.out.println("Seu Tamagotchi já existe!");
			}
		}
		public boolean vivo() {
			if(this.vivo)
				return true;
			System.out.println("Falhou: O Pet Morreu.");
			return false;
		}
		//PLAY -> altera em -2 energia, -1 saciedade, -3 limpeza, +1 diamante, +1 idade.
		//Se algum atributo atingir 0, o pet morre e não poderá executar nenhuma ação.
		public void brincar() { 
			if(!this.vivo())
				return;
			this.pet.setEnergia(this.pet.getEnergia() - 2);
			this.pet.setFome(this.pet.getFome() - 1);
			this.pet.setLimpeza(this.pet.getLimpeza() - 3);
			this.pet.diamantes += 1;
			this.pet.idade += 1;
		}
		//CLEAN -> alteram em -3 energia, -1 na saciedade, MAX na limpeza, +0 diamantes, +2 na idade.
		//Se algum atributo atingir 0, o pet morre e não poderá executar nenhuma ação.
		public void banho() {
			if(!this.vivo())
				return;
			int valor = this.pet.limpezaMax - this.pet.getLimpeza();
			this.pet.setEnergia(this.pet.getEnergia() - 3);
			this.pet.setFome(this.pet.getFome() - 1);
			this.pet.setLimpeza(this.pet.getLimpeza() + valor);
			this.pet.diamantes += 0;
			this.pet.idade += 2;
		}
		//EAT -> altera em -1 a energia, +4 a saciedade, -2 a limpeza, +0 diamantes,  +1 a idade.
		//Se algum atributo atingir 0, o pet morre e não poderá executar nenhuma ação.
		public void comer() {
			if(!this.vivo())
				return;
			this.pet.setEnergia(this.pet.getEnergia() - 1);
			this.pet.setFome(this.pet.getFome() + 4);
			this.pet.setLimpeza(this.pet.getLimpeza() - 2);
			this.pet.diamantes += 0;
			this.pet.idade += 1;
		}
		//SLEEP -> aumenta energia até o máximo e idade aumenta do número de turnos que o pet dormiu.
		//Os outros atributos permanecem inalterados.
		//Se algum atributo atingir 0, o pet morre e não poderá executar nenhuma ação
		//Para dormir, precisa ter perdido pelo menos 5 unidades de energia
		public void dormir() {
			if(!this.vivo())
				return;
			if(this.pet.energiaMax - this.pet.energia <= 5) {
				System.out.println("Falhou: O Pet não está com sono!");
				return;
			}
			this.pet.idade += this.pet.energiaMax - this.pet.energia;
			this.pet.setEnergia(this.pet.getEnergiaMax());
		}
		public void show() {
			if(this.pet == null) {
				System.out.println("Falhou: Nenhum Tamagotchi vivo");
			}else {
				System.out.println( "[" + this.pet.nome + "] " + "=>" + " "  
						+ "E:" + this.pet.getEnergia() + "/" + this.pet.energiaMax + ", "
						+ "F:" + this.pet.getFome() + "/" + this.pet.fomeMax + ", "
						+ "L:" + this.pet.getLimpeza() + "/" + this.pet.limpezaMax + ", "
						+ "D:" + this.pet.diamantes + ", "
						+ "I:" + this.pet.idade);
			}
				
		}
}
