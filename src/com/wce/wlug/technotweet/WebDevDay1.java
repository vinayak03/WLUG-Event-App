package com.wce.wlug.technotweet;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WebDevDay1 extends Fragment {
	
	public WebDevDay1(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_w_day_1, container, false);
         
        return rootView;
    }
}
