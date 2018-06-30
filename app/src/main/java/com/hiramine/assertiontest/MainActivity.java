package com.hiramine.assertiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import junit.framework.Assert;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		( (Button)findViewById( R.id.button1 ) ).setOnClickListener( this );
		( (Button)findViewById( R.id.button2 ) ).setOnClickListener( this );
		( (Button)findViewById( R.id.button3 ) ).setOnClickListener( this );
		( (Button)findViewById( R.id.button4 ) ).setOnClickListener( this );
	}

	@Override
	public void onClick( View v )
	{
		int iNaturalNumber = -10;

		switch( v.getId() )
		{
			case R.id.button1:
				assert 0 < iNaturalNumber;
				Toast.makeText( this, "assert()", Toast.LENGTH_SHORT ).show();
				break;
			case R.id.button2:
				Assert.assertTrue( 0 < iNaturalNumber );
				Toast.makeText(this,"Assert.assertTrue()", Toast.LENGTH_SHORT ).show();
				break;
			case R.id.button3:
				if( BuildConfig.DEBUG && !( 0 < iNaturalNumber ) )
				{
					throw new AssertionError();
				}
				Toast.makeText(this,"BuildConfig.DEBUG && ()", Toast.LENGTH_SHORT ).show();
				break;
			case R.id.button4:
				MyAssert.assertTrue( 0 < iNaturalNumber );
				Toast.makeText(this,"MyAssert.assertTrue()", Toast.LENGTH_SHORT ).show();
				break;
		}
	}
}
