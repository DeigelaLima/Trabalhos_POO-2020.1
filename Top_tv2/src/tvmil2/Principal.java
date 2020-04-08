package tvmil2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Televisao2 tv2 = new Televisao2(0,0,true);
		
		while(true) {	
			String linha = scanner.nextLine();
			System.out.println("TV2:" + " " + linha);
			String entrada[] = linha.split(" ");
			String comando = entrada[0];
			
			//END -> Finaliza execução.
			if(comando.equals("end")) {
				break;	
			//LIG -> ligar.
			}else if(comando.equals("lig")) {
				tv2.ligar();
			//DESLIG -> desligada.
			}else if(comando.equals("deslig")) {
				tv2.desligada();
			//SUB -> subir_canal
			}else if(comando.equals("sub")) {
				tv2.subir_canal();
			//DES -> descer_canal.
			}else if(comando.equals("des")) {
				tv2.descer_canal();
			//AUT -> aumentar_volume.
			}else if(comando.equals("aut")) {
				tv2.aumentar_volume();
			//DIM -> diminuir_volume.
			}else if(comando.equals("dim")) {
				tv2.diminuir_volume();
			}else {
				System.out.println("Falhou: comando inválido!");
			}
			
		}
	}

}
