package edunova;

import javax.swing.JOptionPane;

public class Zadatak06 {
	
	public static void main(String[] args) {
		
		int i;
		
		
		i=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		for(int j=1;j<=10;j++) {
			System.out.println(i + " x " + j + " = " + (i*j));
		}
		
	}

}
