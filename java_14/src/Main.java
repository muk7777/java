import java.util.ArrayList;
import java.util.List;
//// 1.
//class Main {
//	public static void main(String[] args) {
//		int i = 로봇.get정수();
//		boolean b = 로봇.get논리();
//		사람 a사람 = 로봇.get사람();
//		사람 a사람2 = 로봇.get사람2();
//		사람 a사람3 = 로봇.get사람3();
//		사람 a사람4 = 로봇.get사람4();
//		사람 a사람5 = 로봇.get사람5(123, false);
//		로봇.get사람6(123, false);
//	}
//}
//
//// 풀이
//class 사람 {
//	
//}
//class 로봇 {
//	static int get정수 () {
//		return 1;
//	}
//	static boolean get논리() {
//		return true;
//	}
//	static 사람 get사람() {
//		사람 a사람 = new 사람();
//		return a사람;
//	}
//	static 사람 get사람2() {
//		사람 a사람2 = new 사람();
//		return a사람2;
//	}
//	static 사람 get사람3() {
//		사람 a사람3 = new 사람();
//		return a사람3;
//	}
//	static 사람 get사람4() {
//		사람 a사람4 = new 사람();
//		return a사람4;
//	}
//	static 사람 get사람5(int i, boolean j) {
//		사람 a사람5 = new 사람();
//		return a사람5;
//	}
//	static 사람 get사람6(int i, boolean j) {
//		사람 a사람 = new 사람();
//		return a사람;
//	}
//}

// 2.
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Main {
	public static void main(String[] args) {
		사람인력관리소 a사람인력관리소 = new 사람인력관리소();
		
		a사람인력관리소.add사람("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a사람인력관리소.add사람("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a사람인력관리소.add사람("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
		
		사람 a사람1 = a사람인력관리소.get사람(1);
		a사람1.자기소개();
		// 저는 1번, 홍길순, 33살 입니다.
		
		사람 a사람2 = a사람인력관리소.get사람(2);
		a사람2.자기소개();
		// 저는 2번, 홍길동, 20살 입니다.
		
		사람 a사람3 = a사람인력관리소.get사람(3);
		a사람3.자기소개();
		// 저는 3번, 임꺽정, 30살 입니다.
	}
}
// 풀이 1번
//class 사람인력관리소 {
//	사람 a사람1;
//	사람 a사람2;
//	사람 a사람3;
//	int last_code;
//	void add사람 (String name,int age) {
//		this.last_code++;
//		사람 new사람 = new 사람();
//		new사람.name = name;
//		new사람.age = age;
//		new사람.code = this.last_code;
//		System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, this.last_code, name);
//		if (this.last_code == 1) {
//			a사람1 = new사람;
//		}	else if (this.last_code == 2) {
//			a사람2 = new사람;
//		}	else if (this.last_code == 3) {
//			a사람3 = new사람;
//		}
//	}
//	사람 get사람(int code) {
//		if (code == 1) {
//			return a사람1;
//		} else if (code == 2) {
//			return a사람2;
//		} else if (code == 3) {
//			return a사람3;
//		} else {
//			return null;
//		}
//	}
//}
//class 사람 {
//	String name;
//	int age;
//	int code;
//	void 자기소개 () {
//		System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.code, this.name, this.age);
//	}
//}

// 풀이 2번
//class 사람인력관리소 {
//	사람[] 사람들 = new 사람[3];
//	int last_code;
//	void add사람 (String name,int age) {
//		this.last_code++;
//		사람 new사람 = new 사람();
//		new사람.name = name;
//		new사람.age = age;
//		new사람.code = this.last_code;
//		System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, this.last_code, name);
//		사람들[this.last_code - 1] = new사람; 
//	}
//	사람 get사람(int code) {
//		return 사람들[code - 1];
//	}
//}
//class 사람 {
//	String name;
//	int age;
//	int code;
//	void 자기소개 () {
//		System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.code, this.name, this.age);
//	}
//}

// 풀이 3번
//class 사람인력관리소 {
//	ArrayList 사람들 = new ArrayList();
//	int last_code;
//	void add사람 (String name,int age) {
//		this.last_code++;
//		사람 new사람 = new 사람();
//		new사람.name = name;
//		new사람.age = age;
//		new사람.code = this.last_code;
//		System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, this.last_code, name);
//		사람들.add(new사람);
//	}
//	사람 get사람(int code) {
//		return (사람) 사람들.get(code - 1);
//	}
//}
//class 사람 {
//	String name;
//	int age;
//	int code;
//	void 자기소개 () {
//		System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.code, this.name, this.age);
//	}
//}

// 풀이 4번
//class 사람인력관리소 {
//	ArrayList<사람> 사람들 = new ArrayList<사람>();
//	int last_code;
//	void add사람 (String name,int age) {
//		this.last_code++;
//		사람 new사람 = new 사람();
//		new사람.name = name;
//		new사람.age = age;
//		new사람.code = this.last_code;
//		System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, this.last_code, name);
//		사람들.add(new사람);
//	}
//	사람 get사람(int code) {
//		return 사람들.get(code - 1);
//	}
//}
//class 사람 {
//	String name;
//	int age;
//	int code;
//	void 자기소개 () {
//		System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.code, this.name, this.age);
//	}
//}

// 풀이 5번
class 사람인력관리소 {
	List<사람> 사람들 = new ArrayList<>();
	int last_code;
	void add사람 (String name,int age) {
		this.last_code++;
		사람 new사람 = new 사람();
		new사람.name = name;
		new사람.age = age;
		new사람.code = this.last_code;
		System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, this.last_code, name);
		사람들.add(new사람);
	}
	사람 get사람(int code) {
		return 사람들.get(code - 1);
	}
}
class 사람 {
	String name;
	int age;
	int code;
	void 자기소개 () {
		System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.code, this.name, this.age);
	}
}