package Stringtest;

public class StringTest {

	public static void main(String[] args) {
		String a = "�ȳ� �ڹ�";
		String b = "�ȳ� �ڹ�";
		
		if(a == b) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		String c = new String("�ȳ� �ڹ�");
		String d = new String("�ȳ� �ڹ�");
		
//		if(c == d) {
//			System.out.println("����");
//		}else {
//			System.out.println("�ٸ���");
//		}
		if(c.equals(d)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		/*���ڿ��� ���̸� ���ϴ� �ż���*/
		System.out.println(a.length());
	}
}
