package videopackage;

import com.example.anlib2.R;
import com.example.anlib2.R.id;
import com.example.anlib2.R.layout;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends Activity {
	ProgressDialog pDialog;
	VideoView myVideoView;
	Intent intent;
	
	// Insert your Video URL
//	String VideoURL = "http://r12---sn-aigllne7.googlevideo.com/videoplayback?fexp=933406%2C903802%2C920608%2C906435%2C910207%2C916626%2C902545%2C909717%2C936912%2C936910%2C923305%2C936913%2C907231%2C907240&ip=213.133.141.197&key=yt5&sparams=id%2Cip%2Cipbits%2Citag%2Cratebypass%2Csource%2Cupn%2Cexpire&mv=m&upn=jkhsarebjuQ&source=youtube&sver=3&ms=au&id=1fd6e89f0a404a91&ipbits=0&itag=18&mt=1386795919&expire=1386822481&ratebypass=yes&signature=B6FC7FC3E71FD8461C62E5C1594205CA4B6F0300.91E80A92A53C4A743FC2966096BCF8F3039633B4&title=%D0%90%D0%BD%D1%82%D0%BE%D0%BD%D0%BE%D0%B2+%D0%90%D0%BD+225+%D0%9C%D1%80%D0%B8%D1%8F+%28PixDay.ru%29";
	String VideoURL ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the layout from video_main.xml
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
