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
	        //��ȡ��Ļ��С
	        Display display=getWindowManager().getDefaultDisplay();
	        //��Ļ��ȴ��ڳ���(�����)
	        if (display.getWidth()>display.getHeight()) {
	        	LeftFragment leftFragment=new LeftFragment();
	        	//���FragmentManager��getSupportFragmentManager��v4���У�getFragmentManager��app����
	        	FragmentManager fragmentManager=getSupportFragmentManager();
	        	//��������
	        	FragmentTransaction  fragmentTransaction=fragmentManager.beginTransaction();
	        	//leftFragmentд�벼��
	        	fragmentTransaction.replace(R.id.main_layout, leftFragment);
	        	//�ύ�ı������
	        	fragmentTransaction.commit();
				
			}else {
				//��Ļ���С�ڳ���(������)
				RightFragment rightFragment=new RightFragment();
				getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, rightFragment).commit();
			}
	        
	    }
}