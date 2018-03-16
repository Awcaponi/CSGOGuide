package com.android.awni.csgoguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    private CSGOGuideDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
    }

    private void initialize() {
        etUsername=(EditText) findViewById(R.id.etUsername);
        etPassword=(EditText) findViewById(R.id.etpassword);
        btnLogin=(Button) findViewById(R.id.btnLogin);
    }

    public void GotoHome(View view) {
        CSGOGuideDB db = new CSGOGuideDB(this);
        User user = null;
        String Username = etUsername.getText().toString();
        String Password = etPassword.getText().toString();

        if(Username.equals("")||Password.equals(""))
            Toast.makeText(this, "Fill in the blanks", Toast.LENGTH_LONG).show();

        user = db.getUser(Username);

        if(user!=null && !Username.equals("") && Password.equals(""))
            if(user.getUsername().equals(Username)&& user.getPassword().equals(Password)) {
                Toast.makeText(this, "You have logged in succesfully", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
        }

        else Toast.makeText(this, "Icorrect Username or Password", Toast.LENGTH_LONG).show();
    }

    public void GotoSignUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
