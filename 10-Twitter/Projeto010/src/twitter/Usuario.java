package twitter;

import java.util.ArrayList;

public class Usuario {

	String id;
	ArrayList<Usuario> seguidores;
	ArrayList<Usuario> seguidos;
	
	
	public Usuario(String id) {
		this.id = id;
		seguidores = new ArrayList<Usuario>();
		seguidos = new ArrayList<Usuario>();
	}
	
	public void seguir (Usuario other) {
		//verificar se o usuario existe
		for(Usuario usuario : seguidos)
			if(usuario.id.equals(other.id)) // se true, eu já sigo, só retorno    
				return;
		//Adicina na lista de seguidos
		this.seguidos.add(other);
		other.seguidores.add(this);
	}
	@Override
	public String toString() {
		String saida = id + "\n";
		saida += "<-[";
		for(Usuario usuario: seguidos)
			saida += usuario.id + " ";
		saida += "]\n-> [";
		for(Usuario usuario : seguidores)
			saida += usuario.id + " ";
		saida += "]";
		return saida;
				
	}
}
