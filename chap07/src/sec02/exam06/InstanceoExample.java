package sec02.exam06;

public class InstanceoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		//method2(parentB);
	}
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	public static void method2(Parent parent) {
			Child child = (Child) parent;
			System.out.println("method2 - Child�� ��ȯ ����");
		}
	}

