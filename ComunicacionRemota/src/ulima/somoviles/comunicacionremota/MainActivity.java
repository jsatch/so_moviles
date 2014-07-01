package ulima.somoviles.comunicacionremota;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.loopj.android.http.JsonHttpResponseHandler;

public class MainActivity extends Activity implements OnClickListener{
	EditText ete;
	Button but;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ete = (EditText) findViewById(R.id.ete);
		but = (Button) findViewById(R.id.but);
		but.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		Log.i("ULIMA", "Hizo click");
		WCRestClient.get("/teams", null, new JsonHttpResponseHandler(){
			@Override
			public void onSuccess(int statusCode, Header[] headers,
					JSONArray response) {
				super.onSuccess(statusCode, headers, response);
				String paises = "";
				for (int i=0; i<response.length(); i++){
					try {
						JSONObject js = response.getJSONObject(i);
						String nombre = js.getString("country");	
						paises += " , " + nombre;
					} catch (JSONException e) {
						e.printStackTrace();
					}
				}
				ete.setText(paises);
			}
		});
	}
}

















