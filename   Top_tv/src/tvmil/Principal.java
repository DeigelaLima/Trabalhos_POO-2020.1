package tvmil;

public class Principal {

	public static void main(String[] args) {
		
		Televisao tv = new Televisao();
		
		tv.ligar();
		System.out.println("A televisao esta " + tv.ligada);
		
		tv.desligada();
		
		tv.aumentar_volume();
		System.out.println("Volume: " + tv.volume);
		
		tv.diminuir_volume();
		
		tv.subir_canal();
		System.out.println("Canal: " + tv.canal);
		
		tv.descer_canal();
		
	}

}
