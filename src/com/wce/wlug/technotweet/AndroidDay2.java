package com.wce.wlug.technotweet;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AndroidDay2 extends Fragment {
	
	public AndroidDay2(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_a_day_2, container, false);
         
        return rootView;
    }
}
