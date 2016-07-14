package ncu.alpha.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        EditText etName = (EditText) findViewById(R.id.et_username);
        EditText etPassword = (EditText) findViewById(R.id.et_password);
        Button btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
        etName.setText("UserName");
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_login) {
            Toast.makeText(MainActivity.this, "点击 Button", Toast.LENGTH_SHORT).show();
        }
    }
}


//dev: add a line