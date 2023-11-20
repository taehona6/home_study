package new02;

class Counter{
	//�̱��� ��ü�� ����
	private static Counter instance;
	private int count; 
	
	private Counter() {}
	
	public static Counter getInstace() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	
	public int countMethod() {
		count++;
		return count;
	}
}







public class SingletonCount {

	public static void main(String[] args) {
		// counter ��ü 2�� ����
		Counter c1 = Counter.getInstace();
		Counter c2 = Counter.getInstace();
		System.out.println(c1.countMethod());
		System.out.println(c2.countMethod());
	}

}
