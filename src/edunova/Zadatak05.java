package edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {

	public static void main(String[] args) {

		int i, j;

		i = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		j = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);

	}

}
