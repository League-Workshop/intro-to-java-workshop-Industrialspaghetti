package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot N365 = new Robot("batman");
		N365.hide();
		// 5. Set your robot's pen down
		N365.penDown();
		// 3. Set the robot to go at max speed (100)
		N365.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; true; i++) {
			if (i % 7 == 0) {
				// 7. Change the pen color to random
				N365.setPenColor(Color.RED);
			} else if (i % 7 == 1) {

				N365.setPenColor(Color.ORANGE);
			} else if (i % 7 == 2) {

				N365.setPenColor(Color.YELLOW);
			} else if (i % 7 == 3) {

				N365.setPenColor(Color.green);
			} else if (i % 7 == 4) {

				N365.setPenColor(Color.BLUE);
			} else if (i % 7 == 5) {

				N365.setPenColor(Color.magenta);
			} else if (i % 7 == 6) {
				N365.setPenColor(new Color (183,14,196));

			}
			// 6. Move the robot 5 times the loop counter (5*i)
			N365.move(-1 * i);
			// 2. Turn the robot 360/3 degrees to the right
			N365.turn(360 / 7);
			// 8. Set the pen width to i
			N365.setPenWidth(i);
		}
	}
}
