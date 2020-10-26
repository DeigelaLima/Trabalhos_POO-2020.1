package twitter;

import java.util.ArrayList;

public class Usuario {

	static int nextId = 0;
	private String usuario;
	public String login;
	public int naoLidos = 0;
	public ArrayList<Usuario> seguidores;
	public ArrayList<Usuario> seguidos;
	public ArrayList<Tweet> timeline;
	public ArrayList<Tweet> meusTweets;
	
	
	public Usuario(String usuario) {
		this.usuario = usuario;
		seguidores = new ArrayList<Usuario>();
		seguidos = new ArrayList<Usuario>();
		timeline = new ArrayList<Tweet>();
		
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void seguir (Usuario other) {
		//verificar se o usuario existe
		for(Usuario usuario : seguidos)
			if(usuario.usuario.equals(other.usuario)) // se true, eu já sigo, só retorno    
				return;
		//Adicina na lista de seguidos
		this.seguidos.add(other);
		other.seguidores.add(this);
	}
	
	/*public void twittar(String msg) {
		meusTweets.add(tweet);
		for(Usuario seg : seguidores) {
			seg.naoLidos++;
			seg.timeline.add(tweet);
		}
		this.timeline.add(tweet);
		Tweet tweet = new Tweet(Usuario.nextId, this.login, msg);
		Usuario.nextId += 1;
		this.timeline.add(tweet);
		for(Usuario seguidos : seguidores.getAll()) {
			seguidos.timeline.add(tweet);
			seguidos.naoLidos += 1;
		}
	}*/
	
	public void darLike(int idTweet) {
		for(Tweet tweet : timeline) {
			if(tweet.getId() == idTweet) {
				tweet.darLike(this.usuario);
			}
		}
	}
	
	public void lerTimeline() {
		for(Tweet tweet : timeline) {
			System.out.println(tweet);
		}
		this.naoLidos = 0;
	}
	@Override
	public String toString() {
		String saida = usuario + "\n";
		saida += " seguidos [";
		for(Usuario usuario: seguidos)
			saida += usuario.usuario + " ";
		saida += "]\n seguidores [";
		for(Usuario usuario : seguidores)
			saida += usuario.usuario + " ";
		saida += "]";
		return saida;
				
	}
}
