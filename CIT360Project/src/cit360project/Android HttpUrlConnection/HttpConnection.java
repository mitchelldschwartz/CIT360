import java.io.IOException;
import java.util.ArrayList;

public class HttpConnection {
	public static String getSetDataWeb(String url, String method, String data){
		
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		String answer = "";
		
		try{
			ArrayList<NameValuePair> valores = new ArrayList<NameValuePair>();
			values.add(new BasicNameValuePair("method", method));
			values.add(new BasicNameValuePair("json", data));
			
			httpPost.setEntity(new UrlEncodedFormEntity(values));
			HttpResponse answer = httpClient.execute(httpPost);
			answer = EntityUtils.toString(answer.getEntity());
		}
		catch(NullPointerException e){ e.printStackTrace(); }
		catch(ClientProtocolException e){ e.printStackTrace(); }
		catch(IOException e){ e.printStackTrace(); }
		
		return(answer);
	}
}