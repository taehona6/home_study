package word;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		WordManager wm = new WordManager();



		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(menu!=7) {
			
			System.out.println("--메뉴--");
			System.out.println("1.단어등록");
			System.out.println("2.단어검색");
			System.out.println("3.단어수정");
			System.out.println("4.단어삭제");
			System.out.println("5.단어출력");
			System.out.println("6.파일로 출력");
			System.out.println("7.종료");
			
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
