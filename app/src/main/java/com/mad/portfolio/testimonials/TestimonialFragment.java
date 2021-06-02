package com.mad.portfolio.testimonials;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mad.portfolio.R;

import java.util.ArrayList;
import java.util.List;

public class TestimonialFragment extends Fragment {

    RecyclerView RvTeam;
    TestimonialAdapter adapter;
    List<TestimonialItems> mdata;

    public TestimonialFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_testimonial, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RvTeam = view.findViewById(R.id.rv_team);

        TestimonialItems item = new TestimonialItems(getString(R.string.t1_name),getString(R.string.t1_message),R.drawable.ic_user, getString(R.string.t1_post));
        TestimonialItems item2 = new TestimonialItems(getString(R.string.t2_name),getString(R.string.t2_message),R.drawable.ic_user, getString(R.string.t2_post));
        TestimonialItems item3 = new TestimonialItems(getString(R.string.t2_name),getString(R.string.t3_message),R.drawable.ic_user, getString(R.string.t3_post));

        mdata = new ArrayList<>();
        mdata.add(item);
        mdata.add(item2);
        mdata.add(item3);

        RvTeam.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TestimonialAdapter(mdata);
        RvTeam.setAdapter(adapter);
    }
}