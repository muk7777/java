// 1.
//class Main {
//  public static void main(String[] args) {
//    무기 a무기 = new 칼();
//    a무기.공격();
//    // 출력 : 칼로 공격합니다.
//  }
//}
//class 무기 {
//	void 공격() {
//		
//	}
//}
//
//class 칼 extends 무기 {
//	void 공격() {
//		System.out.println("칼로 공격합니다.");
//	}
//}

// 2.
//class Main {
//	public static void main(String[] args) {
//		// 설명
//		// main 매서드 안에 정수만 들어갈 수 있는 지역변수 a를 선언함
//		//
//		int a;
//	}
//}

// 3.
//class Main {
//	public static void main(String[] args) {
//		// 설명
//		// class 무기 { void 공격() { } } 의 의미
//		// 무기 객체를 만들 때 필요한 무기 class를 만듦
//		// 칼 객체를 만들 때 필요한 칼 class를 만듦
//		// 칼 class는 무기 class로 부터 상속받음
//		// 칼은 무기임(AB Test)
//		// 칼 class에는 공격 메서드가 들어있는 것처럼 쓸 수 있으나 메모리 할당을 받지 않아 리소스 이점이 있음
//		// 칼 class에만 사과를_깍다 메서드가 들어있음
//		
//	}
//}
//
//class 무기 {
//	void 공격() { }
//}
//
//class 칼 extends 무기 {
//	void 사과를_깍다() { }
//}

// 4.
//class Main {
//	public static void main(String[] args) {
//		게임.작동하다();
//	}
//}
//
//class 게임 {
//	static void 작동하다() {
//		// 설명
//		// class에 직접 명령할 수 있는 static 작동하다 메서드에 무기 타입의 a무기 변수를 선언
//		// a무기에는 무기 리모컨만 들어갈 수 잇음
//		무기 a무기;
//		
//		// 설명
//		// 무기객체를 새로 생성하고 a무기에 그 객체를 원격조종가능한 리모컨을 복사하여 넣음
//		a무기 = new 무기();
//		
//	}
//}
//
//class 무기 {
//	void 공격() { }
//}

// 5.
//class Main {
//	public static void main(String[] args) {
//		// `class 칼 extends 무기 { }` 의 의미 설명
//		// 칼 class는 무기 class를 상속받음
//		// 무기 class는 메서드가 1개임
//		// 무기 리모컨은 버튼이 1개임
//		// 칼 class는 무기 class가 준 메서드 1개와 고유한 메서드 1개를 추가로 갖고있음
//		// 칼 리모컨은 버튼이 2개임
//		// 칼 class의 메서드 갯수는 무기 class보다 많거나 같음
//		// 칼 class는 무기 class가 준 메서드나 변수를 재정의 하여 사용할 수 있음
//	}
//}
//
//class 무기 {
//	void 공격() { }
//}
//
//class 칼 extends 무기 {
//	void 사과껍질제거() { }
//}

// 6.
// 문제 : `무기 a무기 = new 칼();` 가 실행되는 세부과정을 자세히 쓰세요.

//class Main {
//  public static void main(String[] args) {
//    // * double d = 5.5; 의 처리과정
//    // 1 : 실수 5.5가 생긴다.
//    // 2 : 오직 실수만 담을 수 있는 변수 d가 생성된다.
//    // 3 : d는 5.5가 자신안에 들어 올 수 있는지 판단한다.(가능)
//    // 4 : d변수에 실수 5.5가 들어간다.
//    double d = 5.5;
//    
//    // * double dd = 5; 의 처리과정
//    // 1 : 정수 5가 생긴다.
//    // 2 : 오직 실수만 담을 수 있는 변수 dd가 생성된다.
//    // 3 : dd는 5가 자신안에 들어 올 수 있는지 판단한다.
//    // 4 : 5는 정수이기 때문에 들어 올 수 없다고 판단한다.(불가능)
//    // 5 : dd가 아쉬워하는 5에게 이렇게 이야기 합니다. `니가 실수로 변환될 수 있다면 들어올 수 있다.`
//    // 6 : 5는 자신의 형태를 버리고 실수화 한다. 즉 5.0으로 변신하다.(캐스팅, 또는 형변환)
//    // 7 : dd로 5.0이 들어간다.
//    double dd = 5;
//    
//    // * int i = 5.5; 의 처리과정
//    // 1 : 실수 5.5가 생긴다.
//    // 2 : 오직 정수만 담을 수 있는 변수 i가 생성된다.
//    // 3 : i는 5.5가 자신에게 담길 수 있는지 체크한다.(불가능)
//    // 4 : i는 아쉬워하는 5.5에게 이렇게 이야기 합니다. `니가 정수가 된다면 들어올 수 있다.`
//    // 5 : 5.5는 도저히 불가능 요구를 받고 치명적인 에러를 발생시킨다.(캐스팅 불가능 으로 인한 에러)
//    int i = (int) 5.5;
//    
//    
//    무기 a무기 = new 칼();
//    // 칼 객체가 새로 생성됨
//    // 무기타입의 리모컨만 담을수 있는 a무기 변수가 생성되고 기본값을 가지고 있음(현재는 쓰레기 리모컨)
//    // a무기에 칼객체의 리모컨이 들어가려고 하나 불가능하여 오류가 남
//    // 칼 class가 무기class를 상속받으면 칼 객체는 무기 객체 인 척 할 수 있음 
//    // 칼 객체가 무기인척 하여 고유 특성을 버리고 오면 
//    // a무기에 무기 리모컨이 들어오지만 무기인 척 하는 칼 객체를 조종할수 있음
//    // 칼 고유의 능력을 가지려면 빈 껍데기 변수or메서드를 무기 class에 넣어줘야함
//  }
//}
//
//class 무기 {
//  
//}
//
//class 칼 extends 무기 {
//  
//}

