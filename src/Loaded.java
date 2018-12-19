import java.util.Random;
public class Loaded{
	private static int numSides;
	private static int min = 1;
	private static int roll;
	
	public Loaded(int m) {
		setSides(m);
		getSides();
		randomRoll();
		getRandomRoll();
	}
	public static void setSides(int s) {
		numSides = s;
	}
	public static int getSides() {
		return numSides;
	}
	public static void randomRoll() {
		Random rand = new Random();
		roll = rand.nextInt(((numSides-min)+1)+min);
		if(roll%2 == 0) {
			roll += 1;
			if(roll > numSides) {
				roll -= 2;
			}
			else if(roll < min) {
				roll = 1;
			}
		}
	}
	public static int getRandomRoll() {
		return roll;
	}

	public String toString() {
		return "Your die has "+numSides+" sides.";
	}
	public String rollString() {
		return "Your roll is: "+roll+" ";
	}
	

}

