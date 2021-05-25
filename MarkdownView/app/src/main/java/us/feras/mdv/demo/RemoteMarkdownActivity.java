package us.feras.mdv.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import us.feras.mdv.MarkdownView;

public class RemoteMarkdownActivity extends AppCompatActivity {
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MarkdownView markdownView = new MarkdownView(this); 
		setContentView(markdownView);
		markdownView.loadMarkdownFile("https://raw.github.com/falnatsheh/MarkdownView/master/README.md");
	}
}
