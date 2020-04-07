package tamagotchi;

import java.util.Scanner;

public class Jogo{
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);

			Tamagotchi jogo = new Tamagotchi("", 0, 0, 0);
			
			while(true) {
				String linha = scanner.nextLine();
				System.out.println("$" + linha);
				String entrada[] = linha.split(" ");
				String comando = entrada[0];
				
				if(comando.equals("end"))
					break;
				else if(comando.equals("show")) {
					jogo.show();
				 }else if(comando.equals("init")) {
						 Tamagotchi pet = new Tamagotchi(entrada[1],Integer.parseInt(entrada[2]), 
						 Integer.parseUnsignedInt(entrada[3]),Integer.parseInt(entrada[4]));
						 jogo.iniciar(pet);		 
				 }else if(comando.equals("play")) {
					 jogo.brincar();
			     }else if(comando.equals("eat")) {
			    	 jogo.comer();
			     }else if(comando.equals("clean")) {
			    	 jogo.banho();
			     }else if(comando.equals("sleep")) {
			    	 jogo.dormir();
			     }else {
			    	 System.out.println("Falhou: Comando Invalido.");
			     }
				
		}

	}


}
