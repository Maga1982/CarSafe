package android.automobile.carsafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        WebView webview= findViewById(R.id.videoid);
        webview.loadUrl("https://www.youtube.com/watch?v=mejj7WIIZwk");
        webview.setWebViewClient(new WebViewClient());

    }
}
