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
			}else {
				System.out.println("fail: comando invalido.");
			}
		}
	}

}
