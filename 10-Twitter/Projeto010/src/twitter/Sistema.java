package twitter;

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
	
	@Override
	public String toString() {
		String saida = "";
		for(Usuario usuario : usuarios.values())
			saida += usuario + "\n";
		return saida;
	}
		
}