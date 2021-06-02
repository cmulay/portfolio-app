package com.mad.portfolio.cv;

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

public class WorkFragment extends Fragment {

    RecyclerView rvCv;
    WorkAdapter adapter;
    List<WorkItems> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvCv = view.findViewById(R.id.recyclerview_work);

        items = new ArrayList<>();
        items.add(new WorkItems(getString(R.string.ctech_title),getString(R.string.ctech_desc),getString(R.string.ctech_year)));
        items.add(new WorkItems(getString(R.string.dailybla_title),getString(R.string.dailybla_desc),getString(R.string.dailybla_year)));
        items.add(new WorkItems(getString(R.string.fiverr_title),getString(R.string.fiverr_desc),getString(R.string.fiverr_year)));
        items.add(new WorkItems(getString(R.string.freelancer_title),getString(R.string.freelancer_desc),getString(R.string.freelancer_year)));

        adapter = new WorkAdapter(items);
        rvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        rvCv.setAdapter(adapter);

    }

    public WorkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work, container, false);
    }
}