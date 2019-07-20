package edunova;

import java.util.Arrays;

public class Nizovi {
	public static void main(String[] args) {
		//varijabla
		//int i =10;
		//niz integera sa 12 elemenata
		//int[]temperature =new int[12];
		//System.out.println(temperature[0]);
		
//		temperature[0]=1;
//		temperature[1]=4;
//		temperature[11]=2;
//		
//		int niz[]= {1,2,3,4,7};
//		
//		System.out.println(niz[0]);
//		System.out.println(niz[niz.length-1]);
		
		int[]niz=new int[10];
		
		for(int i=0;i<niz.length;i++) {
			niz[i]=i+1;
		}
		
		System.out.println(Arrays.toString(niz));
		System.out.println(niz[1]);
		
	}
}
