package edu.gatech.unitconvertor;

import android.app.Activity;
import android.view.View;
import android.widget.RadioButton;

/**
 * @author Luis Carrillo
 *
 */
public class DistanceActivity extends Activity {

	/**
	 * Method that handles clicks on elements of this activity
	 * @param view
	 * @param value the input value
	 * @return the converted value
	 */
	public String handleClick(View view, String value) {
		boolean checked = ((RadioButton)view).isChecked();
		double distance = Double.parseDouble(value);
		String converted = "";
		switch(view.getId()) {
		case R.id.radioDistance0:
			if(checked) {
				converted = kmToMiles(distance);
			}
			break;
		case R.id.radioDistance1:
			if(checked) {
				converted = milesToKm(distance);
			}
			break;
		}
		return converted;
	}

	private String milesToKm(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}

	private String kmToMiles(double km) {
		double miles = km / 1.609;
		return String.valueOf(miles);
	}

}
