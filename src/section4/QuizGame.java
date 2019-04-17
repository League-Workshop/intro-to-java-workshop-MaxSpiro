package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String ans1 = JOptionPane.showInputDialog("Which month only has twenty-eight days?");
		// 3.  Use an if statement to check if their answer is correct
		if(ans1.equalsIgnoreCase("February")) {
			score=1;
		JOptionPane.showMessageDialog(null, "Correct!\n Your score is: "+score);	
		
		}
		String ans2 = JOptionPane.showInputDialog("Which month has Easter?");
		// 3.  Use an if statement to check if their answer is correct
		if(ans2.equalsIgnoreCase("April")) {
			if(ans1.equalsIgnoreCase("February")) {
				score=2;
			}
			else {
			score=1;	
			}
		JOptionPane.showMessageDialog(null, "Correct!\n Your score is: "+score);	
		
		}
		String ans3 = JOptionPane.showInputDialog("Which month is the summer solstice?");
		// 3.  Use an if statement to check if their answer is correct
		if(ans3.equalsIgnoreCase("June")) {
			score=1;
			if(ans2.equalsIgnoreCase("April")) {
			score = 2;	
			}
			if(ans1.equalsIgnoreCase("February")) {
				score=3;
			}
			
		JOptionPane.showMessageDialog(null, "Correct!\n Your score is: "+score);	
		
		}
		JOptionPane.showMessageDialog(null, "Done! Your score is "+score);
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}

