package com.mad.portfolio.edu;

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
import com.mad.portfolio.cv.WorkAdapter;
import com.mad.portfolio.cv.WorkItems;

import java.util.ArrayList;
import java.util.List;

public class EduFragment extends Fragment {
    RecyclerView rvCv;
    EduAdapter adapter;
    List<EduItems> Items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvCv = view.findViewById(R.id.recyclerview_work);

        Items = new ArrayList<>();
        Items.add(new EduItems(getString(R.string.degree_title),getString(R.string.degree_description),getString(R.string.degree_year)));
        Items.add(new EduItems(getString(R.string.diploma_title),getString(R.string.diploma_description),getString(R.string.diploma_year)));
        Items.add(new EduItems(getString(R.string.ssc_title),getString(R.string.ssc_description),getString(R.string.ssc_year)));

        adapter = new EduAdapter(Items);
        rvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        rvCv.setAdapter(adapter);
    }

    public EduFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edu, container, false);
    }
}