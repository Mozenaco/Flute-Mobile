package br.com.flautadoce;


import android.app.Activity;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	
	Button btsopro, btclique, btcliquelongo;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		
		btsopro = (Button)findViewById(R.id.btsopro);
		btcliquelongo = (Button)findViewById(R.id.btcliquelongo);
		
		
		btsopro.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
			
				Intent chamasopro = new Intent(getApplicationContext(),
						Sopro.class);
				startActivity(chamasopro);
			
			}
		});
		
		btcliquelongo.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
			
				Intent chamaclique = new Intent(getApplicationContext(),
						Cliquelongo.class);
				startActivity(chamaclique);
			
			}
		});
	}
}

