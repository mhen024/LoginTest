package sdu.cs58.suteenart.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //1.Explicit ปากาศตัวแปร
    EditText nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2.Initial view ผูกตัวแปรบน java ให้รู้จักกับ element บน xml
        nameEditText = findViewById(R.id.TXTName);
        usernameEditText = findViewById(R.id.TXTUsername);
        passwordEditText = findViewById(R.id.TXTPassword);
        loginButton = findViewById(R.id.BTNLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString = nameEditText.getText().toString().trim();
                Toast.makeText(getApplicationContext(),"Sub BOIIII!!!!" + nameString,Toast.LENGTH_SHORT).show();
            }
        });

    } //end method onCreate
} //end class
