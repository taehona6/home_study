package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements DAO {
	//DB와 연결
	//DB와 실제 연결하는 구문
	
	//db와 연결하는 역할
	private Connection conn;
	//sql구문을 실행시키는 기능을 갖는 객체
	private PreparedStatement pst;
	
	//쿼리문 저장
	private String query="";
	
	public ProductDAOImpl() {
		//db 연결정보를 설정하는 class   싱글톤으로 생성
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}
	
	
	
	//sql 구문 처리
	//executeQuery() / select 구문에서 사용 ResultSet이 리턴
	//executeUpdate() / insert, update, delete 처럼 리턴이 없을 때  0/1로만 리턴
	

	@Override
	public int insert(Product p) {
		// db와 직접 연결
		System.out.println("insert dao success");
		query="insert into product(pname,price,madeby) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			// ?에 해당하는 값을 세팅
			pst.setString(1, p.getPname());
			pst.setInt(2, p.getPrice());
			pst.setString(3, p.getMadeby());
			
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("inset error");
			e.printStackTrace();
		}
		
		return 0;
	}


	@Override
	public List<Product> selectList() {
		// TODO Auto-generated method stub
		System.out.println("list DAO success");
		query="select * from product order by pno desc";
		List<Product> list = new ArrayList<Product>();
		
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int pno = rs.getInt("pno"); // 칼럼값을 입력하면 칼럼값의 인덱스로 됨
				list.add(new Product(pno,rs.getString("pname"),rs.getInt("price")));
			}
			return list;
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("List error");
			e.printStackTrace();
		}
		
		return null;
	}



	@Override
	public Product selectOne(int pno) {
		// TODO Auto-generated method stub
		System.out.println("detail DAO success");
		query="select * from product where pno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new Product(
						rs.getInt("pno"),
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getString("regdate"),
						rs.getString("madeby"));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("detail error");
			e.printStackTrace();
		}
		return null;
	}
	
}
