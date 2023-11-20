package word;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		WordManager wm = new WordManager();



		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(menu!=7) {
			
			System.out.println("--�޴�--");
			System.out.println("1.�ܾ���");
			System.out.println("2.�ܾ�˻�");
			System.out.println("3.�ܾ����");
			System.out.println("4.�ܾ����");
			System.out.println("5.�ܾ����");
			System.out.println("6.���Ϸ� ���");
			System.out.println("7.����");
			
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				wm.add();
				break;
				
			case 2:
				wm.search();
				break;
				
			case 3:
				wm.edit();
				break;
				
			case 4:
				wm.delete();
				break;
			case 5:
				wm.printAll();
				break;
			case 6:
				wm.makeFile();
				break;
			}
			
			
	
		}
		

	}

}
