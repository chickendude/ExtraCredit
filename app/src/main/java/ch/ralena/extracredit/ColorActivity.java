package ch.ralena.extracredit;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ColorActivity extends AppCompatActivity {
	List<ch.ralena.extracredit.model.Color> mColorList = new ArrayList<>();

	private final static String COLORS = "Red//f44336," +
			"Pink//e91e63," +
			"Purple//9c27b0," +
			"Deep Purple//673ab7," +
			"Indigo//3f51b5," +
			"Blue//2196f3," +
			"Light Blue//03a9f4," +
			"Cyan//00bcd4," +
			"Teal//009688," +
			"Green//4caf50";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color);

		LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

		// build color list
		for (String color : COLORS.split(",")) {
			String[] colorArray = color.split("//");
			mColorList.add(new ch.ralena.extracredit.model.Color(colorArray[0], colorArray[1]));
		}

		int i = 0;
		for (ch.ralena.extracredit.model.Color color : mColorList) {
			Button button = new Button(this);
			button.setText(color.getColorName());
			button.setTextColor(Color.parseColor("#ff" + color.getColorValue()));
			button.setBackgroundColor(0xFFFFFFFF);
			button.setId(i++);
			button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					int id = view.getId();
					String colorName = mColorList.get(id).getColorName();
					Toast.makeText(ColorActivity.this, "Clicked "+colorName, Toast.LENGTH_SHORT).show();
				}
			});
			linearLayout.addView(button);
		}
	}
}
