package ch.ralena.extracredit;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class ColorResultsActivity extends AppCompatActivity {

	private RelativeLayout mLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color_results);

		mLayout = (RelativeLayout) findViewById(R.id.activity_color_results);

		Intent intent = getIntent();
		String colorName = intent.getStringExtra("colorName");
		String colorValue = intent.getStringExtra("colorValue");
		setTitle(colorName);

		mLayout.setBackgroundColor(Color.parseColor(colorValue));
	}
}
