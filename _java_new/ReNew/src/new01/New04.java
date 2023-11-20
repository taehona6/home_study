package new01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		// 단?어장?
		
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<>();
		int cnt = 0;
		while(cnt!=5) {
			String w,m;
			System.out.println("단어 입력");
			w = sc.next();
			System.out.println("의미 입력");
			m = sc.next();
			map.put(w, m);
			System.out.println("입력완료"+(cnt+1)+"/5");
			cnt++;
		}
		
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			System.out.println(word+":"+map.get(word));
		}
		
		
	}




}
