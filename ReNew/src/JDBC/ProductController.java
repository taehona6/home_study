package JDBC;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	/*
	 * 상품등록, 상품리스트 보기, 상품상세보기, 상품수정, 상품삭제
	 * Controller <->Service<->DAO<->DB
	 * Controller에서 분기처리 모든 메뉴를 처리
	 */
	
	private Scanner scan;
	private Service svc; // package에 interface로 생성
	private boolean flag; //종료변수
	
	public ProductController() {
		scan = new Scanner(System.in);
		svc = new ProductServiceImpl(); //service 구현체
		flag = true; 
		printMenu();//메뉴 출력
	}

	//내부 메서드라 private
	private void printMenu() {
		//flag가 true라는건 종료하지 않았다는것
		while(flag) {
			System.out.println("--상품관리프로그램--");
			System.out.println("1.상품등록|2.상품목록|3.상품검색(상세)");
			System.out.println("4.상품수정|5.상품삭제|6.종료");
			System.out.println("menu >> ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1: register(); break;
			case 2: list(); break;
			case 3: detail(); break;
			case 4: modify(); break;
			case 5: remove(); break;
			default :
				flag = false;
				break;
			}
		}
		
	}

	private void remove() {
		// 상품번호를 받아서 해당 상품을 삭제
		System.out.println("삭제 상품 번호>");
		int pno = scan.nextInt();
		
		int isOk = svc.remove(pno);
		System.out.println("상품 삭제"+ (isOk >0? "성공":"실패"));
	}

	private void modify() {
		// TODO Auto-generated method stub
		System.out.println("수정 상품 번호>");
		int pno = scan.nextInt();
		scan.nextLine();
		System.out.println("상품 이름>");
		String pname = scan.nextLine();
		System.out.println("상품 가격>");
		int price = scan.nextInt();
		System.out.println("상품 상세 내역>");
		scan.nextLine();
		String madeby = scan.nextLine();
		
		Product p = new Product(pno, pname, price, madeby);
		
		int isOk = svc.modify(p);
		System.out.println("상품 수정"+ (isOk >0? "성공":"실패"));
		
	}

	private void detail() {
		// 상품 상세 정보 select * from product where pno = 1
		System.out.println("상품번호>");
		int pno = scan.nextInt();
		Product p = svc.detail(pno);
		System.out.println(p);
		
	}

	private void list() {
		// 상품전체 리스트
		List<Product> list = svc.list();
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

	private void register() {
		// 상품등록
		System.out.println("상품명:");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("상품가격:");
		int price = scan.nextInt();
		System.out.println("상품상세내역;");
		scan.nextLine();
		String madeby = scan.nextLine();
		Product p = new Product(name,price,madeby);
		//svc에게 등록을 요청하는 메서드를 작성
		//insert를 하게되면 리턴되는 값은 몇개의 행이 insert되었는지 값이 리턴이됨
		//isOk insert 후 리턴되는 값을 저장  잘되면 1리턴 안되면 0리턴
		int isOk = svc.register(p);
		System.out.println("상품등록 "+ ((isOk>0)? "성공":"실패"));
		
	}
}
