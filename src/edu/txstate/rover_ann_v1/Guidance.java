package edu.txstate.rover_ann_v1;


import ioio.lib.util.android.IOIOActivity;
import edu.txstate.rover_ann_v1.R;
import android.app.Activity;
//import android.R;
//import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
//import android.view.Menu;

public class Guidance extends IOIOActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidance);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.guidance, menu);
        return true;
    }
    
}
