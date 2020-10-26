package twitter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Sistema sistema = new Sistema();
		
		while(true) {
			String line = scanner.nextLine();
			//System.out.println("$" + line);
			String input[] = line.split(" ");
			String cmd = input[0];
			
			try {
				if(cmd.equals("end") ) {
					break;
				}else if(cmd.equals("addUser")) {
					sistema.addUsuario(input[1]);
				}else if(cmd.equals("show")) {
					System.out.println(sistema);
				}else if(cmd.equals("seguir")) {
					Usuario um = sistema.getUsuario(input[1]);
					Usuario dois = sistema.getUsuario(input[2]);
					um.seguir(dois);
				}else if(cmd.equals("twittar")) {
					String msg = "";
					for(int i = 2; i < cmd.length(); i++)
						msg += input[i] + " ";
					//sistema.getUsuario(input[1].twittar(msg));
				}else if(cmd.equals("like")) {
					sistema.darLike(input[1],Integer.parseInt(input[2]));
				}else if(cmd.equals("timeline")) {
					sistema.verTimeline(input[1]);
				}
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
