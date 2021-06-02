package com.mad.portfolio.connect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mad.portfolio.R;

public class ContactFragment extends Fragment {


    public ContactFragment() {
        // Required empty public constructor
    }

    public void openLinkedIn(View view) {
        Uri uri = Uri.parse("http://linkedin.com/in/cmulay17");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openGithub(View view) {
        Uri uri = Uri.parse("http://github.com/cmulay");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }
}