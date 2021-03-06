import java.util.Random;

import javax.swing.JOptionPane;
public class NormalDice{
	public static int numSides;
	private static int min = 1;
	public static int roll;
	
	public NormalDice(int num){
		setSides(num);
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
		int roll = rand.nextInt(((numSides-min)+1)+min);
		
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

