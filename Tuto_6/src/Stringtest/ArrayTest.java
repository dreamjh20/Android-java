package Stringtest;

public class ArrayTest {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3};
		int[] b;
		b = new int[] {2, 3, 4};
		int[] c = {1, 2, 3, 4, 5};
		
		
		/*¾ê´Â ¾È µÅ*/
//		int[] = d;
//		d = {1, 2, 3, 4, 5}
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		for(int x: c) {
			System.out.println(x);
		}
	}
}
