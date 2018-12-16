import javax.swing.JOptionPane;

public class ChoHan {

	public static void main(String[] args) {
		NormalDice diceOne = new NormalDice(6);
		NormalDice.setSides(6);
		NormalDice.getSides();
		NormalDice.setArraySides();
		NormalDice.setSubtract(6);
		NormalDice.getSubtract();
		JOptionPane.showMessageDialog(null, diceOne.toString());
	}

}
