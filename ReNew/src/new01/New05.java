package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New05 {

	public static void main(String[] args) {
		// �ܾ����� �޼���� �и�
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
			System.out.println("�ܾ��Է�");
			w = sc.next();
			System.out.println("���Է�");
			m = sc.next();
			
			map.put(w, m);
		}
		
		return  map;
	}
	
	
	
}
