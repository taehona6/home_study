package new01;

public class New01 {

	public static void main(String[] args) {
		/*
		 * ȫ�浿 �ֹε�Ϲ�ȣ 881122-1234567�̴� ������� => ������� : 881122, ���� : ��(1,3) ��(2,4)
		 */

		String pin = "881122-3234567";
		String gender = Integer.parseInt(pin.substring(7, 8))%2==0 ? "��" : "��";
		System.out.println("������� : " + pin.substring(0, pin.indexOf("-")) + " ���� : "+gender);

	}

}
