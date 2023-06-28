package id.co.salmanharitsi.uts_dpw_sallman.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import id.co.salmanharitsi.uts_dpw_sallman.MainActivity;
import id.co.salmanharitsi.uts_dpw_sallman.R;

public class Fragment2 extends Fragment {

    Button btnFrag2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment2,container,false);

        btnFrag2 = view.findViewById(R.id.keFragment3);

        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).setPage(2);
            }
        });

        return view;
    }
}
