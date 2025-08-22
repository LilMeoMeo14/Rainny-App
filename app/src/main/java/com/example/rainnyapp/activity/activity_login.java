package com.example.rainnyapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.rainnyapp.R;
import com.example.rainnyapp.utility.SharedPreferencesHelper;

public class activity_login extends AppCompatActivity {
    EditText edtEmail,edtPassword;
    Button btn_login;
    SharedPreferencesHelper prefsHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btn_login = findViewById(R.id.btnLogin);

        prefsHelper = new SharedPreferencesHelper(this);
        if(prefsHelper.isLoggedIn()){
            Intent intent = new Intent(activity_login.this,MainActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtEmail.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                // khong dien day du thong tin
                if(email.isEmpty() || password.isEmpty()){
                    Toast.makeText(activity_login.this, "Vui lòng điền đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // kiem tra dung format email
                if(Patterns.EMAIL_ADDRESS.matcher(email).matches() == false){
                    Toast.makeText(activity_login.this,"Email không hợp lệ !",Toast.LENGTH_SHORT).show();
                    return;
                }

                // test dang nhap thanh cong
                if(email.equals("admin123@gmail.com") && password.equals("123456")){
                    prefsHelper.setLoggedIn(true);
                    Toast.makeText(activity_login.this,"Đăng nhập thành công!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(activity_login.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(activity_login.this,"Sai Email hoặc Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}