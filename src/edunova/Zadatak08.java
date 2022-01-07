package edunova;

import javax.swing.JOptionPane;

public class Zadatak08 {
	public static void main(String[] args) {

		int dan;
		dan=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj dana"));
		
		switch (dan) {
		case 1:
			System.out.println("Ponedjeljak");
			break;
		case 2:
			System.out.println("Utorak");
			break;
		case 3:
			System.out.println("Srijeda");
			break;
		case 4:
			System.out.println("Četvrak");
			break;
		case 5:
			System.out.println("Petak");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedjelja");
			break;
		default:
			System.out.println("Nije u rasponu dana");

		}

	}

}
