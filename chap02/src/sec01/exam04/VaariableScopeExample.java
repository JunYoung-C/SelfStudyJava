package sec01.exam04;

public class VaariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if (v1 > 10) { 
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + /*v2 +*/ 5; // v2는 if문 안에서만 사용 가능
		System.out.println(v3);
	}

}
