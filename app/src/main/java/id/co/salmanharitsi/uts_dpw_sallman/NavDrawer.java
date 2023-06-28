package id.co.salmanharitsi.uts_dpw_sallman;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import id.co.salmanharitsi.uts_dpw_sallman.databinding.ActivityNavDrawerBinding;

public class NavDrawer extends AppCompatActivity {

    TextView namaleng, ttl, emailuser;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityNavDrawerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNavDrawerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        namaleng = findViewById(R.id.namalengkap);
//        ttl = findViewById(R.id.tanggal);
//        emailuser = findViewById(R.id.email);
//
//        Intent i = getIntent();
//        String i_extra = i.getStringExtra("nama");
//        String j_extra = i.getStringExtra("tanggal");
//        String k_extra = i.getStringExtra("email");
//        namaleng.setText(i_extra);
//        ttl.setText(j_extra);
//        emailuser.setText(k_extra);

        String usersucceslogin = getIntent().getStringExtra("nama");
        String usertanggal = getIntent().getStringExtra("tanggal");
        String useremail = getIntent().getStringExtra("email");

        setSupportActionBar(binding.appBarNavDrawer.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        View headerview = navigationView.getHeaderView(0);
        TextView nama = (TextView) headerview.findViewById(R.id.namalengkap);
        TextView ttl = (TextView) headerview.findViewById(R.id.tanggal);
        TextView email = (TextView) headerview.findViewById(R.id.email);

        nama.setText(usersucceslogin);
        ttl.setText(usertanggal);
        email.setText(useremail);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_kontak, R.id.nav_about, R.id.nav_logout)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_nav_drawer);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.getMenu().findItem(R.id.nav_logout).setOnMenuItemClickListener(menuItem -> {
            logout();
            return true;
        });

    }

    private  void logout1(){
        Intent i = getIntent();
        String i_extra = i.getStringExtra("user");
        String j_extra = i.getStringExtra("pw");
        String k_extra = i.getStringExtra("email");
        String l_extra = i.getStringExtra("nama");
        String m_extra = i.getStringExtra("tanggal");

        Intent intent = new Intent(NavDrawer.this, LoginActivity.class);
        intent.putExtra("user", i_extra);
        intent.putExtra("email", k_extra);
        intent.putExtra("pw",j_extra);
        intent.putExtra("nama",l_extra);
        intent.putExtra("tanggal",m_extra);
        startActivity(intent);
    }

    private void logout() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Yakin ingin keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Intent i = getIntent();
                String i_extra = i.getStringExtra("user");
                String j_extra = i.getStringExtra("pw");
                String k_extra = i.getStringExtra("email");
                String l_extra = i.getStringExtra("nama");
                String m_extra = i.getStringExtra("tanggal");

                Intent intent = new Intent(NavDrawer.this, LoginActivity.class);
                intent.putExtra("user", i_extra);
                intent.putExtra("email", k_extra);
                intent.putExtra("pw",j_extra);
                intent.putExtra("nama",l_extra);
                intent.putExtra("tanggal",m_extra);
                startActivity(intent);
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_drawer, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_nav_drawer);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}