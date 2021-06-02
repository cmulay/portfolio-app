package com.mad.portfolio.testimonials;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mad.portfolio.R;

import java.util.List;

public class TestimonialAdapter  extends RecyclerView.Adapter<TestimonialAdapter.TestimonialViewHolder> {

    List<TestimonialItems> mdata;

    public TestimonialAdapter(List<TestimonialItems> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public TestimonialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_testimonial,parent,false);

        return new TestimonialViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestimonialViewHolder holder, int position) {
        holder.tv_name.setText(mdata.get(position).getName());
        holder.tv_desc.setText(mdata.get(position).getDesc());
        holder.tv_post.setText(mdata.get(position).getPost());
        holder.img.setImageResource(mdata.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class TestimonialViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name,tv_desc, tv_post;
        ImageView img;

        public TestimonialViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.team_item_name) ;
            tv_desc = itemView.findViewById(R.id.team_item_desc);
            tv_post = itemView.findViewById(R.id.testi_post);
            img = itemView.findViewById(R.id.team_item_img);
        }
    }
}

