package com.example.app.explorenepal;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextEmail, editTextPassword;
    private ProgressDialog LoadingBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        TextView register = (TextView) findViewById(R.id.register);
        register.setOnClickListener(this);

        Button signIn = (Button) findViewById(R.id.signIn);
        signIn.setOnClickListener(this);
        LoadingBar = new ProgressDialog(this);
        editTextEmail = (EditText) findViewById(R.id.emaail);
        editTextPassword = (EditText) findViewById(R.id.passwoord);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbaar);

        mAuth = FirebaseAuth.getInstance();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.signIn:
                userLogin();
                break;
        }

    }

    private void userLogin() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (email.isEmpty()) {
            editTextEmail.setError("Email is required!");
            editTextEmail.requestFocus();
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextEmail.setError("Please enter a valid email");
            editTextEmail.requestFocus();
        } else if (password.isEmpty()) {
            editTextPassword.setError("Password is required!");
            editTextPassword.requestFocus();

        } else if (password.length() < 6) {
            editTextPassword.setError("Min password length should be 6 characters!");
            editTextPassword.requestFocus();

        } else {
            LoadingBar.setTitle("Signing in");
            LoadingBar.setMessage("Please wait while we are signing you in");
            LoadingBar.show();
            LoadingBar.setCanceledOnTouchOutside(true);

            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            // redirect to homepage
                            startActivity(new Intent(LoginActivity.this, MainActivity.class));
                            LoadingBar.dismiss();
                        } else {
                            // if the user does not exist, create a new account
                            mAuth.createUserWithEmailAndPassword(email, password)
                                    .addOnCompleteListener(task1 -> {
                                        if (task1.isSuccessful()) {
                                            Toast.makeText(LoginActivity.this, "you are authenticated successfully", Toast.LENGTH_SHORT).show();
                                        } else {
                                            String message = Objects.requireNonNull(task1.getException()).getMessage();
                                            Toast.makeText(LoginActivity.this, "Error occurred: " + message, Toast.LENGTH_SHORT).show();
                                        }
                                        LoadingBar.dismiss();
                                    });

                        }
                    });
        }
    }
}
