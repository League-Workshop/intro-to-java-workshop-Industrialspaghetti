package section3;

import javax.swing.JOptionPane;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String name = JOptionPane.showInputDialog("who do you dislike?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+ name + "!");
		// 3. Ask the user for the name of their best friend
String friend = JOptionPane.showInputDialog("what is the name of your friend?");
		// 4. Tell them their best friend is as sweet as candy
        JOptionPane.showMessageDialog(null,  friend + " is as sweet as candy");
	} 
}



