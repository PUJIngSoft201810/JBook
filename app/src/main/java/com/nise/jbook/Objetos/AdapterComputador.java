package com.nise.jbook.Objetos;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nise.jbook.R;

import java.util.List;

public class AdapterComputador extends RecyclerView.Adapter<AdapterComputador.ComputadoresViewHolder>{
    List<Computador> computadores;

    public AdapterComputador(List<Computador> computadores) {
        this.computadores = computadores;
    }

    @NonNull
    @Override
    public AdapterComputador.ComputadoresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler_computador,parent,false);
        AdapterComputador.ComputadoresViewHolder holder = new AdapterComputador.ComputadoresViewHolder(v);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterComputador.ComputadoresViewHolder holder, int position) {
        //LO QUE SE QUIERE HACER

        Computador computador = computadores.get(position);
        holder.textViewComputador.setText("Computador: "+computador.getDescripcion()+ "\n   Id computador: " + computador.getId()+ "\n");
        //holder.textViewRecurso.setText(reserva.getRecurso());
        //holder.textViewIdUsuario.setText(reserva.getIdUsuario()+"");
    }

    @Override
    public int getItemCount() {
        return computadores.size();
    }

    public static class ComputadoresViewHolder extends RecyclerView.ViewHolder{

        TextView textViewComputador, textViewIdUsuario;
        public ComputadoresViewHolder(View itemView) {
            super(itemView);

            textViewComputador = itemView.findViewById(R.id.textview_computador);
            //  textViewIdUsuario = itemView.findViewById(R.id.textview_idusuario);
        }
    }
}
