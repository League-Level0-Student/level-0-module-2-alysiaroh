import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		//1: Ask the user what height they are (in inches)
	String input = JOptionPane.showInputDialog("What is your height in inches?");
	int height = Integer.parseInt(input);
	//2: If they are over 48" tall, tell them they can go on the roller coaster
	if(height>48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
	}
	//3: If they are 48" or less, tell them they need to grow more first
	else if(height<=48) {
		JOptionPane.showMessageDialog(null, "Sorry, but you need to grow more first!");
	}
}
}

	
	