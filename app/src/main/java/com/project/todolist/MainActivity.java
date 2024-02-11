package com.project.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private boolean isLoggedIn = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (isLoggedIn) {
            showLoggedInViews();
        } else {
            showLoggedOutViews();
        }
    }

    private void showLoggedInViews() {
        RecyclerView taskList = findViewById(R.id.task_list);
        MaterialButton logoutButton = findViewById(R.id.logout_button);

        taskList.setVisibility(View.VISIBLE);
        logoutButton.setVisibility(View.VISIBLE);
    }

    private void showLoggedOutViews() {
        MaterialButton loginButton = findViewById(R.id.login_button);
        MaterialButton signupButton = findViewById(R.id.signup_button);

        loginButton.setVisibility(View.VISIBLE);
        signupButton.setVisibility(View.VISIBLE);

        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });
        signupButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(intent);
        });
    }

}
