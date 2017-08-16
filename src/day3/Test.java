package day3;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	String awnser;
	//JOptionPane.showMessageDialog(null, "");
	//System.out.println("");
	awnser = JOptionPane.showInputDialog("What Is you Name?");
	JOptionPane.showMessageDialog(null, "Hi, " + awnser);
}
}
