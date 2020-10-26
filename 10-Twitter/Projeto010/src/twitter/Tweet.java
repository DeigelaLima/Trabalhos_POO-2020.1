package twitter;

import java.util.ArrayList;

public class Tweet {

	private int id;
	public String usuario;
	public String msg;
	public ArrayList<String> likes;
	
	public Tweet(int id, String usuario, String msg) {
		this.id = id;
		this.usuario = usuario;
		this.msg = msg;
		this.likes = new ArrayList<String>();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void darLike(String usuario) {
		this.likes.add(usuario);
	}
	
	public String toString() {
		String saida = id + ":" + ":" + msg + " [ ";
		for(String usuario :likes)
			saida += usuario + " ";
		return saida + "]";
	}

}
