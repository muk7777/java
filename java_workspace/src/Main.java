//// 문제 : 자동차 설계도를 만들어주세요.
//
//class Main {
//  public static void main(String[] args) {
//	  car car1 = new car();
//	  car car2 = new car();
//	  car car3 = new car();
//	  car1.maxspeed = 90;
//	  car2.maxspeed = 190;
//	  car3.maxspeed = 110;
//	  car1.run();
//	  car1.run();
//	  car1.run();
//	  car2.run();
//	  car3.run();
//	  
//  }
//}
//
//class car{
//	int maxspeed;
//	void run() {
//		System.out.printf("최고속도%dkm로 달리기\n",this.maxspeed);
//	}
//}

// 문제 : 일반변수에 값 할당과정 설명

//class Main {
//  public static void main(String[] args) {
//    // 설명
//	// 정수만 들어갈 수 있는 변수공간 x를 만듦
//	// 변수 선언
//    int x;
//
//    // 설명
//    // 변수공간 x에 20을 넣음
//    // 변수의 초기화
//    x = 20;
//  }
//}

// 문제 : 레퍼런스변수에 값 할당과정 설명

class Main {
  public static void main(String[] args) {
    // 설명
	// 자동차 class자료형 값 만을 가질 수 있는 a자동차 변수를 선언함
    자동차 a자동차;
    
    // 설명
    // 자동차 클래스를 참조하여 자동차 객체를 1개 만듦
    // a자동차에 자동차 객체에 있는 리모컨 this를 복사하여 넣음
    a자동차 = new 자동차();
    
    // 설명
    // 자동차 객체 안에 있던 달리다 메서드를 실행함
    // 자동차가 달립니다가 출력되어 나옴
    a자동차.달리다();

    // 모든 객체들은 서로를 평생 볼 수 없다.
    // 모든 객체들은 서로를 원격조종한다.
  }
}

// 자동차 설계도!, 절대 자동차가 아니다.!!!
class 자동차 {
  // 이 메서드(함수)의 2가지 용도
  // 
  // - ???
  void 달리다() {
    System.out.println("자동차가 달립니다.");
  }
}