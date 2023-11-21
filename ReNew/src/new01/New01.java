package new01;

public class New01 {

	public static void main(String[] args) {
		/*
		 * 홍길동 주민등록번호 881122-1234567이다 출력형태 => 생년월일 : 881122, 성별 : 남(1,3) 여(2,4)
		 */

		String pin = "881122-3234567";
		String gender = Integer.parseInt(pin.substring(7, 8))%2==0 ? "여" : "남";
		System.out.println("생년월일 : " + pin.substring(0, pin.indexOf("-")) + " 성별 : "+gender);

	}

}
