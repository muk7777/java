//// 1.
//// 문제 : 구구단을 만들어주세요
//// 출력양식
///*
//== 2단 ==
//2 * 1 = 2
//2 * 2 = 4
//2 * 3 = 6
//...
//== 9단 ==
//9 * 1 = 9
//...
//9 * 9 = 81
//*/
//
//class Main {
//	public static void main(String[] args) {
//		new 구구단출력기().작동();
//	}
//}
//
//class 구구단출력기 {
//	// 구현시작
//	void 작동() {
//		for (int dan = 2; dan <=9; dan++) {
//			System.out.printf("== %d단 ==\n", dan);
//			for (int i = 1; i <=9; i++) {
//				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//			}
//		}
//	}
//	// 구현끝
//}

// 2
//class Main {
//  public static void main(String[] args) {
//    계산기.더한결과를_화면에_출력(10, 20);
//    // 출력 => 결과 : 30
//
//    계산기.더한결과를_화면에_출력(50, 20);
//    // 출력 => 결과 : 70
//
//    계산기.뺀결과를_화면에_출력(50, 20);
//    // 출력 => 결과 : 30
//
//    계산기.뺀결과를_화면에_출력(5, 2);
//    // 출력 => 결과 : 3
//
//    계산기.곱한결과를_화면에_출력(5, 2);
//    // 출력 => 결과 : 10
//  }
//}
//
//class 계산기 {
//	static void 더한결과를_화면에_출력(int i, int j) {
//		System.out.println("결과 : " + (i + j));
//	}
//	static void 뺀결과를_화면에_출력(int i, int j) {
//		System.out.println("결과 : " + (i - j));
//	}
//	static void 곱한결과를_화면에_출력(int i, int j) {
//		System.out.println("결과 : " + (i * j));
//	}
//}

// 3.
//class Main {
//  public static void main(String[] args) {
//    int 결과;
//    
//    결과 = 계산기.합(10, 20);
//    System.out.println("결과 : " + 결과);
//    // 출력 => 결과 : 30
//
//    결과 = 계산기.합(30, 20);
//    System.out.println("결과 : " + 결과);
//    // 출력 => 결과 : 50
//
//    결과 = 계산기.합(30, 70);
//    System.out.println("결과 : " + 결과);
//    // 출력 => 결과 : 100
//
//    결과 = 계산기.차(30, 70);
//    System.out.println("결과 : " + 결과);
//    // 출력 => 결과 : -40
//
//    결과 = 계산기.곱(3, 7);
//    System.out.println("결과 : " + 결과);
//    // 출력 => 결과 : 21
//  }
//}
//
//class 계산기 {
//	static int 합(int i, int j) {
//		return i + j;
//	}
//	static int 차(int i, int j) {
//		return i - j;
//	}
//	static int 곱(int i, int j) {
//		return i * j;
//	}
// }

// 문제 : 아래가 실행되도록 해주세요.

class Main {
  public static void main(String[] args) {
    무기 a칼 = new 칼();
    a칼 = new 활();
  }
}

class 무기 {

}

class 칼 extends 무기 {

}

class 활 extends 무기 {

}
