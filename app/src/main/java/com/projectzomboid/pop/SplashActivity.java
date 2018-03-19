package com.projectzomboid.pop;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class SplashActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);

		finish();
	}

}
