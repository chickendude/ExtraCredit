package ch.ralena.extracredit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FakeLoginActivity extends AppCompatActivity {

	private EditText mUsername;
	private EditText mPassword;

	private Button mLoginButton, mClearButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fake_login);

		mUsername = (EditText) findViewById(R.id.usernameEditText);
		mPassword = (EditText) findViewById(R.id.passwordEditText);
		mLoginButton = (Button) findViewById(R.id.loginButton);
		mClearButton = (Button) findViewById(R.id.resetButton);

		mClearButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mUsername.setText("");
				mPassword.setText("");
			}
		});

		mLoginButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(FakeLoginActivity.this, FakeLoginResultsActivity.class);
				String username = mUsername.getText().toString();
				String password = mPassword.getText().toString();

				intent.putExtra("username",username);
				intent.putExtra("password",password);
				startActivity(intent);
			}
		});

	}
}
