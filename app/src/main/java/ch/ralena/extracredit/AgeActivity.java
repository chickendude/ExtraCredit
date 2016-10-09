package ch.ralena.extracredit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {
	@Override
	protected void onResume() {
		super.onResume();
		mAgeEditText.setText("");
	}

	private EditText mAgeEditText;
	private Button mCalculateAgeButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_age);

		mAgeEditText = (EditText) findViewById(R.id.ageEditText);
		mCalculateAgeButton = (Button) findViewById(R.id.ageCalculateButton);
		mCalculateAgeButton.setEnabled(false);

		mAgeEditText.addTextChangedListener(new TextWatcher() {
			@Override
			public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

			}

			@Override
			public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
				if (mAgeEditText.getText().length() > 0) {
					mCalculateAgeButton.setEnabled(true);
				} else {
					mCalculateAgeButton.setEnabled(false);
				}
			}

			@Override
			public void afterTextChanged(Editable editable) {

			}
		});

		mCalculateAgeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				// pass on contents of edit text
				int age = Integer.parseInt(mAgeEditText.getText().toString());
				Intent intent = new Intent(AgeActivity.this, AgeResultsActivity.class);
				intent.putExtra("age",age);
				startActivity(intent);
			}
		});
	}
}
