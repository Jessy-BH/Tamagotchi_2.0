package tamagotchigame;

public class MyThread extends Thread {

	@Override
	public void run() {
		
		for (int i = 0 ; Main.myTama.vie > 0; i++) {
			
			sleep(10000);
			Main.myTama.setCompteurFaim(-1);
			
			if (Main.myTama.getCompteurFaim() == 0) {
				
				Main.myTama.setVie(-1);
			}
		}
	}
	
	public static void sleep(int x) {
		
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}