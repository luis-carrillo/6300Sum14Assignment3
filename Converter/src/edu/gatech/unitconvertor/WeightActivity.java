package edu.gatech.unitconvertor;

import android.app.Activity;
import android.view.View;
import android.widget.RadioButton;

/**
 * @author Luis Carrillo
 *
 */
public class WeightActivity extends Activity{

	/**
	 * Method that handles clicks on elements of this activity
	 * @param view
	 * @param value the input value
	 * @return the converted value
	 */
	public String handleClick(View view, String value) {
		boolean checked = ((RadioButton)view).isChecked();
		double weight = Double.parseDouble(value);
		String converted = "";
		switch(view.getId()) {
		case R.id.radioWeight0:
			if(checked) {
				converted = kgToLb(weight);
			}
			break;
		case R.id.radioWeight1:
			if(checked) {
				converted = lbToKm(weight);
			}
			break;
		}
		return converted;
	}

	private String lbToKm(double lbs) {
		double kg = lbs / 2.2046;
		return String.valueOf(kg);
	}

	private String kgToLb(double kg) {
		double lbs = kg * 2.2046;
		return String.valueOf(lbs);
	}

}
