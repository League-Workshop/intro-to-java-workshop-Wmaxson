/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Knock Knock Joke
Duration=.25
Platform=Eclipse
Type=Instructions
Objectives=JOptionPane.showMessageDialog
*/

/** Make a pop-up that tells a joke and a separate one for the punchline.
*/
package day3;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		for (int i = 0; i < i++; i++) {
			String stuff = JOptionPane.showInputDialog("Knock Knock \na:Who is there\nb:Cancel");
			if (stuff.equals("a") || stuff.equals("A")) {
				String stuff2 = JOptionPane.showInputDialog("Hoo \na:Hoo who?\nb:Cancel");
				if (stuff2.equals("a") || stuff2.equals("A")) {
					String stuff3 = JOptionPane.showInputDialog(
							"Why are you being like an owl? HAHAHAHAHAHahah...That was not funny was it... \na:Hear it again?\nb:Cancel");
					if (stuff3.equals("b") || stuff2.equals("B")) {
						break;
					}
				} else if (stuff.equals("b") || stuff.equals("B")) {
					System.exit(0);
				}
			} else if (stuff.equals("b") || stuff.equals("B")) {
				System.exit(0);
			}
		}
	}
}