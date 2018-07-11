import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	//1: Ask the user how old they are (in years)
	String input = JOptionPane.showInputDialog("How old are you?");
	int years = Integer.parseInt(input);
	//2: If they are over 18, ask them who the next president should be
	if(years>=18) {
		JOptionPane.showInputDialog("Who do you think the next president should be?");
	}
	//3: If they are younger, tell them nobody cares what they think
	else if(years<18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	}
}
}
