package tvmil;

public class Televisao {

	public int canal = 1;
	public int volume = 1;
	public boolean ligada;
	
	
	
	public Televisao() {
		System.out.println("O ESTADO DA TELEVISÃO:");
	}
	
	public void ligar() {
		ligada = true;
	}
	public void desligada() {
		ligada = false;
	}
	public void subir_canal() {
		volume ++;
	}
	public void descer_canal() {
		volume --;
	}
	public void aumentar_volume() {
		volume ++;
	}
	public void diminuir_volume() {
		volume --;
	}
	
}
