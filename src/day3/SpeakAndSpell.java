package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {
	static String a = "mandlebrot";

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell "
		speak("please try to spell, " + a);
		String stuff = JOptionPane.showInputDialog("Do you spelling thing");
		// 2. Catch the user's answer in a String
		if (stuff.equals("mandlebrot")) {
			speak("good job matey nine. You deserve a cookie! Altho, since i am a computer, the only cookies i store, are non edable");
		} else {
			speak("Well, you tried matey nine. " + stuff +"Is incorect. Try better next time my dude.");
		}
		}
		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words

	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
