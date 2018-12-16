
public class NormalDice{
	public static int numSides;
	public static int [] arraySides = {};
	private static int subtract = 1;
	
	public NormalDice(int num){
		setSides(num);
		setSubtract(num);
		setArraySides();
		getSides();
		getSubtract();
	         
	}
	public static void setSides(int s) {
		numSides = s;
	}
	public static int getSides() {
		return numSides;
	}
	public static void setSubtract(int s) {
		subtract = (s-(s-1));

	}
		public static int getSubtract() {
		return subtract;
	}
	public static void setArraySides() {
		for(int i = 0;i<subtract; i++){
	         arraySides [i] = subtract;
	         System.out.println(arraySides.length);
	         subtract++;
		}
	}
	public String toString() {
		return "Your dice has "+numSides+" sides.";
	}
	}

