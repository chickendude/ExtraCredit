package ch.ralena.extracredit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
	// DONE: ask user for their favorite color and show it to them
	// DONE: design fake login screen and log them in fakely
	// TODO: ask user to input age in years then show age in days, weeks, months, etc.

	private Button mFavoriteColorButton, mFakeLoginButton, mAgeButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mFavoriteColorButton = (Button) findViewById(R.id.favoriteColorButton);
		mFakeLoginButton = (Button) findViewById(R.id.fakeLoginButton);
		mAgeButton = (Button) findViewById(R.id.ageButton);

		// set onclick listeners
		mFavoriteColorButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, ColorActivity.class);
				startActivity(intent);
			}
		});
		mFakeLoginButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, FakeLoginActivity.class);
				startActivity(intent);
			}
		});
		mAgeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, AgeActivity.class);
				startActivity(intent);
			}
		});
	}
}
