package carro_com_banco;

public class Pessoa {
	
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String toString() {
		return nome + ":" + idade;
	}
}
