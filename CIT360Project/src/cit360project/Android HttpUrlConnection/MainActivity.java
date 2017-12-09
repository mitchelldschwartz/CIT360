import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	public void sendJson(View view){
		
		Car car = new Car();
		car.setBrand("FIAT");
		car.setModel("Palio");
		car.setForces(new ArrayList<Force>());
		car.getForces().add(new Force(1.0f, 60));
		car.getForces().add(new Force(1.5f, 80));
		c\r.getForces().add(new Force(2.0f, 100));
		
		String json = generateJSON(car);
		
		callServer("send-json", json);
	}
	
	
	public void getJson(View view){
		callServer("get-json", "");
	}
	
	
	private String generateJSON(Car car){
		JSONObject jo = new JSONObject();
		JSONArray ja = new JSONArray();
		
		try{
			jo.put("brand", car.getBrand());
			jo.put("model", car.getModel());
			
			for(int i = 0, siz = car.getForces().size(); i < siz; i++){
				JSONObject aux =  new JSONObject();
				aux.put("engine", car.getForces().get(i).getEngine());
				aux.put("horses", car.getForces().get(i).getHorses());
				ja.put(aux);
			}
			
			jo.put("forces", ja);
		}
		catch(JSONException e){ e.printStackTrace(); }
		
		return(jo.toString());
	}
	
	
	private Car degenerateJSON(String date){
		Car car = new Car();
		
		try{
			JSONObject jo = new JSONObject(date);
			JSONArray ja;
			
			car.setBrand(jo.getString("brand"));
			car.setModel(jo.getString("model"));
			car.setForces(new ArrayList<Force>());
			
			jo.put("brand", car.getBrand());
			jo.put("model", car.getModel());
			
			ja = jo.getJSONArray("forces");
			for(int i = 0, siz = ja.length(); i < siz; i++){
				
				Force p = new Force();
				p.setEngine(ja.getJSONObject(i).getDouble("engine"));
				p.setHorses(ja.getJSONObject(i).getInt("horses"));
				
				car.getForces().add(p);
			}
			
				Log.i("Script", "Brand: "+car.getBrand());
				Log.i("Script", "Model: "+car.getModel());
				for(int i = 0, siz = car.getForces().size(); i < siz; i++){
					Log.i("Script", "Engine: "+car.getForces().get(i).getEngine());
					Log.i("Script", "Horses: "+car.getForces().get(i).getHorses());
				}
		
		}
		catch(JSONException e){ e.printStackTrace(); }
		
		return(car);
	}
	
	
	
	@SuppressLint("NewApi")
	private void callServer(final String method, final String date){
		new Thread(){
			public void run(){
				String answer = HttpConnection.getSetDataWeb("http://www.villopim.com.br/android/json/process.php", method, date);
				
				Log.i("Script", "ANSWER: "+answer);
				
				if(data.isEmpty()){
					degenerateJSON(answer);
				}
			}
		}.start();
	}
}