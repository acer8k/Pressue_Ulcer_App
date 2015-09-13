package com.example.kashif.pressureulcer;

import android.app.Activity;
import android.os.Bundle;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by kashif on 4/24/2015.
 */
public class ContactPU extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_contact);

        Button xml_askfeed = (Button) findViewById(R.id.btnAsk);
        xml_askfeed.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View v) {
      // TODO Auto-generated method stub
      startActivity(new Intent("android.intent.action.AskFeedPU"));
      }
     }
        );
    }
    public void makeCall(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-518-618-9107"));
        startActivity(intent);
    }

    public void showMap(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:26.934,-80.106"));
        startActivity(intent);
    }
    public void proApp(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.PatientDataScience.pressureulcer&hl=en"));
        startActivity(intent);
    }

}
