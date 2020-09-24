package agenda1;
import java.util.ArrayList;

public class Contato {

		private String name;
		private ArrayList<Fone> fones; //null (array não esxiste)
		
		public Contato(String name) {
			this.name = name;
			fones = new ArrayList<>(); //inicializando o array sem tel (array existe)
		}

		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			String saida = "- " + this.name;
			if(fones.size() > 0)
				saida += " ";
			for(int i = 0; i < fones.size(); i++) {
				Fone fone = fones.get(i);
				saida += "[" + i + ":" + fone + "]";
			}
			return saida;
		}
		
		public void addFone(String id, String namber) {//Composição
			if(Fone.validar(namber))
				fones.add(new Fone(id,namber)); //add fone
			else
				System.out.println("Fail: Fone inválido!");
		}
		
		public void removeFone(int indice) {
			if(indice < 0 || indice >= fones.size()) //não dá erro no indice
				return;
			fones.remove(indice);
		}	
}
