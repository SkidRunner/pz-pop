package com.projectzomboid.pop;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class SplashActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_splash);
		
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);

		finish();
	}

}
