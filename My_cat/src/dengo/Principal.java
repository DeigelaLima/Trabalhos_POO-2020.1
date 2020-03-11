package dengo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Gato tom = new Gato();
		
		while(true) {
			String line = scanner.nextLine();
			String[] vetor = line.split(" ");//quebrar por palavras
			
			if(vetor[0].equals("comer"))
				tom.comer(Integer.parseInt(vetor[1]));
			else if(vetor[0].equals("esperar"))
				tom.esperar();
			else if(vetor[0].equals("estado"))
				tom.estado();
			else if(vetor[0].equals("fim"))
				break;
			else
				System.out.println("Comando invalido!");
		}

	}

}
