package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a' : // grade가 A일 경우 break가 없기 때문에 case a:도 실행된다.
			System.out.println("우수 회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}

}
