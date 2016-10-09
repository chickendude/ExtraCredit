package ch.ralena.extracredit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AgeResultsActivity extends AppCompatActivity {

	private TextView mYears, mMonths, mWeeks, mDays, mSeconds;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_age_results);

		Intent intent = getIntent();
		int age = intent.getIntExtra("age", -1);
		if (age < 0)
			finish();

		int years = age;
		int months = years*12;
		int weeks = (int) (years*52.143);
		int days = weeks*7;
		long seconds = days*24*60*60;

		mYears = (TextView) findViewById(R.id.yearsTextView);
		mMonths = (TextView) findViewById(R.id.monthsTextView);
		mWeeks = (TextView) findViewById(R.id.weeksTextView);
		mDays = (TextView) findViewById(R.id.daysTextView);
		mSeconds = (TextView) findViewById(R.id.secondsTextView);

		mYears.setText(age+"");
		mMonths.setText(months+"");
		mWeeks.setText(weeks+"");
		mDays.setText(days+"");
		mSeconds.setText(seconds+"");

	}
}
