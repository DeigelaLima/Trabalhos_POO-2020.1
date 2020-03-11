package motoca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			Motoca motoca  = new Motoca(2);
			
			while(true) {
				String line = scanner.nextLine();
				String entrada[] = line.split(" ");
				if(entrada[0].equals("end")) {
					break;
				}else if(entrada[0].equals("init")) { // inicia uma nova moto(potencia)			int idade = Integer.parseInt(entrada[2]);
					int potencia = Integer.parseInt(entrada[1]);
					motoca = new Motoca(potencia);
				}else if(entrada[0].equals("embarcar")) { //nome  idade
					int idade = Integer.parseInt(entrada[2]);//pega um inteiro e joga na variavel idade
					motoca.embarcar(new Pessoa (entrada[1], idade));//depois joga aqui
				}else if(entrada[0].equals("desembarcar")) {
					motoca.desembarcar();
				}else if(entrada[0].equals("dirigir")) {
					motoca.dirigir(Integer.parseInt(entrada[1]));
				}else if(entrada[0].equals("pagar")) {// valor
					motoca.pagar(Integer.parseInt(entrada[1]));//Interger-> gera o dado dentro da função
				}else {                                        // valor 1 transformando para inteiro
					System.out.println("Comando invalido");
				}
			}
			scanner.close();
		}
		
}		
		
		
		
		/*Pessoa davi = new Pessoa("Davi", 10);
		{
			Motoca moto = new Motoca();
			moto.embarcar(davi);
			moto.dirigir();            //moto desapareceu pq saiu do escopo, mas a pessoa nao
			moto.desembarcar();
		}
		Motoca moto2 = new Motoca();
		moto2.embarcar(davi);
		moto2.dirigir();
		moto2.desembarcar();

		System.out.println(davi.nome);

	}*/
