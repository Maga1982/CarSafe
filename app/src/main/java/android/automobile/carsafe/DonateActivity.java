package android.automobile.carsafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DonateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        WebView webview= findViewById(R.id.donateid);
        webview.loadUrl("https://secure.actblue.com/donate/asf");
        webview.setWebViewClient(new WebViewClient());
    }
}
