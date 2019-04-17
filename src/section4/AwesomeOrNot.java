package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int num = new Random().nextInt(4);
	// 3. Print out this variable
		 System.out.println(num);
	// 4. Get the user to enter something that they think is awesome
		 String ans = JOptionPane.showInputDialog("What do you think is awesome?");	
		 if(ans==null) {
			 i=100;
		 }
	// 5. If the random number is 0
		 if(num==0) {
			 JOptionPane.showMessageDialog(null, "Wow! "+ans+" is awesome!");
		 }
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
		 if(num==1) {
			 JOptionPane.showMessageDialog(null, "Eh, "+ans+" is ok");
		 }
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
		 if(num==2) {
			 JOptionPane.showMessageDialog(null, ans+" is pretty boring");
		 }
	// -- tell the user whatever they entered is boring.
		 if(num==3) {
			 JOptionPane.showMessageDialog(null, ans+" is kinda quirky!");
		 }
	// 8. If the random number is 3

	// -- write your own answer
	}
}
}

