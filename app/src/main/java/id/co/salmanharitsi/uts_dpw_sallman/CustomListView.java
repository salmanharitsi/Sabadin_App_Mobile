package id.co.salmanharitsi.uts_dpw_sallman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomListView extends AppCompatActivity {

    ListView customListView;
    List listKonten = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        customListView=findViewById(R.id.customListView);

        Konten konten1 = new Konten(R.drawable.sabadin,"10-12-2023","Foto Produk",getResources().getString(R.string.deskripsi_makanan));
        Konten konten2 = new Konten(R.drawable.sabadin,"10-12-2023","Foto Produk",getResources().getString(R.string.deskripsi_kosmetik));
        Konten konten3 = new Konten(R.drawable.sabadin,"10-12-2023","Foto Produk",getResources().getString(R.string.deskripsi_minuman));

        listKonten.add(konten1);
        listKonten.add(konten2);
        listKonten.add(konten3);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.single_list_item, listKonten);
        customListView.setAdapter(adapter);
    }
}