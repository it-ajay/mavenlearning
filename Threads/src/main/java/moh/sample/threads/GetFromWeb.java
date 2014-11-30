package moh.sample.threads;

import org.s2n.ddt.util.http.HttpData;
import org.s2n.ddt.util.http.NetSend;

public class GetFromWeb {
	//helloooo

	public static void main(String[] args) {
		GetFromWeb aa = new GetFromWeb();
//		aa.goUrl("http://sel2in.com/up6.php");
//		aa.goUrl("http://git-scm.com/book/en/v2/Getting-Started-Git-Basics");
//		aa.goUrl("http://www.timesofoman.com/Oman");
		aa.goUrl("http://www.gocricket.com/news/Australian-cricket-news-Phil-Hughes-dies-aged-25/articleshow/45292788.cms?_ga=1.10818228.1236598059.1416946497");
	}

	void goUrl(String u){
		try {
			HttpData hdata = new HttpData();
			hdata.setUrl(u);
			String s = NetSend.send(hdata, "",null, "GET");
			System.out.println("Got :" +s + ".");
		} catch (Exception e) {
			System.out.println("Err:" +e);
			e.printStackTrace();
		}
	}
}
