package new02;

class Counter{
	//教臂沛 按眉肺 积己
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
		// counter 按眉 2俺 积己
		Counter c1 = Counter.getInstace();
		Counter c2 = Counter.getInstace();
		System.out.println(c1.countMethod());
		System.out.println(c2.countMethod());
	}

}
