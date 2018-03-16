package com.android.awni.csgoguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private EditText etFirstName;
    private EditText etLastName;
    private EditText etUsername;
    private EditText etPassword;
    private EditText etPasswordConfirm;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initialize();
    }

    private void initialize() {
        etUsername=(EditText) findViewById(R.id.etUsername);
        etPassword=(EditText) findViewById(R.id.etPassword);
        etPasswordConfirm=(EditText) findViewById(R.id.etPasswordConfirm);
        etFirstName= (EditText) findViewById(R.id.etFirstName);
        etLastName=(EditText) findViewById(R.id.etLastName);
        btnSignUp=(Button) findViewById(R.id.btnSignUp);
    }

    public void GotoLogInscreen(View view) {
        User user = null;
        CSGOGuideDB db = new CSGOGuideDB(this);
        String name = etFirstName.getText().toString() + " " + etLastName.getText().toString();
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        String confirmPassword = etPasswordConfirm.getText().toString();

        if (username.equals("") || password.equals("") || name.equals(""))
            Toast.makeText(this, "Fill in the blanks", Toast.LENGTH_LONG).show();

        user = db.getUser(username);

        if (user != null) {
            Toast.makeText(this, "Username already exists", Toast.LENGTH_LONG).show();
            return;
        }

        if (password.equals(confirmPassword) && !password.equals("")) {
            user = new User();
            user.setPassword(password);
            user.setUsername(username);
            user.setName(name);
            db.addUser(user);
            Toast.makeText(this, "You have Signed Up succesfully", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }


    }

}


