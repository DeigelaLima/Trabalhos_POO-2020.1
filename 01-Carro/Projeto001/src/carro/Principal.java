//package carro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			Carro carro = new Carro();
			System.out.println("Digite: Embarcar-(qtd), Abastecer-(qtd), Dirigir-(qtd):");
			
			while(true) { // faça pra sempre.
				
				String line = scanner.nextLine(); 
				String entrada[] = line.split(" "); //quebrar linha digitada em vetor de strings
				
				if(entrada[0].equals("end")) {
					break;
				}else if(entrada[0].equals("embarcar")) { // primeiro elemento digitado do vetor
					carro.embarcar();
				}else if(entrada[0].equals("desembarcar")) { 
					carro.desembarcar();
				}else if(entrada[0].equals("abastecer")) {// qtd de combustivel
					float combustivel = Float.parseFloat(entrada[1]);
					carro.abastecer(combustivel);
				}else if(entrada[0].equals("dirigir")) {// distancia
					float distancia = Float.parseFloat(entrada[1]);
					carro.dirigir(distancia);
				}else {
					System.out.println("Comando invalido!");
				}
			}
			scanner.close();
		}
}