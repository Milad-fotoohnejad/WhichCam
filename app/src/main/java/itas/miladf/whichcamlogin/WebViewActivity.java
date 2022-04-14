package itas.miladf.whichcamlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = (WebView) findViewById(R.id.webview2);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://dev.itas.ca/~milad.fotoohnejad/ITAS_191/FinalProject/");
    }

    public void backToMAin(View view){
        Intent intent = new Intent (WebViewActivity.this, Gallery.class);
        startActivity(intent);
    }
}