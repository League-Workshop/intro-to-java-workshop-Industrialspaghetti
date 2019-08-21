package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int Random = 	new Random().nextInt(4);
		// 3. Print out this variable
System.out.println(Random);
		// 4. Get the user to enter something that they think is awesome
 String answer = JOptionPane.showInputDialog("type in something that you think is awesome!!!!!!!!");
		// 5. If the random number is 0
if (Random==0) {
	JOptionPane.showMessageDialog(null, "I think " + answer + " are awesome!!!");
}
		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1
if (Random==1) {
	JOptionPane.showMessageDialog(null, "I think " + answer + " is ok");
}
		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2
if (Random==2) {
	JOptionPane.showMessageDialog(null, "I think " + answer + " is boring...");
}
		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3
if (Random==3) {
	JOptionPane.showMessageDialog(null, "I think " + answer + " is [data redacted]");
}
		// -- write your own answer
	
}
	
}


