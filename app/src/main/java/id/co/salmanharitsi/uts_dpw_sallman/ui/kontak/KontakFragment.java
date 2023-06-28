package id.co.salmanharitsi.uts_dpw_sallman.ui.kontak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import id.co.salmanharitsi.uts_dpw_sallman.R;
import id.co.salmanharitsi.uts_dpw_sallman.databinding.FragmentHomeBinding;
import id.co.salmanharitsi.uts_dpw_sallman.databinding.FragmentKontakBinding;

public class KontakFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kontak, container, false);

        return view;
    }
}