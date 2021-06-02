package com.mad.portfolio.cv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mad.portfolio.R;

import java.util.List;

public class WorkAdapter extends RecyclerView.Adapter<WorkAdapter.WorkViewHolder> {

    List<WorkItems> mdata;

    public WorkAdapter(List<WorkItems> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public WorkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_work,parent,false);
        return new WorkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkAdapter.WorkViewHolder holder, int position) {
        holder.tvTitle.setText(mdata.get(position).getTitle());
        holder.tvYear.setText(mdata.get(position).getYear());
        holder.tvDescription.setText(mdata.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class WorkViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvDescription, tvYear;

        public WorkViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.work_title);
            tvYear = itemView.findViewById(R.id.work_year);
            tvDescription = itemView.findViewById(R.id.work_desc);
        }
    }
}
