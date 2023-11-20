package new01;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
		// for문 이용해서 1~10까지 짝수만 출력
		// 1부터 내가 입력한 수까지 5의 배수를 출력
		for(int i = 1 ; i < 11 ; i++) {
			if(i%2==0) System.out.println(i);
		}

		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
		for(int i = 1 ; i<=myNum ; i++) {
			if(i%5==0)System.out.println(i);
		}
		
		
	}

}
