package us.feras.mdv.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import us.feras.mdv.MarkdownView;

public class LocalMarkdownActivity extends AppCompatActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MarkdownView webView = new MarkdownView(this);
		setContentView(webView);
		webView.loadMarkdownFile("file:///android_asset/hello.md");
	}
}
