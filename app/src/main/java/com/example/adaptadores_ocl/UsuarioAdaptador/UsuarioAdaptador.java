package com.example.adaptadores_ocl.UsuarioAdaptador;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadores_ocl.MainActivity2;
import com.example.adaptadores_ocl.R;
import com.example.adaptadores_ocl.Usuario.Usuario;

import com.squareup.picasso.Picasso;

import java.util.List;

public class UsuarioAdaptador extends RecyclerView.Adapter<UsuarioAdaptador.ViewHolder> {

    private List<Usuario> datos;
    private Context context;

    public UsuarioAdaptador(List<Usuario> datos, Context context) {
        this.datos = datos;
        this.context = context;
    }

    @NonNull
    @Override
    public UsuarioAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdaptador.ViewHolder holder, int position) {
        Usuario dato = datos.get(position);
        holder.bind(dato);

        //el OnClickListener para el primer usuario
        if (position == 0) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // el intent
                    Intent intent = new Intent(context, MainActivity2.class);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_tipousuario, txt_colorusuario;
        ImageView img_usuario;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_colorusuario = itemView.findViewById(R.id.txt_colorusuario);
            txt_tipousuario = itemView.findViewById(R.id.txt_tipousuario);
            img_usuario = itemView.findViewById(R.id.img_usuario);
        }

        public void bind(Usuario dato) {
            txt_tipousuario.setText(dato.getNombre());
            txt_colorusuario.setText(dato.getColor());
            Picasso.get().load(dato.getImg()).into(img_usuario);
        }
    }
}
