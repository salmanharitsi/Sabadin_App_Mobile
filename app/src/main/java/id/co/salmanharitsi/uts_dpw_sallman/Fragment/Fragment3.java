package id.co.salmanharitsi.uts_dpw_sallman.Fragment;

import android.content.Intent;
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
import id.co.salmanharitsi.uts_dpw_sallman.Splash;

public class Fragment3 extends Fragment {

    Button btnFrag3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment3,container,false);

        btnFrag3 = view.findViewById(R.id.keSplash);

        btnFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Splash.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return view;
    }
}
