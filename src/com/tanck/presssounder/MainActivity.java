package com.tanck.presssounder;

import com.tanck.presssounder.view.MySounderView;
import com.tanck.presssounder.view.MySounderView.OnRecordListener;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements OnRecordListener {

	private MySounderView mySounderView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sounder);
		mySounderView = (MySounderView) findViewById(R.id.mv);
		mySounderView.setOnRecordListener(this);
	}

	@Override
	public void onStartRecord(String fileSrc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onEndRecod(String fileSrc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onQuickClik() {
		// TODO Auto-generated method stub

	}
}
