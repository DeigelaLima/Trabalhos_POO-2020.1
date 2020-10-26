package agencia_bancaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Agencia agencia = new Agencia();
		
		while(true) {
			String line = scanner.nextLine();
			//System.out.println("$" + line);
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
				agencia.depositar(Integer.parseInt(input[1]), Float.parseFloat(input[2]));
			}else if(cmd.equals("saque")) { //value
				agencia.sacar(Integer.parseInt(input[1]), Float.parseFloat(input[2]));
			}else if(cmd.equals("transf")) {
				agencia.transferir(Integer.parseInt(input[1]), Integer.parseInt(input[2]), Float.parseFloat(input[3]));
			}else if(cmd.equals("update")) {
				agencia.atualizarMensal();
			}else {
				System.out.println("fail: comando inválido");
			}
		}

	}

}
