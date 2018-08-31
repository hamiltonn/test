package threadTest;

public class Loader {


	public static int MAX = 100;
	public static void main (String[] args) {
		
		Unit[] unit = new Unit [MAX];
		
		for (int i=0; i < MAX; i++) {
			unit [i] = new Unit();
			unit [i].start();
		}
		
		/*try {
			for (int i=0; i < 5; i++) {
				unit [i].join();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/
	}	
}
