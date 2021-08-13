////[6-18] 다음의 코드를 컴파일하면 에러가 발생한다
//// 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
//public class Ex11_18 {
//
//	public static void main(String[] args) {
//		 
//
//	}
//
//}
//
//class Marine{
//	int iv = 10;
//	static int cv = 20;
//	
//	int iv2 = cv;
//	static int cv2 = iv; 			//A
//	
//	static void staticMethod1() {
//		System.out.println(cv);
//		System.out.println(iv); 	//B
//	}
//	
//	void instanceMethod1() {
//		System.out.println(cv);
//		System.out.println(iv);		//C
//	}
//	
//	static void staticMethod2() {
//		staticMethod1();
//		instanceMethod1(); 			//D
//	}
//	
//	void instanceMethod2() {
//		staticMethod1();			//E
//		instanceMethod1();
//	}
//	
//}
//
///* A : static변수에  인스턴스 변수를 집어 넣을 수는 없다.
// * B : static메서드는 인스턴스 변수를 사용할 수 없다.
// * D : static메서드는 인스턴스 메서드를 사용할 수 없다.
// * 
// * 
// * */
