package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New05 {

	public static void main(String[] args) {
		// 단어장을 메서드로 분리
		New05 n = new New05();
		Scanner sc = new Scanner(System.in);
		HashMap<String,String>map = n.input(sc.nextInt(), sc);
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp + " : "+ map.get(tmp));
		}
	}

	

	HashMap<String,String> input(int count,Scanner sc) {
		HashMap<String,String>map = new HashMap<>();
		for(int i = 0; i<count; i++) {
			String w,m;
			System.out.println("단어입력");
			w = sc.next();
			System.out.println("뜻입력");
			m = sc.next();
			
			map.put(w, m);
		}
		
		return  map;
	}
	
	
	
}
