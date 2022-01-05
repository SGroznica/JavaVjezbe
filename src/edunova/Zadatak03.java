package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	public static void main(String[] args) {
		int i;
		i = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		if (i % 2 == 0) {
			System.out.println("Broj " + i + " je paran");
		} else {
			System.out.println("Broj " + i + " je neparan");
		}

	}

}
