package atelier3;

import javax.swing.JOptionPane;

public class Phrases {

	public static void main(String[] args) {
	String 	a=JOptionPane.showInputDialog(" Entrez la phrase afin de verifier son equilibre");
	
	JOptionPane.showMessageDialog(null,  Caractere.verification(a), "Phrases equilibrees",1);
	/*
	 * 0-ErrorMessage;
	 * 1-Information_Message
	 * 2-Warning_Message
	 * 3-Question_Message
	*/
	
	
	}

}
