package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	

	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
String Pi = "3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862";

	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
Pi.charAt(0);
Pi.charAt(1);
System.out.println(Pi);
	// 4. Print ALL the digits of of Pi (hint: use a loop)
for (int i = 0; i < 1; i++) {
	
}
	// 5. Use the speak() method to speak all the digits of Pi.
speak("3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862");
	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method

	// *7. Compare the users' char to the next digit of Pi

	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println

}
	static void speak(String pi) {
		try {
			Runtime.getRuntime().exec("say " + pi).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


