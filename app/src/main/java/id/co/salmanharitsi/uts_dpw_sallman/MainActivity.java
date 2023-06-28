package id.co.salmanharitsi.uts_dpw_sallman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import id.co.salmanharitsi.uts_dpw_sallman.Fragment.Fragment1;
import id.co.salmanharitsi.uts_dpw_sallman.Fragment.Fragment2;
import id.co.salmanharitsi.uts_dpw_sallman.Fragment.Fragment3;
import id.co.salmanharitsi.uts_dpw_sallman.Fragment.FragmentStateAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        FragmentStateAdapter adapter = new FragmentStateAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "");
        adapter.addFragment(new Fragment2(), "");
        adapter.addFragment(new Fragment3(), "");
        viewPager.setAdapter(adapter);
    }

    public void setPage(int page){viewPager.setCurrentItem(page);}
}