package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import service.BoardService;
import service.BoardServiceimpl;

@WebServlet("/brd/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);

	// jsp에서 받은 요청 처리, 결과를 다른 jsp로 보내는 역할.
	private RequestDispatcher rdp;
	private String destpage; // 목적지 주소를 저장하는 변수
	private int isOk; // DB 구문 체크 값 저장변수.

	// controller <-> service

	private BoardService bsv; // 인터페이스로 생성

	public BoardController() {
		bsv = new BoardServiceimpl(); // 클래스로 생성
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 실제 처리
		log.info("로그다.");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");

		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/") + 1);
		log.info(uri);
		System.out.println(uri);
		switch (path) {
		case "register":
			destpage = "/board/register.jsp";
			break;
		case "insert":
			try {
				// jsp에서 데이터를 입력후 => controller로 전송
				// DB에 등록한 후 => index.jsp로 이동

				// jsp에서 가져온 title, writer, content를 꺼내오기
				String title = request.getParameter("title");
				String writer = request.getParameter("writer");
				String content = request.getParameter("content");
				log.info(">>insert check1");

				BoardVO bvo = new BoardVO(title, writer, content);
				log.info("insert bvo >>> {} " + bvo);

				// 만들어진 bvo를 db에 저장
				isOk = bsv.register(bvo);
				log.info("board register >> {} ", isOk > 0 ? "성공" : "실패");

				// 목적지 주소
				destpage = "/index.jsp";

			} catch (Exception e) {
				// TODO: handle exception
				log.info("insert error");
				e.printStackTrace();
			}
			break;
		case "list":
			try {
				// index에서 list 버튼을 클릭하면
				// 컨트롤러에서 db로 전체 리스트 요청
				// 전체 리스트를 가지고 list.gsp에 뿌리기
//	             log.info("list check 1");
//	             List<BoardVO>list = bsv.getList();
//	             
//	             log.info("list >>>> {}" + list);
//	             //list를 jsp로 전송
//	             request.setAttribute("list", list);
//	             destpage="/board/list.jsp";
//	             

			} catch (Exception e) {
				log.info("list error");
				e.printStackTrace();
			}
			break;
		}
		rdp = request.getRequestDispatcher(destpage);
		rdp.forward(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post로 오는 요청 처리
		service(request, response);
	}

}
