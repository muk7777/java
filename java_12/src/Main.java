// 0.
//class Main {
//	public static void main(String[] args) {
//		사람 a사람 = new 사람();
//		원숭이 a원숭이 = new 원숭이();
//		
//		// 문제 1 : 아래 줄의 코드가 되는 이유 설명
//		동물 a동물 = a원숭이;
//		
//		원숭이 a원숭이2 = null; // null 은 쓰레기 리모콘이라는 뜻
//		
//		// 문제 2 : 아래 줄의 코드가 안되는 이유 설명
//		// a원숭이2 = a동물;
//		
//		// 문제 3 : 아래 줄의 되는 이유 설명
//		a원숭이2 = (원숭이)a동물;
//		
//		사람 a사람2 = null;
//		
//		// 문제 4 : 아래 줄의 코드가 수동 형변환 까지 했는데도 안되는 이유 설명
//		// a사람2 = (사람)a동물;
//	}
//}
//abstract class 동물 {
//}
//class 사람 extends 동물 {
//}
//class 원숭이 extends 동물 {
//}

// 1.
// 문제 : 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣는 코드를 작성해주세요.

//class Main {
//  public static void main(String[] args) {
//    int i = 10;
//    double d = i; // 여기선 자동형변환 허용
//    i = (int)d; // 여기선 자동형변환 불가능
//  }
//}

// 2.
// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 
// 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 
// 가리키게(참조하게) 하는 코드를 작성해주세요.

//class Main {
//	public static void main(String[] args) {
//		// 수정가능지역 시작
//		자동차 a자동차 = new 페라리();
//		페라리 a페라리 = (페라리) a자동차;
//    // 수정가능지역 끝
//	}
//}
//class 자동차 {
//	void 달리다() {}
//	void 서다() {}
//}
//class 페라리 extends 자동차 {
//	void 뚜껑이_열리다() {}
//}

// 3.
// 문제 : `a무기.공격();` 가 실행되는 세부과정을 자세히 쓰세요.

//class Main {
//  public static void main(String[] args) {
//    무기 a무기 = new 칼();
//    
//    // 무기 타입의 리모컨만 담을 수 있는 a무기 변수가 선언된다.
//    // 칼 객체가 생성된다. 
//    // a무기 변수에 칼 객체의 리모컨을 담을 수 없지만
//    // 칼 객체는 무기객체인척 할 수 있으므로 
//    // a무기 변수에 무기리모컨 인 척 하는 칼 리모컨이 들어간다.
//    // a무기는 실제로 공격 메서드가 있는 칼 객체를 조종하지만
//    // a무기에 있는 리모컨에는 칼만이 가지는 고유 버튼이 제거 된채로 들어와서
//    // a무기는 공격버튼을 누를 수 없다.
//    a무기.공격();
//  }
//}
//
//class 무기 {
//  
//}
//
//class 칼 extends 무기 {
//  void 공격() { }
//}

//4.
// 문제 : 아래가 실행되도록 해주세요.

//class Main {
//  public static void main(String[] args) {
//    사람 a사람 = new 사람();
//    
//    a사람.나이 = 20;
//    a사람.a왼팔 = new 팔();
//  }
//}
//
//class 사람 {
//  // 클래스안에 변수를 정의 할 수 있다.
//  int 나이;
//  팔 a왼팔;
//}
//
//class 팔 {
//	
//}

// 5.
// 문제 : 아래가 실행되도록 해주세요.

//class Main {
//  public static void main(String[] args) {
//    전사 a전사 = new 전사();
//
//    a전사.나이 = 20;
//    a전사.a무기 = new 활();
//    a전사.a무기 = new 칼();
//  }
//}
//
//class 전사 {
//	int 나이;
//	무기 a무기;
//}
//
//class 무기 {
//}
//class 활 extends 무기 {
//	
//}
//class 칼 extends 무기 {
//	
//}

// 6.
// 문제 : 아래가 실행되도록 해주세요.

class Main {
  public static void main(String[] args) {
    전사 a전사 = new 전사();

    String 이름 = "칸";
    a전사.이름 = 이름;
    a전사.나이 = 20;
    a전사.자기소개();
    
    a전사.나이++;
    a전사.자기소개();
    
    a전사.나이 = 30;
    a전사.이름 = "카니";
    a전사.자기소개();
    a전사.a무기 = new 활();
    a전사.공격();
    // 출력 : 카니가 활로 공격합니다.
    
    a전사.a무기 = new 칼();
    a전사.공격();
    // 출력 : 카니가 칼로 공격합니다.
  }
}

class 전사 {
	
  // 인스턴스 변수
  String 이름;
  // 인스턴스 변수
  int 나이;
  // 인스턴스 변수
  무기 a무기;
  void 공격 () {
	  this.a무기.작동(이름);
  }

  void 자기소개() {
    System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
  }
}

class 무기 {
	void 작동 (String name) {
		
	}


}

class 칼 extends 무기 {
	String weapon = "칼";
	void 작동 (String name) {
		System.out.printf("%s가 %s로 공격합니다.\n", name, this.weapon);
	}

}

class 활 extends 무기 {
	String weapon = "활";
	void 작동 (String name) {
		System.out.printf("%s가 %s로 공격합니다.\n", name, this.weapon);
	}
}


