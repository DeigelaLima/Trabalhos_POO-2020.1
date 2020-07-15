package parquinho;

import java.util.ArrayList;
import java.util.Scanner;

public class Trampoline {

	private ArrayList<Kid> kidsWaiting = new ArrayList<>(); //crianca esperando
	private ArrayList<Kid> kidsPlaying = new ArrayList<>(); //crianca brincando

	public void arrive(Kid kid) { //chegar
		kidsWaiting.add(kid);
	}
	
	public void in() {//"entrar"
		Kid kid = kidsWaiting.get(0);//get da fila de espera
		kidsWaiting.remove(0);
		kidsPlaying.add(kid);//add na fila do pulapula
	}
	
	public void out() {//sair
		Kid kid = kidsPlaying.get(0);//get ultimo elemento da fila do pulapula
		kidsPlaying.remove(0);
		kidsWaiting.add(kid);
	}
	
	@Override
	public String toString() {
		return "=> " + kidsWaiting + " => " + kidsPlaying; 
	}
	
}
