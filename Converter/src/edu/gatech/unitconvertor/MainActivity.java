package edu.gatech.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Main activity that holds reference to other activities.
 * @author Luis Carrillo
 *
 */
public class MainActivity extends Activity {

	private final DistanceActivity distance = new DistanceActivity();
	private final TemperatureActivity temp = new TemperatureActivity();
	private final WeightActivity weight = new WeightActivity();

	public void handleClickDistance(View view) {
		EditText textField = (EditText) findViewById(R.id.textDistance);
		String text = textField.getText().toString();
		String converted = distance.handleClick(view, text);
		textField.setText(converted);
	}

	public void handleClickTemperature(View view) {
		EditText textField = (EditText) findViewById(R.id.textTemperature);
		String text = textField.getText().toString();
		String converted = temp.handleClick(view, text);
		textField.setText(converted);
	}

	public void handleClickWeight(View view) {
		EditText textField = (EditText) findViewById(R.id.textWeight);
		String text = textField.getText().toString();
		String converted = weight.handleClick(view, text);
		textField.setText(converted);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

}
