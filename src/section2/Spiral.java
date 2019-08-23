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
		N365.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			N365.move(i);
			// 2. Turn the robot 360/3 degrees to the right
			N365.turn(360 / 7);
			// 8. Set the pen width to i
			N365.setPenWidth(i);
		}
	}
}
