package android.automobile.carsafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TrafficActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);
        WebView webview= findViewById(R.id.trafficid);
        webview.loadUrl("https://www.drivingdirectionsandmaps.com/traffic-conditions-on-google-map/");
        webview.setWebViewClient(new WebViewClient());
    }
}
