package agenda1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contato contato = new Contato("");
		
		while(true) {
			
			String line = scanner.nextLine();
			System.out.println("$" + line);
			String input[] = line.split(" ");
			String cmd = input[0];
			
			if(cmd.equals("end")) {
				break;
			}else if(cmd.equals("init")) {
				contato = new Contato(input[1]);
			}
			else if(cmd.equals("add")) {
				contato.addFone(input[1], input[2]);
			}
			else if(cmd.equals("remove")) {
				contato.removeFone(Integer.parseInt(input[1]));
			}
			else if(cmd.equals("show")) {
				System.out.println(contato);;
			}
			else {
				System.out.println("Comando Inválido!");
			}
			
		}
		scanner.close();
	}

}
