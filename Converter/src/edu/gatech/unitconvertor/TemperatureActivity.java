package edu.gatech.unitconvertor;

import android.app.Activity;
import android.view.View;
import android.widget.RadioButton;

/**
 * @author Luis Carrillo
 *
 */
public class TemperatureActivity extends Activity {

	/**
	 * Method that handles clicks on elements of this activity
	 * @param view
	 * @param value the input value
	 * @return the converted value
	 */
	public String handleClick(View view, String value) {
		boolean checked = ((RadioButton)view).isChecked();
		double temp = Double.parseDouble(value);
		String converted = "";
		switch(view.getId()) {
		case R.id.radioTemperature0:
			if(checked) {
				converted = celsiusToFahrenheit(temp);
			}
			break;
		case R.id.radioTemperature1:
			if(checked) {
				converted = fahrenheitToCelcius(temp);
			}
			break;
		}
		return converted;
	}

	private String fahrenheitToCelcius(double fahrenheit) {
		double celsius = (fahrenheit - 32) / 1.8;
		return String.valueOf(celsius);
	}

	private String celsiusToFahrenheit(double celsius) {
		double fahrenheit = (celsius * 1.8) + 32;
		return String.valueOf(fahrenheit);
	}

}
