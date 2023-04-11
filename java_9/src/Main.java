//// 1. 
// 문제 : 아래 코드가 실행되도록 해주세요.
//
//class Main {
//  public static void main(String[] args) {
//    거북이 a거북이 = new 거북이();
//    
//    a거북이.걷다();
//    // 출력 => 걷다
//    a거북이.수영하다();
//    // 출력 => 수영하다
//  }
//}
//
//class 거북이 {
//	void 걷다(){
//		System.out.println("걷다");
//	}
//	void 수영하다() {
//		System.out.println("수영하다");
//	}
//}

//// 2. 
//// Main 클래스 안의 내용을 올바르게 수정해주세요.
//
//class Main {
//  public static void main(String[] args) {
//    자동차 a자동차 = new 자동차();
//    
//    a자동차.달리다();
//  }
//}
//
//class 자동차 {
//  void 달리다() {
//    System.out.println("자동차가 달립니다.");
//  }
//}

//// 3. 
//// 문제 : 아래 코드가 실행되도록 해주세요.
//
//class Main {
//  public static void main(String[] args) {
//    new 자동차().달리다();
//  }
//}
//
//class 자동차{
//	void 달리다() {
//	}
//}

//// 4.
//// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.
//
//class Main {
//  public static void main(String[] args) {
//    car acar = new car();
//    car bcar = new car();
//    car ccar = new car();
//    car dcar = new car();
//    car ecar = new car();
//    acar.run();
//    bcar.run();
//    ccar.run();
//    dcar.run();
//    ecar.run();
//    
//  }
//}
//
//class car{
//	void run() {
//		
//	}
//}

// 5.
// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

class Main {
  public static void main(String[] args) {
    int a = 자동차.달리다(10,20);
    System.out.println(a);
  }
}

class 자동차{
	static int 달리다(int a,int b) {
		return a+b;
	}
}