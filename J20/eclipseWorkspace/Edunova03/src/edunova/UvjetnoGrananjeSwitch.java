package edunova;

public class UvjetnoGrananjeSwitch {

	public static void main(String[] args) {
		int i=4;
		//svitch radi s int, char i String
		switch(i) {
		case 1:
			System.out.println("Sijeèanj");
			break;
		case 2:
			System.out.println("Veljaèa");
			break;
		case 3:
			System.out.println("Ožujak");
			break;
		case 4:
			System.out.println("Travanj");
			break;
		case 5:
			System.out.println("Svibanj");
			break;
		case 6:
			System.out.println("Lipanj");
			break;
		case 7:
			System.out.println("Srpanj");
			break;
		case 8:
			System.out.println("Kolovoz");
			break;
		case 9:
			System.out.println("Rujan");
			break;
		case 10:
			System.out.println("Listopad");
			break;
		case 11:
			System.out.println("Studeni");
			break;
		case 12:
			System.out.println("Prosinac");
			break;
		default:
			System.out.println("Nije mjesec");
		
		}
		
		i=2;
		
		switch (i) {
		case 1:
		case 2:
			System.out.println("Jedan ili dva");
			break;
		case 3:
			System.out.println("3");
		default:
			System.out.println("Ostalo");
			
			break;
		}
		
		// java >11
		//https://dzone.com/articles/jdk-12-switch-statementsexpressions-in-action
		//https://www.baeldung.com/java-switch
		
		
	}
	
}
