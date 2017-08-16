package day3;
import javax.swing.JOptionPane;
public class TotalyLegitBankVerification {
public static void main(String[] args) {
	String Name;
	String ssn;
	String bd;
	String bankPsswrd;
	String ban;
	String pn;
	String email;
	String Adress;
	//JOptionPane.showMessageDialog(null, "");
	//System.out.println("");
	Name = JOptionPane.showInputDialog("What Is you Name?");
	JOptionPane.showMessageDialog(null, "So, " + Name + ", in order to verify your bank acount, we would like to know a few things..." );
	bd = JOptionPane.showInputDialog("What Is your birth day?");
	ssn = JOptionPane.showInputDialog("What is your social sucurity number?");
	bankPsswrd = JOptionPane.showInputDialog("What is your Online Bank acount Password?");
	ban = JOptionPane.showInputDialog("What is your bank acount Number");
	pn = JOptionPane.showInputDialog("What is your Phone number?");
	email = JOptionPane.showInputDialog("What is your email adress?");
	Adress = JOptionPane.showInputDialog("Lastly, What is your Adress?");
	JOptionPane.showMessageDialog(null, "Thank you, " + Name + ", For your imput. Your bank acount will be verified within 72 hours.");
	JOptionPane.showMessageDialog(null, "JK! Hears what ive learned from you! Ive learned your name: " + Name + ".\n Your Birth day:" + bd +". \nYour Social Sucurity Number:" + ssn + ". \nYour Online Bank Password:" + bankPsswrd + ". \n Your Bank acount Number:" + ban +  ". \nYour Phone number" + pn + ". \nYour Email:" + email +". \nAnd, your Adress:" + Adress + "Git Tolled m8ty9");
	
	
}
}
