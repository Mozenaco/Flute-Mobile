package br.com.flautadoce;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Sopro extends Activity {

	RadioGroup radioGroup1, radioGroup2;
	RadioButton rbdo, rbre, rbmi, rbfa, rbsol, rbla, rbsi;

	private static MediaPlayer mp;

	/* constants */
	private static final int POLL_INTERVAL = 300;

	/** running state **/
	private boolean mRunning = false;

	/** config state **/
	private int mThreshold;

	private PowerManager.WakeLock mWakeLock;

	private Handler mHandler = new Handler();

	/* References to view elements */
	private TextView mStatusView;

	/* data source */
	private SoundMeter mSensor;

	/****************** Define runnable thread again and again detect noise *********/

	private Runnable mSleepTask = new Runnable() {
		public void run() {
			// Log.i("Noise", "runnable mSleepTask");

			start();
		}
	};

	// Create runnable thread to Monitor Voice
	private Runnable mPollTask = new Runnable() {
		public void run() {

			double amp = mSensor.getAmplitude();
			// Log.i("Noise", "runnable mPollTask");

			if ((amp > mThreshold)) {
				callForHelp();
				// Log.i("Noise", "==== onCreate ===");

			}

			/*
			 * if ((amp < mThreshold-1)) { try { mp.stop(); mp.release(); }
			 * catch (Exception e) {
			 * 
			 * }
			 * 
			 * // Log.i("Noise", "==== onCreate ===");
			 * 
			 * }
			 */
			// Runnable(mPollTask) will again execute after POLL_INTERVAL
			mHandler.postDelayed(mPollTask, POLL_INTERVAL);

		}
	};

	/*********************************************************/

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Defined SoundLevelView in main.xml file
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

		rbdo.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();

			}
		});

		rbre.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();

			}
		});

		rbmi.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();

			}
		});
		
		rbfa.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup2.clearCheck();

			}
		});

		rbsol.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup1.clearCheck();

			}
		});
		
		rbla.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup1.clearCheck();

			}
		});

		rbsi.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				radioGroup1.clearCheck();

			}
		});

		// Used to record voice
		mSensor = new SoundMeter();

		PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
		mWakeLock = pm.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK, "Sopro");

	}

	@Override
	public void onResume() {
		super.onResume();
		// Log.i("Noise", "==== onResume ===");

		initializeApplicationConstants();

		if (!mRunning) {
			mRunning = true;
			start();
		}
	}

	@Override
	public void onStop() {
		super.onStop();
		// Log.i("Noise", "==== onStop ===");

		// Stop noise monitoring
		stop();

	}

	private void start() {
		// Log.i("Noise", "==== start ===");

		mSensor.start();
		if (!mWakeLock.isHeld()) {
			mWakeLock.acquire();
		}

		// Noise monitoring start
		// Runnable(mPollTask) will execute after POLL_INTERVAL
		mHandler.postDelayed(mPollTask, POLL_INTERVAL);
	}

	private void stop() {
		Log.i("Noise", "==== Stop Noise Monitoring===");
		if (mWakeLock.isHeld()) {
			mWakeLock.release();
		}
		mHandler.removeCallbacks(mSleepTask);
		mHandler.removeCallbacks(mPollTask);
		mSensor.stop();

		mRunning = false;

	}

	private void initializeApplicationConstants() {
		// Set Noise Threshold
		mThreshold = 9;// normal 8

	}

	private void callForHelp() {

		
		switch (radioGroup1.getCheckedRadioButtonId()) {
		case R.id.rbdo:
			try {
				mp.stop();
				mp.release();
			} catch (Exception e) {

			}
			mp = MediaPlayer.create(getApplicationContext(), R.raw.curso_do);
			mp.start();
			break;

		case R.id.rbre:
			try {
				mp.stop();
				mp.release();
			} catch (Exception e) {

			}
			mp = MediaPlayer.create(getApplicationContext(), R.raw.curso_re);
			mp.start();
			break;

		case R.id.rbmi:
			try {
				mp.stop();
				mp.release();
			} catch (Exception e) {

			}
			mp = MediaPlayer.create(getApplicationContext(), R.raw.curso_mi);
			mp.start();
			break;

		case R.id.rbfa:
			try {
				mp.stop();
				mp.release();
			} catch (Exception e) {

			}
			mp = MediaPlayer.create(getApplicationContext(), R.raw.curso_fa);
			mp.start();
			break;

		}

		switch (radioGroup2.getCheckedRadioButtonId()) {
		case R.id.rbsol:
			try {
				mp.stop();
				mp.release();
			} catch (Exception e) {

			}
			mp = MediaPlayer.create(getApplicationContext(), R.raw.curso_sol);
			mp.start();
			break;

		case R.id.rbla:
			try {
				mp.stop();
				mp.release();
			} catch (Exception e) {

			}
			mp = MediaPlayer.create(getApplicationContext(), R.raw.curso_la);
			mp.start();
			break;

		case R.id.rbsi:
			try {
				mp.stop();
				mp.release();
			} catch (Exception e) {

			}
			mp = MediaPlayer.create(getApplicationContext(), R.raw.curso_si);
			mp.start();
			break;

		}

	}
}