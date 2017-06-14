package br.com.flautadoce;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class Clique extends Activity {

	RadioGroup radioGroup1, radioGroup2;
	RadioButton rbdo, rbre, rbmi, rbfa, rbsol, rbla, rbsi, rbdoagudo, rbreagudo;

	private Handler mHandler;
	
	private static MediaPlayer mp;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.flauta);

		radioGroup1 = (RadioGroup) findViewById(R.id.radiogroup1);
		radioGroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
		rbdo = (RadioButton) findViewById(R.id.rbdo);
		rbre = (RadioButton) findViewById(R.id.rbre);
		rbmi = (RadioButton) findViewById(R.id.rbmi);
		rbfa = (RadioButton) findViewById(R.id.rbfa);
		rbsol = (RadioButton) findViewById(R.id.rbsol);
		rbla = (RadioButton) findViewById(R.id.rbla);
		rbsi = (RadioButton) findViewById(R.id.rbsi);
		rbdoagudo = (RadioButton) findViewById(R.id.rbdoagudo);
		rbreagudo = (RadioButton) findViewById(R.id.rbreagudo);

		
		rbdo.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();
				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.domedio);
				mp.start();

			}
		});
		
		rbdoagudo.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();
				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.doagudo);
				mp.start();

			}
		});
		
		
		/*
		 rbdo.setOnTouchListener(new OnTouchListener() {

			 
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				 
				if(arg1.getAction() == MotionEvent.ACTION_DOWN){
					try {
						mp.stop();
						mp.release();
					} catch (Exception e) {

					}
					mp = MediaPlayer.create(getApplicationContext(),
							R.raw.flauta_do);
					
					mp.start();
						                   
	                }
	                if(arg1.getAction() == MotionEvent.ACTION_UP){
	                	try {
	    					mp.stop();
	    					mp.release();
	    				} catch (Exception e) {

	    				}
	                }
	                return true;
			}

			/*public void onClick(View v) {

				radioGroup2.clearCheck();
				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.flauta_do);
				mp.start();

			}*/
			
			 
			/*
			
		});
		*/

		rbre.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();
				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.re);
				mp.start();

			}
		});
		
		rbreagudo.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();
				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.reagudo);
				mp.start();

			}
		});

		rbmi.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();
				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.mi);
				mp.start();

			}
		});

		rbfa.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();
				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.fa);
				mp.start();

			}
		});

		rbsol.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup1.clearCheck();
				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.sol);
				mp.start();

			}
		});

		rbla.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				try {
					radioGroup1.clearCheck();

					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.la);
				mp.start();

			}
		});

		rbsi.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup1.clearCheck();

				try {
					mp.stop();
					mp.release();
				} catch (Exception e) {

				}
				mp = MediaPlayer.create(getApplicationContext(),
						R.raw.si);
				mp.start();

			}
		});

	}

}
