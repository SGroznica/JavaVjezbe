package edunova;

import javax.swing.JOptionPane;

public class Zadatak07 {

	public static void main(String[] args) {

		double i, j, k, l, o;

		i = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
		System.out.println("Prvi broj:" + i);
		j = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
		System.out.println("Drugi broj:" + j);
		k = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
		System.out.println("Treći broj:" + k);
		l = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
		System.out.println("Četvri broj:" + l);
		o = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
		System.out.println("Prvi broj:" + o);

		System.out.println("Prosječni broj: " + (i + j + k + l + o) / 5);
		
		
	}

}
