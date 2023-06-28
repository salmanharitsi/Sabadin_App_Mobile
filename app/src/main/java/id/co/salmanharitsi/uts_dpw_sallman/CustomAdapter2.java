package id.co.salmanharitsi.uts_dpw_sallman;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter2 extends ArrayAdapter<Konten2> {

    private int layout;
    private Context mContext;
    private List<Konten2> konten;

    public CustomAdapter2(@NonNull Context context, int resource, List<Konten2> object){
        super(context,resource,object);
        this.mContext=context;
        this.layout=resource;
        this.konten=object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View view = convertView;
        KontenHolder holder;

        if (view==null){
            LayoutInflater layoutInflater = ((Activity)mContext).getLayoutInflater();
            view = layoutInflater.inflate(layout,parent,false);

            holder = new KontenHolder();
            holder.img=view.findViewById(R.id.imgList);

            view.setTag(holder);
        }else {
            holder=(KontenHolder) view.getTag();
        }

        Konten2 k1 = konten.get(position);
        holder.img.setImageResource(k1.getImg());

        return view;
    }

    static class KontenHolder{
        ImageView img;

    }
}
