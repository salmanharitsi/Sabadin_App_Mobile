package id.co.salmanharitsi.uts_dpw_sallman;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {

    Button daftar;
    EditText user, userid, email, pw, conpw, tanggal;

    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        daftar = findViewById(R.id.daftarbaru);
        user = findViewById(R.id.nama);
        userid = findViewById(R.id.userid);
        email = findViewById(R.id.emaildaftar);
        pw = findViewById(R.id.password);
        conpw = findViewById(R.id.konfirpass);
        tanggal = findViewById(R.id.et_date);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        RegisterActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        month = month+1;
                        String date = day+"/"+month+"/"+year;
                        tanggal.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = user.getText().toString().trim();
                String username = userid.getText().toString().trim();
                String emailuser = email.getText().toString().trim();
                String pwuser = pw.getText().toString().trim();
                String conpwuser = conpw.getText().toString().trim();
                String ttl = tanggal.getText().toString().trim();
                if (username.equals("") || emailuser.equals("") || pwuser.equals("") || ttl.equals("") || nama.equals("") ){
                    Toast.makeText(RegisterActivity.this, "masukkan data wajib!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (conpwuser.equals(pwuser)){
                        Toast.makeText(RegisterActivity.this, "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show();
                        Intent intent= new Intent(RegisterActivity.this, LoginActivity.class);
                        intent.putExtra("user", username);
                        intent.putExtra("email", emailuser);
                        intent.putExtra("pw",pwuser);
                        intent.putExtra("nama",nama);
                        intent.putExtra("tanggal",ttl);
                        startActivity(intent);
                        finish();
                    }
                    else{
                        Toast.makeText(RegisterActivity.this, "Password tidak sesuai!!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}