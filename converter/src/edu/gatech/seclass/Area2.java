package edu.gatech.seclass;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Area2 extends Activity {

	private Button fM;
	
	private EditText feet;
	private EditText meters;
	private double convertedAnswer;
	private String answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_area2);
		
		 fM = (Button)findViewById(R.id.button1);
		    feet   = (EditText)findViewById(R.id.editText2);
		    meters   = (EditText)findViewById(R.id.editText1);
		    
		   
		    
		    
		    fM.setOnClickListener(
		        new View.OnClickListener()
		        {
		            public void onClick(View view)
		            {
		            	try{
		            	convertedAnswer = calculate(Double.parseDouble(meters.getText().toString()));
		     		    answer = String.valueOf(convertedAnswer);
		                feet.setText(answer);
		            	}
		            	catch(Exception e){
		            		Toast.makeText(getApplicationContext(), "Please enter a value in the first field.",
		            		Toast.LENGTH_SHORT).show();
		            	}
		            }
		        });
		    
		    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.area2, menu);
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
		answer = num*10.764;
		
		
		return answer;
		
		
	}
	
	
	
	
	
}
