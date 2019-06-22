package edunova;

public class Operatori {
	public static void main(String[] args) {
		int i =5, j=9;
		System.out.println(j>i);
		System.out.println(i==j);
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); // 0 zato što je rezultat cijeli broj a ne decimalni
		
		i=10; j=2;
		int z=i/j;
		System.out.println(z);
		
		System.out.println(10%2);
		System.out.println(9%2);
		
		//operator nadoljepljivanja
		System.out.println(2+3);
		System.out.println("2"+3);
		System.out.println("Prvi"+" drugi");
		
		
		
		
	}
}
