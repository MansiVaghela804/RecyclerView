package com.example.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ModelsAdapter extends RecyclerView.Adapter<ModelsAdapter.ViewHolder> {

    private List<Models> modelsList;


    public ModelsAdapter(List<Models> modelsList) {
        this.modelsList = modelsList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Models models = modelsList.get(position);
        holder.data.setText(models.getData());
        holder.imagelist.setImageResource(models.getImagelist());

    }

    @Override
    public int getItemCount() {
        return modelsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView data;
        ImageView imagelist;
        public ViewHolder(View itemView) {
            super(itemView);
            data = (TextView)itemView.findViewById(R.id.data);
            imagelist = (ImageView)itemView.findViewById(R.id.imagelist);
        }
    }
}
