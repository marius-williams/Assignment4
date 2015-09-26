package edu.gatech.seclass;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Currency2 extends Activity {

	private static final double RATE = 1.11945 ;
	private Button eD;
	private EditText dollar;
	private EditText euro;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_currency2);
		
		eD = (Button)findViewById(R.id.button1);
	    dollar   = (EditText)findViewById(R.id.editText1);
	    euro   = (EditText)findViewById(R.id.editText2);
	    
	   
	    
	    
	    eD.setOnClickListener(
	        new View.OnClickListener()
	        {
	            private double convertedAnswer;
				private String answer;

				public void onClick(View view)
	            {
	            	 convertedAnswer = calculate(Double.parseDouble(euro.getText().toString()));
	     		    answer = String.valueOf(convertedAnswer);
	                dollar.setText(answer);
	            }
	        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.currency2, menu);
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
		answer = num*RATE ;
		
		
		return answer;
		
		
	}
}
