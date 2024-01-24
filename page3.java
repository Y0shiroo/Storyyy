package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("pangalan");
    }
    public void gotopage2 (View view) {
        Intent i = new Intent(this, page2.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
    public void gotopage4 (View view) {
        Intent i = new Intent(this, page4.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
}
