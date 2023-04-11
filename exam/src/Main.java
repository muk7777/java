import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int num = sc.nextInt();
				arr[i][j] = num; 
			}
		}
		int y = 1;
		int x = 1;
		if (arr[y][x] != 2) {
			while (true) {
				arr[y][x] = 9;
				if (arr[y][x + 1] == 0) {
					++x;
					continue;
				} else if (arr[y][x + 1] == 1) {
					if (arr[y + 1][x] == 0) {
						++y;
						continue;
					} else if (arr[y + 1][x] == 1) {
						break;
					} else {
						arr[y + 1][x] = 9;
						break;
					}
				} else {
					arr[y][x + 1] = 9;
					break;
				}
				
			}
		} else {
			arr[y][x] = 9;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}

