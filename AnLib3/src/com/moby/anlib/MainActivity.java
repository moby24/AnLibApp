package com.moby.anlib;
/**
 * Have activity with 5 button 
 */
import com.example.anlib2.R;
import com.moby.fragment_app.AnActivity;
import com.moby.videopackage.MainVideo;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity {
	Intent intent;
	ImageButton ib1, ib2, ib3, ib4;
	Button aboutB;
	Context context;
	public static Activity a;
	ImageView iv1, iv2, iv3, iv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		a = this;
		context = this;

		aboutB = (Button) findViewById(R.id.About);
		iv1 = (ImageView) findViewById(R.id.imageViewCargo);
		iv2 = (ImageView) findViewById(R.id.imageViewPass);
		iv3 = (ImageView) findViewById(R.id.imageViewSpec);
		iv4 = (ImageView) findViewById(R.id.imageViewVideo);
		iv1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final String info[] = getResources().getStringArray(
						R.array.data);
				intent = new Intent(context, AnActivity.class);
				intent.putExtra("plane1", R.drawable.an225ru);
				intent.putExtra("plane2", R.drawable.an124ru);
				intent.putExtra("plane3", R.drawable.an70ru);
				intent.putExtra("plane4", R.drawable.an32ru);
				intent.putExtra("plane5", R.drawable.an22ru);
				intent.putExtra("plane6", R.drawable.an12ru);
				intent.putExtra("data", info);
				intent.putExtra("switch", 0);

				startActivity(intent);
			}
		});
		iv2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final String info2[] = getResources().getStringArray(
						R.array.data2);
				intent = new Intent(context, AnActivity.class);
				intent.putExtra("plane1", R.drawable.an158ru);
				intent.putExtra("plane2", R.drawable.an148ru);
				intent.putExtra("plane3", R.drawable.an140ru);
				intent.putExtra("plane4", R.drawable.an74ru);
				intent.putExtra("plane5", R.drawable.an74tk300ru);
				intent.putExtra("plane6", R.drawable.an38ru);
				intent.putExtra("data", info2);
				intent.putExtra("switch", 6);
				startActivity(intent);
			}
		});
		iv3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final String info3[] = getResources().getStringArray(
						R.array.data3);
				intent = new Intent(context, AnActivity.class);
				intent.putExtra("plane1", R.drawable.an2ru);
				intent.putExtra("plane2", R.drawable.an3ru);
				intent.putExtra("plane3", R.drawable.an6ru);
				intent.putExtra("plane4", R.drawable.an14ru);
				intent.putExtra("plane5", R.drawable.an32pru);
				intent.putExtra("plane6", R.drawable.an74ru);
				intent.putExtra("data", info3);
				intent.putExtra("switch", 12);
				startActivity(intent);
			}
		});
		iv4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, MainVideo.class);
				startActivity(intent);
			}
		});
	}

	public void onClickAbout(View v) {
		AlertDialog.Builder b = new AlertDialog.Builder(context);
		b.setTitle("О программе");
		b.setMessage("version: 1.0 \nСправочник по самолетам КБ Антонов \nАвтор программы -\nТовкес <<moby>> Максим \nmail: moby.89@i.ua");
		b.show();
	}

}
