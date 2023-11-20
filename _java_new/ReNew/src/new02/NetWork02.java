package new02;

import java.net.URL;

public class NetWork02 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://n.news.naver.com/article/346/0000066704?cds=news_media_pc&type=editn");
		System.out.println(url.getContent());
		System.out.println(url.getAuthority());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getQuery());
		System.out.println();
	}

}
