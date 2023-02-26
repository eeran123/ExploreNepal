package com.example.app.explorenepal;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextFullName,editTextEmail,editTextPassword;
    private ProgressDialog LoadingBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        findViewById(R.id.login);

        mAuth = FirebaseAuth.getInstance();

        editTextFullName = (EditText) findViewById(R.id.fullName);
        editTextEmail = (EditText) findViewById(R.id.email);
        editTextPassword = (EditText) findViewById(R.id.password);
        LoadingBar = new ProgressDialog(this);
        findViewById(R.id.progressBar);
        Button registerUser = (Button) findViewById(R.id.registerUser);

        registerUser.setOnClickListener(view -> CreateNewAccount());
    }
    private void CreateNewAccount() {
        String email = editTextEmail.getText().toString().trim();
        String fullName = editTextFullName.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        if (fullName.isEmpty()) {
            editTextFullName.setError("Full name is required");
            editTextFullName.requestFocus();

        } else if (email.isEmpty()) {
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();

        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextEmail.setError("Please provide valid email!");
            editTextEmail.requestFocus();

        } else if (password.isEmpty()) {
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();

        } else if (password.length() < 6) {
            editTextPassword.setError("Min password length should be 6 characters!");
            editTextPassword.requestFocus();

        } else {
            LoadingBar.setTitle("Creating new account");
            LoadingBar.setMessage("Please wait while we are creating your account");
            LoadingBar.show();
            LoadingBar.setCanceledOnTouchOutside(true);


            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(RegisterActivity.this, "you are authenticated successfully", Toast.LENGTH_SHORT).show();
                            LoadingBar.dismiss();
                        } else {
                            String message = Objects.requireNonNull(task.getException()).getMessage();
                            Toast.makeText(RegisterActivity.this, "Error occured: " + message, Toast.LENGTH_SHORT).show();
                            LoadingBar.dismiss();
                        }
                    });


            }
        }
    }
