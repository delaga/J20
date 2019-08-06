package edunova;

public class Rekurzija {

	// rekurzija je kada metoda poziva samu sebe
	// mora imati uvjet izlaska iz rekurzije
	
	public static void main(String[] args) {
		System.out.println(zbroj(5));
	}
	
	private static int zbroj(int b) {
		//uvijek se prvo baviš s uvjetom izlaska iz rekurzije
		if(b==0) {
			return 0;
		}
		System.out.println(b);
		return b + zbroj(b-1);
	}
	
}
