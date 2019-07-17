package edunova;

public class Zadatak01 {
public static void main(String[] args) {
	int []niz=new int[2];
	int i=0, j=1;
	niz[0]=++i;
	niz[1]=j--;
	System.out.println(++niz[0]-niz[1]++);
}
}
