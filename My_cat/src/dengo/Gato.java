package dengo;

public class Gato {

	int bucho = 0;
	int maxBucho = 4;
	boolean comVida = true; 
	
	
	public Gato() {
		this.bucho = bucho;
		this.maxBucho = maxBucho;
		this.comVida = comVida;
		System.out.println("QUERO COMER MAMAE:");
	}
	public void comer(int qtd) {// mais comida no bucho
		if(comVida) {
			bucho += qtd;
			System.out.println("Delicia Mamãe!");
			if(bucho > maxBucho) {
				System.out.println("Vou explodir Mamãe!");
				comVida = false;
			}
		}
	}
	public void esperar() {// menos comida no bucho
		if(comVida) {
			bucho -= 1;
			System.out.println("Minha barriga tá secando!");
			if(bucho < 0) {
				System.out.println("Desmaiei!");
			}
		}
	}
	public void estado() {
		if(comVida) 
			System.out.println("Vivo");
		else 
			System.out.println("Morto");
			System.out.println("Bucho: " + bucho);
	}
	
}
