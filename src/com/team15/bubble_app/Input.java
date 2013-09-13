package com.team15.bubble_app;

/*import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Input extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.input, menu);
        return true;
    }
    
}
*/

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

public class Input extends Activity {
    /** Called when the activity is first created. */
//    @Override
    
	private ArrayList<Integer> inputArray = new ArrayList<Integer>();
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        TextView text = new TextView(this);
        text.setText("Input your string - Bubble_app.com");
        setContentView(text);
    }
    
}