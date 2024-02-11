package com.project.todolist;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialButton submitLoginBtn = findViewById(R.id.login_button);
        submitLoginBtn.setOnClickListener(v -> onSubmit());
    }

    private void onSubmit(){
        TextInputEditText emailInput = findViewById(R.id.email_edit_text);
        TextInputEditText passwordInput = findViewById(R.id.password_edit_text);

        Log.d("Trying",emailInput.getText().toString());
    }
}
