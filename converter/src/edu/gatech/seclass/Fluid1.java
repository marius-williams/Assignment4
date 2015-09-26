package edu.gatech.seclass;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fluid1 extends Activity {

	private static final double RATE = 33.814;
	private Button fL;
	private EditText fluidOunces;
	private EditText Liters;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fluid1);
		
		fL = (Button)findViewById(R.id.button1);
	    fluidOunces   = (EditText)findViewById(R.id.editText1);
	    Liters   = (EditText)findViewById(R.id.editText2);
	    
	   
	    
	    
	    fL.setOnClickListener(
	        new View.OnClickListener()
	        {
	            private double convertedAnswer;
				private String answer;

				public void onClick(View view)
	            {
	            	 convertedAnswer = calculate(Double.parseDouble(fluidOunces.getText().toString()));
	     		    answer = String.valueOf(convertedAnswer);
	                Liters.setText(answer);
	            }
	        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fluid1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
public double calculate(double num){
		
		double answer;
		answer = num/RATE;
		
		
		return answer;
		
		
	}
}
