package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"if you find yourself attempting to cross a pirahna-infested river, heres how you do it:");
		// Get the user to enter an adjective
String adjective = JOptionPane.showInputDialog("enter an adjective please");
		// Get the user to enter a type of liquid
String liquid = JOptionPane.showInputDialog ("please enter a liquid");
		// Get the user to enter a body part
String bodypart= JOptionPane.showInputDialog ("please enter a body part please :)");
		// Get the user to enter a verb
String verb= JOptionPane.showInputDialog ("please enter a verb   p l  e a s e");
		// Get the user to enter a place
String place= JOptionPane.showInputDialog ("please enter the name of a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
JOptionPane.showMessageDialog(null, "Pirahnas are more " ); 
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

