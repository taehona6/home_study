package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New03 {

	public static void main(String[] args) {
		/*
		 * �÷��� �����ӿ�ũ List Set Map List : ������ ����, �ߺ����� ����, �迭�� ������ ���� Set : ��������x �ߺ�x Map
		 * : key�� value�� ����, key�� �ߺ�x ��������x
		 */

		// ����Ʈ�� �����ϰ� 1~10���� ������ �� ���
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);

		for (Integer tmp : list) {
			System.out.println(tmp);
		}
		HashMap<String,Integer> map = new HashMap<>();
		map.put("ȫ�浿", 98);
		map.put("�迵��", 62);
		map.put("������", 51);
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp);
			System.out.println(map.get(tmp));
		}
		
	}

}
