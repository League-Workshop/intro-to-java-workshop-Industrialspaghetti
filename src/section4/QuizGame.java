package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("is the Bee movie a good movie yes/no");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("yes")){ score++; speak ("yey");
			
		}else{ speak ("E");
		
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String Answer = JOptionPane.showInputDialog("[why is the sky blue]? "
				+ " /options/: because it is "
				+ " /idk "
				+ " /lemons hurt my eyes /");
		if(Answer.equalsIgnoreCase("because it is")) { score++; speak ("yey");
		
		}
		if(Answer.equalsIgnoreCase("idk")) {speak ("E");
		
		}
	    if(Answer.equalsIgnoreCase("lemons hurt my eyes")) { speak ("E");
		}
		
		// 6.  After all the questions have been asked, print the user's score 
	    JOptionPane.showMessageDialog (null,"your score: " + score);
		
	}static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
