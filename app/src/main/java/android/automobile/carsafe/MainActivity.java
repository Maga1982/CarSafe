package android.automobile.carsafe;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       WebView webView = findViewById(R.id.webviewid);

        webView.loadUrl("http://www.carsafe.org");
        webView.setWebViewClient(new WebViewClient());
       /* mTopToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mTopToolbar);
        FragmentOne fragmentOne= new FragmentOne();
       FragmentTwo fragmentTwo=new FragmentTwo();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_one,fragmentOne);
        fragmentTransaction.add(R.id.fragment_two,fragmentTwo);
        fragmentTransaction.commit();*/

    }
  /*  @Override
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
        if (id == R.id.action_favorite) {
            Toast.makeText(MainActivity.this, "Action clicked", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
