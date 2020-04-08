package tvmil2;

public class Televisao2 {

	private int canal;
	private int volume;
	private boolean ligada;	
	
	
	public Televisao2(int canal, int volume, boolean ligada) {
		System.out.println("O ESTADO DA TELEVISÃO:");
		this.canal = canal;
		this.volume = 0;
		this.ligada = true;
	}	
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	////////////////////////////////////////////
	public void ligar() {
		System.out.println("TV ligada!");
	}
	public void desligada() {
		System.out.println("TV Desligada!");
	}
	public void subir_canal() {
		volume ++;
		System.out.println("Canal modificado!");
		
	}
	public void descer_canal() {
		System.out.println("Mudou de canal!");
			//volume --;
	}
	public void aumentar_volume() {
		System.out.println("Aumentou o volume!");
		//volume ++;
	}
	public void diminuir_volume() {
		System.out.println("Diminuiu o volume!");
		//volume --;
	}
	
}