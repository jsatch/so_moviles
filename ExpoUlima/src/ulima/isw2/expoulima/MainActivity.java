package ulima.isw2.expoulima;

import ulima.somoviles.expoulima.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnClickListener{
	private ImageView iviUno, iviDos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		iviUno = (ImageView) findViewById(R.id.iviUno);
		iviDos = (ImageView) findViewById(R.id.iviDos);
		
		iviUno.setOnClickListener(this);
		iviDos.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if (view.getId() == R.id.iviUno){
			
		}else if (view.getId() == R.id.iviDos){
			Intent intent = new Intent();
			intent.putExtra("PARAM1", "android rulez");
			intent.putExtra("PARAM2", 11235);
			intent.setClass(this, InscribeteActivity.class);
			
			startActivity(intent);
		}
	}
}
