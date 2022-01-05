package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {

	public static void main(String[] args) {

		int i, j, k;

		i = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		j = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		k = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		if (i>j && i>k) {
			System.out.println(i);
		}else if(j>i && j>k) {
			System.out.println(j);
		}else if(k>i) {
			System.out.println(k);
		}else {
			System.out.println("Krivi unos");
		}

	}

}
