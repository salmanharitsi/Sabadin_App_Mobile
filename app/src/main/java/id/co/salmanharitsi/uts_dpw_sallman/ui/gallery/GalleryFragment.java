package id.co.salmanharitsi.uts_dpw_sallman.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;
import java.util.List;

import id.co.salmanharitsi.uts_dpw_sallman.CustomAdapter;
import id.co.salmanharitsi.uts_dpw_sallman.CustomAdapter2;
import id.co.salmanharitsi.uts_dpw_sallman.CustomListView2;
import id.co.salmanharitsi.uts_dpw_sallman.Konten;
import id.co.salmanharitsi.uts_dpw_sallman.Konten2;
import id.co.salmanharitsi.uts_dpw_sallman.R;
import id.co.salmanharitsi.uts_dpw_sallman.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
    ListView CustomListView2;
    List listKonten= new ArrayList();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_gallery,container,false);
        CustomListView2 = (ListView) view.findViewById(R.id.list_galeri);

        Konten2 konten1 = new Konten2(R.drawable.makanan);
        Konten2 konten6 = new Konten2(R.drawable.makanan2);
        Konten2 konten7 = new Konten2(R.drawable.makanan3);
        Konten2 konten2 = new Konten2(R.drawable.kosmetik);
        Konten2 konten8 = new Konten2(R.drawable.kosmetik2);
        Konten2 konten3 = new Konten2(R.drawable.minuman);
        Konten2 konten9 = new Konten2(R.drawable.minuman2);
        Konten2 konten4 = new Konten2(R.drawable.pakaian);
        Konten2 konten5 = new Konten2(R.drawable.sepatu);
        Konten2 konten10 = new Konten2(R.drawable.sepatu2);

        listKonten.add(konten1);
        listKonten.add(konten6);
        listKonten.add(konten7);
        listKonten.add(konten2);
        listKonten.add(konten8);
        listKonten.add(konten3);
        listKonten.add(konten9);
        listKonten.add(konten4);
        listKonten.add(konten5);
        listKonten.add(konten10);


        CustomAdapter2 adapter = new CustomAdapter2(getActivity(), R.layout.single_list_item_2, listKonten);
        CustomListView2.setAdapter(adapter);

        return view;
    }
}