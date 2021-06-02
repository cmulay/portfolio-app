package com.mad.portfolio.edu;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.mad.portfolio.R;

import java.util.List;

public class EduAdapter extends RecyclerView.Adapter<EduAdapter.EduViewHolder> {

    List<EduItems> mdata;

    public EduAdapter (List<EduItems> mdata) { this.mdata = mdata; }

    @NonNull
    @Override
    public EduAdapter.EduViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_edu,parent,false);
        return new EduViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EduAdapter.EduViewHolder holder, int position) {
        holder.tvTitle.setText(mdata.get(position).getTitle());
        holder.tvYear.setText(mdata.get(position).getYear());
        holder.tvDescription.setText(mdata.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class EduViewHolder extends  RecyclerView.ViewHolder {

        TextView tvTitle, tvYear,tvDescription;

        public EduViewHolder( @Nullable View itemView) {
            super (itemView);

            tvTitle = itemView.findViewById(R.id.work_title);
            tvYear = itemView.findViewById(R.id.work_year);
            tvDescription = itemView.findViewById(R.id.work_desc);
        }
    }
}
