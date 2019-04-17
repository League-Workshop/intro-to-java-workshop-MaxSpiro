package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Spell Processing");
		// 2. Catch the user's answer in a String
		String ans = JOptionPane.showInputDialog("Spell the word");
		// 3. If the user spelled the word correctly, speak "correct"
		if(ans.equalsIgnoreCase("processing")) {
			JOptionPane.showMessageDialog(null,"You got it right!", "Congrats!",1);
		}
		// 4. Otherwise say "wrong"
		else {
			JOptionPane.showMessageDialog(null,"Incorrect!", "Oops!",1);
		}
		// 5. repeat the process for other words
		speak("Spell Eclipse");
		// 2. Catch the user's answer in a String
		String ans2 = JOptionPane.showInputDialog("Spell the word");
		// 3. If the user spelled the word correctly, speak "correct"
		if(ans2.equalsIgnoreCase("eclipse")) {
			JOptionPane.showMessageDialog(null,"You got it right!", "Congrats!",1);
		}
		// 4. Otherwise say "wrong"
		else {
			JOptionPane.showMessageDialog(null,"Incorrect!", "Oops!",1);
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


