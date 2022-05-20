package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder>{
    List<Islands> islandsList;

    public Adapter(List<Islands> islandsList) {
        this.islandsList = islandsList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.name.setText(islandsList.get(position).getName());
        holder.location.setText(islandsList.get(position).getLocation());
        holder.size.setText(islandsList.get(position).getSize());



    }

    @Override
    public int getItemCount() {
        return islandsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name,location,size;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView);
            location = itemView.findViewById(R.id.textView2);
            size = itemView.findViewById(R.id.textView3);
        }
    }
}
