package id.co.salmanharitsi.uts_dpw_sallman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    TextView btnDaftar;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnDaftar = findViewById(R.id.daftar);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_email = email.getText().toString().trim();
                String str_pass = password.getText().toString().trim();
                Intent i = getIntent();
                String i_extra = i.getStringExtra("user");
                String j_extra = i.getStringExtra("pw");
                String k_extra = i.getStringExtra("email");
                String l_extra = i.getStringExtra("nama");
                String m_extra = i.getStringExtra("tanggal");
                if (str_email.equals(i_extra) && str_pass.equals(j_extra)){
                    Intent intent = new Intent(LoginActivity.this, NavDrawer.class);
                    intent.putExtra("nama", l_extra);
                    intent.putExtra("email", k_extra);
                    intent.putExtra("tanggal", m_extra);
                    intent.putExtra("user",i_extra);
                    intent.putExtra("pw",j_extra);
                    Toast.makeText(LoginActivity.this, "berhasil login", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Id atau Password salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}