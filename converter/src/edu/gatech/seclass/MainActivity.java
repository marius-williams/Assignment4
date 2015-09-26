package edu.gatech.seclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void sendMessage(View view) 
	{
		
		if(view.getId()==R.id.button1){
	    Intent intent = new Intent(MainActivity.this, Area.class);
	    startActivity(intent);
	    
		}
		
		else if(view.getId() ==R.id.button2){
			
			 Intent intent = new Intent(MainActivity.this, Currency.class);
			    startActivity(intent);
			
			
		}
		else if(view.getId() ==R.id.button3){
			
			 Intent intent = new Intent(MainActivity.this, Distance.class);
			    startActivity(intent);
			
			
		}
		else if(view.getId() ==R.id.button4){
			
			 Intent intent = new Intent(MainActivity.this, Fluid.class);
			    startActivity(intent);
			
			
		}
		
		else if(view.getId() ==R.id.button5){
			
			 Intent intent = new Intent(MainActivity.this, Weight.class);
			    startActivity(intent);
			
			
		}
		
		}
	}
	

