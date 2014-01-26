package com.moby.gallery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;

import com.example.anlib2.R;
import com.moby.anlib2.MainActivity;

public class GalleryAn225 extends Activity {
	private ImageView bigimage;
	public Integer[] imgid = { R.drawable.image1_225, R.drawable.image2_225,
			R.drawable.image4_225, R.drawable.image5_225,
			R.drawable.image6_225, R.drawable.image7_225,
			R.drawable.image8_225, R.drawable.image9_225,
			R.drawable.image10_225, R.drawable.image11_225,
			R.drawable.image12_225, R.drawable.image13_225,
			R.drawable.image17_225, R.drawable.image18_225,
			R.drawable.image20_225 };
	
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gallery);
		final Gallery gallery = (Gallery) findViewById(R.id.gallery1);
		final TextView label = (TextView) findViewById(R.id.textView1);
		bigimage = (ImageView) findViewById(R.id.imageView1);

		bigimage.setImageResource(imgid[0]);
		// bigimage.setBackgroundColor(Color.WHITE);

		gallery.setAdapter(new ImageAdapter(this));

		// ������������ ������ �� �������� �������
		gallery.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				bigimage.setImageResource(imgid[position]);
				int pos = position + 1;
				label.setText(" ����������� � " + pos);
			}
		});
	}

	public static class AnInfoMriya {
		

	

		public String[] info = MainActivity.a.getResources().getStringArray(
				R.array.info_an225);
		
		
		
		Context ctx;

		public AnInfoMriya(Context _ctx) {
			ctx = _ctx;
			
		}
		
		ArrayAdapter<String> adapter;
		public ArrayAdapter<String> getAdapter() {

			adapter = new ArrayAdapter<String>(ctx, android.R.layout.simple_list_item_1, info);

			return adapter;
		}

		
	}

	public class ImageAdapter extends BaseAdapter {
		private int mGalleryItemBackground;
		private Context mContext;
		private final Integer[] mImage = { R.drawable.image1_225,
				R.drawable.image2_225, R.drawable.image4_225,
				R.drawable.image5_225, R.drawable.image6_225,
				R.drawable.image7_225, R.drawable.image8_225,
				R.drawable.image9_225, R.drawable.image10_225,
				R.drawable.image11_225, R.drawable.image12_225,
				R.drawable.image13_225, R.drawable.image17_225,
				R.drawable.image18_225, R.drawable.image20_225 };

		public ImageAdapter(Context �ontext) {

			mContext = �ontext;
			TypedArray attr = mContext
					.obtainStyledAttributes(R.styleable.MyGallery);
			mGalleryItemBackground = attr.getResourceId(
					R.styleable.MyGallery_android_galleryItemBackground, 0);
			attr.recycle();
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mImage.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return mImage[arg0];
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return mImage[position];
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ImageView view = new ImageView(mContext);
			view.setImageResource(mImage[position]);
			view.setPadding(20, 20, 20, 20);
			view.setLayoutParams(new Gallery.LayoutParams(250, 250));
			view.setScaleType(ImageView.ScaleType.FIT_XY);
			view.setBackgroundResource(mGalleryItemBackground);

			return view;
		}
	}
}