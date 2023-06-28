package id.co.salmanharitsi.uts_dpw_sallman;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawer extends AppCompatActivity {

    TextView namaleng, ttl, emailuser;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        mDrawerLayout = findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.buka, R.string.tutup);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        namaleng = findViewById(R.id.namalengkap);
//        ttl = findViewById(R.id.tanggal);
//        emailuser = findViewById(R.id.email);
//
//        Intent i = getIntent();
//        String i_extra = i.getStringExtra("user");
//        String j_extra = i.getStringExtra("tanggal");
//        String k_extra = i.getStringExtra("email");
//        namaleng.setText(i_extra);
//        ttl.setText(j_extra);
//        emailuser.setText(k_extra);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}