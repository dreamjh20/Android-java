package Stringtest;

public class StringTest {

	public static void main(String[] args) {
		String a = "안녕 자바";
		String b = "안녕 자바";
		
		if(a == b) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		String c = new String("안녕 자바");
		String d = new String("안녕 자바");
		
//		if(c == d) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		if(c.equals(d)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		/*문자열의 길이를 구하는 매서드*/
		System.out.println(a.length());
	}
}
