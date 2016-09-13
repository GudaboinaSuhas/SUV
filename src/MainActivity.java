package com.example.varshithaa;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.webkit.WebSettings;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity
{
	
	private WebView mWebView;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		
		
			
		
		
		
		mWebView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = mWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		mWebView.loadUrl("http://varshithaa.blogspot.in/");
		mWebView.setWebViewClient(new MyAppWebViewClient()
				{
			@Override
			public void onPageFinished(WebView view,String url)
			{
				//hide loading image
				findViewById(R.id.splash1).setVisibility(View.GONE);
				//show webview
				findViewById(R.id.webview).setVisibility(View.VISIBLE);
			}}
				
				
				
				
				
				);
		
		
		
			
		
		}
	
	@Override
	public void onBackPressed(){
		if(mWebView.canGoBack()){
			mWebView.goBack();
			
		} else{
			super.onBackPressed();
		}
	}
	private class MyAppWebViewClient extends WebViewClient {
		
	}
}
		

		
