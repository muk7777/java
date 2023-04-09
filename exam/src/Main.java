import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[20][20];
		
		for (int i = 0; i <= 19; i++) {
			for (int j = 0; j <= 19; j++) {
				arr[i][j] = 0;
			}
		}
		System.out.println("==1번==\n");
		for (int i = 0; i <= 19; i++) {
			for (int j = 0; j <= 19; j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("==2번==\n");
		
		
		
		
		List<Integer>[] arr2 = new ArrayList[20]; 
		
		for (int i = 0; i <=19; i++) {
			arr2[i] = new ArrayList<Integer>();
			for (int j = 0; j <= 19; j++) {
				arr2[i].add(0);
			}
		}
		
		for (int i = 0; i <=19; i++) {
			for (int j = 0; j <= 19; j++) {
				System.out.printf("%d ", arr2[i].get(j));
			}
			System.out.println();
		}
	}
}

