package com.why.project.androidbaseapplicationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toast.makeText(MainActivity.this,MyApplication.getAppContext().getResources().getString(R.string.app_name),Toast.LENGTH_SHORT).show();
	}
}
