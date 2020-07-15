package parquinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			Trampoline trampoline = new Trampoline();
			
			while(true) {
				String linha = scanner.nextLine();
				System.out.println("$" + linha);
				String entrada[] = linha.split(" ");
				String comando = entrada[0];
				
				if(comando.equals("end"))
					break;
				else if(comando.equals("show")) {
					System.out.println(trampoline);
					
				}else if(comando.equals("chegou")) {
					String name = entrada[1];
					int age = Integer.parseInt(entrada[2]);
					Kid kid = new Kid(name,age);
					trampoline.arrive(kid);
		
				}else if(comando.equals("entrar")) {
					trampoline.in();
					
				}else if(comando.equals("sair")) {
					trampoline.out();
				}
			}
			
	}

}
