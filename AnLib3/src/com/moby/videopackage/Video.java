package com.moby.videopackage;

import com.example.anlib2.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends Activity {
	ProgressDialog pDialog;
	VideoView myVideoView;
	Intent intent;
	String VideoURL ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Передаем видеоплееру ссылку через интент на видео с ютуба
		intent = getIntent();
		VideoURL=intent.getStringExtra("addres");
		setContentView(R.layout.video);
		myVideoView = (VideoView)findViewById(R.id.videoView1);
	       myVideoView.setVideoURI(Uri.parse(VideoURL));
	       myVideoView.setMediaController(new MediaController(this));
	       myVideoView.requestFocus();
	       myVideoView.start();

	}
}
