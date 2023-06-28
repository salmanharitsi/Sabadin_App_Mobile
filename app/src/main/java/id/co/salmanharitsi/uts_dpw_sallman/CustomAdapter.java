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

public class CustomAdapter extends ArrayAdapter<Konten> {

    private int layout;
    private Context mContext;
    private List<Konten> konten;

    public CustomAdapter(@NonNull Context context, int resource, List<Konten> object){
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
            holder.author=view.findViewById(R.id.tv_author);
            holder.desc=view.findViewById(R.id.tv_desc);

            view.setTag(holder);
        }else {
            holder=(KontenHolder) view.getTag();
        }

        Konten k1 = konten.get(position);
        holder.img.setImageResource(k1.getImg());
        holder.author.setText(k1.getAuthor());
        holder.desc.setText(k1.getDesc());

        return view;
    }

    static class KontenHolder{
        ImageView img;
        TextView author;
        TextView desc;
    }
}
