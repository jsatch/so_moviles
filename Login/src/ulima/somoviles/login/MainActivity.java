package ulima.somoviles.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button butLogin;
	EditText eteUsuario;
	EditText etePassword;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        butLogin = (Button)findViewById(R.id.butLogin);
        eteUsuario = (EditText) findViewById(R.id.eteUsuario);
        etePassword = (EditText) findViewById(R.id.etePassword);
        
        butLogin.setText("Ingresar");
        eteUsuario.setText("Usuario1");
    }

}
