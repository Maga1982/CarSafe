package android.automobile.carsafe;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
;

public class MainActivity extends AppCompatActivity {

    private Toolbar mTopToolbar;
     FragmentOne fragmentOne;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mTopToolbar = findViewById(R.id.my_toolbar);
       // setSupportActionBar(mTopToolbar);
      // mTopToolbar.setTitle(getResources().getString(R.string.about));
       //mTopToolbar.setTitleTextColor(getResources().getColor(R.color.white));
       fragmentOne = new FragmentOne();
       fragmentTransaction=getSupportFragmentManager().beginTransaction();


       /* WebView webView = findViewById(R.id.webviewid);
        webView.loadUrl("http://www.carsafe.org");
        webView.setWebViewClient(new WebViewClient());

       FragmentTwo fragmentTwo=new FragmentTwo();

        fragmentTransaction.add(R.id.fragment_two,fragmentTwo);
        fragmentTransaction.commit();*/

    }
   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
            switch (id) {
                case R.id.about_id:
                    Intent intent= new Intent(this,MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.traffic_id:
                    Intent trafficintent= new Intent(this,TrafficActivity.class);
                    startActivity(trafficintent);
                    break;
                case R.id.carpool_id:
                    Intent carpoolintent= new Intent(this,CarpoolActivity.class);
                    startActivity(carpoolintent);
                    break;
                case R.id.weather_id:
                    Intent weatherintent= new Intent(this,WeatherActivity.class);
                    startActivity(weatherintent);
                    break;
                case R.id.donate_id:
                    Intent donateintent= new Intent(this,DonateActivity.class);
                    startActivity(donateintent);
                    break;
                case R.id.videos_id:
                    Intent videointent= new Intent(this,VideoActivity.class);
                    startActivity(videointent);
                    break;
            }

        return super.onOptionsItemSelected(item);
    }
}

