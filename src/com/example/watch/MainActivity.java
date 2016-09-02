package com.example.watch;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WatchView watchview = (WatchView) findViewById(R.id.watchview);
		watchview.start();
		
	}

}
