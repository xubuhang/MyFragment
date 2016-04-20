package com.example.myfragment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class StaticFragmentActivity extends ActionBarActivity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_staticfragment);
//	         Fragment是Android3.0以后引入
	    }
}