package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot G344 = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
G344.setSpeed(10000);
		// 5. Set the pen width to 5
G344.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
G344.penDown();
for(int i=0; true; i++) {
G344.setRandomPenColor();	



			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

G344.turn(90);	}
}
	
	void drawSquare() {
		
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i=0; i<4;i++) {
			G344.move(100);
			G344.turn(90);
		
		
			}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



