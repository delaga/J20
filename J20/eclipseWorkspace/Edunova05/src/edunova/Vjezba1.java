package edunova;

public class Vjezba1 {

	
	public static void main(String[] args) {
		int x=1,y=2;
		x++;System.out.println(x);//2
		--y;System.out.println(y);//1
		x+=y;System.out.println(x+" "+y);//3 1
		x=y--; System.out.println(x+" "+y);//1 0
		System.out.println(x++ +" "+ ++y);
		System.out.println(x+" "+y);
	}
}
