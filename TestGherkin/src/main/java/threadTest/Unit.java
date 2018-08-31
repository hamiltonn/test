package threadTest;
import java.util.Arrays;
import java.util.Random;

public class Unit extends Thread{

	private static Random random= new Random (System.currentTimeMillis());
	public static int ESPERA = 5000;
	public void run () {
		
		try {
			Data d = Data.getInstance ();
			Thread.sleep(random.nextInt (ESPERA));
			String[] value = d.getValue(Thread.currentThread().getId());
			
			System.out.println("Data [internalArray=" + Arrays.toString(value) + "]");

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
