package sec03.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("���ڹ�", "0100100-123213");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("���ڹ�", "123213- 2132131");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
