package ulima.isw2.expoulima;

import ulima.somoviles.expoulima.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InscribeteActivity extends Activity{
	private TextView tvi;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inscribete);
		
		Intent intent = getIntent();
		String param1 = intent.getStringExtra("PARAM1");
		int param2 = intent.getIntExtra("PARAM2", 0);
		
		tvi = (TextView) findViewById(R.id.tvi);
		tvi.setText(param1 + " - " + param2);
	}
}
