package new01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		// ��?����?
		
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<>();
		int cnt = 0;
		while(cnt!=5) {
			String w,m;
			System.out.println("�ܾ� �Է�");
			w = sc.next();
			System.out.println("�ǹ� �Է�");
			m = sc.next();
			map.put(w, m);
			System.out.println("�Է¿Ϸ�"+(cnt+1)+"/5");
			cnt++;
		}
		
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			System.out.println(word+":"+map.get(word));
		}
		
		
	}




}
