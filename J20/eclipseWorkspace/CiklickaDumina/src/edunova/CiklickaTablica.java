package edunova;

import javax.swing.JOptionPane;

public class CiklickaTablica {
	private CiklickaTablica() {
		// unos broja stupaca i redova
		int red = Integer.parseInt(JOptionPane.showInputDialog("DDR unesi broj redova")),
				stupac = Integer.parseInt(JOptionPane.showInputDialog("DDR unesi broj stupaca"));
		
		// init 2D matrice sa broj stupaca i redova
		int matrica[][] = new int[red][stupac];
		
		//stavi varijable u startne vrijednosti
		int minRed = 0, maxRed = red - 1;
		int minStupac = 0, maxStupac = stupac - 1;
		int brojUpisuje = 1, krajBroj = red * stupac;
		
		//dok je broj koji upisuje manji od umnoška redova i stupaca
		while (krajBroj >= brojUpisuje) {
			//puni matricu desno->lijevo
			for (int i = maxStupac; i >= minStupac; i--) {
				matrica[maxRed][i] = brojUpisuje;
				brojUpisuje++;
			}
			if (brojUpisuje > krajBroj) {
				break;
			}
			//puni matricu dole-> gore
			for (int i = maxRed - 1; i >= minRed; i--) {
				matrica[i][minStupac] = brojUpisuje;
				brojUpisuje++;
			}
			if (brojUpisuje > krajBroj) {
				break;
			}
			//puni matricu lijevo->desno
			for (int i = minStupac + 1; i <= maxStupac; i++) {
				matrica[minRed][i] = brojUpisuje;
				brojUpisuje++;
			}
			if (brojUpisuje > (krajBroj)) {
				break;
			}
			//puni matricu gore->dole
			for (int i = minRed + 1; i <= maxRed - 1; i++) {
				matrica[i][maxStupac] = brojUpisuje;
				brojUpisuje++;
			}
			if (brojUpisuje > krajBroj) {
				break;
			}
			//dekrement maxime i inkrement minimume
			minStupac++;
			maxStupac--;
			minRed++;
			maxRed--;

		}
		//ispis matricu redovi (0-->4)
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < stupac; j++) {
				//ispisuje matricu stupci (0-->4)
				System.out.print(matrica[i][j] + "   ");
			}
			//sljedeci red kada ispise redak
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new CiklickaTablica();
	}
}
