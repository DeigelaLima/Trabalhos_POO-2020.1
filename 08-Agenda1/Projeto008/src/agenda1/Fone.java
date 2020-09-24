package agenda1;

public class Fone {

	public String id;// atributo define o estado do objeto
	public String number;
	
	public Fone(String id, String number) {
		this.id = id;
		this.number = number;
	}

	@Override
	public String toString() {
		return id + ":" + number;
	}
	
	public static boolean validar(String namber) { // atributo da classe (static)
		String validos = "0123456789().-";
		for(int i = 0; i < namber.length(); i++) { //length : comprimento
			char c = namber.charAt(i); //chartAt retorna o caractere na posição i
			if(validos.indexOf(c) == -1) //indexOf : retorna um número inteiro de uma string correspondente
			    return false; // se não encontrar o caracter devolve -1           
		}
		return true;
	}
	
}
