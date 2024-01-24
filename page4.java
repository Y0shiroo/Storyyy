package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page4 extends AppCompatActivity {
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("pangalan");
    }
    public void gotopage3 (View view) {
        Intent i = new Intent(this, page3.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
    public void gotopage5 (View view) {
        Intent i = new Intent(this, page5.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
}
