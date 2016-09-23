package chap8;
import java.util.Random;
public class MaruyamaFighter {
	static int getTe(){
		Random rand = new Random();
		int te = rand.nextInt(3);

		return te;
	}
}
