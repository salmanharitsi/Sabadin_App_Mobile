package id.co.salmanharitsi.uts_dpw_sallman.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentStateAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> listFragment = new ArrayList<>();
    private final List<String> titleFragment = new ArrayList<>();

    public FragmentStateAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addFragment (Fragment frag, String tittle){
        listFragment.add(frag);
        titleFragment.add(tittle);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
