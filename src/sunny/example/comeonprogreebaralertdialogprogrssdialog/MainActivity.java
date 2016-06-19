package sunny.example.comeonprogreebaralertdialogprogrssdialog;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

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
		switch(id){
		case R.id.alertDialog:
			 AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
			 alertDialog.setTitle("Warning");
			 alertDialog.setMessage("This is a warning");
			 alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			 alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
			 alertDialog.show();
			 break;
		case R.id.progressDialog:
			ProgressDialog progressDialog = new ProgressDialog(this);
			progressDialog.setTitle("ProgressDialog");
			progressDialog.setMessage("loading...");
			progressDialog.show();
			break;
		default:
		}


		return super.onOptionsItemSelected(item);
	}
}
