package edunova;

public class Metode2 {
	
	public static void main(String[] args) {
		
	System.out.println(suma(3,3) + suma(1,1,1));
		
		
	System.out.println(suma(1,1,1,1));
	}
	
	
	private static int suma(int a, int b) {
		
		if (a==b) {
			return 0;
		}
		
		return a+b;
	}
	
	// potpis metode
	// naziv + lista parametara koje prima
	
	// method overloading preoptereæenje metode
	private static int suma(int a, int b, int c) {
		return a+b+c;
	}
	
	private static int suma(int... a) {
		//vratiti zbroj svih elemenata a niza
		
		int suma=0, i=0;
		while(i<a.length) {
			suma+=a[i++];
		}
		
//		for(int j=0;j<a.length;j++) {
//			suma+=a[j];
//		}
//		
//		for (int k : a) {
//			suma+=k;
//		}
		
		return suma;
		
	
	}

}