// 7.
// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

//class Main {
//  public static void main(String[] args) {
//    전사 a전사 = new 전사();
//
//    a전사.공격(/* 수정가능지역 시작 */"브라이언이","칼" /* 수정가능지역 끝 */); 
//    // 브라이언이(가) 칼(으)로 공격합니다.
//
//    a전사.공격(/* 수정가능지역 시작 */"필립이","창" /* 수정가능지역 끝 */); 
//    // 필립이(가) 창(으)로 공격합니다.
//
//    a전사.공격(/* 수정가능지역 시작 */"마크", "지팡이" /* 수정가능지역 끝 */); 
//    // 마크(가) 지팡이(으)로 공격합니다.
//  }
//}
//
//class 전사{
//	void 공격 (String name, String weapon) {
//		System.out.printf("%s(가) %s(으)로 공격합니다.\n",name ,weapon);
//	}
//}

// 8.
// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

//class Main {
//	public static void main(String[] args) {
//		전사 a전사 = new 전사();
//
//		a전사.공격(/* 수정가능지역 시작 */ "브라이언이","칼"/* 수정가능지역 끝 */);
//		// 브라이언이(가) 칼(으)로 공격합니다.
//
//		a전사.재공격();
//		// 브라이언이(가) 칼(으)로 공격합니다.
//
//		a전사.공격(/* 수정가능지역 시작 */ "필립이","창" /* 수정가능지역 끝 */);
//		// 필립이(가) 창(으)로 공격합니다.
//
//		a전사.공격(/* 수정가능지역 시작 */"마크", "지팡이" /* 수정가능지역 끝 */);
//		// 마크(가) 지팡이(으)로 공격합니다.
//
//		a전사.재공격();
//		// 마크(가) 지팡이(으)로 공격합니다.
//
//		a전사.재공격();
//		// 마크(가) 지팡이(으)로 공격합니다.
//	}
//}
//
//class 전사 {
//	String last_name;
//	String last_weapon;
//	void 공격(String name, String weapon) {
//		System.out.printf("%s(가) %s(으)로 공격합니다.\n", name, weapon);
//		this.last_name = name;
//		this.last_weapon = weapon;
//	}
//	void 재공격() {
//		this.공격(last_name, last_weapon);
//	}
//}

//9.
// 문제 : 아래 코드가 실행되도록 해주세요.

class Main {
  public static void main(String[] args) {
    샤오미Tv a샤오미Tv = new 샤오미Tv();
    삼성Tv a삼성Tv = new 삼성Tv();
    LGTv aLGTv = new LGTv();
    
    a샤오미Tv.켜기();
    // 출력 => 샤오미Tv 켜집니다.
    a샤오미Tv.끄기();
    // 출력 => 샤오미Tv 꺼집니다.
    a샤오미Tv.vr켜기();
    // 출력 => 샤오미Tv vr켜기!
    
    a삼성Tv.켜기();
    // 출력 => 삼성Tv 켜집니다.
    a삼성Tv.끄기();
    // 출력 => 삼성Tv 꺼집니다.
    a삼성Tv.ar켜기();
    // 출력 => 삼성Tv ar켜기!
    
    aLGTv.켜기();
    // 출력 => LGTv 켜집니다.
    aLGTv.끄기();
    // 출력 => LGTv 꺼집니다.
    aLGTv.게임모드전환();
    // 출력 => LGTv 게임모드전환!
  }
}

class Tv{
	class etv{
		
	}
	void 켜기() {
		
	}
	void 끄기() {
		
	}
	void input () {
		
	}
}
class 샤오미Tv extends Tv {
	void 켜기() {
		System.out.println("샤오미Tv 켜집니다.");
		int fk = 10;
	}
	void 끄기() {
		System.out.println("샤오미Tv 꺼집니다.");
	}
	void vr켜기() {
		System.out.println("샤오미Tv vr켜기!");
	}
}
class 삼성Tv extends Tv {
	void 켜기() {
		System.out.println("삼성Tv 켜집니다.");
	}
	void 끄기() {
		System.out.println("삼성Tv 꺼집니다.");
	}
	void ar켜기() {
		System.out.println("삼성Tv ar켜기!");
	}
}
class LGTv extends Tv {
	void 켜기() {
		System.out.println("LGTv 켜집니다.");
	}
	void 끄기() {
		System.out.println("LGTv 꺼집니다.");
	}
	void 게임모드전환() {
		System.out.println("LGTv 게임모드전환!");
	}
}