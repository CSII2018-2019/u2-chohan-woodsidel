import javax.swing.JOptionPane;

public class ChoHan {
	static String rollSide;
	static String result1;
	static String result2;
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to ChoHan!");
		String decision = JOptionPane.showInputDialog("Do you want to play with normal or loaded dice?");
		if(decision.equals("Loaded")) {
			Loaded diceOne = new Loaded(6);
			Loaded.setSides(6);
			Loaded.getSides();
			Loaded diceTwo = new Loaded(6);
			Loaded.setSides(6);
			Loaded.getSides();
			JOptionPane.showMessageDialog(null, "Player 1: "+diceOne.toString()+"\nPlayer 2: "+diceTwo.toString());
			JOptionPane.showMessageDialog(null, "Let's start!");
			Loaded.randomRoll();
			int roll1 = Loaded.getRandomRoll();
			Loaded.randomRoll();
			int roll2 = Loaded.getRandomRoll()+1;
			String bet1 = JOptionPane.showInputDialog(null, "Player 1: What is your bet? Even or Odd");
			String bet2 = JOptionPane.showInputDialog(null, "Player 2: What is your bet? Even or Odd");
			if((roll1 + roll2) % 2 == 0) {
				rollSide = "Even";
			}
			else {
				rollSide = "Odd";
			}
			if(bet1.equals(rollSide)) {
				result1 = "WIN";
			}
			else {
				result1 = "LOSE";
			}
			if(bet2.equals(rollSide)) {
				result2 = "WIN";
			}
			else {
				result2 = "LOSE";
			}
			JOptionPane.showMessageDialog(null, "The dice were "+rollSide+"!" );
			if(result1.equals(result2)) {
				JOptionPane.showMessageDialog(null, "It's A Tie! Nobody Wins!");
			}
			else if(result1.equals("WIN")) {
				JOptionPane.showMessageDialog(null,"Player 1 Wins!\nPlayer 2 Loses!");
			}
			else if(result2.equals("WIN")) {
				JOptionPane.showMessageDialog(null,"Player 2 Wins!\nPlayer 1 Loses!");
			}
			
		}
		else {
			NormalDice diceOne = new NormalDice(6);
			NormalDice.setSides(6);
			NormalDice.getSides();
			NormalDice diceTwo = new NormalDice(6);
			NormalDice.setSides(6);
			NormalDice.getSides();
			JOptionPane.showMessageDialog(null, "Player 1: "+diceOne.toString()+"\nPlayer 2: "+diceTwo.toString());
			JOptionPane.showMessageDialog(null, "Let's start!");
			NormalDice.randomRoll();
			int roll1 = NormalDice.getRandomRoll();
			NormalDice.randomRoll();
			int roll2 = NormalDice.getRandomRoll();
			String bet1 = JOptionPane.showInputDialog(null, "Player 1: What is your bet? Even or Odd");
			String bet2 = JOptionPane.showInputDialog(null, "Player 2: What is your bet? Even or Odd");
			if((roll1 + roll2) % 2 == 0) {
				rollSide = "Even";
			}
			else {
				rollSide = "Odd";
			}
			if(bet1.equals(rollSide)) {
				result1 = "WIN";
			}
			else {
				result1 = "LOSE";
			}
			if(bet2.equals(rollSide)) {
				result2 = "WIN";
			}
			else {
				result2 = "LOSE";
			}
			JOptionPane.showMessageDialog(null, "The dice were "+rollSide+"!" );
			if(result1.equals(result2)) {
				JOptionPane.showMessageDialog(null, "It's A Tie! Nobody Wins!");
			}
			else if(result1.equals("WIN")) {
				JOptionPane.showMessageDialog(null,"Player 1 Wins!\nPlayer 2 Loses!");
			}
			else if(result2.equals("WIN")) {
				JOptionPane.showMessageDialog(null,"Player 2 Wins!\nPlayer 1 Loses!");
			}
			
		}
	
		
		
}
}
