package com.mylol.project.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.it.administrator.mylol_project.R;

/**
 * Created by kim
 * on 2017/4/10.
 */
public class VideoFt extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.videoft_fragment_layout, null);
        return view;
    }
}
