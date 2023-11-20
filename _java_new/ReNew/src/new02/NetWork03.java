package new02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetWork03 {

	public static void main(String[] args) throws Exception {
		URL url = null;
		BufferedReader input = null;
		String addr = "https://www.dorocy.co.kr/";
		String line ="";
		
		url = new URL(addr);
		input = new BufferedReader(new InputStreamReader(url.openStream()));
		while((line=input.readLine())!=null) {
			System.out.println(line);
			
		}
		input.close();

	}

}
