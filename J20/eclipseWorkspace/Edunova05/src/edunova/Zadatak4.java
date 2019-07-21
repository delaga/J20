package edunova;

public class Zadatak4 {
	
	// program beskonaèno ispiuje brojeve
	// od 1 do 100 pa od 100 do 1 pa od 1 d0 100 i tako beskonaèno

	public static void main(String[] args) {
		
		boolean jedanDoSto=true;
		
		while(true) {
			if(jedanDoSto) {
				for(int i=1;i<100;i++) {
					System.out.println(i);
				}
			}else {
				for(int i=100;i>0;i--) {
					System.out.println(i);
				}
			}
			jedanDoSto=!jedanDoSto;
		}
		
	}
}
