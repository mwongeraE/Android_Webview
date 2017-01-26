package com.mwongera.android_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.defaultTheme) {
            new FinestWebView.Builder(this).titleDefault("The Finest Artist")
            .show("http://thefinestartist.com");
        } else if (view.getId() == R.id.redTheme) {
            new FinestWebView.Builder(this).theme(R.style.FinestWebViewTheme)
                    .titleDefault("Bless This Stuff")
                    .webViewBuiltInZoomControls(true)
                    .webViewDisplayZoomControls(true)
                    .dividerHeight(0)
                    .gradientDivider(false)
                    .setCustomAnimations(R.anim.activity_open_enter, R.anim.activity_open_exit,
                            R.anim.activity_close_enter, R.anim.activity_close_exit)
                    .injectJavaScript("javascript: document.getElementById('msg').innerHTML='Hello "
                            + "TheFinestArtist"
                            + "!';")
                    .show("http://www.blessthisstuff.com");
        }
    }
}
