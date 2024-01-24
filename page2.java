package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    TextView Character;
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Character = findViewById(R.id.Character);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("pangalan");
        Character.setText("One day " +pangalan+ " the rock");
    }
    public void gotopage1 (View view) {
        Intent i = new Intent(this, page1.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
    public void gotopage3 (View view) {
        Intent i = new Intent(this, page3.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
}
