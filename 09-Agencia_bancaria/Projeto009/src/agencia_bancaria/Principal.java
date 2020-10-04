package agencia_bancaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Agencia agencia = new Agencia();
		
		while(true) {
			String line = scanner.nextLine();
			System.out.println("$" + line);
			String input[] = line.split(" ");
			String cmd = input[0];
			
			if(cmd.equals("end"))
				break;
			else if(cmd.equals("addCli")) { // id
				agencia.adicionarCliente(input[1]);
			}
			else if(cmd.equals("show")) {
				System.out.println(agencia);
			}
			else if(cmd.equals("deposito")) { //value
				
			}
			else if(cmd.equals("transf")) {
				
			}
			else {
				System.out.println("fail: comando inválido");
			}
		}

	}

}
