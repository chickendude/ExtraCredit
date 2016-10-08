package ch.ralena.extracredit.model;

public class Color {
	private String mColorName;
	private String mColorValue;

	public Color(String colorName, String colorValue) {
		mColorName = colorName;
		mColorValue = colorValue;
	}

	public String getColorName() {
		return mColorName;
	}

	public void setColorName(String colorName) {
		mColorName = colorName;
	}

	public String getColorValue() {
		return mColorValue;
	}

	public void setColorValue(String colorValue) {
		mColorValue = colorValue;
	}
}
