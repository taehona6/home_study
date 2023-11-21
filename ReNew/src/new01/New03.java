package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New03 {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크 List Set Map List : 순서를 보장, 중복저장 가능, 배열과 동일한 형태 Set : 순서보장x 중복x Map
		 * : key와 value를 가짐, key는 중복x 순서보장x
		 */

		// 리스트를 생성하고 1~10까지 저장한 후 출력
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);

		for (Integer tmp : list) {
			System.out.println(tmp);
		}
		HashMap<String,Integer> map = new HashMap<>();
		map.put("홍길동", 98);
		map.put("김영이", 62);
		map.put("강감찬", 51);
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp);
			System.out.println(map.get(tmp));
		}
		
	}

}
