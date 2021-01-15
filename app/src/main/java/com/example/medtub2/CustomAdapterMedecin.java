package com.example.medtub2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapterMedecin extends RecyclerView.Adapter<CustomAdapterMedecin.MyViewHolder> {

    private Context context;
    private ArrayList medecin_id, medecin_nom, medecin_prenom, medecin_poste, medecin_telephone, medecin_hopital;

    CustomAdapterMedecin(Context context,
                         ArrayList medecin_id,
                         ArrayList medecin_nom,
                         ArrayList medecin_prenom,
                         ArrayList medecin_poste,
                         ArrayList medecin_telephone,
                         ArrayList medecin_hopital){
        this.context = context;
        this.medecin_id = medecin_id;
        this.medecin_nom = medecin_nom;
        this.medecin_prenom = medecin_prenom;
        this.medecin_poste = medecin_poste;
        this.medecin_telephone = medecin_telephone;
        this.medecin_hopital = medecin_hopital;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row_medecin, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.medecin_id_txt.setText(String.valueOf(medecin_id.get(position)));
        holder.medecin_nom_txt.setText(String.valueOf(medecin_nom.get(position)));
        holder.medecin_prenom_txt.setText(String.valueOf(medecin_prenom.get(position)));
        holder.medecin_poste_txt.setText(String.valueOf(medecin_poste.get(position)));
        holder.medecin_telephone_txt.setText(String.valueOf(medecin_telephone.get(position)));
        holder.medecin_hopital_txt.setText(String.valueOf(medecin_hopital.get(position)));
    }

    @Override
    public int getItemCount() {
        return medecin_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView medecin_id_txt, medecin_nom_txt, medecin_prenom_txt, medecin_poste_txt, medecin_telephone_txt, medecin_hopital_txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            medecin_id_txt = itemView.findViewById(R.id.medecin_id_txt);
            medecin_nom_txt = itemView.findViewById(R.id.medecin_nom_txt);
            medecin_prenom_txt = itemView.findViewById(R.id.medecin_prenom_txt);
            medecin_poste_txt = itemView.findViewById(R.id.medecin_poste_txt);
            medecin_telephone_txt = itemView.findViewById(R.id.medecin_telephone_txt);
            medecin_hopital_txt = itemView.findViewById(R.id.medecin_hopital_txt);
        }
    }
}
