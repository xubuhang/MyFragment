package com.example.myfragment.fragment;

import com.example.myfragment.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class LeftFragment extends Fragment  implements OnClickListener{

	String tag="LeftFragment";
	private TextView leftfragment_infoTv;
	private TextView  rightfragment_infoTv;
	@Override
	public void onAttach(Activity activity) {
		// onAttach方法：Fragment和Activity建立关联
		super.onAttach(activity);
		Log.e(tag, "onAttach");
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.e(tag, "onCreate");
	}
	
	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// 为Fragment加载布局
		Log.e(tag, "onCreateView");
		return      inflater.inflate(R.layout.fragment_left, container, false);
		
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		leftfragment_infoTv=(TextView)getActivity().findViewById(R.id.leftfragment_infoTv);
		rightfragment_infoTv=(TextView)getActivity().findViewById(R.id.rightfragment_infoTv);
		if (leftfragment_infoTv!=null) {
			leftfragment_infoTv.setOnClickListener(this);
		}
		if (rightfragment_infoTv!=null) {
			rightfragment_infoTv.setOnClickListener(this);
		}
		
		super.onActivityCreated(savedInstanceState);
		Log.e(tag, "onActivityCreated");
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.e(tag, "onStart");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.e(tag, "onResume");
	}

	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e(tag, "onPause");
	}
	
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e(tag, "onStop");
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e(tag, "onDestroy");
	}

	@Override
	public void onDestroyView() {
		// Fragment布局移除时候调用
		super.onDestroyView();
		Log.e(tag, "onDestroyView");
	}

	@Override
	public void onDetach() {
		// Fragment和Activity解除关联
		super.onDetach();
		Log.e(tag, "onDetach");
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.leftfragment_infoTv:
			if (leftfragment_infoTv!=null) {
			leftfragment_infoTv.setText("您点击了左边TextView");
			}
			if (rightfragment_infoTv!=null) {
			rightfragment_infoTv.setText("并修改右边TextView");
			}
			break;
		case R.id.rightfragment_infoTv:
			if (rightfragment_infoTv!=null) {
			rightfragment_infoTv.setText("您点击了右边TextView");
			}
			if (leftfragment_infoTv!=null) {
			leftfragment_infoTv.setText("并修改左边TextView");
			}
			break;
		default:
			break;
		}
		
	}



}
