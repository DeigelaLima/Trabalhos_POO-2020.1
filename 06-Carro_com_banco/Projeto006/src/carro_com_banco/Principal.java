package carro_com_banco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		while(true) {
			String line = scanner.nextLine();
			String input[] = line.split(" ");
			String cmd = input[0];
			
			if(cmd.equals("end")) {
				break;
			}else if(cmd.equals("show")) {
				System.out.println(carro);
			}else if(cmd.equals("in")) { //entrar -> nome, idade, indice que a pessoa vai sentar
				carro.in(new Pessoa(input[1], Integer.parseInt(input[2])), Integer.parseInt(input[3]));
			}else if(cmd.equals("init")) {// recebo maxPass e MaxGas
				carro = new Carro();
			}else if(cmd.equals("dirigir")){
				carro.dirigir((input[1]), Integer.parseInt(input[2]));	
			}else if(cmd.equals("remover")) {
					carro.out(input[1]);// 1 = nome
			}else {
				System.out.println("fail: comando inválido.");
			}
		}
		scanner.close();
	}
	
}
