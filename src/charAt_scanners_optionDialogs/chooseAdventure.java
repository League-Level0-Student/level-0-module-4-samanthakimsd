package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class chooseAdventure {
public static void main(String[] args) {
	int choose = JOptionPane.showOptionDialog(null, "You are in a cave, but then the door that you came through closes behind you and you get trapped in. There are 3 doors you can go through, each going to a different place. ", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Go to the right door", "Go to the middle door", "Go to the left door" }, null);
	
}
}
