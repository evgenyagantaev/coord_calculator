package ru.agantaev.coordinates;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.R.integer;
import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity 
{
	
	Button newCalculationButton;
	Button calculateButton;
	
	RadioButton degreesRadio;
	RadioButton degminRadio;
	RadioButton degminsecRadio;
	
	EditText degrees_edit;
	EditText degmin_deg_edit;
	EditText degmin_min_edit;
	EditText degminsec_deg_edit;
	EditText degminsec_min_edit;
	EditText degminsec_sec_edit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		newCalculationButton = (Button)findViewById(R.id.button_newCalculation);
		calculateButton = (Button)findViewById(R.id.button_calculate);
		
		degreesRadio = (RadioButton)findViewById(R.id.radio_degrees);
		degminRadio = (RadioButton)findViewById(R.id.radio_degmin);
		degminsecRadio = (RadioButton)findViewById(R.id.radio_degminsec);
		
		degrees_edit = (EditText)findViewById(R.id.editText_degrees);
		degmin_deg_edit = (EditText)findViewById(R.id.editText_degmin_deg);
		degmin_min_edit = (EditText)findViewById(R.id.editText_degmin_min);
		degminsec_deg_edit = (EditText)findViewById(R.id.editText_degminsec_deg);
		degminsec_min_edit = (EditText)findViewById(R.id.editText_degminsec_min);
		degminsec_sec_edit = (EditText)findViewById(R.id.editText_degminsec_sec);
		
		// make calculate Button disabled
		calculateButton.setBackgroundResource(R.drawable.buttonstyle0);// disabled
		calculateButton.setEnabled(false);
		// make new Calculation Button disabled
		newCalculationButton.setBackgroundResource(R.drawable.buttonstyle0);// disabled
		newCalculationButton.setEnabled(false);
		
		
		// make all radio buttons unchecked
		degreesRadio.setChecked(false);
		degminRadio.setChecked(false);
		degminsecRadio.setChecked(false);
		// disable all edit boxes
		degrees_edit.setEnabled(false);
		degmin_deg_edit.setEnabled(false);
		degmin_min_edit.setEnabled(false);
		degminsec_deg_edit.setEnabled(false);
		degminsec_min_edit.setEnabled(false);
		degminsec_sec_edit.setEnabled(false);
	}
	
	
	public void radio_degrees_onClick(View v)
	{
		//enable new calculation button
		newCalculationButton.setBackgroundResource(R.drawable.buttonstyle1);// Enabled
		newCalculationButton.setEnabled(true);
		
		// disable all edit boxes
		degrees_edit.setEnabled(false);
		degmin_deg_edit.setEnabled(false);
		degmin_min_edit.setEnabled(false);
		degminsec_deg_edit.setEnabled(false);
		degminsec_min_edit.setEnabled(false);
		degminsec_sec_edit.setEnabled(false);
	}
	
	public void radio_degmin_onClick(View v)
	{
		//enable new calculation button
		newCalculationButton.setBackgroundResource(R.drawable.buttonstyle1);// Enabled
		newCalculationButton.setEnabled(true);
		
		// disable all edit boxes
		degrees_edit.setEnabled(false);
		degmin_deg_edit.setEnabled(false);
		degmin_min_edit.setEnabled(false);
		degminsec_deg_edit.setEnabled(false);
		degminsec_min_edit.setEnabled(false);
		degminsec_sec_edit.setEnabled(false);
	}
	
	public void radio_degminsec_onClick(View v)
	{
		//enable new calculation button
		newCalculationButton.setBackgroundResource(R.drawable.buttonstyle1);// Enabled
		newCalculationButton.setEnabled(true);
		
		// disable all edit boxes
		degrees_edit.setEnabled(false);
		degmin_deg_edit.setEnabled(false);
		degmin_min_edit.setEnabled(false);
		degminsec_deg_edit.setEnabled(false);
		degminsec_min_edit.setEnabled(false);
		degminsec_sec_edit.setEnabled(false);
	}
	
	
	public void newCalculation_onClick(View v)
	{
		// make new Calculation Button disabled
		newCalculationButton.setBackgroundResource(R.drawable.buttonstyle0);// disabled
		newCalculationButton.setEnabled(false);
		// make calculate Button Enabled
		calculateButton.setBackgroundResource(R.drawable.buttonstyle1);// Enabled
		calculateButton.setEnabled(true);
		
		if(degreesRadio.isChecked())
		{
			// enable degrees edit box
			degrees_edit.setEnabled(true);
			// disable all other edit boxes
			degmin_deg_edit.setEnabled(false);
			degmin_min_edit.setEnabled(false);
			degminsec_deg_edit.setEnabled(false);
			degminsec_min_edit.setEnabled(false);
			degminsec_sec_edit.setEnabled(false);
					
		}
		else if(degminRadio.isChecked())
		{
			degrees_edit.setEnabled(false);
			degmin_min_edit.setEnabled(true);
			degmin_deg_edit.setEnabled(true);
			degminsec_deg_edit.setEnabled(false);
			degminsec_min_edit.setEnabled(false);
			degminsec_sec_edit.setEnabled(false);
		}
		else if(degminsecRadio.isChecked())
		{
			degrees_edit.setEnabled(false);
			degmin_deg_edit.setEnabled(false);
			degmin_min_edit.setEnabled(false);
			degminsec_min_edit.setEnabled(true);
			degminsec_sec_edit.setEnabled(true);
			degminsec_deg_edit.setEnabled(true);
		}
		else
		{
			Toast.makeText(getApplicationContext(), "Не выбран исходный формат", Toast.LENGTH_SHORT).show();
		}
		
		
		// clear all edit boxes
		degrees_edit.setText("");
		degmin_deg_edit.setText("");
		degmin_min_edit.setText("");
		degminsec_deg_edit.setText("");
		degminsec_min_edit.setText("");
		degminsec_sec_edit.setText("");
	}
	
	
	public void calculate_onClick(View v)
	{
		// make new Calculation Button Enabled
		//newCalculationButton.setBackgroundResource(R.drawable.buttonstyle1);// Enabled
		//newCalculationButton.setEnabled(true);
		// make calculate Button disabled
		calculateButton.setBackgroundResource(R.drawable.buttonstyle0);// disabled
		calculateButton.setEnabled(false);
		
		
		if(degreesRadio.isChecked())
		{
			if((degrees_edit.getText()).toString().length() > 0)
			{
				// source format is degrees
				double degrees = Double.parseDouble(((degrees_edit.getText()).toString()));
				// calculate minutes
				double minutes = degrees - (int)degrees;
				minutes *= 60.0;
				double seconds = minutes - (int)minutes;
				seconds *= 60.0;
				
				String deg = String.valueOf((int)degrees);
				String min = String.valueOf((int)minutes);
				String dblMin = String.valueOf(minutes);
				String sec = String.valueOf(seconds);
				
				// set all edit boxes
				degmin_deg_edit.setText(deg);
				degmin_min_edit.setText(dblMin);
				degminsec_deg_edit.setText(deg);
				degminsec_min_edit.setText(min);
				degminsec_sec_edit.setText(sec);
			}
					
		}
		else if(degminRadio.isChecked())
		{
			if((degmin_deg_edit.getText()).toString().length() > 0)
			{
				// source format is degrees + minutes
				int degrees = Integer.parseInt(((degmin_deg_edit.getText()).toString()));
				// calculate minutes
				double minutes;
				if(degmin_min_edit.getText().toString().length() > 0)
				{
					minutes = Double.parseDouble(((degmin_min_edit.getText()).toString()));
				}
				else
					minutes = 0;
				
				double seconds = minutes - (int)minutes;
				seconds *= 60.0;
				
				double dblDegrees = degrees + minutes/60;
				
				String dblDeg = String.valueOf(dblDegrees);
				String deg = String.valueOf((int)degrees);
				String min = String.valueOf((int)minutes);
				String sec = String.valueOf(seconds);
				
				// set all edit boxes
				degrees_edit.setText(dblDeg);
				degminsec_deg_edit.setText(deg);
				degminsec_min_edit.setText(min);
				degminsec_sec_edit.setText(sec);
			}
		}
		else if(degminsecRadio.isChecked())
		{
			if((degminsec_deg_edit.getText()).toString().length() > 0)
			{
				// source format is degrees + minutes + seconds
				int degrees = Integer.parseInt(((degminsec_deg_edit.getText()).toString()));
				// get minutes
				int minutes;
				if(degminsec_min_edit.getText().toString().length() > 0)
				{
					minutes = Integer.parseInt(((degminsec_min_edit.getText()).toString()));
				}
				else
					minutes = 0;
				// get seconds
				double seconds;
				if(degminsec_sec_edit.getText().toString().length() > 0)
				{
					seconds = Double.parseDouble(((degminsec_sec_edit.getText()).toString()));
				}
				else
					seconds = 0;
				
				double dblMinutess = minutes + seconds/60;
				double dblDegrees = degrees + dblMinutess/60;
				
				String dblMin = String.valueOf(dblMinutess);
				String dblDeg = String.valueOf(dblDegrees);
				String deg = String.valueOf((int)degrees);
				
				// set all edit boxes
				degrees_edit.setText(dblDeg);
				degmin_deg_edit.setText(deg);
				degmin_min_edit.setText(dblMin);
			}
		}
		else
		{
			Toast.makeText(getApplicationContext(), "Не выбран исходный формат", Toast.LENGTH_SHORT).show();
		}
		
		// after all make all radio buttons unchecked
		degreesRadio.setChecked(false);
		degminRadio.setChecked(false);
		degminsecRadio.setChecked(false);
		// disable all edit boxes
		degrees_edit.setEnabled(false);
		degmin_deg_edit.setEnabled(false);
		degmin_min_edit.setEnabled(false);
		degminsec_deg_edit.setEnabled(false);
		degminsec_min_edit.setEnabled(false);
		degminsec_sec_edit.setEnabled(false);
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) 
		{
			System.exit(0);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

}
