package id.co.salmanharitsi.uts_dpw_sallman.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import id.co.salmanharitsi.uts_dpw_sallman.CustomAdapter;
import id.co.salmanharitsi.uts_dpw_sallman.Konten;
import id.co.salmanharitsi.uts_dpw_sallman.R;

public class AboutFragment extends Fragment {
    ListView CustomListView;
    List listKonten= new ArrayList();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_about,container,false);
        CustomListView = (ListView) view.findViewById(R.id.list_about);

        Konten konten1 = new Konten(R.drawable.makanan,"10-12-2023","Foto Produk Makanan",getResources().getString(R.string.deskripsi_makanan));
        Konten konten2 = new Konten(R.drawable.kosmetik,"10-12-2023","Foto Produk Kosmetik",getResources().getString(R.string.deskripsi_kosmetik));
        Konten konten3 = new Konten(R.drawable.minuman,"10-12-2023","Foto Produk Minuman",getResources().getString(R.string.deskripsi_minuman));
        Konten konten4 = new Konten(R.drawable.pakaian,"10-12-2023","Foto Produk Pakaian",getResources().getString(R.string.deskripsi_pakaian));
        Konten konten5 = new Konten(R.drawable.sepatu,"10-12-2023","Foto Produk Sepatu",getResources().getString(R.string.deskripsi_sepatu));

        listKonten.add(konten1);
        listKonten.add(konten2);
        listKonten.add(konten3);
        listKonten.add(konten4);
        listKonten.add(konten5);

        CustomAdapter adapter = new CustomAdapter(getActivity(), R.layout.single_list_item, listKonten);
        CustomListView.setAdapter(adapter);

        return view;
    }
}