package new01;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
		// for�� �̿��ؼ� 1~10���� ¦���� ���
		// 1���� ���� �Է��� ������ 5�� ����� ���
		for(int i = 1 ; i < 11 ; i++) {
			if(i%2==0) System.out.println(i);
		}

		System.out.println("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int myNum = sc.nextInt();
		for(int i = 1 ; i<=myNum ; i++) {
			if(i%5==0)System.out.println(i);
		}
		
		
	}

}
