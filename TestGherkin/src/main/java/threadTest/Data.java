package threadTest;
import java.util.Arrays;

public class Data {

	public static Data d;
	String[] internalArray;// = new String[100];
	public static int MAX = 100;

	public Object obj = new Object();
	
	private Data () {
		
	}
	
	public static Data getInstance() {
	
		if (d == null) {
			d = new Data();
		}
		return d;
	}
	
	public String[] getValue(long id) {
		
		System.out.println("id espera" + id);
		if (internalArray == null) {
			synchronized (obj) {
				System.out.println("id entrou" + id);
				internalArray = new String[MAX];
				for (int i = 0; i < MAX; i++) {
					internalArray [i] = i + "";
				}
			}
		}
		System.out.println("id saiu" + id);
		return internalArray;
	}
	
	@Override
	public String toString() {
		return "Data [internalArray=" + Arrays.toString(internalArray) + "]";
	}
	
}
