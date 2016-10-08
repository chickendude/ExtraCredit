package ch.ralena.extracredit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FakeLoginResultsActivity extends AppCompatActivity {

	private TextView mUsername;
	private TextView mPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fake_login_results);

		mUsername = (TextView) findViewById(R.id.usernameTextView);
		mPassword = (TextView) findViewById(R.id.passwordTextView);

		Intent intent = getIntent();
		String username = intent.getStringExtra("username");
		String password = intent.getStringExtra("password");
		mUsername.setText(username);
		mPassword.setText(password);
	}
}
