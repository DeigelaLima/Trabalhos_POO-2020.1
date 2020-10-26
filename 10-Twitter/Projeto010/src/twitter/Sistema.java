package twitter;

import java.util.Collection;
import java.util.TreeMap;

public class Sistema {

	TreeMap<String, Usuario> usuarios;
	
	public Sistema() {
		usuarios = new TreeMap<String, Usuario>();
	}
	
	public void addUsuario(String id) {
		Usuario usuario = usuarios.get(id);
		if(usuario == null) {
			// Adiciona na lista de usuarios
			usuarios.put(id, new Usuario(id));
		}
	}
	
	public Usuario getUsuario(String id) {
		Usuario usuario = usuarios.get(id);
		if(usuario == null)
			throw new RuntimeException("fail: usuario não encontrado");
		return usuario;
	}
	
	//public void usuarioTweetar(String nome, String msg) {
		//getUsuario(nome).twittar(new Tweet(nome, msg));
	//}
	
	public void verTimeline(String nome) {
		getUsuario(nome).lerTimeline();
	}
	
	public void darLike(String nome, int idTweet) {
		getUsuario(nome).lerTimeline();
	}
	
	Collection<Usuario> getAll(){
		return this.usuarios.values();
	}
	
	@Override
	public String toString() {
		String saida = "";
		for(Usuario usuario : usuarios.values())
			saida += usuario + "\n";
		return saida;
	}
		
}