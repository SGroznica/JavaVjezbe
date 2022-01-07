package edunova;

import javax.swing.JOptionPane;

public class Zadatak09 {

	public static void main(String[] args) {

		int i, j, k, h, g;

		i = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		j = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		k = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		h = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		g = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		if (i%2==0) {
			System.out.println("Broj:" + g + " je paran.");
		}else {
			System.out.println("Broj:" + g + " je neparan.");
		}
		
		if (j%2==0) {
			System.out.println("Broj:" + j + " je paran.");
		}else {
			System.out.println("Broj:" + j + " je neparan.");
		}
		
		if (k%2==0) {
			System.out.println("Broj:" + k + " je paran.");
		}else {
			System.out.println("Broj:" + k + " je neparan.");
		}
		
		if (h%2==0) {
			System.out.println("Broj:" + h + " je paran.");
		}else {
			System.out.println("Broj:" + h + " je neparan.");
		}
		
		if (g%2==0) {
			System.out.println("Broj:" + g + " je paran.");
		}else {
			System.out.println ("Broj:" + g + " je neparan.");
		}
		
		

	}

}
