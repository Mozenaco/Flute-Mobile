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
import android.widget.RelativeLayout;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class Cliquelongo extends Activity {

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

		
		 rbdo.setOnTouchListener(new OnTouchListener() {

			 
			@Override
			public boolean onTouch(View arg0, MotionEvent evento) {
				 
				if(evento.getAction() == MotionEvent.ACTION_DOWN){
					try {
						mp.stop();
						mp.release();
					} catch (Exception e) {

					}
					mp = MediaPlayer.create(getApplicationContext(),
							R.raw.curso_do);
					
					mp.start();
					
					View  layout =(RelativeLayout)findViewById(R.id.main_layout);
					layout.setBackgroundResource(R.drawable.flauta_do);
					
						                   
	                }
	                if(evento.getAction() == MotionEvent.ACTION_UP){
	                	try {
	    					mp.stop();
	    					mp.release();
	    				} catch (Exception e) {

	    				}
	                	
	                }
			      return true;
			}
			
		});
		
		 
		 rbre.setOnTouchListener(new OnTouchListener() {

			 
				@Override
				public boolean onTouch(View arg0, MotionEvent evento) {
					 
					if(evento.getAction() == MotionEvent.ACTION_DOWN){
						try {
							mp.stop();
							mp.release();
						} catch (Exception e) {

						}
						mp = MediaPlayer.create(getApplicationContext(),
								R.raw.curso_re);
						
						mp.start();
						View  layout =(RelativeLayout)findViewById(R.id.main_layout);
						layout.setBackgroundResource(R.drawable.flauta_re);
							                   
		                }
		                if(evento.getAction() == MotionEvent.ACTION_UP){
		                	try {
		    					mp.stop();
		    					mp.release();
		    				} catch (Exception e) {

		    				}
		                	
		                }
						return true;
		 
				}
				});
		 
		 rbmi.setOnTouchListener(new OnTouchListener() {

			 
				@Override
				public boolean onTouch(View arg0, MotionEvent evento) {
					 
					if(evento.getAction() == MotionEvent.ACTION_DOWN){
						try {
							mp.stop();
							mp.release();
						} catch (Exception e) {

						}
						mp = MediaPlayer.create(getApplicationContext(),
								R.raw.curso_mi);
						
						mp.start();
						View  layout =(RelativeLayout)findViewById(R.id.main_layout);
						layout.setBackgroundResource(R.drawable.flauta_mi);
							                   
		                }
		                if(evento.getAction() == MotionEvent.ACTION_UP){
		                	try {
		    					mp.stop();
		    					mp.release();
		    				} catch (Exception e) {

		    				}
		                }
						return true;
		 
				}
				});
		 
		 rbfa.setOnTouchListener(new OnTouchListener() {

			 
				@Override
				public boolean onTouch(View arg0, MotionEvent evento) {
					 
					if(evento.getAction() == MotionEvent.ACTION_DOWN){
						try {
							mp.stop();
							mp.release();
						} catch (Exception e) {

						}
						mp = MediaPlayer.create(getApplicationContext(),
								R.raw.curso_fa);
						
						mp.start();
						View  layout =(RelativeLayout)findViewById(R.id.main_layout);
						layout.setBackgroundResource(R.drawable.flauta_fa);		
							                   
		                }
		                if(evento.getAction() == MotionEvent.ACTION_UP){
		                	try {
		    					mp.stop();
		    					mp.release();
		    				} catch (Exception e) {

		    				}
		                }
						return true;
		 
				}
				});
		 
		 rbsol.setOnTouchListener(new OnTouchListener() {

			 
				@Override
				public boolean onTouch(View arg0, MotionEvent evento) {
					 
					if(evento.getAction() == MotionEvent.ACTION_DOWN){
						try {
							mp.stop();
							mp.release();
						} catch (Exception e) {

						}
						mp = MediaPlayer.create(getApplicationContext(),
								R.raw.curso_sol);
						
						mp.start();
						View  layout =(RelativeLayout)findViewById(R.id.main_layout);
						layout.setBackgroundResource(R.drawable.flauta_sol);		
							                   
		                }
		                if(evento.getAction() == MotionEvent.ACTION_UP){
		                	try {
		    					mp.stop();
		    					mp.release();
		    				} catch (Exception e) {

		    				}
		                }
						return true;
		 
				}
				});
		 
		 rbla.setOnTouchListener(new OnTouchListener() {

			 
				@Override
				public boolean onTouch(View arg0, MotionEvent evento) {
					 
					if(evento.getAction() == MotionEvent.ACTION_DOWN){
						try {
							mp.stop();
							mp.release();
						} catch (Exception e) {

						}
						mp = MediaPlayer.create(getApplicationContext(),
								R.raw.curso_la);
						
						mp.start();
						View  layout =(RelativeLayout)findViewById(R.id.main_layout);
						layout.setBackgroundResource(R.drawable.flauta_la);		
							                   
		                }
		                if(evento.getAction() == MotionEvent.ACTION_UP){
		                	try {
		    					mp.stop();
		    					mp.release();
		    				} catch (Exception e) {

		    				}
		                }
						return true;
		 
				}
				});
		 
		 rbsi.setOnTouchListener(new OnTouchListener() {

			 
				@Override
				public boolean onTouch(View arg0, MotionEvent evento) {
					 
					if(evento.getAction() == MotionEvent.ACTION_DOWN){
						try {
							mp.stop();
							mp.release();
						} catch (Exception e) {

						}
						mp = MediaPlayer.create(getApplicationContext(),
								R.raw.curso_si);
						
						mp.start();
						View  layout =(RelativeLayout)findViewById(R.id.main_layout);
						layout.setBackgroundResource(R.drawable.flauta_si);		
							                   
		                }
		                if(evento.getAction() == MotionEvent.ACTION_UP){
		                	try {
		    					mp.stop();
		    					mp.release();
		    				} catch (Exception e) {

		    				}
		                }
						return true;
		 
				}
				});
		 
		 rbdoagudo.setOnTouchListener(new OnTouchListener() {

			 
				@Override
				public boolean onTouch(View arg0, MotionEvent evento) {
					 
					if(evento.getAction() == MotionEvent.ACTION_DOWN){
						try {
							mp.stop();
							mp.release();
						} catch (Exception e) {

						}
						mp = MediaPlayer.create(getApplicationContext(),
								R.raw.curso_doagudo);
						
						mp.start();
						View  layout =(RelativeLayout)findViewById(R.id.main_layout);
						layout.setBackgroundResource(R.drawable.flauta_doagudo);		
							                   
		                }
		                if(evento.getAction() == MotionEvent.ACTION_UP){
		                	try {
		    					mp.stop();
		    					mp.release();
		    				} catch (Exception e) {

		    				}
		                }
						return true;
		 
				}
				});
		 
		 rbreagudo.setOnTouchListener(new OnTouchListener() {

			 
				@Override
				public boolean onTouch(View arg0, MotionEvent evento) {
					 
					if(evento.getAction() == MotionEvent.ACTION_DOWN){
						try {
							mp.stop();
							mp.release();
						} catch (Exception e) {

						}
						mp = MediaPlayer.create(getApplicationContext(), R.raw.reagudo);
						
						mp.start();
									
							                   
		                }
		                if(evento.getAction() == MotionEvent.ACTION_UP){
		                	try {
		    					mp.stop();
		    					mp.release();
		    				} catch (Exception e) {

		    				}
		                }
						return true;
		 
				}
				});
		
	}
}
