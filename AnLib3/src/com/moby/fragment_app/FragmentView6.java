package com.moby.fragment_app;

import com.example.anlib2.R;
import com.moby.anlib.AnInfo;

import android.widget.ImageView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class FragmentView6 extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View myView = inflater.inflate(R.layout.fragment6, container, false);

		ImageView iv6 = (ImageView) myView.findViewById(R.id.imageView6);
		Intent intent = getActivity().getIntent();
		int pic = intent.getIntExtra("plane6", 0);
		iv6.setImageResource(pic);
		int swi = intent.getIntExtra("switch", 0);
		final int res = 6 + swi;
		iv6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(), AnInfo.class);
				intent.putExtra("list", res);
				startActivity(intent);
			}
		});

		return myView;

	}

}
