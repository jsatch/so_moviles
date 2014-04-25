package ulima.somoviles.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	Button butLogin;
	EditText eteUsuario;
	EditText etePassword;
	TextView tviMensaje;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        butLogin = (Button)findViewById(R.id.butLogin);
        eteUsuario = (EditText) findViewById(R.id.eteUsuario);
        etePassword = (EditText) findViewById(R.id.etePassword);
        tviMensaje = (TextView)findViewById(R.id.tviMensaje);
        
        butLogin.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View v) {
		String usuario = eteUsuario.getText().toString();
		String password = etePassword.getText().toString();
		
		if (usuario.equals("ulima") && password.equals("123")){
			// Correcto
			tviMensaje.setText("Login Correcto!!!!!");
			
			
		}else{
			// Incorrecto
			tviMensaje.setText("Error Login");
		}
	}

}
