package android.automobile.carsafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CarpoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpool);
        WebView webview= findViewById(R.id.carpoolid);
        webview.loadUrl("https://www.groupcarpool.com/new");
        webview.setWebViewClient(new WebViewClient());
    }
}
