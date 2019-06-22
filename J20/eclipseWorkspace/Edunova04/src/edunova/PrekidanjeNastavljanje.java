package edunova;

public class PrekidanjeNastavljanje {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(i>20) {
				break;
			}
			if(i==3 || i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
