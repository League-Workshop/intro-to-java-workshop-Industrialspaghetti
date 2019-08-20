package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot N365 = new Robot();
		
			N365.setSpeed(500);
			N365.penDown();
			for(int i=0; i<8;i++) {
			N365.move(100);
			N365.turn(90);
		
		
			}
	}
}