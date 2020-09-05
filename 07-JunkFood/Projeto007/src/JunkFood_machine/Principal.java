package JunkFood_machine;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Machine machine;
		machine = new Machine(0,0);
		
		while(true) {
			
			String line = scanner.nextLine();
			String input[] = line.split(" ");
			String cmd = input[0];
			
			if(cmd.equals("end")) {
				break;
			}else if(cmd.equals("init")) {
				machine = new Machine(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
			}else if(cmd.equals("show")) {
				System.out.println(machine);
			}else if(cmd.equals("set")){
				machine.set(Integer.parseInt(input[1]),input[2], 
						   Integer.parseInt(input[3]),Float.parseFloat(input[4]));
			}else if(cmd.equals("limpar")) {
				machine.limpar(Integer.parseInt(input[1]));	
			}else if(cmd.equals("dinheiro")) {
				machine.dinheiro(Float.parseFloat(input[1]));
			}else if(cmd.equals("comprar")) {
				machine.comprar(Integer.parseInt(input[1]));
			}else if(cmd.equals("troco")) {
				machine.troco();
			}else {
				System.out.println("fail: comando invalido.");
			}
		}
	}

}
