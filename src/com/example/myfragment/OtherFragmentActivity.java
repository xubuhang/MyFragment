package com.example.myfragment;

import com.example.myfragment.fragment.LeftFragment;
import com.example.myfragment.fragment.RightFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;

public class OtherFragmentActivity extends ActionBarActivity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_otherfragment);
	        //获取屏幕大小
	        Display display=getWindowManager().getDefaultDisplay();
	        //屏幕宽度大于长度(或横屏)
	        if (display.getWidth()>display.getHeight()) {
	        	LeftFragment leftFragment=new LeftFragment();
	        	//获得FragmentManager，getSupportFragmentManager在v4包中，getFragmentManager在app包中
	        	FragmentManager fragmentManager=getSupportFragmentManager();
	        	//开启事务
	        	FragmentTransaction  fragmentTransaction=fragmentManager.beginTransaction();
	        	//leftFragment写入布局
	        	fragmentTransaction.replace(R.id.main_layout, leftFragment);
	        	//提交改变给事务
	        	fragmentTransaction.commit();
				
			}else {
				//屏幕宽度小于长度(或竖屏)
				RightFragment rightFragment=new RightFragment();
				getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, rightFragment).commit();
			}
	        
	    }
}