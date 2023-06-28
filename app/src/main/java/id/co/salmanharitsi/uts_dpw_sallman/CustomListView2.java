package id.co.salmanharitsi.uts_dpw_sallman;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListView2 extends AppCompatActivity {

    ListView customListView2;
    List listKonten = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view2);

        customListView2=findViewById(R.id.customListView2);

        Konten konten1 = new Konten(R.drawable.sabadin,"10-12-2023","Foto Produk",getResources().getString(R.string.deskripsi_makanan));
        Konten konten2 = new Konten(R.drawable.sabadin,"10-12-2023","Foto Produk",getResources().getString(R.string.deskripsi_kosmetik));
        Konten konten3 = new Konten(R.drawable.sabadin,"10-12-2023","Foto Produk",getResources().getString(R.string.deskripsi_minuman));

        listKonten.add(konten1);
        listKonten.add(konten2);
        listKonten.add(konten3);

        CustomAdapter2 adapter = new CustomAdapter2(this, R.layout.single_list_item_2, listKonten);
        customListView2.setAdapter(adapter);
    }
}