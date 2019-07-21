package edunova;

public class While {
	
	public static void main(String[] args) {
		
		boolean uvjet=true;
		//wihle radi s boolean tipom podatka
		while(uvjet) {
			System.out.println("Komarci");
			
			uvjet=!uvjet;
		}
		
		
		//uobièajeni primjer
		 int i=0;
		 while(i++<10 && i>5) {
			 System.out.println("Komarci");
			 
		 }
		 
		 
		 //beskonaèna petlja
		 int x=0;
		 while(true) {
			 if(x==12) {
				 continue;
			 }
			 if(x>10) {
				 break;
			 }
			 
			 x++;
		 }
		
		
		
		
		
	}

}
