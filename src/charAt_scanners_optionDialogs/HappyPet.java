package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	 static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 5; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What will you do to make your pet happy?", "ANSWER HERE", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Play with it", "Feed it", "Buy it some toys" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	
		
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
			if(task==0) {
				JOptionPane.showMessageDialog(null, "Your pet likes it when you pet it, +6");
			happinessLevel = +6;
			}
			
			if(task==1) {
				JOptionPane.showMessageDialog(null, "Your pet is now thirsty! -2");
			happinessLevel = -2;
			}
			
			if(task==2) {
				JOptionPane.showMessageDialog(null, "your pet likes new toys, +9");
			happinessLevel = +9;if(task==0) {
				JOptionPane.showMessageDialog(null, "Your pet likes it when you pet it, +6");
			}
			}
}}}