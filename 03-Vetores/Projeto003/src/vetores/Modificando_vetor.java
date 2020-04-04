package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class Modificando_vetor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		
		while(true) {
			
			String linha = scanner.nextLine();
			System.out.println("$" + linha);
			String entrada[] = linha.split(" ");//SPLIT -> quebra uma String em várias substrings a partir de um caracter definido
			String comando = entrada[0];
			
			//END -> Finaliza execução.
			if(linha.equals("end")) {
				break;
			}
			//SHOW -> mostra os valores do vetor.
			else if(comando.equals("show")) {
				System.out.print("[ ");
				for(Integer valor : vetor)
					System.out.print(valor + " ");
				System.out.println("]\n");	
			}
			//RSHOW -> mostra os valores da estrutura do ultimo para o primeiro.
			else if(comando.equals("rshow")) {
				System.out.print("[ ");
				for(int i = vetor.size() - 1; i >= 0; --i)
					System.out.print(vetor.get(i) + " ");
				System.out.print("]\n");
			}
			//ADD -> adiciona os valores no final da estrutura.
			else if(comando.equals("add")) {
				for(int i = 1; i < entrada.length; i++)
					vetor.add(Integer.parseInt(entrada[i]));
			}
			//FIND -> retorna o índice da primeira ocorrência dos valores procurado ou -1 se ele não existir.
			else if(comando.equals("find")) {
				System.out.print("[ ");
				for(int i = 1; i < entrada.length; i++)
					System.out.print(vetor.indexOf(Integer.parseInt(entrada[i])) + " ");//O indexOf -> eh um metodo retorna a posição da primeira ocorrência
				System.out.print("]\n");                                               //do caractere especificado em uma sequencia de caracteres.
			}
			//GET -> mostra o valor do vetor na posicao do 'indice'
			else if(comando.equals("get")) {
				int indice = Integer.parseInt(entrada[1]);
				System.out.println(vetor.get(indice));
			}
			//SET -> muda o valor da posicao `indice` para o valor `vallor`.
			else if(comando.equals("set")) {
				int indice = Integer.parseInt(entrada[1]);
				int vallor = Integer.parseInt(entrada[2]);
				vetor.set(indice, vallor);
			}
			/*
			 * INS 'indice' V" -> insere esse valor V na posição indice da estrutura.
			 * Se o 'indice' for menor que 0, não faça a inserção.
			 * Se indice for maior que ultimo Indice válido, insira na ultima posição.
			 * Se 'indice' for um índice válido, desloque todos os elementos a partir dessa posição, uma posição à frente.
			*/
			else if(comando.equals("ins")) {
				int indice = Integer.parseInt(entrada[1]);
				int vallor = Integer.parseInt(entrada[2]);
				
				if(indice < 0)
					continue;
				if(indice > vetor.size()) 
					indice = vetor.size();
				vetor.add(indice, vallor);
			}
			//RMI -> remove o elemento dado o índice. Se o índice não existir, informe a falha.
			else if(comando.equals("rmi")) {
				int indice = Integer.parseInt(entrada[1]);
				if((indice < 0) || (indice >= vetor.size()))
					System.out.println("Falhou!");
				else
					vetor.remove(Integer.parseInt(entrada[1]));
			}
			/*
			 * RMA V" remove todos os elemento que contém esse valor. 
			 * Observe que você deve caminhar pela estrutura UMA ÚNICA VEZ removendo os elementos. 
			 * NÃO utilize find + remover por índice.
			 */
			else if(comando.equals("rma")) {
				int vallor = Integer.parseInt(entrada[1]);
				
				for(int i = 0; i < vetor.size(); i++) {
					if(vallor == vetor.get(i)) {
						vetor.remove(i);
						i--;
					}
				}
			}else {
				System.out.print("Falhou:comando não encontrado\n");
			}
			
		}
	}		

}