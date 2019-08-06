package edunova;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ObradaPogresaka {
	public ObradaPogresaka() {
		List<String> lista=new ArrayList<>();
		try {
			lista.add(JOptionPane.showInputDialog("Unesi a"));
			lista.add(JOptionPane.showInputDialog("Unesi b"));
			System.out.println(lista.get(1).substring(0,2));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Element ne postoji");
		} catch (NullPointerException e) {
			System.out.println("Element nije definiran");
		} catch (Exception e) {
			System.out.println("Nepoznata greška"+e.getMessage());
		} finally {
			//zatvori sve otvoreno u try
		}
		
		
		
	}
	
	public static void main(String[] args) {
	new ObradaPogresaka();	
	}
}
