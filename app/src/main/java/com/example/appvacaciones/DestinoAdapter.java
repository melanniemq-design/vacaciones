package com.example.appvacaciones;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DestinoAdapter extends BaseAdapter {

    private Context context;
    private List<Destino> listaDestinos;

    public DestinoAdapter(Context context, List<Destino> listaDestinos) {
        this.context = context;
        this.listaDestinos = listaDestinos;
    }

    @Override
    public int getCount() {
        return listaDestinos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDestinos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_destino, parent, false);
        }

        Destino destino = listaDestinos.get(position);

        CircleImageView ivDestino = convertView.findViewById(R.id.iv_destino);
        TextView tvNombre = convertView.findViewById(R.id.tv_nombre_destino);
        TextView tvUbicacion = convertView.findViewById(R.id.tv_ubicacion_destino);
        TextView tvDuracion = convertView.findViewById(R.id.tv_duracion_destino);
        TextView tvPrecio = convertView.findViewById(R.id.tv_precio_destino);

        tvNombre.setText(destino.getNombre());
        tvUbicacion.setText(destino.getUbicacion());
        tvDuracion.setText(destino.getDuracion());
        tvPrecio.setText(destino.getPrecio());

        Picasso.with(context)
                .load(destino.getImagenResId())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(ivDestino);

        return convertView;
    }
}