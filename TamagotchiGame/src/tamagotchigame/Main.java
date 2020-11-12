package tamagotchigame;

public class Main {

	public static Tamagotchi myTama = new Tamagotchi();	
	
	public static void main(String[] args) {

		Menu.startMenu();
		
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println(myTama.toString());
		
		Game.actions();
	}

}